/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Vendedores_khp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author kende
 */
public class VendedoresDAO extends DAOAbstract {

    @Override
    public void insert(Object object) {
        Vendedores_khp vendedor = (Vendedores_khp) object;
        try {
            String sql = "INSERT INTO vendedores_khp (id_vendedores_khp, nome_khp, telefone_khp, email_khp, data_cadastro_khp, endereco_khp, uf_khp, bairro_khp, logradouro_khp, numero_khp, sexo_khp, cidade_khp, identidade_khp, cep_khp, complemento_khp, cpf_khp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendedor.getId_vendedores_khp());
            pstm.setString(2, vendedor.getNome_khp());
            pstm.setString(3, vendedor.getTelefone_khp());
            pstm.setString(4, vendedor.getEmail_khp());
            pstm.setString(5, vendedor.getData_cadastro_khp());
            pstm.setString(6, vendedor.getEndereco_khp());
            pstm.setString(7, vendedor.getUf_khp());
            pstm.setString(8, vendedor.getBairro_khp());
            pstm.setString(9, vendedor.getLogradouro_khp());
            pstm.setString(10, vendedor.getNumero_khp());
            pstm.setInt(11, vendedor.getSexo_khp());
            pstm.setString(12, vendedor.getCidade_khp());
            pstm.setString(13, vendedor.getIdentidade_khp());
            pstm.setString(14, vendedor.getCep_khp());
            pstm.setString(15, vendedor.getComplemento_khp());
            pstm.setString(16, vendedor.getCpf_khp());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Errp de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void update(Object object) {
        Vendedores_khp vendedor = (Vendedores_khp) object;
        try {
            String sql = "UPDATE vendedores_khp SET nome_khp = ?, telefone_khp = ?, email_khp = ?, data_cadastro_khp = ?, endereco_khp = ?, uf_khp = ?, bairro_khp = ?, logradouro_khp = ?, numero_khp = ?, sexo_khp = ?, cidade_khp = ?, identidade_khp = ?, cep_khp = ?, complemento_khp = ?, cpf_khp = ? WHERE id_vendedores_khp = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setString(1, vendedor.getNome_khp());
            pstm.setString(2, vendedor.getTelefone_khp());
            pstm.setString(3, vendedor.getEmail_khp());
            pstm.setString(4, vendedor.getData_cadastro_khp());
            pstm.setString(5, vendedor.getEndereco_khp());
            pstm.setString(6, vendedor.getUf_khp());
            pstm.setString(7, vendedor.getBairro_khp());
            pstm.setString(8, vendedor.getLogradouro_khp());
            pstm.setString(9, vendedor.getNumero_khp());
            pstm.setInt(10, vendedor.getSexo_khp());
            pstm.setString(11, vendedor.getCidade_khp());
            pstm.setString(12, vendedor.getIdentidade_khp());
            pstm.setString(13, vendedor.getCep_khp());
            pstm.setString(14, vendedor.getComplemento_khp());
            pstm.setString(15, vendedor.getCpf_khp());
            pstm.setInt(16, vendedor.getId_vendedores_khp());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Object object) {
        Vendedores_khp vendedor = (Vendedores_khp) object;
        try {
            String sql = "DELETE FROM vendedores_khp WHERE id_vendedores_khp = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendedor.getId_vendedores_khp());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public Object list(int id) {
        Vendedores_khp vendedor = null;
        try {
            String sql = "SELECT * FROM vendedores_khp WHERE id_vendedores_khp = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                vendedor = new Vendedores_khp();
                vendedor.setId_vendedores_khp(rs.getInt("id_vendedores_khp"));
                vendedor.setNome_khp(rs.getString("nome_khp"));
                vendedor.setTelefone_khp(rs.getString("telefone_khp"));
                vendedor.setEmail_khp(rs.getString("email_khp"));
                vendedor.setData_cadastro_khp(rs.getString("data_cadastro_khp"));
                vendedor.setEndereco_khp(rs.getString("endereco_khp"));
                vendedor.setUf_khp(rs.getString("uf_khp"));
                vendedor.setBairro_khp(rs.getString("bairro_khp"));
                vendedor.setLogradouro_khp(rs.getString("logradouro_khp"));
                vendedor.setNumero_khp(rs.getString("numero_khp"));
                vendedor.setSexo_khp(rs.getInt("sexo_khp"));
                vendedor.setCidade_khp(rs.getString("cidade_khp"));
                vendedor.setIdentidade_khp(rs.getString("identidade_khp"));
                vendedor.setCep_khp(rs.getString("cep_khp"));
                vendedor.setComplemento_khp(rs.getString("complemento_khp"));
                vendedor.setCpf_khp(rs.getString("cpf_khp"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return vendedor;
    }

    @Override
    public ArrayList listAll() {
        ArrayList lista = new ArrayList();
        try {
            String sql = "SELECT * FROM vendedores_khp";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Vendedores_khp vendedor = new Vendedores_khp();
                vendedor.setId_vendedores_khp(rs.getInt("id_vendedores_khp"));
                vendedor.setNome_khp(rs.getString("nome_khp"));
                vendedor.setTelefone_khp(rs.getString("telefone_khp"));
                vendedor.setEmail_khp(rs.getString("email_khp"));
                vendedor.setData_cadastro_khp(rs.getString("data_cadastro_khp"));
                vendedor.setEndereco_khp(rs.getString("endereco_khp"));
                vendedor.setUf_khp(rs.getString("uf_khp"));
                vendedor.setBairro_khp(rs.getString("bairro_khp"));
                vendedor.setLogradouro_khp(rs.getString("logradouro_khp"));
                vendedor.setNumero_khp(rs.getString("numero_khp"));
                vendedor.setSexo_khp(rs.getInt("sexo_khp"));
                vendedor.setCidade_khp(rs.getString("cidade_khp"));
                vendedor.setIdentidade_khp(rs.getString("identidade_khp"));
                vendedor.setCep_khp(rs.getString("cep_khp"));
                vendedor.setComplemento_khp(rs.getString("complemento_khp"));
                vendedor.setCpf_khp(rs.getString("cpf_khp"));
                lista.add(vendedor);
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return lista;
    }
}
