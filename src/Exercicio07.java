import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        float valorboleto = 0;
        float percmulta = 0;
        float valtotalmulta = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do boleto");
        valorboleto = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o percentual da multa");
        percmulta = Float.parseFloat(leitor.nextLine());

   valtotalmulta = (valorboleto * percmulta) / 100;
    
   System.out.println("O valor da multa por atraso é de: " + valtotalmulta);
        
   leitor.close();
   
    }
}
