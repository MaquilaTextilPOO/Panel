/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.Ciudad;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maureen
 */
public class CiudadDatos {
    
    public static List<Ciudad> LeerCiudad(){
        List<Ciudad> ciudades = new ArrayList<Ciudad>();
        try {
            Connection cn= conexion.ObtenerConexion();
            Statement st= cn.createStatement();
            String sql ="SELECT CODCIUDAD,NOMCIUDAD FROM CIUDAD";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setCodCiudad(rs.getInt(1));
                ciudad.setNomCiudad(rs.getString(2)); 
                ciudades.add(ciudad);                
            }
            rs.close();
            cn.close();
            
        } catch (SQLException e) {
            System.err.println("error "+e.getMessage());
            
        }
        return ciudades;
    
    }
    
    public static String InsertarCiudad(Ciudad ciudad){
        try {
             Connection cn= conexion.ObtenerConexion();
             String sql ="INSERT INTO CIUDAD VALUES(?,?)";
             PreparedStatement ps= cn.prepareStatement(sql);
             ps.setInt(1, ciudad.getCodCiudad());
             ps.setString(2, ciudad.getNomCiudad());
             ps.execute();
             ps.close();
             cn.close();
             
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error InsertarCiudad:"+e.getMessage();
        }
    return null;
    }
    
    public static String ActualizarCiudad(Ciudad ciudad){
        try {
            Connection cn= conexion.ObtenerConexion();
            String sql ="UPDATE CIUDAD SET NOMCIUDAD= ? WHERE CODCIUDAD=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ciudad.getNomCiudad());
            ps.setInt(2, ciudad.getCodCiudad());
            ps.execute();
            ps.close();
            cn.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error ActualizarCiudad:"+e.getMessage();
        }
        return null;
    }
    
    public static String EliminarCiudad(Ciudad ciudad){
        try {
            Connection cn= conexion.ObtenerConexion();
            String sql ="DELETE FROM CIUDAD WHERE CODCIUDAD=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1,ciudad.getCodCiudad());
            ps.execute();
            ps.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: "+ e.getMessage();
        }
        return null;
    }
    
}
