public class Exercicio07 {

    public static void main(String[] args) {

        int[] valores = {1,2,3,4,5,6,7,8,9,10};
        int x = 20;
        int mult = 0;

        for(int valor : valores){
            mult += valor * x;
        }
        System.out.println("O produto dos valores do array multiplicado pelo valor " + x
                + " é: " + mult );
    }

}