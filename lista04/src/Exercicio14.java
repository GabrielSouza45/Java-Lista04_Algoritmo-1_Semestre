public class Exercicio14 {

    public static void main(String[] args) {

        int[] a = {4,8,6,5,86,68,6};
        int[] b = {89,2,6,7,29,46,58};
        int[] c = new int[a.length + b.length];

        int j=0;
        for (int i =0; i < c.length; i+=2){
            c[i] = a[j];
            c[i+1] = b[j];
            j++;
        }
        System.out.print("[");
        for(int h =0; h < c.length; h++ ){
            System.out.print(
                    c[h] + ((h+1 == c.length) ? ""  : ", ")
            );
        }
        System.out.print("]");
    }

}