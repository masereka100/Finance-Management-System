/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author MASEREKA
 */
import java.sql.*;
import javax.swing.*;

public class DBConnection {
          Connection conn = null;
    
    public static Connection ConnectDB(){
        
         try{
         Class.forName("org.sqlite.JDBC");
            Connection  conn = DriverManager.getConnection("jdbc:sqlite:business.sqlite"  );
            // JOptionPane.showMessageDialog(null, "connection established");
             return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    return null;
    }
    
}
