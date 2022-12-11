import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        /*
         Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a média do total.
        */
        Scanner leitor = new Scanner(System.in);

        int soma = 0, numero;
        float media = 0;
        for (int i=0; i<10; i++){
            System.out.println("Digite um número");
            numero = Integer.parseInt(leitor.nextLine());
            //acumulador
            soma += numero;           
        }
        
        media = soma / 10f;
        System.out.println("O valor da somatoria é de " + soma);
        System.out.println("A média é de " + media);
        leitor.close();
    }
}