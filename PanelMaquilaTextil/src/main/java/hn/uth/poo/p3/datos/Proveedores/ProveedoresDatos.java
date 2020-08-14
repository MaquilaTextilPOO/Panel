/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.Proveedores;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.Proveedores;
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
public class ProveedoresDatos {
    
    public static int secuenciaCodProveedor() throws SQLException {
        int cod = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(CODPROVEEDOR) FROM PROVEEDORES";
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

    public static List<Proveedores> LeerProveedores() throws SQLException {
        List<Proveedores> proveedores = new ArrayList<Proveedores>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODPROVEEDOR,NOMPROVEEDOR FROM PROVEEDORES";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Proveedores proveedor = new Proveedores();
                proveedor.setCodProveedor(rs.getInt(1));
                proveedor.setNomProveedor(rs.getString(2));
                proveedores.add(proveedor);
            }
            rs.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return proveedores;

    }

    public static String InsertarProveedores(Proveedores proveedor) throws SQLException {
        try {
            int cod = secuenciaCodProveedor();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO PROVEEDORES VALUES(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setString(2, proveedor.getNomProveedor());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String ActualizarProveedores(Proveedores proveedor) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE PROVEEDORES SET NOMPROVEEDOR= ? WHERE CODPROVEEDOR=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, proveedor.getNomProveedor());
            ps.setInt(2, proveedor.getCodProveedor());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarProveedores(Proveedores proveedor) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM PROVEEDORES WHERE CODPROVEEDOR=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, proveedor.getCodProveedor());
            ps.execute();
            ps.close();
            cn.close();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<Proveedores> BuscarProveedores(Proveedores proveedor) throws SQLException, Exception {
        List<Proveedores> proveedores = new ArrayList<Proveedores>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODPROVEEDOR,NOMPROVEEDOR FROM PROVEEDORES WHERE UPPER(NOMPROVEEDOR) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + proveedor.getNomProveedor().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    Proveedores proveedorObjeto = new Proveedores();
                    proveedorObjeto.setCodProveedor(1);
                    proveedorObjeto.setNomProveedor(rs.getString(2));
                    proveedores.add(proveedorObjeto);
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
        return proveedores;

    }
}
