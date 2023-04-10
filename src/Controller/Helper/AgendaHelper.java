package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper {
     private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
      
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);

        //Percorrer a lista preenchendo o tableModel
        for(Agendamento agendamento : agendamentos){
            
            tableModel.addRow(
            new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
        });
    }
}
    
    public void preencherClientes(ArrayList<Cliente> clientes) {
      
         DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) 
                 view.getJComboBoxCliente().getModel();
        //Percorrer a lista preenchendo o comboBoxModel
        for(Cliente cliente : clientes){
            comboBoxModel.addElement(cliente);    
    }
}
    
     public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) 
                 view.getJComboBoxServico().getModel();
        //Percorrer a lista preenchendo o comboBoxModel
        for(Servico servico : servicos){
            comboBoxModel.addElement(servico);    
    }
     }
}
