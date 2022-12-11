import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        

        /* Faça um programa que receba o peso de uma pessoa, calcule e mostre:
        - o novo peso, se a pessoa engordar 15% sobre o peso digitado;
        - o novo peso, se a pessoa emagrecer 20% sobre o peso digitado.

        E: peso 
        P: pesototal = peso + (peso * 15) / 100 
        P: pesotot = peso - (peso * 20) / 100

        */

        float peso;
        final float engorda = 15;
        float pesototal;
        float pesotot;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu peso");
        peso = Float.parseFloat(leitor.nextLine());
        pesototal = peso + (peso * engorda) / 100;
        pesotot = peso - (peso * 20) / 100;

        System.out.println("Você engordou e está com kg " + pesototal);
        System.out.println("Você emagreceu e está com kg " + pesotot);
        leitor.close();
    }
}
