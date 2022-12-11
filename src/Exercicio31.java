import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {

        /*
         * Faça um programa que mostre o menu de opções a seguir, receba a opção do
         * usuário e
         * os dados necessários para executar cada operação.
         * Menu de opções:
         * 1. Somar dois números
         * 2. Raiz quadrada de um número
         * Solicite ao usuário digitar a opção desejada
         * 
         * 
         */

        int opcao, numero1, numero2, total, raiz;
        Scanner leitor = new Scanner(System.in);

        System.out.println("*-----------------------------------------------------------------------------------------------------*");
        System.out.println("|Escolha a opção (1) para somar dois números ou a opção (2) para calcular a raiz quadrada de um número|");
        System.out.println("* -----------------------------------------------------------------------------------------------------*");
        opcao = Integer.parseInt(leitor.nextLine());

        if (opcao == 1) {
            System.out.println("Digite o número 1");
            numero1 = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite o segundo número");
            numero2 = Integer.parseInt(leitor.nextLine());

            total = numero1 + numero2;
            System.out.println("O resultado é: " + total);
        } else {
            System.out.println("Digite o número que você deseja saber a raiz quadrada");
            raiz = Integer.parseInt(leitor.nextLine());

            var totalraiz = Math.sqrt(raiz);
            System.out.println("A raiz desse número é de: " + totalraiz);
            leitor.close();
        }
    }
}
