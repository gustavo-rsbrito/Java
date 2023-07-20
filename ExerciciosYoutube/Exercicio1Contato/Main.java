import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        Contato contato = new Contato();
        Endereco end = new Endereco();
        Telefone tell = new Telefone();

        Telefone[] telefone = new Telefone[2];
        telefone[0] = tell;

        System.out.println("Informe Seu nome:");
        contato.setNome(ler.nextLine());

        contato.setEndereco(end);

        System.out.println("Informe Sua Rua:");
        end.setRua(ler.nextLine());

        System.out.println("Informe Seu numero da casa:");
        end.setNumero(ler.next());

        System.out.println("Informe Seu Bairro:");
        end.setBairro(ler.next());

        System.out.println("Informe Sua cidade:");
        end.setCidade(ler.next());
         
        contato.setTelefones(telefone);

        System.out.println("Informe o tipo");
        tell.setTipo(ler.next());

        System.out.println("Informe o ddd");
        tell.setDdd(ler.next());

        System.out.println("Informe o numero");
        tell.setTelefone(ler.next());

        for(Telefone telefone1 : contato.getTelefones()){
            System.out.println( " AQui a saida " + telefone1.getDdd() + " " + telefone1.getTelefone());
        }


    

    }
}
