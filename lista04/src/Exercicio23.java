public class Exercicio23 {

    public static void main(String[] args) {

        int N = 5;
        int M = 7;

        int[][] matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i % 2 == 0){
                    matriz[i][j] = 21;
                } else {
                    matriz[i][j] = 10;
                }
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