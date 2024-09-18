/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import bean.VendaKvm;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class VendaControle extends AbstractTableModel{
    private List lista;
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
public VendaKvm getVendaKvm(int rowIndex){
return  (VendaKvm) lista.get(rowIndex);
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
      VendaKvm vendaKvm = (VendaKvm) lista.get(rowIndex);
        if (columnIndex == 0) {
           return vendaKvm.getIdvendaKvm();
        } 
        if (columnIndex == 1) {
           return vendaKvm.getFormaPagamentoKvm();
        } 
        if (columnIndex == 2) {
           return vendaKvm.getTotalKvm();
        } 
        if (columnIndex == 3) {
           return vendaKvm.getDataKvm();
        } 
        return null;
    }
           public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "formapagamento";
        }
        if (column == 2) {
            return "Total";
        }
        if (column == 3) {
            return "Datavenda";
        }
        return "";
    }
    
}
