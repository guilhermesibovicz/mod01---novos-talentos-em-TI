import java.util.Scanner;
public class Exercicio54 {
    public static void main(String[] args) {
        /*
        Faça um ÚNICO programa para auxiliar uma empresa de importação a calcular o valor do preço final de importação de um produto. 
        Para isso solicite ao usuário: o preço original do produto em dólares, o valor da cotação do dólar, 
        o preço do transporte em reais e o tipo de imposto que deve incidir sobre o preço do produto (1 – IPI, 2 – ICMS, 3 – Ambos IPI e ICMS). 
 
        Para CADA item abaixo calcule e mostre: 
        
        O preço do produto em reais, que consiste no preço original do produto em dólares e o valor da cotação do dólar.
        
        O valor do imposto federal em reais, de acordo com a tabela abaixo, 
        considerando o tipo informado de imposto que incide sobre o produto e o preço do produto em reais já calculado:
        
        Tipo Imposto             |Preço do Produto em Reais             |% de Imposto 
        -------------------------+--------------------------------------+----------------
        IPI                      |Até R$3.000,00 (inclusive)            | 1,5% 
                                 |Mais de R$3.000,00                    | 2% 
        -------------------------+--------------------------------------+----------------
        ICMS                     |Até R$ 1.500,00                       | 2% 
                                 |Mais de R$ 1.500,00 (inclusive)       | 3,5% 
        -------------------------+--------------------------------------+----------------
        Ambos IPI e ICMS                                                | 5% 
        -------------------------+--------------------------------------+----------------
        
        O valor do imposto estadual em reais, conforme a regra abaixo:
        O valor do imposto estadual em reais será 2/7 (dois sétimos) do valor do imposto federal em reais calculado anteriormente.
        
        O valor do preço final de importação de um produto, consiste na soma do preço do produto em reais com o valor do imposto federal em reais, 
        o preço do transporte em reais, e o valor do imposto estadual em reais.
        */

        float valoriginalemdol, valororiginalemreal = 0, cotacao, transporte, impostofed, precofinal, impostoest;
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o preço original do produto em dólares");
        valoriginalemdol = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da cotação do dólar");
        cotacao = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o preço do transporte em reais");
        transporte = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite 1 se o tipo de imposto for IPI, 2 para ICMS ou 3 para AMBOS");
        impostofed = Float.parseFloat(leitor.nextLine());

        valororiginalemreal = valoriginalemdol * cotacao;
        System.out.println("O valor convertido de dolares para real é de R$ " + valororiginalemreal);

        if (impostofed == 1 && valororiginalemreal <= 3000){
            impostofed = (valororiginalemreal * 1.5f) / 100;
        } else {
            if (impostofed == 1 && valororiginalemreal > 3000) {
                impostofed = (valororiginalemreal * 2) / 100;
            } else {
                if (impostofed == 2 && valororiginalemreal < 1500) {
                    impostofed = (valororiginalemreal * 2) / 100;
                } else {
                    if (impostofed == 2 && valororiginalemreal>= 1500) {
                        impostofed = (valororiginalemreal * 3.5f) / 100;
                    } else {
                        if (impostofed == 3) {
                            impostofed = (valororiginalemreal * 5) / 100;
                        }
                    }
                }
            }
        }
        System.out.println("O valor do imposto federal é de R$ " + impostofed);

        impostoest = (impostofed / 7) * 2;
        System.out.println("O valor do imposto estadual é de R$ " + impostoest );
        precofinal = valororiginalemreal + impostofed + transporte + impostoest;
        System.out.println("O valor final do produto é de R$ " + precofinal);
        leitor.close();
    }
}
