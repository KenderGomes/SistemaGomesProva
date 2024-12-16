/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.ClienteKhp;
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

public ClienteKhp getBean(int row){
    return (ClienteKhp) clientePesquisar.get(row);
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
        ClienteKhp clienteKhp = getBean(rowIndex);
        
        if(columnIndex == 0){
            return clienteKhp.getIdClienteKhp();
            
        }else if(columnIndex == 1){
            return clienteKhp.getNomeKhp();
        } else if(columnIndex == 2){
            return clienteKhp.getTelefoneKhp();
        } else if(columnIndex == 3){
            return clienteKhp.getEmailKhp();
        } else if(columnIndex == 4){
            return clienteKhp.getUfKhp();
        } else if(columnIndex == 5){
            return clienteKhp.getBairroKhp();
        } else if(columnIndex == 6){
            return clienteKhp.getNumeroKhp();
        } else if(columnIndex == 7){
            return clienteKhp.getCidadeKhp();
        } else if(columnIndex == 8){
            return clienteKhp.getEnderecoKhp();
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

