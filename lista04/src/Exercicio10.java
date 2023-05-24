public class Exercicio10 {

    public static void main(String[] args) {

        double[] vetor = {.1, 1, 2.5, 3, 4.9, 5.4, 6, 7, 8, 9.8, 10};
        // Somente números inteiros podem ser considerados par ou ímpar
        double x = 2;
        double mult = 0;
        for (double valor : vetor) {
            if ( valor % 2.0 == 1){
                mult += valor * x;
            }
        }

        System.out.println(mult);
    }

}