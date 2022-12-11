import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que calcule o valor de uma chamada de telefone. 
        Deverá ser informado a quantidade de minutos falados durante a ligação além de sua origem. 
        Considere que uma ligação “local” custa R$0.020, ligação “intermunicipal” R$0,08 e “interestadual” R$0,1.
        */

        int min, origem;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tempo da ligação");
        min = Integer.parseInt(leitor.nextLine());
        System.out.println("Se a ligação for local digite 1, se for intermunicipal digite 2 e se for interestadual digite 3");
        origem = Integer.parseInt(leitor.nextLine());

        if (origem == 1) {
            System.out.println("A ligação custou R$0.020 e você ficou " + min + " minutos em ligação");
        } else {
            if (origem == 2) {
                System.out.println("A ligação custou R$0,08 e você ficou " + min + " minutos em ligação");
            } else {
                if (origem == 3) {
                    System.out.println("A  ligação custou R$0,1 e você ficou " + min + " minutos em ligação");
                    leitor.close();
                }
            }
        }
    }
}