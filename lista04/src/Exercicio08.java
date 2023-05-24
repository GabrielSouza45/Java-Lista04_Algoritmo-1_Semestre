import java.util.ArrayList;
import java.util.List;

public class Exercicio08 {

    public static void main(String[] args) {

        int[] valores = {4,2,2,4,5,5,7,7,9,5};

        int x = 5;

        List<Integer> posicao = new ArrayList<>();
        for(int i =0; i < valores.length; i++){
            if(valores[i] == x){
                posicao.add(i+1);
            }
        }
        if (posicao.size() > 0){
            System.out.println("O valor " + x + " existe" + ((posicao.size() > 1)? " nas posições: ": " na posição: "));
            for(int i =0; i< posicao.size(); i++){
                System.out.print(
                        posicao.get(i) + ((i+1 == posicao.size()) ? ""  : ", ")
                );
            }
            System.out.println();
        }
        else {
            System.out.println("O valor "+ x + " não existe no array.");
        }
        System.out.println();
        System.out.println("Array: ");
        System.out.print("[");
        for(int i =0; i < valores.length; i++ ){
            System.out.print(
                  valores[i] + ((i+1 == valores.length) ? ""  : ", ")
            );
        }
        System.out.print("]");

    }

}