import java.util.Arrays;

public class ExemploString {
    public static void main(String[] args) {
        String texto = "Universidade da Região de Joinville";
        char[] textoarray = texto.toCharArray(); 
        System.out.println(Arrays.toString(textoarray));
        // retorna um caracter n aposição informada 

        System.out.println(texto.charAt(12));
        // troca um ou mais caracteres por outros caracteres 
        // STRING SÃO OBJETOS IMUTAVEIS 

        System.out.println(texto.replace("i", "!"));
        System.out.println(texto);

        //corta texto
        System.out.println(texto.substring(26, 35));
        //conta texto
        System.out.println(texto.length()+ " letras");        
        
        System.out.println(Arrays.toString(texto.split(",")));
        
    }
}
