import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
float salario = 0;
float despesas = 0;
float percentual = 0;

Scanner leitor = new Scanner(System.in);

System.out.println("Digite o seu salário");
salario = Float.parseFloat(leitor.nextLine());

System.out.println("Digite o valor das suas depesas");
despesas = Float.parseFloat(leitor.nextLine());

percentual = (despesas * 100) / salario;

System.out.println("O percentual de suas despesas são: " + percentual + "%");


leitor.close();



    }
}
