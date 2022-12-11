import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        
        /*
        Faça um programa que receba o salário de um funcionário
        e o percentual de aumento, calcule e mostre o valor do 
        aumento e o novo salário. 

        E: salario, aumento, valaumento, novosal;

        P: novosal = salario + (salario * aumento) / 100;

        */

        float salario, aumento, valaumento, novosal;
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Digite o valor do salário");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a porcentagem do aumento");
        aumento = Float.parseFloat(leitor.nextLine());

        valaumento = aumento * salario;
        novosal = salario + (salario * aumento) / 100;

        System.out.println("O valor do aumento é de: R$ " + valaumento);
        System.out.println("O valor do novo salário é de: R$ " + novosal);
        leitor.close();
    }
}
