public class Exercicio11 {

    public static void main(String[] args) {

        double[] vetor = {.1, 1, 2.5, 3, 4, 5.4, 6, 7, 8, 9.8, 10, 553.4, 21.3, 57, 1121.1};
        // Somente números inteiros podem ser considerados par ou ímpar

        double soma = 0;
        int qtd = 0;
        for (double valor : vetor) {
            if ( valor % 2.0 == 0){
                soma += valor;
                qtd++;
            }
        }
        double media = soma / qtd;
        System.out.println("Media: "+ media);
        for (double valor : vetor) {
            if ( valor > media ){
                System.out.println(valor);
            }
        }

    }

}