public class Exercicio39 {

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 7, 0},
                {0, 1, 0},
                {1, 0, 3},
                {5, 2, 0}
        };
        int[][] matriz2 = {
                {0, 7, 0, 5, 2},
                {0, 1, 0, 8, 4},
                {1, 0, 3, 0, 5}
        };

        int linhasMatriz1 = matriz.length;
        int linhasMatriz2 = matriz2.length;
        int colunasMatriz1 = matriz[0].length;
        int colunasMatriz2 = matriz2[0].length;
        int[][] produto = new int[linhasMatriz1][colunasMatriz2];


        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                int soma =0;
                for (int h = 0; h < colunasMatriz1;h++){
                    soma += matriz[i][h] * matriz2[h][j];
                }
                produto[i][j] = soma;
            }
        }

        for (int i = 0; i < produto.length; i++){
            for (int j = 0; j < produto[0].length; j++){
                System.out.print(produto[i][j] + ((j+1 >= produto[0].length) ? "" : ", "));
            }
            System.out.println();
        }
    }
}