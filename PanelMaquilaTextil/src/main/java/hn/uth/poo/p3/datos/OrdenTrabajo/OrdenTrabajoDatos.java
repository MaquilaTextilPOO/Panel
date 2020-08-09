/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.OrdenTrabajo;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.OrdenesTrabajo;
import java.sql.Connection;
import java.sql.Date;
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
public class OrdenTrabajoDatos {

    public static int secuenciaNumOrdenesTrabajo() throws SQLException {
        int cod = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(NUMORDEN) FROM ORDENTRABAJO";
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

    public static List<OrdenesTrabajo> LeerOrdenesTrabajo() throws SQLException {
        List<OrdenesTrabajo> ordenesTrabajo = new ArrayList<OrdenesTrabajo>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT NUMORDEN,FOLIO,FECHA,LUGARENTREGA,DESCRIPCION,CODCLIENTE,FECHAENTREGA,TOTALPAGAR,ADELANTO,RESTANTE,FORMAPAGO,ESTORDEN FROM ORDENTRABAJO";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                OrdenesTrabajo ordenTrabajo = new OrdenesTrabajo();
                ordenTrabajo.setNumOrden(rs.getInt(1));
                ordenTrabajo.setFolio(rs.getInt(2));
                ordenTrabajo.setFecha(rs.getDate(3));
                ordenTrabajo.setLugarEntrega(rs.getString(4));
                ordenTrabajo.setDescripcion(rs.getString(5));
                ordenTrabajo.setCodCliente(rs.getInt(6));
                ordenTrabajo.setFechaEntrega(rs.getDate(7));
                ordenTrabajo.setTotPagar(rs.getDouble(8));
                ordenTrabajo.setTotPagar(rs.getDouble(9));
                ordenTrabajo.setTotPagar(rs.getDouble(10));
                ordenTrabajo.setDescripcion(rs.getString(11));
                ordenTrabajo.setEstOrden(rs.getString(12));

                ordenesTrabajo.add(ordenTrabajo);
            }
            rs.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return ordenesTrabajo;

    }

    public static String InsertarOrdenesTrabajo(OrdenesTrabajo ordenTrabajo) throws SQLException {
        try {
            int NumOrden = secuenciaNumOrdenesTrabajo();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO ORDENTRABAJO VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, NumOrden);
            ps.setInt(2, ordenTrabajo.getFolio());
            ps.setDate(3, (Date) ordenTrabajo.getFecha());
            ps.setString(4, ordenTrabajo.getLugarEntrega());
            ps.setString(5, ordenTrabajo.getDescripcion());
            ps.setInt(6, ordenTrabajo.getCodCliente());
            ps.setDate(7, (Date) ordenTrabajo.getFechaEntrega());
            ps.setDouble(8, ordenTrabajo.getTotPagar());
            ps.setDouble(9, ordenTrabajo.getAdelanto());
            ps.setDouble(10, ordenTrabajo.getRestante());
            ps.setString(11, ordenTrabajo.getFormaPago());
            ps.setString(12, ordenTrabajo.getEstOrden());

            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String ActualizarOrdenesTrabajo(OrdenesTrabajo ordenTrabajo) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE ORDENTRABAJO SET LUGARENTREGA= ?, DESCRIPCION=?, FECHAENTREGA=?,ADELANTO=?,FORMAPAGO=?, ESTORDEN=? WHERE NUMORDEN=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ordenTrabajo.getLugarEntrega());
            ps.setString(2, ordenTrabajo.getDescripcion());
            ps.setDate(3, (Date) ordenTrabajo.getFechaEntrega());
            ps.setDouble(4, ordenTrabajo.getAdelanto());
            ps.setString(5, ordenTrabajo.getFormaPago());
            ps.setString(6, ordenTrabajo.getEstOrden());

            ps.setInt(7, ordenTrabajo.getNumOrden());

            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarOrdenesTrabajo(OrdenesTrabajo ordenTrabajo) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM ORDENTRABAJO WHERE NUMORDEN=? ";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, ordenTrabajo.getNumOrden());
            ps.execute();
            ps.close();
            cn.close();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<OrdenesTrabajo> BuscarOrdenesTrabajo(OrdenesTrabajo OrdenesTrabajo) throws SQLException, Exception {
        List<OrdenesTrabajo> ordenesTrabajo = new ArrayList<OrdenesTrabajo>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT NUMORDEN,FOLIO,FECHA,LUGARENTREGA,DESCRIPCION,CODCLIENTE,FECHAENTREGA,TOTALPAGAR,ADELANTO,RESTANTE,FORMAPAGO,ESTORDEN FROM ORDENTRABAJO WHERE UPPER(DESCRIPCION) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + OrdenesTrabajo.getDescripcion().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    OrdenesTrabajo OrdenTrabajoObjeto = new OrdenesTrabajo();
                    OrdenTrabajoObjeto.setNumOrden(rs.getInt(1));
                    OrdenTrabajoObjeto.setFolio(rs.getInt(2));
                    OrdenTrabajoObjeto.setFecha(rs.getDate(3));
                    OrdenTrabajoObjeto.setLugarEntrega(rs.getString(4));
                    OrdenTrabajoObjeto.setDescripcion(rs.getString(5));
                    OrdenTrabajoObjeto.setCodCliente(rs.getInt(6));
                    OrdenTrabajoObjeto.setFechaEntrega(rs.getDate(7));
                    OrdenTrabajoObjeto.setTotPagar(rs.getDouble(8));
                    OrdenTrabajoObjeto.setTotPagar(rs.getDouble(9));
                    OrdenTrabajoObjeto.setTotPagar(rs.getDouble(10));
                    OrdenTrabajoObjeto.setDescripcion(rs.getString(11));
                    OrdenTrabajoObjeto.setEstOrden(rs.getString(12));

                    ordenesTrabajo.add(OrdenTrabajoObjeto);
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
        return ordenesTrabajo;

    }
}
