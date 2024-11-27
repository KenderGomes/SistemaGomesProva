/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.Usuarios_khp;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kende
 */

public class ControllerUsuarios extends AbstractTableModel{

    private List usuariosPesquisar;
    
public void setList(List list){
    this.usuariosPesquisar = list;
}

public Usuarios_khp getBean(int row){
    return (Usuarios_khp) usuariosPesquisar.get(row);
}

    
    @Override
    public int getRowCount() {
        return usuariosPesquisar.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuarios_khp usuarios_khp = getBean(rowIndex);
        
        if(columnIndex == 0){
            return usuarios_khp.getId_usuarios_khp();
            
        }else if(columnIndex == 1){
            return usuarios_khp.getNome_khp();
        } else if(columnIndex == 2){
            return usuarios_khp.getCpf_khp();
        } else if(columnIndex == 3){
            return usuarios_khp.getSenha_khp();
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
            return "CPF";
        } else if(columnIndex == 3){
            return "Senha";
        }
        return "";
    }
}
