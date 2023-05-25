public class Exercicio31 {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int j = 0; j < matriz[0].length; j++) {
            int somaColuna = 0;

            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }

            System.out.println("Soma da coluna " + (j+1) + ": " + somaColuna);
        }
    }
}