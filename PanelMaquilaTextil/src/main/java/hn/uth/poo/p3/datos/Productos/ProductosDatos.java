/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.Productos;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.Productos;
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
public class ProductosDatos {
    
    public static int secuenciaCodProducto() throws SQLException {
        int cod = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(CODPRODUCTO) FROM PRODUCTOS";
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

    public static List<Productos> LeerProductos() throws SQLException {
        List<Productos> productos = new ArrayList<Productos>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODPRODUCTO,DESCPRODUCTO,RUTA FOTO FROM PRODUCTOS";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Productos producto = new Productos();
                producto.setCodProducto(rs.getInt(1));
                producto.setDescProducto(rs.getString(2));
                producto.setRuta(rs.getString(3));
                productos.add(producto);
            }
            rs.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return productos;

    }

  public static String InsertarProducto(Productos producto) throws SQLException {
        try {
            int cod = secuenciaCodProducto();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO Productos VALUES(?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setString(2, producto.getDescProducto());
            ps.setString(3, producto.getRuta());            
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String ActualizarProducto(Productos productos) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE PRODUCTOS SET DESCPRODUCTO= ?, RUTA=? WHERE CODPRODUCTO=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, productos.getRuta());
            ps.setString(2, productos.getDescProducto());
            ps.setInt(3, productos.getCodProducto());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarProductos(Productos productos) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM PRODUCTOS WHERE CODPRODUCTO=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, productos.getCodProducto());
            ps.execute();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<Productos> BuscarProductos(Productos Productos) throws SQLException, Exception {
        List<Productos> productos = new ArrayList<Productos>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODPRODUCTO,DESCPRODUCTO,RUTA FROM PRODUCTOS WHERE UPPER(DESCPRODUCTO) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + Productos.getDescProducto().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    Productos productosObjeto = new Productos();
                    productosObjeto.setCodProducto(1);
                    productosObjeto.setDescProducto(rs.getString(2));
                    productosObjeto.setRuta(rs.getString(3));
                    productos.add(productosObjeto);
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
        return productos;

    }
}
