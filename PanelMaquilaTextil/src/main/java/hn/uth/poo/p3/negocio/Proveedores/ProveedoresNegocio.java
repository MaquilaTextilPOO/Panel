/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.Proveedores;

import hn.uth.poo.p3.datos.Proveedores.ProveedoresDatos;
import hn.uth.poo.p3.recursos.clases.Proveedores;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARLON HERNANDEZ
 */
public class ProveedoresNegocio {
    
    public List<Proveedores> Leer()throws Exception {
        List<Proveedores> listaProveedores = new ArrayList<>();
        try {
            listaProveedores = ProveedoresDatos.LeerProveedores();
        } catch (SQLException e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaProveedores;
    }

    public String Insertar(Proveedores proveedores) throws Exception{
        String respuesta = "Error";
        try {
            if (proveedores.getCodProveedor() <= 0) {
                throw new Exception("Error Insertar Proveedores: El Codigo no debe de ser menor o igual a 0");

            }
            if (proveedores.getNomProveedor().isEmpty()) {
                throw new Exception("Error Insertar Proveedores: El nombre no debe de estar vacio");

            }
            respuesta = ProveedoresDatos.InsertarProveedores(proveedores);
            if (respuesta == null) {
                respuesta = "Proveedores almacenada exitosamente";
            }
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    } 
    
     public String Actualizar(Proveedores proveedores) throws Exception {
        String respuesta = "Error";
        try {
            if (proveedores.getNomProveedor().isEmpty()) {
                throw new Exception("Error Actualizar: El nombre no debe de estar vacio");
            }
            respuesta = ProveedoresDatos.ActualizarProveedores(proveedores);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(Proveedores proveedores) throws Exception{
        String respuesta = "Error";
        try {
            respuesta = ProveedoresDatos.EliminarProveedores(proveedores);
        } catch (Exception e) {
             throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    }
    
     public List<Proveedores> Buscar(Proveedores proveedores) throws Exception {
        List<Proveedores> listaProveedores = new ArrayList<>();
        try {
            listaProveedores = ProveedoresDatos.BuscarProveedores(proveedores);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaProveedores;
    }
}
