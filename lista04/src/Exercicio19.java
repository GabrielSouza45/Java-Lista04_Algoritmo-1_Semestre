public class Exercicio19 {

    public static void main(String[] args) {

        int[] valores =  {6, 8, 2, 3, 7, 1, 5, 3, 9};

        int exists = 0;
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) {
                exists++;
            }
        }
        int[] posicao = new int[exists];
        int j =0;
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) {
                posicao[j] = valores[i];
                j++;
            }
        }

        for (int i = 0; i < posicao.length; i++) {
            System.out.print(
                    posicao[i] + ((i + 1 == posicao.length) ? "" : ", ")
            );
        }
        System.out.println();
    }

}