/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.conexion;

import static hn.uth.poo.p3.datos.conexion.conexion.ObtenerConexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author maureen
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
     Connection con =
     ObtenerConexion();
        System.out.println("connection"+con.getSchema());
    }
    
}
