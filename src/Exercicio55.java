public class Exercicio55 {
    public static void main(String[] args) {
        int contador = 1;
        int  soma = 0; // acumulador 
        while (contador <= 100) {
            // System.out.println("contando" + contador);
            soma = soma + contador;
            contador++;
        }
        System.out.println("A soma é de: " + soma);
    }
}
