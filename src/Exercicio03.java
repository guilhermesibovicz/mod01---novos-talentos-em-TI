import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
float kmandados = 0;
final float gasolina = 2.20f;
final float gasolporlitro = 13;
float reembolso = 0;

Scanner leitor = new Scanner(System.in); 

System.out.println("Digite os km andados");
kmandados =  Float.parseFloat(leitor.nextLine());

reembolso = (kmandados / gasolporlitro) * gasolina;

System.out.println("O reembolso é de: " + reembolso);

leitor.close();






    }



}
