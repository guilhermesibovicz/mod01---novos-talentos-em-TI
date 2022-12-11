import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        /*
         * Uma empresa decide dar um aumento de 30% aos funcionários com salários
         * inferiores a R$ 500,00.
         * Faça um programa que receba o salário do funcionário e mostre o valor do
         * salário reajustado ou
         * uma mensagem caso ele não tenha direito ao aumento.
         * 
         * 
         */
        float salario, aumento;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu salario");
        salario = Float.parseFloat(leitor.next());

        if (salario < 500) {
            aumento = (salario * 30) / 100;
            System.out.println("Você recebe aumento de: R$ " + aumento);
        } else {
            System.out.println("Você não ganha aumento");
        }
        leitor.close();
    }
}
