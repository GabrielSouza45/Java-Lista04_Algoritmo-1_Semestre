public class Exercicio06 {

    public static void main(String[] args) {

        int[] valores = {1,2,3,4,5,6,7,8,9,10};
        int produto = 1;

        for(int valor : valores){
            produto *= valor;
        }
        System.out.println("O produto dos valores do array é: " + produto );
    }

}