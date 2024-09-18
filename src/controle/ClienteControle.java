/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import bean.ClienteKvm;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ClienteControle extends AbstractTableModel{
   private List lista;  
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
public ClienteKvm getClienteKvm(int rowIndex){
return  (ClienteKvm) lista.get(rowIndex);
}

    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
   return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          ClienteKvm clienteKvm = (ClienteKvm) lista.get(rowIndex);
        if (columnIndex == 0) {
           return clienteKvm.getIdclienteKvm();
        } 
        if (columnIndex == 1) {
           return clienteKvm.getNomeKvm();
        } 
        if (columnIndex == 2) {
           return clienteKvm.getSobrenomeKvm();
        } 
        if (columnIndex == 3) {
           return clienteKvm.getEmailKvm();
        } 
        return null;
    }
           public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Sobrenome";
        }
        if (column == 3) {
            return "Email";
        }
        return "";
    }
    
}
