public class Exercicio34 {

    public static void main(String[] args) {
        int[][] matriz = {
                {-1, 2, 3, 10, -19},
                {4, -5, 6, -11, 21},
                {-7, 8, -9, 12, -5}
        };

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                 soma += matriz[i][j];
            }
        }

        System.out.println("Soma: " + soma);
    }
}