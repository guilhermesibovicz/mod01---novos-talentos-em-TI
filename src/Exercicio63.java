import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        /*
         * Faça um programa que receba 'vários números, calcule e mostre:
         * - a soma dos números digitados;
         * - a quantidade de números digitados;
         * - a média dos números digitados;
         * - o maior número digitado;
         * - o menor número digitado;
         * - a média dos números pares;
         * - a porcentagem dos números ímpares entre todos os números digitados.
         * Finalize a entrada de dados com a digitação do número 30000.
         */

        int numero, contador = 0, soma = 0, maior = 0, menor = 0, somapar = 0, contapar = 0, mediapares = 0;
        float media = 0;
        Scanner leitor = new Scanner(System.in);

        do{
            
            System.out.println("Digite um numero");
            numero = Integer.parseInt(leitor.nextLine());
            
            if(numero != 30000){
                soma = soma + numero;

                if(contador==0){
                    maior = numero;
                }else{
                    if(numero > maior){
                        maior = numero;
                    }
                }
                //nunca deve misturar a lógica do maior numero com a do menor numero
                if(contador==0){
                    menor = numero;
                }else{
                    if(numero < menor){
                        menor = numero;
                    }
                }
                if(numero % 2 == 0){
                    somapar += numero; //somapar = somapar + numero;
                    contapar++;
                }
                contador++; // contador = contador + 1; // contador += 1;  
            }
        }while(numero != 30000);

        media = soma / contador;
        System.out.println("A soma e " + soma);
        System.out.println("A qtd total de numeros e " + contador);
        System.out.println("A media e " + media);
        System.out.println("O maior numero e " + maior);
        System.out.println("O menor numero e " + menor);
        mediapares = somapar / contapar;
        System.out.println("A media dos numeros pares e " + mediapares);
        int numimpar = contador - contapar;
        /*
           numeroTOTAL      100
           numimpar         perc
        */
        float percimpar = (numimpar * 100f) / contador;
        System.out.println("O percentual de numeros impar e " + percimpar);
        leitor.close();
    }
}