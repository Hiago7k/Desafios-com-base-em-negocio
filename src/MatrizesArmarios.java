public class MatrizesArmarios {
    static void main(String[] args) {
        int[][] armarios = {
                {0, 1, 0, 0},
                {0, 0, -1, 0},
                {1, 0, 0, 0},
                {-1, 0, 1, 0},
                {0, 0, 0, 0}
        };

        for (int i = 0; i < armarios.length; i++) {
            for (int j = 0; j < armarios[i].length; j++) {
                System.out.printf("%d ", armarios[i][j]);
            }
            System.out.println();
        }


        int quantidade = 2;
        boolean achou = false;
        int grupo = 0;

        int numeroColuna = 0;
        int numeroAndar = 0;

        for (int j = 0; j < armarios[0].length; j++) {
            for (int i = 0; i < armarios.length; i++) {

                if (armarios[i][j] == 0) {
                    grupo++;
                }else {
                    grupo = 0; // zero a sequencia
                }

                if (grupo == quantidade) {
                    achou = true;
                    System.out.println("Achou par");
                    System.out.printf("j: %d%n", j + 1);
                    System.out.printf("i: %d%n", i + 1);
                    armarios[i][j] = 999;
                    armarios[i - 1][j] = 999;
                    break;
                }
            }
            if (achou) {
                break;
            }
            System.out.println();
        }


        System.out.println();

        for (int i = 0; i < armarios.length; i++) {
            for (int j = 0; j < armarios[i].length; j++) {
                System.out.printf("%d ", armarios[i][j]);
            }
            System.out.println();
        }
    }
}
