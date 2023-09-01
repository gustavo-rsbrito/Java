import java.util.*;
public class ArryHashMap{

    static Scanner ler = new Scanner(System.in);
    public static void  main (String [] args){

    /*Implemente um programa em Java com Menu de opções, para gerenciar o preço das ações de uma
     corretora. O sistema deve permitir o cadastro e a atualização dos preços das ações. Quando
     atualizada a ação, o programa deve mostrar se  o  preço caiu ou subiu.*/

        HashMap<String, Integer> listaAcoes  = new HashMap<String, Integer>();

        int opcao = 0;
        int escolha = 0;

        do {
            escolha = Menu(opcao);

            switch(escolha){
                case 1:
                    System.out.println();
                    System.out.println(" Informe a Ação:");
                    String acao = ler.next();

                    System.out.println(" Informe o valor: ");
                    int valor = ler.nextInt();

                    if(listaAcoes.containsKey(acao)){
                        int valorAntigo = listaAcoes.get(acao);
                        if( valor == valorAntigo){
                            System.out.println(" a acão continua o msm r$ " + valor);
                        }
                        if(valor > valorAntigo){
                            System.out.println(">> Ação subiu em r$ " + (valor - valorAntigo));
                            listaAcoes.put(acao,valor);
                        } else{
                            System.out.println(">> Ação caiur em r$ " + (valor - valorAntigo));
                            listaAcoes.put(acao,valor);
                        }
                    }

                    listaAcoes.put(acao,valor);

                    break;
                case 2:
                    System.out.println();
                    for(String i : listaAcoes.keySet()){
                        System.out.println(i + " Preço: " + listaAcoes.get(i) + "R$");
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Opção Invalida , Digite Novamente.");
            }
        }while(escolha != 0);




    }

    public static int Menu(int opcaoMenu){

        System.out.println("1 - Atualizar Ação");
        System.out.println("2 - Listar Ações");
        System.out.println("0 - Sair");
        System.out.println();

        opcaoMenu = ler.nextInt();

        return opcaoMenu;
    }
}