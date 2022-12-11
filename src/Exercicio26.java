import java.util.Scanner;

public interface Exercicio26 {
    public static void main(String[] args) {
        
        /*
         Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. 
         Faça um programa que receba o valor do salário mínimo e 
         a quantidade de quilowatts consumida por uma residência. Calcule e mostre 

        - O valor em reais de cada quilowatt 
        - O valor em reais a ser pago por essa residência 
        - O valor em reais a ser pago com desconto de 15% 

        E: salariomin, quantqw

        P: valordeqw = salariomin / 5;

        */
         
        float salariomin, quantqw, valordeqw, valcons, valcomdesc;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do  salário mínimo");
        salariomin = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de quilowatts consumida por uma residência");
        quantqw = Float.parseFloat(leitor.nextLine());

        valordeqw = salariomin / 5;
        valcons= valordeqw * quantqw;
        valcomdesc = valcons - (valcons * 15) / 100;

        System.out.println("O valor em reais de cada quilowatt é de R$ " + valordeqw);
        System.out.println("O valor em reais a ser pago por essa residência é de R$ " + valcons);
        System.out.println("O valor em reais a ser pago com desconto de 15% é de R$ " + valcomdesc);
        leitor.close();






















    }
}
