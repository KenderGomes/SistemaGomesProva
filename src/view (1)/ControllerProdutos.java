/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.Produtos_khp;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kende
 */
public class ControllerProdutos extends AbstractTableModel{

    private List produtosPesquisar;
    
public void setList(List list){
    this.produtosPesquisar = list;
}

public Produtos_khp getBean(int row){
    return (Produtos_khp) produtosPesquisar.get(row);
}

    
    @Override
    public int getRowCount() {
        return produtosPesquisar.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produtos_khp produtos_khp = getBean(rowIndex);
        
        if(columnIndex == 0){
            return produtos_khp.getId_produtos_khp();
            
        }else if(columnIndex == 1){
            return produtos_khp.getMaterial_khp();
        } else if(columnIndex == 2){
            return produtos_khp.getPreco_khp();
        } else if(columnIndex == 3){
            return produtos_khp.getTamanho_khp();
        } else if(columnIndex == 4){
            return produtos_khp.getCor_khp();
        } else if(columnIndex == 5){
            return produtos_khp.getMarca_khp();
        } else if(columnIndex == 6){
            return produtos_khp.getDescricao_khp();
        }
        return "";
    }
    
    @Override
    
    public String getColumnName(int columnIndex){
        
        if(columnIndex == 0){
            return "ID";
            
        }else if(columnIndex == 1){
            return "Material";
        } else if(columnIndex == 2){
            return "Preço";
        } else if(columnIndex == 3){
            return "Tamanho";
        } else if(columnIndex == 4){
            return "Cor";
        } else if(columnIndex == 5){
            return "Marca";
        } else if(columnIndex == 6){
            return "Descrição";
        }
        return "";
    }
}
