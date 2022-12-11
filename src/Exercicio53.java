import java.util.Scanner;
public class Exercicio53 {
    public static void main(String[] args) {
        /*
        Faça um UNICO programa em que receba o nome, o salário-base e o tempo de serviço de um funcionário. 
        
        Calcule e mostre TODOS os item abaixo em um UNICO PROGRAMA:
        a.    O imposto que esta na tabela a seguir:
        
                       Salário Base                          |     % de imposto sobre Salário Base
        -----------------------------------------------------+----------------------------------------
        Menor R$200,00 (inclusive)                           |             Isento
        Maior que R$200,00 até R$ 450,00 (inclusive)         |               3%
        Entre R$450,00 e R$ 700,00                           |               8%
        Igual a R$ 700,00                                    |              10%
        Maior que R$ 700,00                                  |              12%
        
        
        b.    A Gratificação conforme a tabela a seguir:
                Salário Base            |        Tempo de Serviço           |               Gratificação
        +-------------------------------+-----------------------------------+------------------------------------------+
        | Superior a R$500,00           |Até 3 anos (inclusive)             |2% do salário base mais R$ R$ 50,00 reais |
        +-------------------------------+-----------------------------------+-------------------------------------------
        |                               |Mais de 3 anos                     |3% do salário base mais R$ 60,00 reais    |
        --------------------------------+-----------------------------------+-------------------------------------------
        | Até R$ 500,00 (inclusive)     |Até 3 anos (inclusive)             |5% do salário base mais R$ 23 reais       |
        |-------------------------------+-----------------------------------+-------------------------------------------
        |                               |Entre 3 e 6 anos                   |6% do salário base mais R$ 35,00 reis     |
        |-------------------------------+-----------------------------------+-------------------------------------------
        |                               |De 6 anos para cima (inclusive)    |10% do salário base mais R$ 33 reais      |
        +-------------------------------+-----------------------------------+------------------------------------------+

        c.    Calcule o valor do auxilio alimentação:
        Tempo de Serviço             |Valor do auxilio alimentação
        -----------------------------+----------------------------
        Até 10 anos (inclusive)      |4% salário Base
        -----------------------------+----------------------------
        Mais de 10 anos              |6% salário Base
        
        d.    Calcule o salário líquido, subtraindo o imposto e somando a gratificação, o auxilio alimentação ao salário base.

        */

        float salbase, tempodeserv, imposto = 0, gratificacao = 0, auxalimentacao = 0, salliquido = 0;
        String nome;

        Scanner leitor = new Scanner(System.in);
    
        
        System.out.println("Digite o nome do funcionário");
        nome = String.format(leitor.nextLine());
        System.out.println("Digite o salário base do funcionário");
        salbase = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o tempo de serviço do funcionário");
        tempodeserv = Float.parseFloat(leitor.nextLine());

        if (salbase <= 200){
            imposto = (salbase * 1) / 100; 
        } else {
            if (salbase > 200 && salbase<= 450){
                imposto = (salbase * 3) / 100;
            } else {
                if (salbase > 450 && salbase < 700){
                    imposto = (salbase * 8) / 100;
                } else {
                    if (salbase == 700){
                        imposto = (salbase * 10) / 100;
                    } else {
                        if (salbase > 700){
                            imposto = (salbase * 12) / 100;
                        }
                    }
                }
            }
        }
        System.out.println("O imposto é de: R$ " + imposto);

        if (salbase > 500 && tempodeserv <= 3){
            gratificacao = ((salbase * 2) / 100) + 50;
        } else {
            if (tempodeserv > 3){
                gratificacao = ((salbase * 3) / 100) + 60;
            } else {
                if (salbase <= 500 && tempodeserv <= 3){
                    gratificacao = ((salbase * 5) / 100) + 23;
                } else {
                    if (tempodeserv > 3 && tempodeserv < 6){
                        gratificacao = ((salbase * 6) / 100) + 35;
                    } else {
                        if (tempodeserv >= 6){
                            gratificacao = ((salbase * 10) / 100) + 33;
                        }
                    }
                }
            }
        }
        System.out.println("O valor da gratificação é de R$ " + gratificacao);

        if (tempodeserv <= 10){
            auxalimentacao = (salbase * 4) / 100;
        } else {
            if (tempodeserv > 10){
                auxalimentacao = (salbase * 6) / 100;
            }
        }
        System.out.println("O valor do auxilio alimentação é de R$ " + auxalimentacao);

        salliquido = (salbase + gratificacao + auxalimentacao) - imposto;
        System.out.println("O valor do salário líquido é de R$ " + salliquido);
        leitor.close();
        

    }
}