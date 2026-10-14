public class MatrizesArmarios {
    static void main(String[] args) {
        int[][] armarios = {
                {0, 1, 0, 0},
                {0, 0, -1, 0},
                {1, 0, 0, 0},
                {-1, 0, 1, 0},
                {0, 0, 0, 0}
        };
        int quantidade = 2;

        for (int j = 0; j < armarios[0].length; j++){
            for (int i = 0; i < armarios.length; i++){
                System.out.printf("%d ", armarios[i][j]);
            }
            System.out.println();
        }


//        System.out.println();

//        for (int i  = 0; i < armarios.length; i++){
//            for (int j = 0; j < armarios[i].length; j++){
//                System.out.printf("%d ", armarios[i][j]);
//            }
//            System.out.println();
//        }
    }
}
