package es.tuespiral.u6.p1.conexionoracle;

import java.sql.*;

public class PruebaStatementExecuteUpdate {

    public static void main(String args[]) {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();

            System.out.println("Hola");
            int numFilas = st.executeUpdate("update inventories set quantity = quantity + 10 "
                    + "where warehouse_id = 7 and product_id in(select product_id from products p, product_categories pc where p.category_id=pc.category_id and pc.category_name='CPU')");

            System.out.println("Se han modificado " + numFilas + " filas");

//            numFilas = st.executeUpdate("DELETE FROM INVENTORIES "
//                                        + "WHERE PRODUCT_ID = "+i+" and WAREHOUSE_ID = 7 and QUANTITY = 10"); 
//            System.out.println("Se han eliminado "+numFilas+" filas");
//            }
        } catch (SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
            e.printStackTrace();
        } finally {
            try {
                DBUtils.close(st);
                DBUtils.close(conn);
            } catch (SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}
