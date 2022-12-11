import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        
        /*
        Faça um programa que receba uma hora (uma variável para hora e outra para minutos), calcule e mostre:
        - a hora digitada convertida em minutos;
        - o total dos minutos, ou seja, os minutos digitados mais a conversão anterior;
        - o total dos minutos convertidos em segundos.
 

        */
         
        float hora, minutos, horaemmin, totmin, minemseg;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite qualquer hora");
        hora = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite qualquer minuto");
        minutos = Float.parseFloat(leitor.nextLine());

        horaemmin = hora * 60;
        totmin = horaemmin + minutos;
        minemseg = totmin * 60;

        System.out.println( + (int)hora + " horas convertida em minutos é de: " + (int)horaemmin + " minutos");
        System.out.println( + (int)minutos + " minutos somados com " + (int)horaemmin + " minutos, são: " + (int)totmin + " minutos");
        System.out.println( + (int)totmin + " minutos convertidos para segundos são de " + (int)minemseg + " segundos");

        leitor.close();
    }
    
}
