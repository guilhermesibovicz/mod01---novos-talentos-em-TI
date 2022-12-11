import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        
        /* Faça um programa que receba o peso de uma pessoa em quilos, 
        calcule e mostre esse peso em gramas.
 
E: peso
P: pesoemg = peso / 1000


        */
        float peso;
        float pesoemg;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu peso em kg");
        peso = Float.parseFloat(leitor.nextLine());

        pesoemg = peso * 1000;

        System.out.println("O seu peso em gramas é de: " + (int)pesoemg);

        leitor.close();
    }
}
