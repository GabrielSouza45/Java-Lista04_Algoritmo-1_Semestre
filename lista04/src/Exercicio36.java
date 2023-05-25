public class Exercicio36 {

    public static void main(String[] args) {
        int[][] matriz = {
                {-1, 2, 3, 10, -19},
                {4, -5, 6, -11, 21},
                {-7, 8, -9, 12, -5},
                {1,  2,  5,  7,  8},
                {25, 8, 66, -48, 12}
        };

        int aux =0;
        for (int i = 0; i < matriz.length; i++) { //linha
            for (int j = 0; j < matriz[0].length; j++) { //coluna
                if (j+aux < matriz[0].length) {
                    System.out.println(matriz[i][j + aux]);
                    aux++;
                    break;
                }
            }

        }

    }
}