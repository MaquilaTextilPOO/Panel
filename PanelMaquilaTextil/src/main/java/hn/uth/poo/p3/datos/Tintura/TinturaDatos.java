/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.Tintura;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.Tintura;
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
public class TinturaDatos {
    
    public static int secuenciaCodTintura() throws SQLException {
        int cod = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(CODTINTURA) FROM TINTURA";
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
    
    public static List<Tintura> LeerTintura() throws SQLException {
        List<Tintura> tinturas = new ArrayList<Tintura>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODTINTURA,DESTINTURA FROM TINTURA";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Tintura tintura = new Tintura();
                tintura.setCodTintura(rs.getInt(1));
                tintura.setDesTintura(rs.getString(2));
                tinturas.add(tintura);
            }
            rs.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return tinturas;

    }

    public static String InsertarTintura(Tintura tintura) throws SQLException {
        try {
            int cod = secuenciaCodTintura();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO TINTURA VALUES(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, tintura.getCodTintura());
            ps.setString(2, tintura.getDesTintura());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String ActualizarTintura(Tintura tintura) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE TINTURA SET DESTINTURA= ? WHERE CODTINTURA=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, tintura.getDesTintura());
            ps.setInt(2, tintura.getCodTintura());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarTintura(Tintura tintura) throws SQLException {
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM TINTURA WHERE CODTINTURA=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, tintura.getCodTintura());
            ps.execute();
            ps.close();
            cn.close();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<Tintura> BuscarTintura(Tintura tintura) throws SQLException, Exception {
        List<Tintura> tinturas = new ArrayList<Tintura>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODTINTURA,DESTINTURA FROM TINTURA WHERE UPPER(DESTINTURA) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + tintura.getDesTintura().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    Tintura tinturaObjeto = new Tintura();
                    tinturaObjeto.setCodTintura(1);
                    tinturaObjeto.setDesTintura(rs.getString(2));
                    tinturas.add(tinturaObjeto);
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
        return tinturas;

    }
}
