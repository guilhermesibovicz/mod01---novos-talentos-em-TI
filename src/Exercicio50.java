import java.util.Scanner;
public class Exercicio50 {
    public static void main(String[] args) {
        /*
        Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). 
        Escreva um programa que solicite a quantidade de votos de cada candidato, a quantidade de votos nulos e votos em branco.
        Calcule o percentual DE CADA CANDIDATO em relação ao total de votos válidos. E o percentual de votos nulos e votos em branco do total geral de votos.

        */

        float candidatoA, candidatoB, candidatoC, nulo, branco, votosvalidos, votogeral;
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de votos do candidato A");
        candidatoA = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de votos do candidato B");
        candidatoB = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de votos do candidato C");
        candidatoC = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de votos nulos");
        nulo = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de votos em branco");
        branco = Float.parseFloat(leitor.nextLine());

        votosvalidos = candidatoA + candidatoB + candidatoC;

        candidatoA = (candidatoA * 100) / votosvalidos;
        candidatoB = (candidatoB * 100) / votosvalidos;
        candidatoC = (candidatoC * 100) / votosvalidos;
        
        System.out.println("A porcentagem do candidato A é de: " + candidatoA);
        System.out.println("A porcentagem do candidato B é de: " + candidatoB);
        System.out.println("A porcentagem do candidato C é de: " + candidatoC);

        votogeral = votosvalidos + nulo + branco;

        nulo = (nulo * 100) / votogeral;
        branco = (branco * 100) / votogeral;

        System.out.println("O percentual de votos nulos é de: " + nulo);
        System.out.println("O percentual de votos brancos é de: " + branco);
        leitor.close();
    }
}
