import java.util.*;
public class ArryListTarefas {
    public static void main (String[] args){

            Scanner ler = new Scanner(System.in);

            ArrayList<String> lista = new ArrayList<String>();
            int escolha = 0;
            do {
                Menu();
                escolha = ler.nextInt();
                System.out.println();
                switch(escolha){
                    case 1:
                        System.out.println("Informe uma Nova Tarefa");
                        lista.add(ler.next());
                        break;
                    case 2:
                        for(String item : lista){
                            System.out.println(item);
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Informe uma Posição para ser Removida:");
                        lista.remove(ler.nextInt()+1);
                        break;
                    case 4:
                        System.err.println("Informe uma posicão para marcar como Resolvido");
                        int posicao = (ler.nextInt() - 1);
                        String resolvido = lista.get(posicao);
                        lista.set(posicao , resolvido + " Ok ");
                        break;
                    case 0:
                        System.out.println("Programa Finalizado");
                        break;
                    default:
                        System.out.println("Opção Invalida Digiteno novamente.");
                }
            } while(escolha != 0);

        }
        public static void Menu(){

            System.out.println("1  - Nova Tarefa");
            System.out.println("2  -  Listar Tarefas");
            System.out.println("3  -  Remover");
            System.out.println("4  - Marcar resolvido");
            System.out.println("0  -  Sair");

        }
    }

