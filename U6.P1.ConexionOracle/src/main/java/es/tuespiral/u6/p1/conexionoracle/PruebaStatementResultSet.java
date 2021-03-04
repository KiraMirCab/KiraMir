package es.tuespiral.u6.p1.conexionoracle;
import java.sql.*;
public class PruebaStatementResultSet {
    public static void main(String args[]){
        Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:1521/XE";
        String user = "COMPANY";
        String pass = "COMPANY";        
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión válida: " + conn.isValid(10));
            
            System.out.println("Estado del autocommit: "+ conn.getAutoCommit());
            
        } catch(SQLException e) {
            System.out.println("Ocurrió una excepción al conectar a la BD");
        } finally {
            try {
                if (conn != null) 
                    conn.close();
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}


