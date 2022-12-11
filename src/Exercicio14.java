import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        

        /*
 Faça um programa que calcule e mostre a área de um quadrado. 
 Sabe-se que: A=lado * lado

E: areaquad, areatotal
P: resultado = area * area 


        */

        float areaquad, areatotal;
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o tamanho de um quadrado");
        areaquad = Float.parseFloat(leitor.nextLine());

        areatotal = areaquad * areaquad;

        System.out.println("A área do quadrado é de : " + areatotal);
        
        leitor.close();
        
            



    }
}
