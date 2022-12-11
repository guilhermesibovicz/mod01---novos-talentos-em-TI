import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
    float numeroreal;
    int parteint;
    double partefrac;
    double partearred;
    Scanner leitor = new Scanner(System.in);
 
    System.out.println("Digite um número real");
    numeroreal = Float.parseFloat(leitor.nextLine());
    //Conversão de tipo float para int (perda de info)
    parteint = (int)numeroreal;
    partefrac = numeroreal - parteint;
    partearred = Math.ceil(numeroreal);

    System.out.println("O número real convertido em inteiro é: " + parteint);
    System.out.println("O número real convertido para fracionário é de: " + partefrac);
    System.out.println("O número real arredondado é de: " + (int)partearred);

    leitor.close();

    }
    
}
