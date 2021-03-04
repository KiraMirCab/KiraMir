package es.tuespiral.u6.p1.conexionoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:1521/XE";
        String user = "COMPANY";
        String pass = "COMPANY";        

        conn = DriverManager.getConnection(url, user, pass);
        return conn;

    }
    
    public static void close(Connection conn) throws SQLException {
        if (conn != null)
            conn.close();
    }
}
