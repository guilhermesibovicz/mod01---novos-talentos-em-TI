import java.util.Scanner;
public class CalcMediaAluno {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS 
        //float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0; APAGAMOS A MEDIA 
        //float nota1, nota2, nota3, nota4;
        //VARIAVEL - TIPO NOME = VALOR;
        final float nota1, nota2, nota3, nota4;
        float percPresenca = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite primeira nota");
        //CONVERSAO ENTRE TIPO OBJETO PRA TIPO PRIMITIVO 
        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda nota");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota");
        nota3 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quarta nota");
        nota4 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o percentual de presenca do aluno");
        //CONVERTE O TEXTO DIGITADO (NEXTLINE) DA STRING PARA UM PRIMITIVO FLOAT
        percPresenca = Float.parseFloat(leitor.nextLine());
        
//CONSTANTE = MODIFICADOR FINAL 
        final var media = (nota1 + nota2 + nota3 + nota4) / 4.0f;

        //media = 0;

        System.out.println("A média do aluno é " + media);

        leitor.close();
        
        //CONSTANTE =  MODIFICADOR FINAL 
        //"tipo" a palavra var permite que o JAVA 
        //crie a variavel com o tipo de valor 
        //que foi ATRIBUIDO no codigo 

        //REGRA aluno aprovado >= media > 7
        //REGRA aluno aprovado >= percPresenca >= 75
        //AND && - OR || - NOT !
        
        boolean situacao = media >= 7 && percPresenca >= 75;
        
        System.out.println("Situação:" + (situacao?"Aprovado":"Reprovado"));
                                                                                                                                                                        

        leitor.close(); 
     

    }

}
