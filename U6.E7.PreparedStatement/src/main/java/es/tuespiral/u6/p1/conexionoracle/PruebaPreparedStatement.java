package es.tuespiral.u6.p1.conexionoracle;
import java.sql.*;
import java.util.Scanner;

public class PruebaPreparedStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            
            System.out.println("Dime el nombre de la CPU:");
            String nombre = sc.nextLine();
            System.out.println("Dime la descripcion de la CPU:");
            String desc = sc.nextLine();
            System.out.println("Dime el coste de la CPU:");
            double cost = sc.nextDouble();
            System.out.println("Dime el precio de la CPU:");
            double price = sc.nextDouble();            
            
            st = conn.prepareStatement("INSERT INTO PRODUCTS (PRODUCT_NAME, DESCRIPTION, STANDARD_COST, LIST_PRICE, CATEGORY_ID) "+
                    " VALUES (?, ?, ?, ?, 1)");
            st.setString(1, nombre);
            st.setString(2, desc);
            st.setDouble(3, cost);
            st.setDouble(4, price);
            
            rs = st.executeQuery();    
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {
                DBUtils.close(rs);
                DBUtils.close(st);    
                DBUtils.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}


