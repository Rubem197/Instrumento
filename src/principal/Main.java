package principal;

import static principal.Instrumento.*;

public class Main {

    public static void main(String[] args) {
        Piano piano = new Piano();
        Campana campana = new Campana();

        bucle(7);
        campana.interpretar();

    }
}
