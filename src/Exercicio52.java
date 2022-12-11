import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        
        /*
        Um supermercado deseja reajustar os preços de seus produtos usando o seguinte critério: 
        o produto poderá ter seu preço aumentado ou diminuído. 
        Para alterar o preço o produto deve preencher pelo menos um dos requisitos a seguir:

                       Requisitos                      |             Reajuste
        -----------------------------------------------+-------------------------------------
        Venda Média Mensal         Preço Atual         | % de Aumento    % de Redução
        -----------------------------------------------+-------------------------------------
        < R$ 500                     < R$ 30           |     12               não    
        >= 500 e < 1.600        >= R$ 30 e < R$ 80     |     15               não    
        >= 1.600                  >= R$ 80,00          |     não               25
        */

        float valprod, mediamensal, aumento, reducao, novopreco;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto");
        valprod = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da média mensal");
        mediamensal = Float.parseFloat(leitor.nextLine());

        if (mediamensal < 500 || valprod < 30){
            aumento = (valprod * 12) / 100;
        } else {
            if (mediamensal >= 500 && mediamensal < 1600 || valprod >= 30 && valprod < 80);
            aumento = (valprod * 15) / 100;
        } if (mediamensal >= 1600 || valprod >= 80){
            reducao = (valprod * 25) / 100;
            novopreco = valprod - reducao;
            System.out.println("O produto receberá uma redução de 25% e custará R$ " + novopreco); 
        }else{
            novopreco = valprod + aumento;
            System.out.println("O produto passará à custar R$ " + novopreco);
            leitor.close();
        }
    }
}
