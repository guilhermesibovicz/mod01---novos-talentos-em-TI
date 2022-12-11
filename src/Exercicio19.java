import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        
        /*
        Sabe-se que, para iluminar de maneira correta os cômodos de uma casa, 
        para cada metro quadrado, deve-se usar 18Watts de potência. 
        Faça um programa que receba as duas dimensões de um cômodo (em metros),
        calcule e  mostre a sua área (em metros quadrados) e a potência de iluminação que deverá ser utilizada.
        
        E: primdimensao, segdimensao, metros,watts
        P: metros = primdimensao * segunda;
        watts = metros * 18;
        */

        float primdimensao, segdimensao, metros, watts;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira dimensão");
        primdimensao = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda dimensão");
        segdimensao = Float.parseFloat(leitor.nextLine());

        metros = primdimensao * segdimensao;
        watts = metros * 18f;

        System.out.println("A area é de " + metros + " metros");
        System.out.println("Você precisa de " + watts + " watts para iluminar todo o cômodo");
        leitor.close();

    }
}
