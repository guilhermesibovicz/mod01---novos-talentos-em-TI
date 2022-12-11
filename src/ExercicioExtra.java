import java.util.Scanner;

public class ExercicioExtra {
    public static void main(String[] args) {
        
        int idade;
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite sua idade");
        idade = Integer.parseInt(leitor.nextLine());

        if  (idade <=20) {
            //ENTÃO
            System.out.println("Você é jovem");
        }else{
            //SENÃO
            if(idade <= 60){
            System.out.println("Você é adulto");
            }else{
                System.out.println("Você é idoso");
                leitor.close();
            }
        }
    }
}
