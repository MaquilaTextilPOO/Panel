/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.Materiales;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.Materiales;
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
public class MaterialesDatos {

    public static List<Materiales> LeerMateriales() throws SQLException {
        List<Materiales> materiales = new ArrayList<>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sqlLeer = "SELECT CODMATERIAL,DESCMATERIAL FROM MATERIALES";
            try ( ResultSet rs = st.executeQuery(sqlLeer)) {
                while (rs.next()) {
                    Materiales material = new Materiales();
                    material.setCodMateria(rs.getInt(1));
                    material.setDescMateria(rs.getString(2));
                    materiales.add(material);
                }
                rs.close();
            }
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return materiales;
    }
    
      public static String InsertarMateriales(Materiales materiales) {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO MATERIALES VALUES(?,?)";
            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                ps.setInt(1, materiales.getCodMateria());
                ps.setString(2, materiales.getDescMateria());
                ps.execute();
                ps.close();
            }
            
            cn.close();

        } catch (SQLException e) {
            return "Error InsertarMateriales:" + e.getMessage();
        }
        return null;
    }
    
    

}
