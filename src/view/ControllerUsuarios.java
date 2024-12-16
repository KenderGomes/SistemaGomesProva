/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.UsuariosKhp;
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

public UsuariosKhp getBean(int row){
    return (UsuariosKhp) usuariosPesquisar.get(row);
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
        UsuariosKhp usuariosKhp = getBean(rowIndex);
        
        if(columnIndex == 0){
            return usuariosKhp.getIdUsuariosKhp();
            
        }else if(columnIndex == 1){
            return usuariosKhp.getNomeKhp();
        } else if(columnIndex == 2){
            return usuariosKhp.getCpfKhp();
        } else if(columnIndex == 3){
            return usuariosKhp.getSenhaKhp();
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
