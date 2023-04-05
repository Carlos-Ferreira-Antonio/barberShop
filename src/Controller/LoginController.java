package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;
import java.text.ParseException;

public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    //Regras de negocio da tela de Login
     public void entrarSistema() throws ParseException{
         //Pegar um Usuario da View e transformar em usuario de Model
         Usuario user = helper.obterModelo();
         //Pesquisar usuario no Banco
         UsuarioDAO usuarioDAO = new UsuarioDAO();
         Usuario userAutenticado = usuarioDAO.selectPorNomeESenha(user);
         //Se o usuario da View tiver o mesmo usuario e senha que o usuario que veio
         //do banco de dados direciona para Menu Principal
         if(userAutenticado != null){
             //Navegar para menu principal
             MenuPrincipal menu = new MenuPrincipal();
             //entrar menu
             menu.setVisible(true);
             //fechar tela login
             this.view.dispose();
         }
         //Se não mostro uma mensagem de usuario ou senha invalidos
         else {
             view.exibeMensagem("Usuario ou senha invalidos!");
         }  
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
   
}
