import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        
        /*
        Faça um programa que receba o salário-base de um funcionário, calcule e mostre o salário a receber, 
        sabendo-se que esse funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre o salário-base.


        */
        float salario, salarioliq, imposto;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu salário base");
        salario = Float.parseFloat(leitor.nextLine());
        
        imposto = (salario * 7) / 100;
        salario += (salario * 5) / 100;
        salarioliq = salario - imposto;

        System.out.println("O valor de seu salário é de: R$ " + salarioliq);
        leitor.close();
    }
}
