/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.OrdenTrabajo;

import hn.uth.poo.p3.datos.OrdenTrabajo.OrdenTrabajoDatos;
import hn.uth.poo.p3.recursos.clases.OrdenesTrabajo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maureen
 */
public class OrdenTrabajoNegocio {
    
     public List<OrdenesTrabajo> Leer() {
        List<OrdenesTrabajo> listaOrdenesTrabajo = new ArrayList<>();
        try {
            listaOrdenesTrabajo = OrdenTrabajoDatos.LeerOrdenesTrabajo();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("error Leer" + e.getMessage());
        }
        return listaOrdenesTrabajo;
    }

    public String Insertar(OrdenesTrabajo ordenesTrabajo) {
        String respuesta = "Error";
        try {
            
            if (ordenesTrabajo.getNumOrden()<= 0) {
                throw new Exception("Error Insertar OrdenTrabajo: El Codigo no debe de ser menor o igual a 0");

            }
            if (ordenesTrabajo.getLugarEntrega().isEmpty()) {
                throw new Exception("Error Insertar OrdenTrabajo: El nombre no debe de estar vacio");

            }
            respuesta = OrdenTrabajoDatos.InsertarOrdenesTrabajo(ordenesTrabajo);
            if (respuesta == null) {
                respuesta = "OrdenesTrabajo almacenada exitosamente";
            }
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Actualizar(OrdenesTrabajo ordenesTrabajo) {
        String respuesta = "Error";
        try {
            respuesta = OrdenTrabajoDatos.ActualizarOrdenesTrabajo(ordenesTrabajo);
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(OrdenesTrabajo ordenesTrabajo) {
        String respuesta = "Error";
        try {
            respuesta = OrdenTrabajoDatos.EliminarOrdenesTrabajo(ordenesTrabajo);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            return respuesta;
        }
    }
    
     public List<OrdenesTrabajo> Buscar(OrdenesTrabajo ordenesTrabajo) throws Exception {
        List<OrdenesTrabajo> listaOrdenesTrabajo = new ArrayList<>();
        try {
            listaOrdenesTrabajo = OrdenTrabajoDatos.BuscarOrdenesTrabajo(ordenesTrabajo);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaOrdenesTrabajo;
    }

}
