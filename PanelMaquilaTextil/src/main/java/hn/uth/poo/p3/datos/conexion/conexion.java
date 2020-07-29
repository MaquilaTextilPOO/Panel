/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maureen
 */
public class conexion {
    private static final String USUARIO="maquilaAdmin";
    private static final String CLAVE="admin123";
    public static Connection ObtenerConexion(){
        try {
            String URL ="jdbc:derby://localhost:1527/maquilaTextil";
            Connection cn=DriverManager.getConnection(URL,USUARIO,CLAVE);
        } catch (SQLException e) {
            System.err.println("error en conexion DataBase"+ e.getMessage());
        }
        return null;
    }
    
    
}
