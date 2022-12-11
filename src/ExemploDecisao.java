import java.util.Scanner;
public class ExemploDecisao {
    public static void main(String[] args) {
        

        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        numero = Integer.parseInt(leitor.nextLine());

        /*
        if(condição/TESTE) {
        //BLOCO DE CÓDIGO (ENTÃO - VERDADEIRO)
        }
        {else
        //  BLOCO DE CÓDIGO (SE NÃO - FALSO)
        }

        */
    
        if(numero >= 10){
            System.out.println("O número é maior que DEZ");
        }else{
            System.out.println("O número é menor que DEZ");
        }
        System.out.println("Fim do Programa");
        leitor.close();
    }
    
}
