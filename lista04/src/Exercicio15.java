public class Exercicio15 {

    public static void main(String[] args) {

        int[] a = {68,4,8,6,5,86,6};

        boolean move = true;
        while(move){
            move = false;
            for(int i =0; i < a.length -1; i++){
                if (a[i] > a[i+1]){
                    move= true;
                    int aux = a[i];
                    a[i] = a[i+1];
                    a[i+1] = aux;
                }
            }
        }
        System.out.println("Lista em ordem crescente: " );
        System.out.print("[");
        for(int h =0; h < a.length; h++ ){
            System.out.print(
                    a[h] + ((h+1 == a.length) ? ""  : ", ")
            );
        }
        System.out.print("]");

    }

}