/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u08883230183
 */
public abstract class DAOAbstract{

    public Connection cnt;

    public DAOAbstract(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, pass;
//            url = "jdbc:mysql://10.7.0.51:33062/db_kender_gomes";
//            user = "kender_gomes";
//            pass = "kender_gomes";
            url = "jdbc:mysql://localhost/db_kender_gomes";;
            user = "root";
            pass = "";
            cnt = DriverManager.getConnection(url, user, pass);

        } catch (SQLException ex) {
            System.out.println("Erro de SQL:" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAbstract.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public abstract void insert(Object objeto);
    public abstract void update(Object objeto);
    public abstract void delete(Object objeto);

    public abstract Object list(int id);

    public abstract List listAll(); 
}

