import java.util.Scanner;
public class Exercicio45 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que calcule o valor de desconto que será oferecido ao comprador de uma loja de acordo com o valor da compra: 
        compras até R$100 desconto de 5%, compras maiores que R$ 100 e ate R$400 desconto de 10%, e acima de R$ 400 desconto de 13%. 
        Após o calculo do valor com desconto, acrescente o valor da taxa de entrega que é de R$ 1,5 por item comprado.
        */

        double desconto, compra, itemcomp = 0, novoval;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra");
        compra = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a quantidade de itens que você comprou");
        itemcomp = Double.parseDouble(leitor.nextLine());

        if (compra <= 100) {
            desconto = (compra * 5) / 100;
            novoval = itemcomp * 1.5;
            System.out.println("O valor do desconto é de R$ " + desconto + " e o valor da taxa de entrega é de R$ "+ novoval);
        } else {
            if (compra > 100 && compra <=400) {
                desconto = (compra * 10) / 100;
                novoval = itemcomp * 1.5;
                System.out.println("O valor do desconto é de R$ " + desconto +" e o valor da taxa de entrega é de R$ " + novoval);
            } else {
                if (compra > 400) {
                    desconto = (compra * 13) / 100;
                    novoval = itemcomp * 1.5;
                    System.out.println("O valor do desconto é de R$" + desconto +" e o valor da taxa de entrega é de R$ " + novoval);
                    leitor.close();
                }
            }
        }
    }
}