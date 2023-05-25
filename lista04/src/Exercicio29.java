public class Exercicio29 {

    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 5, 9, 8, 7, 6, 4};
        int N = 5;
        int M = vetor.length;

        int[][] matriz = new int[N][M];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = vetor[j];
            }
        }
        System.out.print("[");
        for (int i = 0; i < N; i++) {
            System.out.print("[");
            for (int j = 0; j < M; j++) {
                System.out.print(
                        matriz[i][j] + (j+1 >= M ? ""  : ", ")
                );
            }
            System.out.print("]");
            if (i+1 != N){
                System.out.println(", ");
            }
            else {
                System.out.println("]");
            }
        }

    }
}