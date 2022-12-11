import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        int n = 0;
        float e = 1;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de N");
        n = Integer.parseInt(leitor.nextLine());


        for (int j=1 ; j <= n ; j++){
        int numFat = j;
        int resFat = 1;

            for(int i = numFat; i>=1 ; i--){
            resFat = resFat * i;            
            }
            e = e + (1f / resFat);
            System.out.println("Fatorial de " + numFat + "! = " + resFat);
        }
        System.out.println("O resultado é  " + e);
        leitor.close();
    }    
}
