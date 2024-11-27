/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Produtos_khp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kende
 */
public class ProdutosDAO extends DAOAbstract {

    @Override
    public void insert(Object object) {
        Produtos_khp produto = (Produtos_khp) object;
        try {
            String sql = "INSERT INTO produtos_khp (id_produtos_khp, material_khp, descricao_khp, preco_khp, tamanho_khp, cor_khp, marca_khp) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, produto.getId_produtos_khp());
            pstm.setString(2, produto.getMaterial_khp());
            pstm.setString(3, produto.getDescricao_khp());
            pstm.setString(4, produto.getPreco_khp());
            pstm.setString(5, produto.getTamanho_khp());
            pstm.setString(6, produto.getCor_khp());
            pstm.setString(7, produto.getMarca_khp());
            
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void update(Object object) {
        Produtos_khp produto = (Produtos_khp) object;
        try {
            String sql = "UPDATE produtos_khp SET material_khp=?, descricao_khp=?, preco_khp=?, tamanho_khp=?, cor_khp=?, marca_khp=? WHERE id_produtos_khp=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setString(1, produto.getMaterial_khp());
            pstm.setString(2, produto.getDescricao_khp());
            pstm.setString(3, produto.getPreco_khp());
            pstm.setString(4, produto.getTamanho_khp());
            pstm.setString(5, produto.getCor_khp());
            pstm.setString(6, produto.getMarca_khp());
            pstm.setInt(7, produto.getId_produtos_khp());
            
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Object object) {
        Produtos_khp produto = (Produtos_khp) object;
        try {
            String sql = "DELETE FROM produtos_khp WHERE id_produtos_khp=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, produto.getId_produtos_khp());
            
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public Object list(int id) {
        Produtos_khp produto = new Produtos_khp();
        try {
            String sql = "SELECT * FROM produtos_khp WHERE id_produtos_khp=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                produto.setId_produtos_khp(rs.getInt("id_produtos_khp"));
                produto.setMaterial_khp(rs.getString("material_khp"));
                produto.setDescricao_khp(rs.getString("descricao_khp"));
                produto.setPreco_khp(rs.getString("preco_khp"));
                produto.setTamanho_khp(rs.getString("tamanho_khp"));
                produto.setCor_khp(rs.getString("cor_khp"));
                produto.setMarca_khp(rs.getString("marca_khp"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return produto;
    }

    @Override
    public ArrayList listAll() {
        ArrayList lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM produtos_khp";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Produtos_khp produto = new Produtos_khp();
                produto.setId_produtos_khp(rs.getInt("id_produtos_khp"));
                produto.setMaterial_khp(rs.getString("material_khp"));
                produto.setDescricao_khp(rs.getString("descricao_khp"));
                produto.setPreco_khp(rs.getString("preco_khp"));
                produto.setTamanho_khp(rs.getString("tamanho_khp"));
                produto.setCor_khp(rs.getString("cor_khp"));
                produto.setMarca_khp(rs.getString("marca_khp"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return lista;
    }
}
