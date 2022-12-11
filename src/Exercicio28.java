import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {

        int idade;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        idade = Integer.parseInt(leitor.nextLine());
        if (idade >= 18) {
            // ENTÃO SIM
            System.out.println("Você é maior de idade");
        } else {
            // SENÃO NÃO (ELSE)
            System.out.println("Você é menor de idade");
            leitor.close();
        }
    }
}