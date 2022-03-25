package principal;

public class Piano extends Instrumento {


    @Override
    public void interpretar() {
        for (int i = 0; i < this.contarNotas; i++) {
            if (notas[i] != null) {
                switch (notas[i]) {
                    case DO:
                        System.out.println("Pom");
                        break;
                    case RE:
                        System.out.println("Pem");
                        break;
                    case MI:
                        System.out.println("Pim");
                        break;
                    case FA:
                        System.out.println("Pam");
                        break;
                    case SO:
                        System.out.println("Bom");
                        break;
                    case LA:
                        System.out.println("Bam");
                        break;
                    case SI:
                        System.out.println("Bim");
                        break;
                }
            }
        }
    }
}
