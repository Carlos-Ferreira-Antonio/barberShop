package Controller;

import View.Agenda;
import View.MenuPrincipal;



public class MenuController {
    private final MenuPrincipal view;
    
     public MenuController(MenuPrincipal view) {
        this.view = view;
    }
     
     public void navegarAgenda(){
         Agenda agenda = new Agenda();
         agenda.setVisible(true);
     }
     
}
