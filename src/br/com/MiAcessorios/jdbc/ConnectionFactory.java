
package br.com.MiAcessorios.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MIMACESSORIOS",
                    "Isac","1234");
        } catch (Exception e) {
            throw new RuntimeException(e);
            
        }
    }
}
