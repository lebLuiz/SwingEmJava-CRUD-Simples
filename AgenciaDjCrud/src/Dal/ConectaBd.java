package Dal;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConectaBd {
    
    public static Connection conectabd() throws ClassNotFoundException {
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AgenciaDjCrud","--SeuUsuárioDoBancodeDados--","--SuaSenhaDoBancoDeDados--");
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
            return con;
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
            
            return null;
        }
        
    }
    
}
