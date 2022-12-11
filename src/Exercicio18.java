import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        
        /*
        Faça um programa que receba uma temperatura em Celsius, 
        calcule e mostre essa temperatura em Fahrenheit. 
        Sabe-se que F = C x 1,8 + 32
        */

        float grauC, conversao;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite uma temperatura em graus Celsius");
        grauC = Float.parseFloat(leitor.nextLine());

        conversao = (grauC * 1.8f) + 32;

        System.out.println("Essa temperatura em Celsius para Fahrenheit é " + (int)conversao + "°F");
        leitor.close();

    }

}
