import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que solicite a quantidade total em miligramas de colesterol mau existente no sangue de um paciente.
        Considerando que o valor máximo ideal para uma pessoa saudável é 130mg, 
        caso a quantidade esteja menor apresente uma mensagem indicando que esta menor. 
        Caso esteja acima, calcule o percentual que esta acima e apresente uma mensagem.
         */

        int totmili = 0, perc;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor total em miligramas e colesterol mau existente no seu sangue");
        totmili = Integer.parseInt(leitor.nextLine());

        if (totmili < 130) {
            System.out.println("O seu colesterol está saudável");
        } else {
            if (totmili > 130) {
                perc = (totmili * 100) / 130 - 100; 
                System.out.println("O seu colesterol está " + perc + "% acima do ideal");
                leitor.close();
            }
        }
    } 
}
