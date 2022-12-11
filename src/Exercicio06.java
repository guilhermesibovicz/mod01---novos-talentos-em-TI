import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        float qtdracaodia = 0;
        float qtdrefdia = 0;
        float qtdmes = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de ração que o cachorro consome por dia:");
        qtdracaodia = Float.parseFloat(leitor.nextLine());
    
        System.out.println("Digite o quantidade de refeição que o cachorro consome por dia:");
         qtdrefdia = Float.parseFloat(leitor.nextLine());

        qtdmes = qtdracaodia * qtdrefdia * 30f;

        System.out.println("O cachorro irá consumir no mês: " + qtdmes);

        leitor.close();

    }
}
