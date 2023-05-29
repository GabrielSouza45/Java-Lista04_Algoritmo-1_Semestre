public class Exercicio38 {

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 7, 0},
                {0, 1, 0},
                {1, 0, 3}
        };


        for (int i = 0; i < matriz.length; i++) { //linha

            for (int j = 0; j < matriz[0].length; j++) { //coluna
                if (i <= j) {
                    System.out.print(matriz[i][j] + ((j+1 >= matriz[0].length) ? "" : ","));
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}