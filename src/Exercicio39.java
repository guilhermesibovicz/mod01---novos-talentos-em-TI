import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {
        /*
        Escreva o algoritmo de um programa que solicite dois números quaisquer ao usuário, 
        se os números forem iguais mostre uma mensagem e mostre a media dos dois, 
        caso contrário mostre qual o maior número e qual o menor número. 
        */

        int num1, num2, media;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número qualquer");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite um segundo número qualquer");
        num2 = Integer.parseInt(leitor.nextLine());

        if (num1 == num2) {
            media = num1 + num2 / 2;
            System.out.println("A média dos números é de: " + media);
        } else {
            if (num1 > num2) {
                System.out.println("O número maior é o " + num1);
            } else {
                if (num2 > num1) {
                    System.out.println("O número maior é o " + num2);
                    leitor.close();
                }
            }
        }
    }
}
