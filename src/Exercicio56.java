public class Exercicio56 {
    public static void main(String[] args) {
        /*
        Elabore um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
        NÃO TEM ENTRADA
        */
        int soma = 0;
        for(int i=1; i <= 500; i++){
            if (i % 2 == 0) {
            System.out.print(String.format("%d ",i));
            soma += i;
            }
        }
        System.out.println("O total dos números pares é de " + soma);
    }
}
