/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import bean.UsuarioKvm;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class UsuarioControle extends AbstractTableModel{
private List lista;
   public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   public UsuarioKvm getBean(int linha){
        //System.out.println("getbean");
        return (UsuarioKvm) lista.get(linha);
    }
public UsuarioKvm getUsuarioKvm(int rowIndex){
return  (UsuarioKvm) lista.get(rowIndex);
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
     UsuarioKvm usuarioKvm = (UsuarioKvm) lista.get(rowIndex);
        if (columnIndex == 0) {
           return usuarioKvm.getIdusuarioKvm();
        } 
        if (columnIndex == 1) {
           return usuarioKvm.getNomeKvm();
        } 
        if (columnIndex == 2) {
           return usuarioKvm.getApelidoKvm();
        } 
        if (columnIndex == 3) {
           return usuarioKvm.getCpfKvm();
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
            return "Apelido";
        }
        if (column == 3) {
            return "Cpf";
        }
        return "";
    }
    
}
