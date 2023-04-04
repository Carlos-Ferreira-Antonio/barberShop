package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    //Regras de negocio da tela de Login
     public void entrarSistema(){
         //Pegar um Usuario da View e transformar em usuario de Model
         Usuario user = helper.obterModelo();
         //Pesquisar usuario no Banco
         //Se o usuario da View tiver o mesmo usuario e senha que o usuario que veio
         //do banco de dados direciona para Menu Principal
         //Se não mostro uma mensagem de usuario ou senha invalidos
         
         
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
   
}
