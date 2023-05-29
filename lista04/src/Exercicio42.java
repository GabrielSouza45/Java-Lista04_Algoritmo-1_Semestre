public class Exercicio42 {

    public static void main(String[] args) {

        int[][] a = {
                { 0, 1, 0, 5, 2 },
                { 0, 1, 0, 8, 3 },
                { 1, 0, 3, 0, 5 }
        };
        int[][] b = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 1, 0, 3 },
                { 1, 0, 1 }
        };
        int maiorA = a[0][0];
        int maiorB = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > maiorA) {
                    maiorA = a[i][j];
                }
            }
        }
        System.out.println("Maior valor de A: " + maiorA);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j] > maiorB) {
                    maiorB = b[i][j];
                }
            }
        }
        System.out.println("Maior valor de B: " + maiorB);
        int produto = maiorA * maiorB;
        System.out.println("Produmo dos maiores valores: " + produto);

    }
}