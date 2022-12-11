import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        /*
         * Faça um programa que receba um número inteiro e mostre se ele é par ou impar.
         * (utilize o operador %)
         * se (num % 2 == 0 ) ENTAO INICIO
         * ESCREVA "PAR"
         * FIM
         * SENAO INICIO
         * ESCREVA "IMPAR"
         * FIM
         * 
         */

        int numero, resto;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        numero = Integer.parseInt(leitor.nextLine());

        resto = numero % 2;
        if (resto == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
        leitor.close();
    }
}
