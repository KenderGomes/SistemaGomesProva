/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Vendas_khp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author kende
 */
public class VendasDAO extends DAOAbstract {

    @Override
    public void insert(Object object) {
        Vendas_khp venda = (Vendas_khp) object;
        try {
            String sql = "INSERT INTO vendas_khp (id_vendas_khp, fk_cliente_khp, data_venda_khp, valor_total_khp, forma_de_pagamento_khp, fk_vendedores_khp) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, venda.getId_vendas_khp());
            pstm.setInt(2, venda.getFk_cliente_khp());
            pstm.setString(3, venda.getData_venda_khp());
            pstm.setInt(4, venda.getValor_total_khp());
            pstm.setInt(5, venda.getForma_de_pagamento_khp());
            pstm.setInt(6, venda.getFk_vendedores_khp());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void update(Object object) {
        Vendas_khp venda = (Vendas_khp) object;
        try {
            String sql = "UPDATE vendas_khp SET fk_cliente_khp = ?, data_venda_khp = ?, valor_total_khp = ?, forma_de_pagamento_khp = ?, fk_vendedores_khp = ? WHERE id_vendas_khp = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, venda.getFk_cliente_khp());
            pstm.setString(2, venda.getData_venda_khp());
            pstm.setInt(3, venda.getValor_total_khp());
            pstm.setInt(4, venda.getForma_de_pagamento_khp());
            pstm.setInt(5, venda.getFk_vendedores_khp());
            pstm.setInt(6, venda.getId_vendas_khp());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Object object) {
        Vendas_khp venda = (Vendas_khp) object;
        try {
            String sql = "DELETE FROM vendas_khp WHERE id_vendas_khp = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, venda.getId_vendas_khp());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public Object list(int id) {
        Vendas_khp venda = null;
        try {
            String sql = "SELECT * FROM vendas_khp WHERE id_vendas_khp = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                venda = new Vendas_khp();
                venda.setId_vendas_khp(rs.getInt("id_vendas_khp"));
                venda.setFk_cliente_khp(rs.getInt("fk_cliente_khp"));
                venda.setData_venda_khp(rs.getString("data_venda_khp"));
                venda.setValor_total_khp(rs.getInt("valor_total_khp"));
                venda.setForma_de_pagamento_khp(rs.getInt("forma_de_pagamento_khp"));
                venda.setFk_vendedores_khp(rs.getInt("fk_vendedores_khp"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return venda;
    }

    @Override
    public ArrayList listAll() {
        ArrayList lista = new ArrayList();
        try {
            String sql = "SELECT * FROM vendas_khp";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Vendas_khp venda = new Vendas_khp();
                venda.setId_vendas_khp(rs.getInt("id_vendas_khp"));
                venda.setFk_cliente_khp(rs.getInt("fk_cliente_khp"));
                venda.setData_venda_khp(rs.getString("data_venda_khp"));
                venda.setValor_total_khp(rs.getInt("valor_total_khp"));
                venda.setForma_de_pagamento_khp(rs.getInt("forma_de_pagamento_khp"));
                venda.setFk_vendedores_khp(rs.getInt("fk_vendedores_khp"));
                lista.add(venda);
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return lista;
    }
}
