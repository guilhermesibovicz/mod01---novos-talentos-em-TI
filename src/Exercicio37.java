import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        /*
         * Faça um programa que receba o código correspondente ao cargo de um
         * funcionário e
         * seu salário atual e mostre o cargo,
         * o valor do aumento e seu novo salário. Os cargos estão na seguinte tabela:
         * 
         * Código Cargo Percentual
         * 1 Escriturário 50%
         * 2 Secretário 35%
         * 3 Caixa 20%
         * 4 Gerente 10%
         * 5 Diretor Não tem aumento
         */

        float salario, codigo;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de seu salário atual");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o código correspondente ao seu cargo");
        codigo = Float.parseFloat(leitor.nextLine());

        if (codigo == 1) {
            salario += (salario * 50) / 100;
            System.out.println("Você é Escrituário e ganhará um aumento de 50%. Entretanto ganhará: R$ " + salario);
        } else {
        }   if (codigo == 2) {
            salario += (salario * 35) / 100;
            System.out.println("Você é Secretário e ganhará um aumento de 35%. Entretanto ganhará: R$ " + salario);
        } else {
            if (codigo == 3) {
                salario += (salario * 20) / 100;
                System.out.println("Você é Caixa e ganhará um aumento de 20%. Entretanto ganhará: R$ " + salario);
            } else {
                if (codigo == 4) {
                    salario += (salario * 10) / 100;
                    System.out.println("Você é Gerente e ganhará um aumento de 10%. Entretanto ganhará: R$ " + salario);
                } else {
                    if (codigo == 5) {
                        System.out.println(
                                "Você já é Diretor e não ganhará aumento. Entretanto ganhará ganhando o mesmo salário: R$ " + salario);
                        leitor.close();
                    }
                }
            }
        }
    }
}
