public class Exercicio09 {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.print("[");
        for (int i = 0; i < c.length; i++) {
            System.out.print(
                    c[i] + ((i + 1 == c.length) ? "" : ", ")
            );
        }
        System.out.print("]");
    }

}