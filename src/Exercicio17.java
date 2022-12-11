import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

float salario, valconta1, valconta2, valmulta1, valmulta2;
Scanner leitor = new Scanner(System.in);

System.out.println("Digite o seu salário");
salario = Float.parseFloat(leitor.nextLine());
System.out.println("Digite o valor da primeira conta");
valconta1 = Float.parseFloat(leitor.nextLine());
System.out.println("Digite o valor da segunda conta");
valconta2 = Float.parseFloat(leitor.nextLine());

valmulta1 = (valconta1 * 2f) / 100f;
valmulta2 = (valconta2 * 2f) / 100f;
//salario = salario - (valconta1 + valconta2 + valmulta1 + valmulta2)
salario -= (valconta1 + valconta2 + valmulta1 + valmulta2);


System.out.println("O valor do que sobra do seu salário é de: R$ " + salario);
leitor.close();




    }
}
