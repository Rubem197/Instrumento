package principal;

public class Campana extends Instrumento {

    @Override
    public void interpretar() {
        for (int i = 0; i < this.contarNotas; i++) {
            if (notas[i] != null) {
                switch (notas[i]) {
                    case DO:
                        System.out.println("tolon");
                        break;
                    case RE:
                        System.out.println("tolonn");
                        break;
                    case MI:
                        System.out.println("tolonnn");
                        break;
                    case FA:
                        System.out.println("tolonnnn");
                        break;
                    case SO:
                        System.out.println("tolonnnnn");
                        break;
                    case LA:
                        System.out.println("tolonnnnnn");
                        break;
                    case SI:
                        System.out.println("tolonnnnnnn");
                        break;
                }
            }
        }
    }
}
