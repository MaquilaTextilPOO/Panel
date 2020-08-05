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

    public static int secuenciaCodMaterial() throws SQLException {
        int cod = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(CODMATERIAL) FROM MATERIALES";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                cod = rs.getInt(1);
                if (rs.wasNull()) {
                    cod = 0;
                }
            }
            rs.close();
            cn.close();
            cod = cod + 1;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }

        System.out.println("codigo " + cod);
        return cod;
    }

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
            int cod = secuenciaCodMaterial();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO MATERIALES VALUES(?,?)";
            try ( PreparedStatement ps = cn.prepareStatement(sql)) {
                ps.setInt(1, cod);
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

    public static String ActualizarMateriales(Materiales materiales) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE MATERIALES SET DESCMATERIAL= ? WHERE CODMATERIAL=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, materiales.getDescMateria());
            ps.setInt(2, materiales.getCodMateria());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarMateriales(Materiales materiales) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM MATERIALES WHERE CODMATERIAL=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, materiales.getCodMateria());
            ps.execute();
            ps.close();
            cn.close();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<Materiales> BuscarMateriales(Materiales material) throws SQLException, Exception {
        List<Materiales> materiales = new ArrayList<Materiales>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODMATERIAL,DESCMATERIAL FROM MATERIALES WHERE UPPER(DESCMATERIAL) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + material.getDescMateria().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    Materiales materialesObjeto = new Materiales();
                    materialesObjeto.setCodMateria(1);
                    materialesObjeto.setDescMateria(rs.getString(2));
                    materiales.add(materialesObjeto);
                } while (rs.next());

            } else {
                throw new Exception("No encontro coincidencia");

            }
            rs.close();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return materiales;

    }

}
