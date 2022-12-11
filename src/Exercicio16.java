import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        
        /*
 Faça um programa que receba o valor do salario
  mínimo e o valor do salário de um funcionário, 
 calcule e mostre a quantidade de salários mínimos que esses funcionário ganha.

E: salario minimo, valorsalfun
P: resultado = salariomin / salariofun


        */

        float salariomin, salariofun, resultado;
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o salario minimo");
        salariomin  = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o salario do funcionário");
        salariofun  = Float.parseFloat(leitor.nextLine());

        resultado = salariomin / salariofun;

        System.out.println("Ele recebe: " + (int)resultado  +  " salários mínimos");
        
        leitor.close();  
        










    }
}
