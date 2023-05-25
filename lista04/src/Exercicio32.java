public class Exercicio32 {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 10, 19},
                {4, 5, 6, 11, 21},
                {7, 8, 9, 12, 5}
        };

        for (int j = 0; j < matriz[0].length; j++) {
            int somaColuna = 0;
            if (j % 2 == 0) {
                for (int i = 0; i < matriz.length; i++) {
                    somaColuna += matriz[i][j];
                }

                System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna);
            }
        }
    }
}