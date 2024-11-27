/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import bean.Vendedores_khp;
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

public Vendedores_khp getBean(int row){
    return (Vendedores_khp) vendedoresPesquisar.get(row);
}

    
    
    public int getRowCount() {
        return vendedoresPesquisar.size();
    }

    
    public int getColumnCount() {
        return 6;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vendedores_khp vendedores_khp = getBean(rowIndex);
        
        if(columnIndex == 0){
            return vendedores_khp.getId_vendedores_khp();
            
        }else if(columnIndex == 1){
            return vendedores_khp.getNome_khp();
        } else if(columnIndex == 2){
            return vendedores_khp.getTelefone_khp();
        } else if(columnIndex == 3){
            return vendedores_khp.getEmail_khp();
        } else if(columnIndex == 4){
            return vendedores_khp.getEndereco_khp();
        } else if(columnIndex == 5){
            return vendedores_khp.getCpf_khp();
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

