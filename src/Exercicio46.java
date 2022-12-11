import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        /*
        Construa um algoritmo que calcule o consumo de combustível de um veículo qualquer 
        baseado nas informações de quilometragem  inicial e final de um percurso, e a quantidade de gasolina consumida em litros. 
        Caso o consumo esteja entre 10 e 16 litros/km mostre a mensagem “consumo normal”, 
        caso seja maior que 16 litros/km apresente a mensagem “consumo anormal”.
        */

        float consumo = 0, kminicial, kmfinal, qtdgasolina, litros;
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite a quilometragem inicial");
        kminicial = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quilometragem final");
        kmfinal = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de gasolina comsumida em litros");
        litros = Float.parseFloat(leitor.nextLine());

        consumo = kmfinal - kminicial;
        qtdgasolina = consumo / litros;
        
        if (qtdgasolina >= 10 && qtdgasolina <= 16) {
            System.out.println("O consumo de gasolina está normal");
        } else {
            System.out.println("O consumo de gasolina está anormal");
            leitor.close();
        }
    }
}