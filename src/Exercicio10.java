import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        /*
        Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. 
        Faça um programa que receba o salário fixo do funcionário e o valor de suas vendas,
         calcule e mostre a comissão e seus salário final.
        */

        Float salario;
        
        float salariofinal;
        final float comissao = 4;
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Digite o valor do salário fixo");
        salario = Float.parseFloat(leitor.nextLine());
       

        salariofinal = salario + (salario * comissao) / 100;

        System.out.println("O salário final junto com a comissão é de: R$ "+ salariofinal);
        leitor.close();
    }
}
