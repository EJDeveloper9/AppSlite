/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author wanzambi
 */
public class ShowTabela {
    
 public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection cn = DriverManager.getConnection("jdbc:sqlite:mysql.db");
//           
            Statement stmt = cn.createStatement();
            String sql = "select  * from REGISTRATION";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
            }

        } catch (Exception e) {
            System.out.println("Falha de conexao" + e.getMessage());
        }
    }
}
