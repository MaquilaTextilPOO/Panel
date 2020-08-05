/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.datos.Persona;

import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.Persona;
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
public class PersonaDatos {
    
        public static int secuenciaCodPersona() throws SQLException {
        int cod = 0;
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT MAX(CODPERSONA) FROM PERSONA";
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
    
    public static List<Persona> LeerPersona() throws SQLException, Exception{
        List<Persona> personas = new ArrayList<Persona>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODPERSONA,TIPOPERSONA,NOMBRE,FECCREACION FROM PERSONA";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setCodigo(rs.getInt(1));
                persona.setTipoPersona(rs.getString(2));
                persona.setNombre(rs.getString(3));
                persona.setFecCreacion(rs.getDate(4));
                personas.add(persona);
            }
            rs.close();
            cn.close();

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());

        }
        return personas;

    }

    public static String InsertarPersona(Persona persona) throws SQLException, Exception{
        try {
            int cod = secuenciaCodPersona();
            Connection cn = conexion.ObtenerConexion();
            String sql = "INSERT INTO PERSONA VALUES(?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setString(2, persona.getTipoPersona());
            ps.setString(3, persona.getNombre());
            ps.setDate(4, (Date) persona.getFecCreacion());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
           throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String ActualizarPersona(Persona persona) throws SQLException, Exception{
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "UPDATE PERSONA SET TIPOPERSONA=? ,NOMBRE= ?  WHERE CODCIUDAD=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getTipoPersona());
            ps.setInt(3, persona.getCodigo());
            ps.execute();
            ps.close();
            cn.close();

        } catch (SQLException e) {
           throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static String EliminarPersona(Persona persona) throws SQLException{
        try {
            Connection cn = conexion.ObtenerConexion();
            String sql = "DELETE FROM PERSONA WHERE CODPERSONA=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, persona.getCodigo());
            ps.execute();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return null;
    }

    public static List<Persona> BuscarPersona(Persona Persona) throws SQLException, Exception {
        List<Persona> personas = new ArrayList<Persona>();
        try {
            Connection cn = conexion.ObtenerConexion();
            Statement st = cn.createStatement();
            String sql = "SELECT CODPERSONA,NOMBRE,TIPOPERSONA,FECCREACION  FROM PERSONA WHERE UPPER(NOMBRE) LIKE ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, "%" + Persona.getNombre().toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                do {
                    Persona personaObjeto = new Persona();
                    personaObjeto.setCodigo(1);
                    personaObjeto.setNombre(rs.getString(2));
                    personaObjeto.setTipoPersona(rs.getString(3));
                    personaObjeto.setFecCreacion(rs.getDate(4));
                    personas.add(personaObjeto);
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
        return personas;

    }
    
}
