import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        float numhorasdia = 0;
        float numdediastrabmes = 0;
        float numhorasmes = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de horas que trabalha no dia");
        numhorasdia = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o número de dias trabalhados no mês");
        numdediastrabmes = Float.parseFloat(leitor.nextLine());

        numhorasmes = numhorasdia * numdediastrabmes;
        System.out.println("O resultado de horas trabalhadas é de: ");

        System.out.println(numhorasmes);

        leitor.close();


    }
}
