package Application;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class MainLogin {
    
    public static void main(String[]args){
    
        /*
        String nome = "Carlos";
        System.out.println("Cliente: " + nome);
        Servico svc = new Servico(1, "barba", 30);
        System.out.println("Serviço: "+ svc.getDescricao() + " \nValor: " + svc.getValor());
        */
     
        Usuario usu = new Usuario(1, "Jhon", "barbado");
        System.out.println(usu);
        
        Cliente cli = new Cliente(1, "Alan", 'M', "063925887484", "Rua 123");
         System.out.println(cli);
    }
}
