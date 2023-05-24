public class Exercicio12 {

    public static void main(String[] args) {

        int[] a = {4,8,6,5,86,68,6,98,5,5,66,8,6,46,8};
        int[] b = {89,2,6,7,29,46,89,5,9,36,8,9,5,5,6};
        int somaA = 0;
        int somaB = 0;
        for (int i = 0; i< a.length; i++){
            somaA += a[i];
            somaB += b[i];
        }
        System.out.println("Soma do vetor a: " + somaA);
        System.out.println("Soma do vetor b: " + somaB);
        double mediaA = (double) somaA / a.length;
        double mediaB = (double) somaB / b.length;
        System.out.println("Media do vetor a: " + mediaA);
        System.out.println("Media do vetor b: " + mediaB);
        System.out.println();
        if (somaA < somaB){
            System.out.println("Maior soma: 'b': " + somaB);
        } else if (somaA == somaB) {
            System.out.println("Somas iguais: 'a': " + somaA + " 'b': " + somaB);
        } else {
            System.out.println("Maior soma: 'a': " + somaA);
        }
        if (mediaA < mediaB){
            System.out.println("Menor media: 'a': " + mediaA);
        }else if (mediaA == mediaB) {
            System.out.println("Medias iguais: 'a': " + mediaA + " 'b': " + mediaB);
        } else {
            System.out.println("Menor media: 'b': " + mediaB);
        }

    }

}