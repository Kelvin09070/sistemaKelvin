/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import bean.ProdutoKvm;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ProdutoControle extends AbstractTableModel{
   private List lista;
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }public ProdutoKvm getBean(int linha){
        //System.out.println("getbean");
        return (ProdutoKvm) lista.get(linha);
    }
    
public ProdutoKvm getProdutoKvm(int rowIndex){
return  (ProdutoKvm) lista.get(rowIndex);
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
           ProdutoKvm produtoKvm = (ProdutoKvm) lista.get(rowIndex);
        if (columnIndex == 0) {
           return produtoKvm.getIdprodutoKvm();
        } 
        if (columnIndex == 1) {
           return produtoKvm.getCorKvm();
        } 
        if (columnIndex == 2) {
           return produtoKvm.getMarcaKvm();
        } 
        if (columnIndex == 3) {
           return produtoKvm.getModeloKvm();
        }
        if (columnIndex == 4) {
           return produtoKvm.getTamanhoKvm();
        } 
        return null;
    }
           public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "cor";
        }
        if (column == 2) {
            return "marca";
        }
        if (column == 3) {
            return "modelo";
        }
         if (column == 4) {
            return "tamanho";
        }
        return "";
    }
    
}
