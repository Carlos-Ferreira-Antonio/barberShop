package Application;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.text.ParseException;

public class MainLogin {
    
    public static void main(String[]args) throws ParseException{
    
        String nome = "Carlos";
        System.out.println("Cliente: " + nome);
        Servico svc = new Servico(1, "barba", 30);
        System.out.println("Serviço: "+ svc.getDescricao() + " \nValor: " + svc.getValor());
  
        Usuario usu = new Usuario(1, "Jhonn", "barbado");
        System.out.println(usu.getNome());
        
        Cliente cli = new Cliente(1, "Carlos", "Rua123", "77470555");
         System.out.println(cli.getNome());
         
        Agendamento agd = new Agendamento(1, cli, svc, 30, "05/04/2023 08:00");
        System.out.println(agd.getCliente().getNome());
    }
}
