/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.OrdenTrabajo;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.OrdenesTrabajoDetalle;
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
public class OrdenTrabajoDetalleDatos {

    public static int secuenciaNumOrdenesTrabajoDet() throws SQLException {
        int cod = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(NUMORDENDET) FROM ORDENTRABAJODETALLE";
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

    public static List<OrdenesTrabajoDetalle> LeerOrdenesTrabajoDet(OrdenesTrabajoDetalle OrdenesTrabajoDetalle) throws SQLException {
        List<OrdenesTrabajoDetalle> ordenesTrabajoDetalle = new ArrayList<OrdenesTrabajoDetalle>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT NUMORDEN,NUMORDENDET,A.CODPRODUCTO,B.NOMPRODUCTO,CANTPRODUCTO,B.PRECIO,TOTAL FROM ORDENTRABAJODETALLE A, PRODUCTOS B WHERE A.CODPRODUCTO= B.CODPRODUCTO AND UPPER(B.NOMPRODUCTO) AND NUMORDEN= ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, OrdenesTrabajoDetalle.getNumOrden());
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                OrdenesTrabajoDetalle OrdenTrabajoObjetoDetalle = new OrdenesTrabajoDetalle();
                OrdenTrabajoObjetoDetalle.setNumOrden(rs.getInt(1));
                OrdenTrabajoObjetoDetalle.setNumOrdenDetalle(rs.getInt(2));
                OrdenTrabajoObjetoDetalle.setCodProductos(rs.getInt(3));
                OrdenTrabajoObjetoDetalle.setNomProducto(rs.getString(4));
                OrdenTrabajoObjetoDetalle.setCantProducto(rs.getInt(5));
                OrdenTrabajoObjetoDetalle.setPrecio(rs.getDouble(6));
                OrdenTrabajoObjetoDetalle.setTotal(rs.getDouble(7));

                ordenesTrabajoDetalle.add(OrdenTrabajoObjetoDetalle);
            }
            rs.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return ordenesTrabajoDetalle;

    }

    public static String InsertarOrdenesTrabajoDet(OrdenesTrabajoDetalle ordenTrabajoDetalle) throws SQLException {
        try {
            int NumOrdenDetalle = secuenciaNumOrdenesTrabajoDet();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO ORDENTRABAJODETALLE VALUES(?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, ordenTrabajoDetalle.getNumOrden());
            ps.setInt(2, NumOrdenDetalle);
            ps.setInt(4, ordenTrabajoDetalle.getCantProducto());
            ps.setDouble(5, ordenTrabajoDetalle.getTotal());

            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String ActualizarOrdenesTrabajoDet(OrdenesTrabajoDetalle ordenTrabajoDetalle) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE ORDENTRABAJODETALLE SET CODPRODUCTO= ?, CANTPRODUCTO=?, TOTAL=? WHERE NUMORDEN=? AND NUMORDENDET=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, ordenTrabajoDetalle.getCodProductos());
            ps.setInt(2, ordenTrabajoDetalle.getCantProducto());
            ps.setDouble(3, ordenTrabajoDetalle.getTotal());

            ps.setInt(4, ordenTrabajoDetalle.getNumOrden());
            ps.setInt(5, ordenTrabajoDetalle.getNumOrdenDetalle());

            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarOrdenesTrabajoDet(OrdenesTrabajoDetalle ordenTrabajoDetalle) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM ORDENTRABAJODETALLE WHERE NUMORDEN=? AND NUMORDENDET=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, ordenTrabajoDetalle.getNumOrden());
            ps.setInt(2, ordenTrabajoDetalle.getNumOrdenDetalle());
            ps.execute();
            ps.close();
            cn.close();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<OrdenesTrabajoDetalle> BuscarOrdenesTrabajoDet(OrdenesTrabajoDetalle OrdenesTrabajoDetalle) throws SQLException, Exception {
        List<OrdenesTrabajoDetalle> ordenesTrabajoDetalle = new ArrayList<OrdenesTrabajoDetalle>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT NUMORDEN,NUMORDENDET,A.CODPRODUCTO,B.NOMPRODUCTO,CANTPRODUCTO,B.PRECIO,TOTAL FROM ORDENTRABAJODETALLE A, PRODUCTOS B WHERE A.CODPRODUCTO= B.CODPRODUCTO AND UPPER(B.NOMPRODUCTO) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + OrdenesTrabajoDetalle.getNomProducto().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    OrdenesTrabajoDetalle OrdenTrabajoObjetoDetalle = new OrdenesTrabajoDetalle();
                    OrdenTrabajoObjetoDetalle.setNumOrden(rs.getInt(1));
                    OrdenTrabajoObjetoDetalle.setNumOrdenDetalle(rs.getInt(2));
                    OrdenTrabajoObjetoDetalle.setCodProductos(rs.getInt(3));
                    OrdenTrabajoObjetoDetalle.setNomProducto(rs.getString(4));
                    OrdenTrabajoObjetoDetalle.setCantProducto(rs.getInt(5));
                    OrdenTrabajoObjetoDetalle.setPrecio(rs.getDouble(6));
                    OrdenTrabajoObjetoDetalle.setTotal(rs.getDouble(7));

                    ordenesTrabajoDetalle.add(OrdenTrabajoObjetoDetalle);
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
        return ordenesTrabajoDetalle;

    }
}
