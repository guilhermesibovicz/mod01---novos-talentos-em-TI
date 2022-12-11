import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        
        /*
Faça um programa que calcule e mostre a área de um trapézio. 
Sabe-se que: A=((base maior + base menor) * altura)/2

E: basemaior, basemenor, altura
P: resultado = ((basemaior + basemenor) * altuta) / 2

        */

int basemaior, basemenor, altura, resultado;

Scanner leitor = new Scanner(System.in);

System.out.println("Digite a base maior do trapézio");
basemaior = Integer.parseInt(leitor.nextLine());

System.out.println("Digite a base menor do trapézio");
basemenor = Integer.parseInt(leitor.nextLine());

System.out.println("Digite a altura do trapézio");
altura = Integer.parseInt(leitor.nextLine());

resultado =  ((basemaior + basemenor) * altura) / 2;

System.out.println("A área do trapézio é de: " + resultado);

leitor.close();

    
    }
}
