public class Exercicio40 {

    public static void main(String[] args) {

        int[][] matriz = {
                {0, 1, 0, 5, 2},
                {0, 1, 0, 8, 3},
                {1, 0, 3, 0, 5}
        };
        int x = 4;
        boolean exists = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] == x){
                    System.out.println("Linha: " + (i+1) + "\n Coluna: " + (j+1));
                    exists = true;
                }
            }
        }
        if (!exists){
            System.out.println("Valor não existe na matriz");
        }

    }
}