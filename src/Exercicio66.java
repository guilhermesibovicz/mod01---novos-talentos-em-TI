import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        /* 
        Faça um algoritmo que calcule a soma de todos os números ímpares dentro de uma faixa de valores determinada pelo usuário. 
        Um número é ímpar quando sua divisão por 2 não é exata, ou seja, o resto resultante da divisão inteira pelo número 2 tem valor 1. 
        Utilize a palavra resto como operador que calcula o resto da divisão de um numero por outro.
        */

        int numero, soma = 0, contador = 0, qtdnum; 
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de valores que serão digitados");
        qtdnum = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite um número");
        numero = Integer.parseInt(leitor.nextLine());
        

        for(int i=0; i < numero; i++){
            System.out.println(i);
            leitor.close();
        }

















        /*
        do {
           System.out.println("Digite um número");
            numero = Integer.parseInt(leitor.nextLine());

            if (numero % 2 ==1)
            
        contador++;
        }while(numero >= 0);
        */
    }
}
