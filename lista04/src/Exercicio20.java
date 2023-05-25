import java.util.ArrayList;
import java.util.List;

public class Exercicio20 {

    public static void main(String[] args) {

        int[] valores = {6, 8, 2, 3, 7, 1, 5, 3, 9, 21, 30, 58, 90, 36, 10, 15, 1};

        int tamanho = 0;
        for (int value : valores) {
            if (value % 3 == 0) {
                tamanho++;
            }
        }
        int[] novaArray = new int[tamanho];
        int i = 0;
        for (int value : valores) {
            if (value % 3 == 0) {
                novaArray[i] = value;
                i++;
            }
        }
        System.out.println("Array com divisíveis por 3: ");
        System.out.print("[");
        for (int j = 0; j < novaArray.length; j++) {
            System.out.print(
                    novaArray[j] + ((j + 1 >= tamanho) ? "" : ", ")
            );
        }
        System.out.print("]");
        System.out.println();
        System.out.println("posições ímpares" +
                "");
        if (tamanho > 0) {
            for (int j = 0; j < novaArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(
                            novaArray[j] + ((j + 1 >= tamanho) ? "" : ", ")
                    );
                }
            }
        }
        System.out.println();


    }

}