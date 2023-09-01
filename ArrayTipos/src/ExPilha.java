import java.util.*;
class ExPilha{
    static Scanner ler = new Scanner(System.in);
    public static void main (String[] args){
   
    /*Implemente um programa em Java com Menu de opções, para gerenciar uma lista de 
    reprodução de músicas de seu aplicativo favorito. Quando você adiciona uma música,
    ela será sempre a próxima a ser tocada. As opções do menu e seus objetivos 
    correspondentes devem ser implementados conforme abaixo */
        Stack<String> pilha = new Stack<String>();

        int opcao = 0;
        int r = 0;
        do{

            r = menu(opcao);

            switch(r){
                case 1:
                    System.out.println("Informe o nome da musica.");
                    pilha.push(ler.next());
                    break;
                case 2:
                    if(pilha.isEmpty()){
                        System.out.println("não há proxima musica");
                    } else{
                        System.out.println("chamar :");
                        System.out.println(pilha.pop());
                    }

                    break;
                case 3:
                    if(pilha.isEmpty()){
                        System.out.println("PlayList vazia");
                    }
                    for(String item : pilha){
                        System.out.println(item);
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado.");
                    break;
                default:
                    System.out.println("Opção invalida - Digite Novamente.");
            }

        }while(r != 0);

    }
    public static int menu (int opcao){
        System.out.println("Digite 1 - Adicionar música");
        System.out.println("Digite 2 - Tocar próxima ");
        System.out.println("Digite 3 - Listar Músicas " );
        System.out.println("Digite 0 - Sair ");
        System.out.println();

        opcao = ler.nextInt();

        return opcao;

    }

}