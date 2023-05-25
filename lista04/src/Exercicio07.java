public class Exercicio07 {

    public static void main(String[] args) {

        int[] valores = {1,2,3,4,5,6,7,8,9,10};
        int x = 20;

        for(int i =0; i < valores.length; i++){
            valores[i] = valores[i] * x;
        }
        System.out.print("[");
        for(int i =0; i < valores.length; i++){
            System.out.print(valores[i] + ((i+1 == valores.length) ? ""  : ", "));
        }
        System.out.print("]");
    }

}