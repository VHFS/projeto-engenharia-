
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class conexaoBD {
    public static void Conexao(String args[]) {
String bd, usuario, senha, endereco, porta;
bd = "biblioteca";
usuario = "root";
senha = "";
endereco = "localhost";
porta = "3306";
try {
DriverManager.getConnection(
"jdbc:mysql://localhost:3306/biblioteca" , "root" ,"");
JOptionPane.showMessageDialog(null, "Conectado");
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, "Não conectado\n" + ex.getMessage());
}
}
  
}
