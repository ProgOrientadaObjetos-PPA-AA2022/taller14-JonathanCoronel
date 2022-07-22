/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SALAI
 */
public class Enlace {
    
    private Connection conn;
    
    public void establecerConexion() {
        
        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public Connection obtenerConexion() {
        return conn;
    }
    
    public void insertarAuto(Estudiante estu) {
        
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (nombre,"
                    + "apellido,calificacion1,calificacion2,calificacion3) "
                    + "values ('%s', '%s', '%.2f','%.2f','%.2f')",
                    estu.obtenerNombre(), estu.obtenerApellido(),
                    estu.obtenerCal1(), estu.obtenerCal2(), estu.obtenerCal3());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());
            
        }
    }
    
    public ArrayList<Estudiante> obtenerDataAuto() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";
            
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Estudiante estu = new Estudiante();
                estu.establecerNombre(rs.getString("nombre"));
                estu.establecerApellido(rs.getString("apellido"));
                estu.establecerCal1(rs.getDouble("cal1"));
                lista.add(auto);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarCiudad");
            System.out.println(e.getMessage());
            
        }
        return lista;
    }
}
