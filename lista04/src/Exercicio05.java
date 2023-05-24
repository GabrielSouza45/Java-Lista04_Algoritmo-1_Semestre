public class Exercicio05 {

    public static void main(String[] args) {

        int[] valores = {54,48,44,32,56,4,78,532,9,11,52,1,10,1};
        float soma = 0;

        for(int valor : valores){
            soma += valor;
        }
        float media = soma / valores.length;
        System.out.println("A média dos valores do array é: " + media );
    }

}