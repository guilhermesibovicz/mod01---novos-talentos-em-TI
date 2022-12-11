import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        
        /*
        Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo. Calcule e mostre o salário a receber seguindo as regras abaixo: 
        - A hora trabalhada vale a metade do salário mínimo 
        - O salário bruto equivale ao número de horas trabalhas multiplicado pelo valor da hora trabalhada; 
        - O imposto equivale a 3% do salário bruto; 
        - O salário a receber equivale ao salário bruto menos o imposto.

        
        */

        int horastrab;
        float valsalmin, salarec, salporhora, salbruto, imposto;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o números de horas trabalhadas");
        horastrab = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor do salário mínimo");
        valsalmin = Float.parseFloat(leitor.nextLine());

        salporhora = valsalmin / 2;
        salbruto = horastrab * salporhora;
        imposto = (salbruto * 3) / 100;
        salarec = salbruto - imposto;
        
        System.out.println("O valor do salário a receber é de: R$ " + salarec);
        leitor.close();






















    }
}
