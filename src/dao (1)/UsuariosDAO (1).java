/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuarios_khp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class UsuariosDAO extends DAOAbstract {

    @Override
    public void insert(Object object) {
        Usuarios_khp usuarios = (Usuarios_khp) object;
        try {

            String sql = "insert into usuarios_khp values (?,?,?,?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, usuarios.getId_usuarios_khp());
            pstm.setString(2, usuarios.getNome_khp());
            pstm.setString(3, usuarios.getApelido_khp());
            pstm.setString(4, usuarios.getCpf_khp());
            pstm.setDate(5, null);//Usuarios.getDataNascimento());
            pstm.setString(6, usuarios.getSenha_khp());
            pstm.setInt(7, usuarios.getNivel_khp());
            pstm.setString(8, usuarios.getAtivo_khp());
            
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL:" + ex.getMessage());
        }
//        System.out.println("Rodou");        
    }

    @Override
    public void update(Object object) {
        Usuarios_khp usuarios = (Usuarios_khp) object;
        try {
          
            String sql = "update usuarios_khp set nome_khp=?, apelido_khp=?, cpf_khp=?, dataNascimento_khp=?, senha_khp=?, nivel_khp=?, ativo_khp=? where id_usuarios_khp=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(8, usuarios.getId_usuarios_khp());
            pstm.setString(7, usuarios.getAtivo_khp());
            pstm.setInt(6, usuarios.getNivel_khp());
            pstm.setString(5, usuarios.getSenha_khp());
            pstm.setDate(4, null);//Usuarios.getDataNascimento());
            pstm.setString(3, usuarios.getCpf_khp());
            pstm.setString(2, usuarios.getApelido_khp());
            pstm.setString(1, usuarios.getNome_khp());
            
            pstm.executeUpdate();
            
   
        } catch (SQLException ex) {
            System.out.println("Erro de SQL:" + ex.getMessage());
        }
//            String sql = "update usuarios "
//                    + "set nome ='marcos pinheiro', apelido='mpv123' "
//                    + "where idusuarios = 3";

    }

    @Override
    public void delete(Object object) {
        Usuarios_khp usuarios = (Usuarios_khp) object;
        try {
            
            String sql = "delete from usuarios_khp where id_usuarios_khp=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, usuarios.getId_usuarios_khp());
          
            pstm.executeUpdate();
            
        
        } catch (SQLException ex) {
            System.out.println("Erro de SQL:" + ex.getMessage());
        }
    }

    @Override
    public Object list(int id) {  
        Usuarios_khp usuarios_khp = new Usuarios_khp();
        try {
            
            String sql = "select * from usuarios_khp where id_usuarios_khp=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs;
            rs = pstm.executeQuery();
            if (rs.next() == true){
                usuarios_khp = new Usuarios_khp();
                usuarios_khp.setId_usuarios_khp(rs.getInt("id_usuarios_khp"));
                usuarios_khp.setNome_khp(rs.getString("nome_khp"));
                usuarios_khp.setApelido_khp(rs.getString("apelido_khp"));
                usuarios_khp.setCpf_khp(rs.getString("cpf_khp"));
                usuarios_khp.setDataNascimento_khp(null);// rs.getDate("dataNascimento_khp"));
                usuarios_khp.setSenha_khp( rs.getString("senha_khp"));
                usuarios_khp.setNivel_khp(rs.getInt("nivel_khp"));
                usuarios_khp.setAtivo_khp(rs.getString("ativo_khp"));
               
                
            } 
        
       
        } catch (SQLException ex) {
            System.out.println("Erro de SQL:" + ex.getMessage());
        }
        return usuarios_khp;
    }

    @Override
    public ArrayList listAll() {
        ArrayList lista = new ArrayList();
   
        try {
            String sql = "select * from usuarios";
            PreparedStatement pstm;
            pstm = cnt.prepareStatement("Select * from usuarios_khp");
            ResultSet rs;
            rs = pstm.executeQuery();
            while (rs.next() == true){
                Usuarios_khp usuarios = new Usuarios_khp();
                usuarios.setId_usuarios_khp(rs.getInt("id_usuarios_khp"));
                usuarios.setApelido_khp(rs.getString("apelido_khp"));
                usuarios.setNome_khp(rs.getString("nome_khp"));
                usuarios.setCpf_khp(rs.getString("cpf_khp"));
                usuarios.setDataNascimento_khp(null);
                usuarios.setSenha_khp(rs.getString("senha_khp"));
                usuarios.setNivel_khp(rs.getInt("nivel_khp"));
                usuarios.setAtivo_khp(rs.getString("ativo_khp"));
                lista.add(usuarios);
                
            }
        
        } catch (SQLException ex) {
            System.out.println("Erro de SQL:" + ex.getMessage());
        }
        return lista;
    }
    

}