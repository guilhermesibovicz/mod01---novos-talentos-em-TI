import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        
        /*
        Faça um programa que receba o salário-base de um funcionário, calcule e mostre o seu salário a receber, 
        sabendo-se que esse funcionário tem gratificação de R$ 50,00 e paga imposto de 10% sobre o salário-base. 



        */

        float salariobase, salarioarec, saltotal;
        final float imposto = 90;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário base");
        salariobase = Float.parseFloat(leitor.nextLine());
    
        salarioarec = (salariobase * imposto) / 100; 
        saltotal = salarioarec + 50;

        System.out.println("O valor do salário a receber é de: R$ " + saltotal);
        leitor.close();

















    }
}
