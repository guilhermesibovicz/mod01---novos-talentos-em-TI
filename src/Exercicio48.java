import java.util.Scanner;
public class Exercicio48 {
    public static void main(String[] args) {
        /*
        Escreva o algoritmo em FLUXOGRAMA que calcule o valor total de aluguel e taxas a serem cobrados de um morador. 
        Solicite o valor do aluguel, o valor do condomínio, considere que o valor do metro cubico do gas é de R$ 1,80 
        e o valor da taxa de consumo de agua é de R$ 0,60 por metro cubico de agua consumida. 
        Apresente também o valor de 5% do valor total do aluguel que pode ser dado como desconto caso seja pago 5 dias antes do vencimento.
 
        */

        float total, valtot, aluguel, condominio, gas, agua, desconto, valorgas, valoragua, fatura;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do aluguel");
        aluguel = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do condominio");
        condominio = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o consumo de gás");
        gas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o consumo de água");
        agua = Float.parseFloat(leitor.nextLine());

        valorgas = gas * 1.80f;
        valoragua = agua * 0.60f;

        System.out.println("Quantos dias de antecedencia foi paga a fatura do aluguel?");
        fatura = Float.parseFloat(leitor.nextLine());

        if (fatura == 5) {
            total = aluguel + condominio + gas + agua;
            desconto = (total * 5) / 100;
            valtot = total - desconto;
            System.out.println("O valor total do aluguel com desconto é de: R$ " + valtot);
        } else {
            total = aluguel + condominio + gas + agua;
            System.out.println("O valor total do aluguel é de: R$ " + total);
            leitor.close();
        }
    }
}