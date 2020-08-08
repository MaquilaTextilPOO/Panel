/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.Unidades;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.Unidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gisell Aguilera
 */
public class UnidadesDatos {

    public static int secuenciaUnidades() throws SQLException {
        int unidad = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(UNIDADES) FROM UNIDADES";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                unidad = rs.getInt(1);
                if (rs.wasNull()) {
                    unidad = 0;
                }
            }
            rs.close();
            cn.close();
            unidad = unidad + 1;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }

        return unidad;
    }

    public static List<Unidades> LeerUnidades() throws SQLException {
        List<Unidades> unidades = new ArrayList<Unidades>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT UNIDADES,DESCUNIDADES FROM UNIDADES";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Unidades Unidades = new Unidades();
                Unidades.setUnidades(rs.getInt(1));
                Unidades.setDescripcion(rs.getString(2));
                unidades.add(Unidades);
            }
            rs.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return unidades;

    }

    public static String InsertarUnidades(Unidades unidades) throws SQLException {
        try {
            int cod = secuenciaUnidades();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO UNIDADES VALUES(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setString(2, unidades.getDescripcion());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String ActualizarUnidades(Unidades unidades) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE UNIDADES SET DESCUNIDADES= ? WHERE UNIDADES=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, (String) unidades.getUnidades());
            ps.setInt(2, (int) unidades.getUnidades());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarUnidades(Unidades unidades) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM UNIDADES WHERE UNIDADES=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, (int) unidades.getUnidades());
            ps.execute();
            ps.close();
            cn.close();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<Unidades> BuscarUnidades(Unidades Unidades) throws SQLException, Exception {
        List<Unidades> unidades = new ArrayList<Unidades>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT UNIDADES,DESCUNIDADES FROM UNIDADES WHERE UPPER(DESCUNIDADES) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + Unidades.getDescripcion().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    Unidades unidadesObjeto = new Unidades();
                    unidadesObjeto.setUnidades(1);
                    unidadesObjeto.setUnidades(2);
                    unidades.add(unidadesObjeto);
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
        return unidades;

    }

}

