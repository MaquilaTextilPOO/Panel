/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.ciudad;

import hn.uth.poo.p3.datos.Ciudad.CiudadDatos;
import hn.uth.poo.p3.recursos.clases.Ciudad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maureen
 */
public class CiudadNegocio {

    public List<Ciudad> Leer() {
        List<Ciudad> listaCiudad = new ArrayList<>();
        try {
            listaCiudad = CiudadDatos.LeerCiudad();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("error Leer" + e.getMessage());
        }
        return listaCiudad;
    }

    public String Insertar(Ciudad ciudad) {
        String respuesta = "Error";
        
        try {
            if (ciudad.getCodCiudad() <= 0) {
                throw new Exception("Error Insertar Ciudad: El Codigo no debe de ser menor o igual a 0");

            }
            if (ciudad.getNomCiudad().isEmpty()) {
                throw new Exception("Error Insertar Ciudad: El nombre no debe de estar vacio");

            }
            respuesta = CiudadDatos.InsertarCiudad(ciudad);
            if (respuesta == null) {
                respuesta = "Ciudad almacenada exitosamente";
            }
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Actualizar(Ciudad ciudad) {
        String respuesta = "Error";
        try {
            if (ciudad.getNomCiudad().isEmpty()) {
                throw new Exception("Error Actualizar: El nombre no debe de estar vacio");
            }
            respuesta = CiudadDatos.ActualizarCiudad(ciudad);
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(Ciudad ciudad) {
        String respuesta = "Error";
        try {
            respuesta = CiudadDatos.EliminarCiudad(ciudad);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            return respuesta;
        }
    }
    
     public List<Ciudad> Buscar(Ciudad ciudad) throws Exception {
        List<Ciudad> listaCiudad = new ArrayList<>();
        try {
            listaCiudad = CiudadDatos.BuscarCiudad(ciudad);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaCiudad;
    }

}
