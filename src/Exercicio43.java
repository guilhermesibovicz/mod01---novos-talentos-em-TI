import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que calcule o numero de prateleiras necessárias para guardar uma quantidade informada de livros. 
        Considerando que em média uma prateleira comporta 32 livros.
        */

        int numprat, qtdlivros;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número de livros que você irá guardar na prateleira");
        qtdlivros = Integer.parseInt(leitor.nextLine());

        numprat = qtdlivros / 32;

        System.out.println("A quantidade de prateleiras usadas será de: " + numprat);
        leitor.close();
    }
}
