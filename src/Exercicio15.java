import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        
        /*
 Faça um programa que calcule e mostre a área de um losango. 
 Sabe-se que: A = (diagonal maior * diagonal menor) / 2

 E: areamaior, areamenor 
 P: resultado = (areamaior * areamenor) / 2


        */

        float areamaior, areamenor, resultado;
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da area maior");
        areamaior  = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o tamanho da area menor");
        areamenor  = Float.parseFloat(leitor.nextLine());

        resultado = (areamaior * areamenor) / 2;

        System.out.println("A área do losango é de : " + resultado);
        
        leitor.close();
        

    }
}
