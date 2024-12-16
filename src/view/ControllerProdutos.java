/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.ProdutosKhp;
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

public ProdutosKhp getBean(int row){
    return (ProdutosKhp) produtosPesquisar.get(row);
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
        ProdutosKhp produtosKhp = getBean(rowIndex);
        
        if(columnIndex == 0){
            return produtosKhp.getIdProdutosKhp();
            
        }else if(columnIndex == 1){
            return produtosKhp.getMaterialKhp();
        } else if(columnIndex == 2){
            return produtosKhp.getPrecoKhp();
        } else if(columnIndex == 3){
            return produtosKhp.getTamanhoKhp();
        } else if(columnIndex == 4){
            return produtosKhp.getCorKhp();
        } else if(columnIndex == 5){
            return produtosKhp.getMarcaKhp();
        } else if(columnIndex == 6){
            return produtosKhp.getDescricaoKhp();
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
