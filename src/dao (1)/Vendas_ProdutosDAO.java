/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Vendas_Produtos_khp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author kende
 */
public class Vendas_ProdutosDAO extends DAOAbstract {

    @Override
    public void insert(Object object) {
        Vendas_Produtos_khp vendaProduto = (Vendas_Produtos_khp) object;
        try {
            String sql = "INSERT INTO vendas_produtos_khp (fk_vendas_khp, fk_produtos_khp, quantidade_khp, valor_unitario_khp) VALUES (?, ?, ?, ?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendaProduto.getFk_vendas_khp());
            pstm.setInt(2, vendaProduto.getFk_produtos_khp());
            pstm.setInt(3, vendaProduto.getQuantidade_khp());
            pstm.setInt(4, vendaProduto.getValor_unitario_khp());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void update(Object object) {
        Vendas_Produtos_khp vendaProduto = (Vendas_Produtos_khp) object;
        try {
            String sql = "UPDATE vendas_produtos_khp SET quantidade_khp = ?, valor_unitario_khp = ? WHERE fk_vendas_khp = ? AND fk_produtos_khp = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendaProduto.getQuantidade_khp());
            pstm.setInt(2, vendaProduto.getValor_unitario_khp());
            pstm.setInt(3, vendaProduto.getFk_vendas_khp());
            pstm.setInt(4, vendaProduto.getFk_produtos_khp());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Object object) {
        Vendas_Produtos_khp vendaProduto = (Vendas_Produtos_khp) object;
        try {
            String sql = "DELETE FROM vendas_produtos_khp WHERE fk_vendas_khp = ? AND fk_produtos_khp = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendaProduto.getFk_vendas_khp());
            pstm.setInt(2, vendaProduto.getFk_produtos_khp());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public Object list(int id) {
        
        return null;
    }

    @Override
    public ArrayList listAll() {
        ArrayList lista = new ArrayList();
        try {
            String sql = "SELECT * FROM vendas_produtos_khp";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Vendas_Produtos_khp vendaProduto = new Vendas_Produtos_khp();
                vendaProduto.setFk_vendas_khp(rs.getInt("fk_vendas_khp"));
                vendaProduto.setFk_produtos_khp(rs.getInt("fk_produtos_khp"));
                vendaProduto.setQuantidade_khp(rs.getInt("quantidade_khp"));
                vendaProduto.setValor_unitario_khp(rs.getInt("valor_unitario_khp"));
                lista.add(vendaProduto);
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return lista;
    }
}
