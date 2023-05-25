import java.util.ArrayList;
import java.util.List;

public class Exercicio19 {

    public static void main(String[] args) {

        int[] valores =  {6, 8, 2, 3, 7, 1, 5, 3, 9};

        List<Integer> posicao = new ArrayList<>();
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) {
                posicao.add(valores[i]);
            }
        }
        for (int i = 0; i < posicao.size(); i++) {
            System.out.print(
                    posicao.get(i) + ((i + 1 == posicao.size()) ? "" : ", ")
            );
        }
        System.out.println();


    }

}