
package com.estudo.testeprojetocompostgresql;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author GustavoSantos
 */

public class ExecutaQuery {
    
    public static void executa() {
        
        try{
            String url = "jdbc:postgresql://localhost:5432/teste";
            String usuario = "postgres";
            String senha = "postgres";
            
            Class.forName("org.postgresql.Driver");
            
            Connection con;
            
            con = DriverManager.getConnection(url, usuario, senha);
            
            System.out.println("Conexão realizada com sucesso!!!");
            
            Statement stm = con.createStatement();
            
            stm.executeUpdate("insert into teste values (7,'tereza');");
            
            con.close();
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
