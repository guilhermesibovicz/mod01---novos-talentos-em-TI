import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {

        /*
         * Faça um programa que receba três notas de um aluno,
         * calcule e mostre a média aritmética e a mensagem constante na tabela a
         * seguir.
         * Aos alunos que ficaram para exame, calcule e mostre a nota que
         * deverão tirar para serem aprovados, considerando que a média exigida é 7.0
         * 'Média Aritmética Mensagem
         * 0,0 ●-------O 3,0 Reprovado
         * 3,0 ●-------O 7,0 Exame
         * 7,0 ●-------● 10,00 Aprovado
         * '
         */

        float nota1, nota2, nota3, media, falta;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda nota");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota");
        nota3 = Float.parseFloat(leitor.nextLine());

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média é de: " + media);

        if (media >= 7 && media<=10) {
            System.out.println("Você foi APROVADO");
        } else {
            if (media >= 3 && media<7)
                System.out.println("Você ficou em em EXAME");
            else {
                System.out.println("Você foi REPROVADO");
            }
        }
        falta = 7 - media;
        System.out.println(falta + " é o tanto que falta para você passar de ano");
        leitor.close();

    }
}
