/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.materiales;

import hn.uth.poo.p3.datos.Materiales.MaterialesDatos;
import hn.uth.poo.p3.recursos.clases.Materiales;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maureen
 */
public class MaterialesNegocio {

    public List<Materiales> Leer()throws Exception {
        List<Materiales> listaMateriales = new ArrayList<>();
        try {
            listaMateriales = MaterialesDatos.LeerMateriales();
        } catch (SQLException e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaMateriales;
    }

    public String Insertar(Materiales materiales) throws Exception{
        String respuesta = "Error";
        try {
            if (materiales.getCodMateria() <= 0) {
                throw new Exception("Error Insertar Materiales: El Codigo no debe de ser menor o igual a 0");

            }
            if (materiales.getDescMateria().isEmpty()) {
                throw new Exception("Error Insertar Materiales: El nombre no debe de estar vacio");

            }
            respuesta = MaterialesDatos.InsertarMateriales(materiales);
            if (respuesta == null) {
                respuesta = "Materiales almacenada exitosamente";
            }
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    } 
    
     public String Actualizar(Materiales materiales) throws Exception {
        String respuesta = "Error";
        try {
            if (materiales.getDescMateria().isEmpty()) {
                throw new Exception("Error Actualizar: El nombre no debe de estar vacio");
            }
            respuesta = MaterialesDatos.ActualizarMateriales(materiales);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(Materiales materiales) throws Exception{
        String respuesta = "Error";
        try {
            respuesta = MaterialesDatos.EliminarMateriales(materiales);
        } catch (Exception e) {
             throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    }
    
     public List<Materiales> Buscar(Materiales materiales) throws Exception {
        List<Materiales> listaMateriales = new ArrayList<>();
        try {
            listaMateriales = MaterialesDatos.BuscarMateriales(materiales);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaMateriales;
    }
    
}
