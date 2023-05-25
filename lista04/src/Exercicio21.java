import java.util.HashMap;
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[qtd];
        double[] notas = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = sc.nextLine();

            System.out.print("Digite a nota de " + nome[i] + " : ");
            notas[i] = sc.nextInt();
            sc.nextLine();
        }

        double media = 0;
        for(double nota : notas ){
            media += nota;
        }
        media = media / notas.length;
        System.out.println(media);

        HashMap<String, Double> acimaDaMedia = new HashMap<>();
        for(int i = 0; i < qtd; i++){
            if (notas[i] >= media){
                acimaDaMedia.put(nome[i], notas[i]);
            }
        }

        for(String key : acimaDaMedia.keySet()){
            System.out.println("Aluno(a): " + key + "\n Nota: " + acimaDaMedia.get(key));
        }

    }

}