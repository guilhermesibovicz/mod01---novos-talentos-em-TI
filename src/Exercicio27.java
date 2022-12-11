import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        
        /*
        27) Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa que vai viajar possui. 
        Essa pessoa vai passar por vários países e precisa converter seu dinheiro em dólares, marco alemão e libra esterlina. 
        Sabe-se que a cotação do dólar é R$ 1,80 do marco alemão R$2,00 e da libra esterlina de R$ 1,57. 
        O programa deve fazer as conversões e mostrá-las.

        float dinheiro, dólaresconv, marcoalemãoconv, libraconv;
        final float  dólares = 1.80, marcoalemão = 2.00, libraesterlina = 1.57;

        */

        float dinheiro, dolaresconv, marcoalemaoconv, libraconv;
        final float  dolares = 1.80f, marcoalemao = 2.00f, libra = 1.57f;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o total em dinheiro que você posssui");
        dinheiro = Float.parseFloat(leitor.next());

        dolaresconv = dinheiro / dolares;
        marcoalemaoconv = dinheiro / marcoalemao;
        libraconv = dinheiro / libra;
         
        System.out.println( + dinheiro + " covertido para dolar é: " + dolaresconv);
        System.out.println( + dinheiro + " covertido para dolar é: " + marcoalemaoconv);
        System.out.println( + dinheiro + " covertido para dolar é: " + libraconv);

        leitor.close();
    }

}
