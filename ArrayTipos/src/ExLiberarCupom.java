import java.util.*;
public class ExLiberarCupom {
    static Scanner ler = new Scanner(System.in);
        public static void main (String [] args){

    /*Implemente um programa em Java com Menu de opções, para gerenciar um sistema que libera
    cupons para os usuários de um e-Commerce. O  sistema só pode liberar um cupom por CPF. As
    opções do menu e seus objetivos correspondentes devem ser implementados conforme abaixo.*/

            HashSet<String> hashSet = new HashSet<String>();

            int escolha =0;
            int op = 0;
            do{

                op = menu(escolha);

                switch(op){
                    case 1:
                        System.out.println("Informe seu cpf para validação.");
                        String cpf = ler.next();
                        if(hashSet.contains(cpf)){
                            System.out.println("Cupom já liberado para o CPF , Informe um novo CPF");
                        } else{
                            hashSet.add(cpf);
                        }
                        break;
                    case 2:
                        if (hashSet.size() == 0){
                            System.out.println("Lista Vazia");
                        }
                        for(String item : hashSet){
                            System.out.println("CPF : " + item);
                        }
                        break;
                    case 0:
                        System.out.println("Programa Finalizado.");
                        break;

                    default:
                        System.out.println("Opção Invalida, Digite Novamente.");
                }
            } while (op != 0);

        }
        public static int menu (int escolhaMenu){

            System.out.println(" 1 - Liberar cupom");
            System.out.println(" 2 Listar CPF’s liberados");
            System.out.println(" 0 Sair");

            escolhaMenu = ler.nextInt();

            return escolhaMenu;

        }
    }

