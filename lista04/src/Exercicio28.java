public class Exercicio28 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;

            for (int j = 0; j < matriz[0].length; j++) {
                somaLinha += matriz[i][j];
            }

            System.out.println("Soma da linha " + (i+1) + ": " + somaLinha);
        }

    }
}