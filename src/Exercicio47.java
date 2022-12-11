import java.util.Scanner;
public class Exercicio47 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que calcule o valor de Imposto de Renda que uma Pessoa Física deve pagar de acordo com o valor total de seu rendimento anual: 
        abaixo de R$19.200 isento, acima deste valor e até R$30.000 8%. Mais que R$30.000 anuais 11%.
        */ 

        float imposto, rendimento;
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Digite o valor do seu rendimento anual");
        rendimento = Float.parseFloat(leitor.nextLine());

        if (rendimento <= 19.200) {
            System.out.println("Não será cobrado imposto de renda");
        } else { 
            if (rendimento > 19200 && rendimento <= 30000) {
                imposto = (rendimento * 8) / 100;
                System.out.println("Irá ser descontado imposto de renda de 8%, totalizando R$ " + imposto + " de imposto");
            } else {
                if (rendimento > 30000) {
                    imposto = (rendimento * 11) / 100;
                    System.out.println("Irá ser descontado imposto de renda de 11%, totalizando " + imposto + " de imposto");
                    leitor.close();
                }
            }
        }
    }
}
