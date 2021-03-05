package es.tuespiral.u6.p1.conexionoracle;

import java.sql.*;
import java.util.Scanner;

public class PruebaPreparedStatement {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();

            System.out.println("Dime el numero de la categoria de productos que te interesa:");
            int cat = sc.nextInt();
            System.out.println("Dime el precio minimo del producto:");
            double pr_min = sc.nextDouble();
            System.out.println("Dime el precio maximo del producto:");
            double pr_max = sc.nextDouble();
            System.out.println("Quieres ordenarlos de forma ascendiente (A) o descendiente (D)?");
            String limpieza = sc.nextLine();
            String orden = sc.nextLine();

            if (orden.equalsIgnoreCase("d")) {
                st = conn.prepareStatement("select * from products where category_id = ? and list_price BETWEEN ? AND ? order by list_price desc");                
            } else {
               st = conn.prepareStatement("select * from products where category_id = ? and list_price BETWEEN ? AND ? order by list_price");
            }

            st.setInt(1, cat);
            st.setDouble(2, pr_min);
            st.setDouble(3, pr_max);
//            st.setString(4, orden);

            rs = st.executeQuery();

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    long id = rs.getLong(1);
                    String name = rs.getString(2);
                    String desc = rs.getString(3);
                    double cost = rs.getDouble(4);
                    double price = rs.getDouble(5);
                    int cat_id = rs.getInt(6);
                    System.out.println("Id = " + id + ", name = " + name + ", descripcion = " + desc
                            + ", coste = " + cost + ", precio = " + price + ", categoria = " + cat_id);
                }
            } else {
                System.out.println("No se encuentra productos en ese rango de precios");
            }
        } catch (SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
            e.printStackTrace();
        } finally {
            try {
                DBUtils.close(rs);
                DBUtils.close(st);
                DBUtils.close(conn);
            } catch (SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}
