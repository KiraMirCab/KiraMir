package es.tuespiral.u6.p1.conexionoracle;
import java.sql.*;
public class PruebaStatementExecuteUpdate {
    public static void main(String args[]){
        Connection conn = null;
        Statement st = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            
            for (int i = 7; i <=9; i++) {
           
                int numFilas = st.executeUpdate("INSERT INTO INVENTORIES "
                    + "(PRODUCT_ID, WAREHOUSE_ID, QUANTITY) "
                    + "VALUES ("+i+", 7, 10)");   
            
            System.out.println("Se han insertado "+numFilas+" filas");
            
//            numFilas = st.executeUpdate("DELETE FROM INVENTORIES "
//                                        + "WHERE PRODUCT_ID = "+i+" and WAREHOUSE_ID = 7 and QUANTITY = 10"); 
//            System.out.println("Se han eliminado "+numFilas+" filas");
            }
            
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
            e.printStackTrace();
        } finally {
            try {  
                DBUtils.close(st);  
                DBUtils.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}


