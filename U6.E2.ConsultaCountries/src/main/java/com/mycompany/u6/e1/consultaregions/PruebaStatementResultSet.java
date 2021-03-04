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
            rs = st.executeQuery("select r.region_name, c.country_name from countries c, regions r "
                    + "where r.region_id = c.region_id order by r.region_name");   
            
            while(rs.next()) {
                String region = rs.getString(1);
                String country = rs.getString(2);
                System.out.println("Region = "+region+", country = "+country);
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


