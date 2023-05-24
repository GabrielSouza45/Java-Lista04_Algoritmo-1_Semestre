public class Exercicio04 {

    public static void main(String[] args) {

        double[] valores = {54,48,44,32,56,4,78,532,9,11,52,1,10,1};
        double menor = valores[0];
        for(double valor : valores){
            if (menor > valor){
                menor = valor;
            }
        }
        System.out.println("O menor valor do array é : " + menor);
    }

}