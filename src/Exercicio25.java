import java.util.Scanner;

public interface Exercicio25 {
    public static void main(String[] args) {
        
        /*
        Um trabalhador recebeu seu salário e depositou em sua conta corrente bancária.
        Esse trabalhador emitiu dois cheques e agora deseja saber seu saldo atual. 
        Sabe-se que cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial da conta esta zerado. 

        */
        
        float salario, cheque1, cheque2, valtotcheque, novosal;
        final float imposto = 0.38f;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do cheque1");
        cheque1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do cheque2");
        cheque2 = Float.parseFloat(leitor.nextLine());

        cheque1 += (cheque1 * imposto) / 100;
        cheque2 += (cheque2 * imposto) / 100;
        valtotcheque = cheque1 + cheque2;
        novosal = salario - valtotcheque;


        System.out.println("O saldo total do que resta da sua conta é de: R$ " + novosal);
        leitor.close();







    }
}
