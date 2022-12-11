import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que calcule o valor da multa (em UFIR) que um motorista deve receber de acordo com a velocidade de seu carro. 
        Acima de 60km/h e ate 100km/h multa media 60 UFIR, acima de 100 km/h até 160km/h grave 120 UFIR, e acima de 160km/h gravíssima 180 UFIR
        */

        float velo;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a velocidade que você estava dirigindo");
        velo =  Float.parseFloat(leitor.nextLine());
        
        if (velo >= 60 && velo <= 100) {
            System.out.println("A multa é de 60 UFIR");
        } else {
            if (velo > 100 && velo <= 160) {
                System.out.println("A multa é de 120 UFIR");
            } else {
                if (velo > 160) {
                    System.out.println("A multa é de 180 UFIR");
                    leitor.close();
                }
            }
        }
    }
}
