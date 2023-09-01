
import java.util.*;
public class ArryHashSet {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /*Implemente um programa em Java que registre um jogo da MegaSena.O usuário deve informar 06 números não repetidos.
         Enquanto o usuárioinformar um número repetido, o programa deve pedir outro número.*/


        HashSet<Integer> numerosMega = new HashSet<Integer>();

        System.out.println("Informe  6 numeros para o jogo da Mega");

        for(int i=0; i < 6 ; i++){
            System.out.println("Informe o " + (i+1) + "numero");
            int numero = ler.nextInt();
            if(numerosMega.contains(numero)){
                System.out.println("Este numero já existe informe outro");
                i-=1;
            } else {
                numerosMega.add(numero);
            }
        }
        for(int item : numerosMega){
            System.out.print(item + ",");
        }


        }
    }
