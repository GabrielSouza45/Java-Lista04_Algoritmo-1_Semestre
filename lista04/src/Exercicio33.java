import java.util.HashMap;

public class Exercicio33 {

    public static void main(String[] args) {
        int[][] matriz = {
                {-1, 2, 3, 10, -19},
                {4, -5, 6, -11, 21},
                {-7, 8, -9, 12, -5}
        };


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                 if (matriz[i][j] < 0){
                     System.out.println("Linha: "+ (i+1) + "\n Coluna: "+ (j+1) );
                 }
            }
        }
    }
}