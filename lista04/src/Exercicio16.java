public class Exercicio16 {

    public static void main(String[] args) {

        int[] a = {3, 6, 7, 8, 1, 2, 5, 3, 9};

        boolean move = true;
        while(move){
            move = false;
            for(int i =0; i < a.length -1; i++){
                if (a[i] % 2 ==1 && a[i+1] % 2 ==0){
                    move= true;
                    int aux = a[i];
                    a[i] = a[i+1];
                    a[i+1] = aux;
                }
            }
        }
        System.out.println("Array em ordem crescente: " );
        System.out.print("[");
        for(int h =0; h < a.length; h++ ){
            System.out.print(
                    a[h] + ((h+1 == a.length) ? ""  : ", ")
            );
        }
        System.out.print("]");

    }

}