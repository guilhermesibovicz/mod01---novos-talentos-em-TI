import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo e o número de horas extras trabalhadas. 
        Calcule e mostre o salário a receber seguindo as regras abaixo:
        a)    a hora trabalhada vale 1/8 do salário mínimo;
        b)    a hora extra vale ¼ do salário mínimo;
        c)    o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalha (apresente o valor para o usuário);
        d)    a quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplicado pelo valor da hora extra(apresente o valor para o usuário);
        e)    o salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras(apresente o valor para o usuário);
 
        */
        float numhoras, salminimo, horaextra, salliquido, valhoratrabalhada, valhoraextra, salariobruto, valareceberhoraextra;
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o número de horas trabalhadas");
        numhoras = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do salário mínimo");
        salminimo = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o número de horas extras trabalhadas");
        horaextra = Float.parseFloat(leitor.nextLine());

        valhoratrabalhada = salminimo / 8;
        valhoraextra = salminimo / 4;
        salariobruto = numhoras * valhoratrabalhada;
        valareceberhoraextra = horaextra * valhoraextra;
        salliquido = salariobruto + valareceberhoraextra;


        System.out.println("O salário bruto é de: R$ " + salariobruto);
        System.out.println("O valor a receber das horas extras é de: R$ " + valareceberhoraextra);
        System.out.println("O salário líquido é de: R$ " + salliquido);
        leitor.close();
    }
}
