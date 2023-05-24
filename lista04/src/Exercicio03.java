public class Exercicio03 {

    public static void main(String[] args) {

        int[] valores = {54,48,44,32,56,4,78,532,9,11,52,1,10,1};
        int maior = valores[0];
        for(int valor : valores){
            if (maior < valor){
                maior = valor;
            }
        }
        System.out.println("O maior valor do array é : " + maior);
    }

}