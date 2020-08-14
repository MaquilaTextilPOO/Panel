/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.norma;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.Norma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARLON HERNANDEZ
 */
public class NormaDatos {
    
    public static int secuenciaCodNorma() throws SQLException {
        int cod = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(CODNORMA) FROM NORMA";
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

        return cod;
    }

    public static List<Norma> LeerNorma() throws SQLException {
        List<Norma> normas = new ArrayList<Norma>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODNORMA,DESCRIPCION FROM NORMA";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Norma norma = new Norma();
                norma.setCodNorma(rs.getInt(1));
                norma.setDescripcion(rs.getString(2));
                normas.add(norma);
            }
            rs.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return normas;

    }

    public static String InsertarNorma(Norma norma) throws SQLException {
        try {
            int cod = secuenciaCodNorma();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO NORMA VALUES(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setString(2, norma.getDescripcion());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String ActualizarNorma(Norma norma) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE NORMA SET DESCRIPCION= ? WHERE CODNORMA=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, norma.getDescripcion());
            ps.setInt(2, norma.getCodNorma());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarNorma(Norma norma) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM NORMA WHERE CODNORMA=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, norma.getCodNorma());
            ps.execute();
            ps.close();
            cn.close();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<Norma> BuscarNorma(Norma norma) throws SQLException, Exception {
        List<Norma> normas = new ArrayList<Norma>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODNORMA,DESCRIPCION FROM NORMA WHERE UPPER(DESCRIPCION) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + norma.getDescripcion().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    Norma normaObjeto = new Norma();
                    normaObjeto.setCodNorma(1);
                    normaObjeto.setDescripcion(rs.getString(2));
                    normas.add(normaObjeto);
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
        return normas;

    }
}
