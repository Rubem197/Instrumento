package principal;

import java.util.Random;

public abstract class Instrumento {

    protected static int notasMaxima = 100;
    public static Notas[] notas = new Notas[notasMaxima];
    protected static int contarNotas;

    public static void add(Notas notas1) {
        if (contarNotas < notasMaxima) {
            notas[contarNotas] = notas1;
            contarNotas++;
        } else {
            System.out.println("no se puden añadir mas");
        }
    }

    public static void bucle(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            add(generarAleatorios());
        }
    }

    public static Notas generarAleatorios() {
        Notas[] values = Notas.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }

    public abstract void interpretar();
}
