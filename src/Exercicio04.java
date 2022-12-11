import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

double numdefotos = 0;
double valorfotos = 0.90;
double reembolsodasfotos = 0;

Scanner leitor = new Scanner(System.in);

System.out.println("Digite o número de fotos reveladas");
numdefotos = Double.parseDouble(leitor.nextLine());

reembolsodasfotos = valorfotos * numdefotos;

System.out.println("O valor do reembolso das fotos serão de: "  + reembolsodasfotos);

leitor.close();





    }
}
