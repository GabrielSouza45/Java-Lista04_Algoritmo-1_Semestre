public class Exercicio08 {

    public static void main(String[] args) {

        int[] valores = {4,2,2,4,5,5,7,7,9,5};
        int x = 5;

        boolean existe = false;
        for(int i =0; i < valores.length; i++){
            if(valores[i] == x){
                existe = true;
                break;
            }
        }
        if (existe){
            System.out.println("Valor existe no vetor.");
        }
        else {
            System.out.println("O valor "+ x + " não existe no vetor.");
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