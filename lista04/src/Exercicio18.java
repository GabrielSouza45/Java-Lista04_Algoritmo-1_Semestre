public class Exercicio18 {

    public static void main(String[] args) {

        int[] valores = {4,2,2,4,5,5,7,7,9,5};

        int x = 5;
        int exists = 0;
        for(int i =0; i < valores.length; i++){
            if(valores[i] == x){
                exists++;
            }
        }
        int[] posicao = new int[exists];
        int j =0;
        for(int i =0; i < valores.length; i++){
            if(valores[i] == x){
                posicao[j] = (i+1);
                j++;
            }
        }
        if (posicao.length > 0){
            System.out.println("O valor " + x + " existe" + ((posicao.length > 1)? " nas posições: ": " na posição: "));
            for(int i =0; i< posicao.length; i++){
                System.out.print(
                        posicao[i] + ((i+1 == posicao.length) ? ""  : ", ")
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