import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
      


int numerodepessoas = 0;
int quantidadedecarne = 250;
int quantasref = 0;

Scanner leitor = new Scanner(System.in); 

System.out.println("Digite o número de passoas convidadas");
numerodepessoas = Integer.parseInt(leitor.nextLine());

System.out.println("Digite quantas refeições cada um irá comer");
quantasref = Integer.parseInt(leitor.nextLine());

quantidadedecarne = numerodepessoas * quantidadedecarne * quantasref;

System.out.println("O consumo de carne será de: " + quantidadedecarne);


leitor.close();



    }
}
