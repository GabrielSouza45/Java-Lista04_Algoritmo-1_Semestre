public class Exercicio02 {

    public static void main(String[] args) {

        double[] valores = {1,2,3,4,5,6,7,8,9,10};
        double soma = 0;
        for(double valor : valores){
            soma += valor;
        }
        System.out.println("A soma de todos os valores é igual a: " + soma);
    }

}