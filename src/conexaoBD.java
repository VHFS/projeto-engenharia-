
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



public class conexaoBD {

    private final Connection connection;
    
    public conexaoBD() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver"); 
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca" , "root" ,"");
    System.out.println("Conectado");
    }
    
         public static void main(String[] args) {
             try {
                 new conexaoBD();
             } catch (Exception e){
                 System.out.println("Não conectado");
}
}
  
}


