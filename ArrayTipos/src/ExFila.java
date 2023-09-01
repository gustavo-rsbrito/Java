import java.util.*;
class ExFila {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);

    /*Implemente um programa em Java com Menu de opções, para gerenciar uma fila de 
    reservas do restaurante Outback. As opções do menu e seus objetivos correspondentes 
    devem ser implementados conforme abaixo*/

        Queue<String> fila = new LinkedList<>();

        int opcao = 0;
        do {
            menu();
            opcao = ler.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Informe o nome para adicinar a reserva");
                    fila.add(ler.next());

                    if(fila.isEmpty()){
                        System.out.println("Não tem ninguem com reserva marcada.");
                    }
                    break;
                case 2:
                    System.out.println(fila.poll());
                    break;
                case 3:
                    System.out.println();
                    if(fila.isEmpty()){
                        System.out.println("Fila vazia");
                    } else{
                        for(String item : fila){
                            System.out.println(item);
                            System.out.println();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado.");
                    break;
                default :
                    System.out.println("Opção Invalida Digite Novamente.");
            }

        } while(opcao != 0);




    }
    public static void menu(){

        System.out.println("Digite 1 - Adicionar reserva ");
        System.out.println("Digite 2 - Chamar próximo");
        System.out.println("Digite 3 - Listar Reservas");
        System.out.println("Digite 0 - Sair ");
        System.out.println();

    }
}