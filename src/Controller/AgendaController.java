package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import java.util.ArrayList;


public class AgendaController {
    
     private final Agenda view;
     private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }

    public void atualizaTabela(){
    //Buscar lista com agendamentos do banco
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
         ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
         //Exibir lista na View
         helper.preencherTabela(agendamentos);
    }
    
}
