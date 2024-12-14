/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Cliente_khp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author kende
 */
public class ClienteDAO extends DAOAbstract {

    @Override
    public void insert(Object object) {
        Cliente_khp cliente = (Cliente_khp) object;
        try {
            String sql = "INSERT INTO cliente_khp (id_cliente_khp, nome_khp, telefone_khp, email_khp, data_cadastro_khp, datanascimento_khp, uf_khp, bairro_khp, logradouro_khp, numero_khp, sexo_khp, cpf_khp, cep_khp, complemento_khp, endereco_khp, cidade_khp, identidade_khp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getId_cliente_khp());
            pstm.setString(2, cliente.getNome_khp());
            pstm.setString(3, cliente.getTelefone_khp());
            pstm.setString(4, cliente.getEmail_khp());
            pstm.setString(5, cliente.getData_cadastro_khp());
            pstm.setString(6, cliente.getDatanascimento_khp());
            pstm.setString(7, cliente.getUf_khp());
            pstm.setString(8, cliente.getBairro_khp());
            pstm.setString(9, cliente.getLogradouro_khp());
            pstm.setString(10, cliente.getNumero_khp());
            pstm.setInt(11, cliente.getSexo_khp());
            pstm.setString(12, cliente.getCpf_khp());
            pstm.setString(13, cliente.getCep_khp());
            pstm.setString(14, cliente.getComplemento_khp());
            pstm.setString(15, cliente.getEndereco_khp());
            pstm.setString(16, cliente.getCidade_khp());
            pstm.setString(17, cliente.getIdentidade_khp());
            
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void update(Object object) {
        Cliente_khp cliente = (Cliente_khp) object;
        try {
            String sql = "UPDATE cliente_khp SET nome_khp=?, telefone_khp=?, email_khp=?, data_cadastro_khp=?, datanascimento_khp=?, uf_khp=?, bairro_khp=?, logradouro_khp=?, numero_khp=?, sexo_khp=?, cpf_khp=?, cep_khp=?, complemento_khp=?, endereco_khp=?, cidade_khp=?, identidade_khp=? WHERE id_cliente_khp=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setString(1, cliente.getNome_khp());
            pstm.setString(2, cliente.getTelefone_khp());
            pstm.setString(3, cliente.getEmail_khp());
            pstm.setString(4, cliente.getData_cadastro_khp());
            pstm.setString(5, cliente.getDatanascimento_khp());
            pstm.setString(6, cliente.getUf_khp());
            pstm.setString(7, cliente.getBairro_khp());
            pstm.setString(8, cliente.getLogradouro_khp());
            pstm.setString(9, cliente.getNumero_khp());
            pstm.setInt(10, cliente.getSexo_khp());
            pstm.setString(11, cliente.getCpf_khp());
            pstm.setString(12, cliente.getCep_khp());
            pstm.setString(13, cliente.getComplemento_khp());
            pstm.setString(14, cliente.getEndereco_khp());
            pstm.setString(15, cliente.getCidade_khp());
            pstm.setString(16, cliente.getIdentidade_khp());
            pstm.setInt(17, cliente.getId_cliente_khp());
            
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Object object) {
        Cliente_khp cliente = (Cliente_khp) object;
        try {
            String sql = "DELETE FROM cliente_khp WHERE id_cliente_khp=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getId_cliente_khp());
            
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
    }

    @Override
    public Object list(int id) {
        Cliente_khp cliente = new Cliente_khp();
        try {
            String sql = "SELECT * FROM cliente_khp WHERE id_cliente_khp=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                cliente.setId_cliente_khp(rs.getInt("id_cliente_khp"));
                cliente.setNome_khp(rs.getString("nome_khp"));
                cliente.setTelefone_khp(rs.getString("telefone_khp"));
                cliente.setEmail_khp(rs.getString("email_khp"));
                cliente.setData_cadastro_khp(rs.getString("data_cadastro_khp"));
                cliente.setDatanascimento_khp(rs.getString("datanascimento_khp"));
                cliente.setUf_khp(rs.getString("uf_khp"));
                cliente.setBairro_khp(rs.getString("bairro_khp"));
                cliente.setLogradouro_khp(rs.getString("logradouro_khp"));
                cliente.setNumero_khp(rs.getString("numero_khp"));
                cliente.setSexo_khp(rs.getInt("sexo_khp"));
                cliente.setCpf_khp(rs.getString("cpf_khp"));
                cliente.setCep_khp(rs.getString("cep_khp"));
                cliente.setComplemento_khp(rs.getString("complemento_khp"));
                cliente.setEndereco_khp(rs.getString("endereco_khp"));
                cliente.setCidade_khp(rs.getString("cidade_khp"));
                cliente.setIdentidade_khp(rs.getString("identidade_khp"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return cliente;
    }

    @Override
    public ArrayList listAll() {
        ArrayList lista = new ArrayList();
        try {
            String sql = "SELECT * FROM cliente_khp";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Cliente_khp cliente = new Cliente_khp();
                cliente.setId_cliente_khp(rs.getInt("id_cliente_khp"));
                cliente.setNome_khp(rs.getString("nome_khp"));
                cliente.setTelefone_khp(rs.getString("telefone_khp"));
                cliente.setEmail_khp(rs.getString("email_khp"));
                cliente.setData_cadastro_khp(rs.getString("data_cadastro_khp"));
                cliente.setDatanascimento_khp(rs.getString("datanascimento_khp"));
                cliente.setUf_khp(rs.getString("uf_khp"));
                cliente.setBairro_khp(rs.getString("bairro_khp"));
                cliente.setLogradouro_khp(rs.getString("logradouro_khp"));
                cliente.setNumero_khp(rs.getString("numero_khp"));
                cliente.setSexo_khp(rs.getInt("sexo_khp"));
                cliente.setCpf_khp(rs.getString("cpf_khp"));
                cliente.setCep_khp(rs.getString("cep_khp"));
                cliente.setComplemento_khp(rs.getString("complemento_khp"));
                cliente.setEndereco_khp(rs.getString("endereco_khp"));
                cliente.setCidade_khp(rs.getString("cidade_khp"));
                cliente.setIdentidade_khp(rs.getString("identidade_khp"));
                lista.add(cliente);
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return lista;
    }
}
