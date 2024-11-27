/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.Cliente_khp;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kende
 */
public class ControllerCliente extends AbstractTableModel{

    private List clientePesquisar;
    
public void setList(List list){
    this.clientePesquisar = list;
}

public Cliente_khp getBean(int row){
    return (Cliente_khp) clientePesquisar.get(row);
}

    
    @Override
    public int getRowCount() {
        return clientePesquisar.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente_khp cliente_khp = getBean(rowIndex);
        
        if(columnIndex == 0){
            return cliente_khp.getId_cliente_khp();
            
        }else if(columnIndex == 1){
            return cliente_khp.getNome_khp();
        } else if(columnIndex == 2){
            return cliente_khp.getTelefone_khp();
        } else if(columnIndex == 3){
            return cliente_khp.getEmail_khp();
        } else if(columnIndex == 4){
            return cliente_khp.getUf_khp();
        } else if(columnIndex == 5){
            return cliente_khp.getBairro_khp();
        } else if(columnIndex == 6){
            return cliente_khp.getNumero_khp();
        } else if(columnIndex == 7){
            return cliente_khp.getCidade_khp();
        } else if(columnIndex == 8){
            return cliente_khp.getEndereco_khp();
        }
        return "";
    }
    
    @Override
    
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
            return "UF";
        } else if(columnIndex == 5){
            return "Bairro";
        } else if(columnIndex == 6){
            return "Numero";
        } else if(columnIndex == 7){
            return "Cidade";
        } else if(columnIndex == 8){
            return "Endereço";
        }
         
        return "";
    }
}

