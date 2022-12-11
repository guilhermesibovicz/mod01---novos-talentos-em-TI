import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        /*
         * Escreva um programa para calcular o valor da bolsa de estudos paga pela
         * empresa a seus funcionários,
         * utilize a tabela abaixo. De acordo com o Tipo do curso existe um percentual
         * pago da bolsa,
         * sendo que o valor calculado do percentual não pode superar o valor limite por
         * tipo. Insira pelo menos duas restrições nos dados de entrada .
         * +-----------+---------------------+--------------------+
         * | Tipo | Percentual Pago | Valor Limite|
         * +-----------+---------------------+-----------------+
         * | 1- Inglês | 40% | R$ 200,00 |
         * | 2- Espanhol | 40% | R$ 200,00 |
         * | 3- Graduação | 55% | R$ 300,00 |
         * +-----------+---------------------+--------------------+
         */

        float valcurso, tipcurso, valbolsa = 0, valorfinal;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tipo da bolsa: 1- inglês, 2- espanhol ou 3- graduação");
        tipcurso = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do curso");
        valcurso = Float.parseFloat(leitor.nextLine());

        if (tipcurso == 1) {
            valbolsa = (valcurso * 40) / 100;
        } else {
            if (tipcurso == 2) {
                valbolsa = (valcurso * 40) / 100;
            }
        }
        if (tipcurso == 3) {
            valbolsa = (valcurso * 55) / 100;
            if (valbolsa > 300) {
                valorfinal = valcurso - 300;
                System.out.println("Valor da bolsa: " + 300);
                System.out.println("Valor final: " + valorfinal);
            } else {
                valorfinal = valcurso - valbolsa;
                System.out.println("Valor da bolsa: " + valbolsa);
                System.out.println("Valor final: " + valorfinal);
            }
        }else{
            if (valbolsa > 200) {
                valorfinal = valcurso - 200;
                System.out.println("Valor da bolsa: " + 200);
                System.out.println("Valor final: " + valorfinal);
            } else {
                valorfinal = valcurso - valbolsa;
                System.out.println("Valor da bolsa: " + valbolsa);
                System.out.println("Valor final: " + valorfinal);
                leitor.close();
            }
        }
        
    }
}