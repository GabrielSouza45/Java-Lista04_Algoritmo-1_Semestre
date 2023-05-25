public class Exercicio17 {

    public static void main(String[] args) {

        float[] a = {3, 6, 7, 8, 1, 2, 5, 3, 9};
        float x = 15f;

        System.out.print("Antes da multiplicação ->[");
        for(int i =0; i < a.length; i++){
            System.out.print(a[i] + ((i+1 == a.length) ? ""  : ", "));
        }
        for(int i =0; i < a.length; i++){
            a[i] = a[i] * x;
        }
        System.out.println();
        System.out.print("Após a multiplicação ->[");
        for(int i =0; i < a.length; i++){
            System.out.print(a[i] + ((i+1 == a.length) ? ""  : ", "));
        }
        System.out.print("]");

    }

}