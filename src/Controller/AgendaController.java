package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
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
    
    public void atualizaCliente(){
        //buscar clientes do Banco 
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        //Exibir cliente no JComboBox cliente
         helper.preencherClientes(clientes);
    }
    
    public void atualizaServico(){
        //buscar servicos do Banco 
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        //Exibir servicos no JComboBox cliente
         helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
    
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
        
    }
    
}
