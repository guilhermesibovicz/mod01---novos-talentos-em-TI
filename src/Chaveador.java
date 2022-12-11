public class Chaveador {
    public static void main(String[] args) {
        
        int opcao = -1;
        if (opcao == 0) {
            System.out.println("IF: Valor zero");
        }else{
            if (opcao > 1){
                System.out.println("IF: Valor é UM");
            }else{
                if (opcao == -1){
                    System.out.println("IF: Valor é negativo");
                }
            }
        }
        switch (opcao) {
            case -1:
            System.out.println("SWITH: valor negativo");
                
                break;
        
                case 0:
                System.out.println("SWITH: Valor ZERO");
                break;

                case 1:
                System.out.println("SWITH: valor é um");
                break;

            default:
                System.out.println("Nenhum dos casos anteriores!");
                break;
        }
    }
}
