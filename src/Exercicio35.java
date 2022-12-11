import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {
        
        /*
        O custo ao consumidor de um carro novo é a soma do preço da fábrica com o percentual de
        lucro do distribuidor e dos impostos aplicados ao preço de fábrica. Faça um programa que receba o preço de fábrica de um veículo,
        o percentual de lucro do distribuidor e o percentual de impostos. Calcule e mostre:
        a.    O valor correspondente ao lucro do distribuidor
        b.    O valor correspondente aos impostos
        c.    O preço final do veículo
        */

        float preco, percentual, percimp, valorimposto, lucro, valtot;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do carro");
        preco = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do percentual de lucro do distribuidor");
        percentual = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do percentual de impostos");
        percimp = Float.parseFloat(leitor.nextLine());

        lucro = preco * percentual / 100;
        valorimposto = (preco * percimp) / 100;
        valtot = preco + lucro + valorimposto;

        System.out.println("O valor do lucro do distribuidor é de: R$ " + lucro);
        System.out.println("O valor do imposto é de: R$ " + valorimposto);
        System.out.println("O valor total do carro é de : R$ " + valtot);
        leitor.close();
    }
}
