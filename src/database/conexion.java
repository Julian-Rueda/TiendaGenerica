package database;

import java.sql.*;
public class conexion {

    public static Connection obtenerConexion(){
        String url="jdbc:sqlserver://localhost:3306;"
                +"database=tienda"
                +"username=username;"
                +"password=password";
       try {
           Connection con = DriverManager.getConnection(url);
           return con;
       }catch (SQLException ex) {
           System.out.println(ex.toString());
           return null;
       }
    }

}
