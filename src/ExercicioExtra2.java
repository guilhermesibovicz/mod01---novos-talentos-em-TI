import java.util.Scanner;

public class ExercicioExtra2 {
    public static void main(String[] args) {
        
        float num1, num2, num3;
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite o primeiro número:");
        num1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o segundo número:");
        num2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o terceiro número:");
        num3 = Float.parseFloat(leitor.nextLine());

        if (num1 > num2){
            if (num1 > num3){
                System.out.println("O númeor maior é: " + num1);
                if (num2 > num3){ 
                    System.out.println("O número do meio é: " + num2);
                    System.out.println("O menor número é: " + num3);
                }else {
                    System.out.println("O número do meio é: " + num3);
                    System.out.println("O menor número é: " + num2);
                }
            }else{
                System.out.println("O número maior é:");
                System.out.println("O número do meio é: ");
                System.out.println("O número menor é:");
            }
        }else{
            if (num2 > num3){
                System.out.println("O número maior é: " + num2);
                if ( num1 > num3){
                    System.out.println("O número do meio é: " + num1);
                    System.out.println("O número menor é: " + num3);    
                }else{
                    System.out.println("O número do meio é: " + num3);
                    System.out.println("O número menor é: " + num1);
                }
            }else{
                System.out.println("O número maior é:" + num3);
                System.out.println("O número do meio é: " + num2);
                System.out.println("O número menor é: " + num1);
                leitor.close();
            }
        }
    }
}
