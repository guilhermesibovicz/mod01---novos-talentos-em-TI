public class Exercicio59 {
    public static void main(String[] args) {
        /*
        Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, 
        iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. 
        O programa deverá apresentar os valores das duas temperaturas.
        */
        for(int tempc = 10; tempc <= 100; tempc +=10){
            float tempf = (tempc * 1.8f) + 32f;
            System.out.println(String.format("Celsius %d - Fahrenheit %.2f" , tempc , tempf));
        }
    }
}
