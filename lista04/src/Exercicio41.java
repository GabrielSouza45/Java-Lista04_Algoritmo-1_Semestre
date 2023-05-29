public class Exercicio41 {

    public static void main(String[] args) {

        int[][] matriz = {
                {0, 1, 0, 5, 2},
                {0, 1, 0, 8, 3},
                {1, 0, 3, 0, 5}
        };
        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("Maior valor: " + maior);

    }
}