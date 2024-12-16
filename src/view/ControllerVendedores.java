/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import bean.VendedoresKhp;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kende
 */
public class ControllerVendedores extends AbstractTableModel{
    private List vendedoresPesquisar;
    
public void setList(List list){
    this.vendedoresPesquisar = list;
}

public VendedoresKhp getBean(int row){
    return (VendedoresKhp) vendedoresPesquisar.get(row);
}

    
    
    public int getRowCount() {
        return vendedoresPesquisar.size();
    }

    
    public int getColumnCount() {
        return 6;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendedoresKhp vendedoresKhp = getBean(rowIndex);
        
        if(columnIndex == 0){
            return vendedoresKhp.getIdVendedoresKhp();
            
        }else if(columnIndex == 1){
            return vendedoresKhp.getNomeKhp();
        } else if(columnIndex == 2){
            return vendedoresKhp.getTelefoneKhp();
        } else if(columnIndex == 3){
            return vendedoresKhp.getEmailKhp();
        } else if(columnIndex == 4){
            return vendedoresKhp.getEnderecoKhp();
        } else if(columnIndex == 5){
            return vendedoresKhp.getCpfKhp();
        }
        return "";
    }
    
    
    
    public String getColumnName(int columnIndex){
        
        if(columnIndex == 0){
            return "ID";
            
        }else if(columnIndex == 1){
            return "Nome";
        } else if(columnIndex == 2){
            return "Telefone";
        } else if(columnIndex == 3){
            return "Email";
        } else if(columnIndex == 4){
            return "Endereço";
        } else if(columnIndex == 5){
            return "CPF";
        }
        return "";
    }
}

