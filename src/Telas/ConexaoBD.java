package Telas;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno ssasr
 */



public class ConexaoBD {

    private final Connection connection;
    private static ConexaoBD uniqueInstance;
    
    ConexaoBD() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver"); 
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca?useTimezone=true&serverTimezone=UTC" , "root" ,"");
    System.out.println("Conectado");
    }
    
    public Connection getConnection()
    {
        return connection;
    }
    
    public static synchronized ConexaoBD getInstance()
    {
        if(uniqueInstance == null)
        {
            try {
                uniqueInstance = new ConexaoBD();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return uniqueInstance;
    }
        
             
             
}
  

