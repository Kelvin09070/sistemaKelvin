/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import bean.VendaProdutoKvm;
import bean.FuncionarioKvm;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class FuncionarioControle extends AbstractTableModel{
   private List lista;
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
public FuncionarioKvm getFuncionarioKvm(int rowIndex){
return  (FuncionarioKvm) lista.get(rowIndex);
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
      VendaProdutoKvm vendaProdutoKvm = (VendaProdutoKvm) lista.get(rowIndex);
        if (columnIndex == 0) {
           return vendaProdutoKvm.getIdvendaProdutoKvm();
        } 
        if (columnIndex == 1) {
           return vendaProdutoKvm.getProdutoKvm();
        } 
        if (columnIndex == 2) {
           return vendaProdutoKvm.getQuantidadeKvm();
        } 
        if (columnIndex == 3) {
           return vendaProdutoKvm.getValorUnitKvm();
        } 
        return null;
    }
           public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Produto";
        }
        if (column == 2) {
            return "Quantidade";
        }
        if (column == 3) {
            return "Valorunitario";
        }
        return "";
    }
    
}
