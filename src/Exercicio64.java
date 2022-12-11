import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que calcule a multiplicação de dois números inteiros sem utilizar o operador “*”. 
        Em vez disso, utilize apenas o operador de adição “+”. Para implementar esse algoritmo, 
        devemos lembrar que qualquer multiplicação pode ser expressa por meio de somas. 
        Por exemplo, o resultado da expressão 6 * 3 é o mesmo que 6 + 6 + 6 ou 3 + 3 + 3 + 3 + 3 + 3. 
        Ou seja, soma-se um elemento com ele próprio o número de vezes do segundo elemento.
        */
        int numero1, numero2, acumulador = 0;
        Scanner leitor= new Scanner(System.in);
        
        System.out.println("digite um número inteiro");
        numero1=Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro número inteiro");
        numero2=Integer.parseInt(leitor.nextLine());
       
        for (int i = 0; i < numero1 ; i++){            
            acumulador = acumulador + numero2;            
        }
        System.out.println(String.format("%d x %d = %d", numero1,numero2,acumulador));

       leitor.close();
    }
}
