package Exercicio2;

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Contato contato = new Contato();

        contato.setNome("Gustavo");
      
        // Setanto as Informações do endereco
        Endereco enderecoDoContato = new Endereco();
            enderecoDoContato.setRua("Rua Beira lago ");
            enderecoDoContato.setNumero(" N - 14b ");
            enderecoDoContato.setBairro("Cantinho do céu ");
            enderecoDoContato.setCidade("São Paulo ");
            enderecoDoContato.setCep("044488-254 ");

        //passando as informaçoes do endereco para o objeto contato
        contato.setEndereco(enderecoDoContato);

        // Setando as informacoes do telefone 1.
         Telefone telefone1 = new Telefone();
            telefone1.setDdd("11 ");
            telefone1.setTipo("celular ");
            telefone1.setTelefone("99999-8888 ");

        //Setando as Informações do Telefone 2.
        Telefone telefone2 = new Telefone();
            telefone2.setDdd("12 ");
            telefone2.setTipo("Residencial");
            telefone2.setTelefone("55555-2315 ");

        // Criando um objeto do tipo array telefone para seta os telefones de 1 cliente    
        Telefone[] telefonesDoCliente1 = new Telefone[2];
        telefonesDoCliente1[0] = telefone1;
        telefonesDoCliente1[1] = telefone2;
        
        // setando as informaçoes do telefones do cliente1 para o contato
        contato.setTelefones(telefonesDoCliente1);

        //mostrando as informacoes com metodos proprios do objetos
        contato.mostrar();
        enderecoDoContato.mostrarEndereco();

        if ( contato != null && contato.getTelefones() != null){
            for(Telefone tell : contato.getTelefones()){
             System.out.println("Telefones " + tell.getDdd() + " " + tell.getTelefone());
         }
        }

    }

}
