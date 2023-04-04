package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper {
    
    //Injetar acesso a view
    private final Login view;
    
     public LoginHelper(Login view) {
        this.view = view;
    }
    //retornar um usuario
    public Usuario obterModelo(){
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        Usuario user = new Usuario(0, nome, senha);
        return user;
    }
    
     public void setarModelo(Usuario user){
         String nome = user.getNome();
         String senha = user.getSenha();
         
         view.getTextUsuario().setText(nome);
         view.getTextSenha().setText(senha);
    }
    
     public void limparTela(){
    //Pegar os dois campos e atribuir espaço vazio para limpa-los
         view.getTextUsuario().setText("");
         view.getTextSenha().setText("");
    }
    
}
