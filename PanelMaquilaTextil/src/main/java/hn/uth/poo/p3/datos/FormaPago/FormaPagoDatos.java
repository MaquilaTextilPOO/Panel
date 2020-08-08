/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.FormaPago;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.FormaPago;
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
public class FormaPagoDatos {
    public static int secuenciaFormaPago() throws SQLException {
        int formPago = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(FORMAPAGO) FROM FORMAPAGO";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                formPago = rs.getInt(1);
                if (rs.wasNull()) {
                    formPago = 0;
                }
            }
            rs.close();
            cn.close();
            formPago = formPago + 1;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }

        return formPago;
    }

    public static List<FormaPago> LeerFormaPago() throws SQLException {
        List<FormaPago> formasPago = new ArrayList<FormaPago>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODCIUDAD,NOMCIUDAD FROM CIUDAD";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                FormaPago formaPago = new FormaPago();
                formaPago.setFormaPago(rs.getInt(1));
                formaPago.setNomFormaPago(rs.getString(2));
                formasPago.add(formaPago);
            }
            rs.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return formasPago;

    }

    public static String InsertarFormaPago(FormaPago formaPago) throws SQLException {
        try {
            int cod = secuenciaFormaPago();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO FORMAPAGO VALUES(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setString(2, formaPago.getNomFormaPago());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String ActualizarFormaPago(FormaPago formaPago) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE FORMAPAGO SET NOMFORMAPAGO= ? WHERE FORMAPAGO=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, formaPago.getNomFormaPago());
            ps.setInt(2, formaPago.getFormaPago());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarFormaPago(FormaPago formaPago) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM FORMPAGO WHERE FORMAPAGO=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, formaPago.getFormaPago());
            ps.execute();
            ps.close();
            cn.close();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<FormaPago> BuscarFormaPago(FormaPago FormaPago) throws SQLException, Exception {
        List<FormaPago> formasPago = new ArrayList<FormaPago>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT FORMAPAGO,NOMFORMAPAGO FROM FORMAPAGO WHERE UPPER(NOMFORMAPAGO) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + FormaPago.getNomFormaPago().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    FormaPago formaPagoObjeto = new FormaPago();
                    formaPagoObjeto.setFormaPago(1);
                    formaPagoObjeto.setNomFormaPago(rs.getString(2));
                    formasPago.add(formaPagoObjeto);
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
        return formasPago;

    }

}

