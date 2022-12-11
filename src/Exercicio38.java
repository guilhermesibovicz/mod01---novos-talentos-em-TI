import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba o preço de um produto e o seu código de origem e mostre a sua procedência. A procedência obedece a tabela a seguir:
        Código de origem    Procedência
        1                    Sul
        2                     Norte
        3                     Leste
        4                     Oeste
        5 ou 6                Noroeste
        7 ou 8 ou 9           Sudeste
        10 a 20               Centro-Oeste
        21 a 30               Nordeste
        */

        float codigo;
        Scanner leitor =  new Scanner(System.in);
        
        System.out.println("Digite o código do produto");
        codigo = Float.parseFloat(leitor.nextLine());

        if (codigo ==1) {
            System.out.println("O produto é do Sul");
        } else {
            if (codigo ==2) {
                System.out.println("O produto é do Norte");
            } else {
                if (codigo ==3) {
                    System.out.println("O produto é do Leste");
                } else {
                    if (codigo ==4) {
                        System.out.println("O produto é do Oeste");
                    } else {
                        if (codigo ==5 || codigo ==6) {
                            System.out.println("O produto é do Noreste");
                        } else {
                            if (codigo ==7 || codigo ==8 || codigo ==9) {
                                System.out.println("O produto é do Sudeste");
                            } else {
                                if (codigo >=10 && codigo <=20) {
                                    System.out.println("O produto é do Centro-Oeste");
                                } else {
                                    if (codigo >=21 || codigo <=30) {
                                        System.out.println("O produto é do Nordeste");
                                        leitor.close();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}