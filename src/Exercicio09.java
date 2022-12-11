import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        float preco; 
        final float desconto = 10;
        float precototal;
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Digite o preço do produto");
        preco = Float.parseFloat(leitor.nextLine());
        precototal = preco - (preco * desconto / 100);

        System.out.println("O preço com desconto é de: " + precototal);
        leitor.close();

    }
}
