import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que calcule o número de páginas mínimo que um leitor deve ler para terminar um livro em um determinado numero de dias informado. 
        Caso o número de paginas a ler por dia for maior que 100, 
        informe ao usuário que é impossível de realizar a leitura, caso contrário apresente o número de paginas.
        */

        int dias, paginas, pagsdia;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de dias para que você termine de ler o livro");
        dias = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o número de páginas do livro");
        paginas = Integer.parseInt(leitor.nextLine());

        pagsdia = paginas / dias;
        

        if (pagsdia > 100) {
            System.out.println("É impossível realizar a leitura");
        } else {
            System.out.println("A quantidade de páginas por dia a serem lidas é de: " + pagsdia);
            leitor.close();
        }
    }
}
