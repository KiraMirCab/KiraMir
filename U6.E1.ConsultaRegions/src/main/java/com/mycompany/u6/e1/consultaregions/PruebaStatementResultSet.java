package com.mycompany.u6.e1.consultaregions;
import java.sql.*;
public class PruebaStatementResultSet {
    public static void main(String args[]){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM REGIONS");   
            
            while(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("Id = "+id+", name = "+name);
            }
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                
                if (st != null) {
                    st.close();
                }
                    
                DBUtils.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}


