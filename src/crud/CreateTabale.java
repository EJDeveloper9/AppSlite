package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author wanzambi
 */
public class CreateTabale {
public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection cn = DriverManager.getConnection("jdbc:sqlite:mysql.db");
//           
            Statement stmt = cn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS REGISTRATION "
                    + "(id INTEGER auto_increment, "
                    + " nome VARCHAR(50), "
                    + " endereco VARCHAR(50), "
                    + " idade INTEGER, "
                    + " PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Tabela Criada");
        } catch (Exception e) {
            System.out.println("Falha de conexao" + e.getMessage());
        }
    }

}
