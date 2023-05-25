public class Exercicio10 {

    public static void main(String[] args) {

        double[] vetor = {.1, 1, 2.5, 3, 4.9, 5.4, 6, 7, 8, 9.8, 10};
        // Somente números inteiros podem ser considerados par ou ímpar
        double x = 15;
        System.out.print("Antes da multiplicação ->[");
        for(int i =0; i < vetor.length; i++){
            System.out.print(vetor[i] + ((i+1 == vetor.length) ? ""  : ", "));
        }
        System.out.print("]");
        System.out.println();
        for(int i =0; i < vetor.length; i++){
            if ( vetor[i] % 2.0 == 1){
                vetor[i] = vetor[i] * x;
            }
        }

        System.out.print("Após a multiplicação ->[");
        for(int i =0; i < vetor.length; i++){
            System.out.print(vetor[i] + ((i+1 == vetor.length) ? ""  : ", "));
        }
        System.out.print("]");
    }

}