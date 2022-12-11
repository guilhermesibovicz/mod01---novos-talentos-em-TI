import java.util.Scanner;

import javax.sound.sampled.FloatControl;
public class Exercicio61 {
    public static void main(String[] args) {
        /*
        Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total de valores lidos.
        O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
        Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
        */

        int numero=0, soma=0, contador=1;
        float media=0;
        Scanner leitor =  new Scanner(System.in);

        do {
            System.out.println("Digite um número");
            numero = Integer.parseInt(leitor.nextLine());
            if (numero < 0)break; {

        contador ++;
        soma += numero;
        media = soma / numero;
        
            }
        }while (numero >= 0 );
        System.out.println("A soma dos números é de: " + soma);
        System.out.println("A média dos valores é de: " + media);
        
        leitor.close();
        

    }
}
