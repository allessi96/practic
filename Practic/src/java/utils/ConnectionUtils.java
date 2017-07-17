package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtils {
    public static Connection getConnection()
             throws ClassNotFoundException, SQLException {
        Connection conn;
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/contacts","chemax1", "chemax");
        return conn;
    }   
    
    public static void closeQuietly(Connection conn) {
       try {
           conn.close();
       } catch (SQLException e) {
       }
   }
 
   public static void rollbackQuietly(Connection conn) {
       try {
           conn.rollback();
       } catch (SQLException e) {
       }
   }
    
}
