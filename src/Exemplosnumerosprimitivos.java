public class Exemplosnumerosprimitivos {
     {
        
    }

    public static void main(String[] args) throws Exception {

        //comentário de linha 
        /*comentário de bloco*/
        //sempre ponto e vírgula no final
        //não errar nenhuma letra, se errar acontece erro 
        //System.out.println("Eu irei conseguir");
        //System.out.println("Eu consegui");
        //Entrada: é primeiro número / segundo número
        //Processamento:primeiro número + segundo número
        //Saída: resultado da soma 

        //ENTRADAS 
        //int significa tipo inteiro 
        //Atribuição  de valor - variavel = valor
        int primeironumero = 7;
        int segundonumero = 2;

        //PROCESSAMENTO 
        //Atribuição de valor 
        int resultado = primeironumero + segundonumero;


        //SAÍDA 
        System.out.print( "O resultado da soma é: ");
        System.out.println(resultado);

        //CONCATENAÇÃO
        //System.err.println( "o resultado é: " + resultado);

        //INTERPOLAÇÃO DE STRING
        //System.err.println(String.format("O resultado é: %d" , resultado));


        //subtração      -
        int resultadosub = 0;
        resultadosub = primeironumero - segundonumero;
        System.out.println("O resultado da subtração é: " + resultadosub);


        //divisão        /
        float resultadodiv = (float)primeironumero / (float)segundonumero;
        System.out.println("O resultado da divisão é: " + resultadodiv);
        //System.out.println(Sthing.format("O resultado da divisão é: %.3f" , resultadodiv));

        double resultadodivdouble = (double)primeironumero / (double)segundonumero;
        System.out.println(String.format("O resultado da divisão é: %4.3f" , resultadodivdouble));


        //multiplicação  *
        int resultadomult = primeironumero * segundonumero;
        System.out.println("O resultado da multiplicação é: " + resultadomult);


        // O IGUAL (=) FAZ UMA ATRIBUIÇÃO

        //TIPO LÓGICO (BOOLEANO) = TRUE OR FALSE 
        boolean resultadocomparacao = primeironumero == segundonumero;
        System.out.println(resultadocomparacao);


        String nome = "Guilherme Sibovicz";


        char  umaLetra = 'i';


        long numeromuitogrande = 10L;
        //ERRO: A VARIAVEL INT NÃO SUPORTA O VALOR LONG POR CONTA DO TAMANHO 
        //int vaidarruim = 10L;
        System.out.println(numeromuitogrande);


        int salario = (int)1210.5f;
        System.out.println(salario);

        //O double tem 64bits e não cabe dentro do float 32bits 
        //float imposto = 1000.0;


     }
}    
