public class Exercicio37 {

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 0, 0},
                {0, 0, 0},
                {1, 0, 3},
                {1, 0, 1}
        };

        int tamanhoLinha = matriz[0].length;
        int linhasNulas = 0;
        for (int i = 0; i < matriz.length; i++) { //linha
            int qtdNulos = 0;
            for (int j = 0; j < matriz[0].length; j++) { //coluna
                if (matriz[i][j] == 0) {
                    qtdNulos++;
                }
            }
            if (qtdNulos == tamanhoLinha) {
                linhasNulas++;
            }
        }
        System.out.println("Total de linhas nulas: " + linhasNulas);

        int tamanhoColuna = matriz.length;
        int colunasNulas = 0;
        for (int i = 0; i < matriz[0].length; i++) { //coluna
            int qtdNulos = 0;
            for (int j = 0; j < matriz.length; j++) { //linha
                if (matriz[j][i] == 0) {
                    qtdNulos++;
                }
            }
            if (qtdNulos == tamanhoColuna) {
                colunasNulas++;
            }
        }
        System.out.println("Total de colunas nulas: " + colunasNulas);

    }
}