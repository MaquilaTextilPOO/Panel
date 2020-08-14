/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.OrdenTrabajo;

import hn.uth.poo.p3.datos.OrdenTrabajo.OrdenTrabajoDetalleDatos;
import hn.uth.poo.p3.recursos.clases.OrdenesTrabajoDetalle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maureen
 */
public class OrdenTrabajoDetalleNegocio {
    public List<OrdenesTrabajoDetalle> Leer(OrdenesTrabajoDetalle ordenesTrabajoDetalle) {
        List<OrdenesTrabajoDetalle> listaOrdenesTrabajo = new ArrayList<>();
        try {
            listaOrdenesTrabajo = OrdenTrabajoDetalleDatos.LeerOrdenesTrabajoDet(ordenesTrabajoDetalle);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("error Leer" + e.getMessage());
        }
        return listaOrdenesTrabajo;
    }

    public String Insertar(OrdenesTrabajoDetalle ordenesTrabajoDetalle) {
        String respuesta = "Error";
        try {
            
            if (ordenesTrabajoDetalle.getNumOrden()<= 0) {
                throw new Exception("Error Insertar OrdenTrabajo: El Codigo no debe de ser menor o igual a 0");

            }
            if (ordenesTrabajoDetalle.getLugarEntrega().isEmpty()) {
                throw new Exception("Error Insertar OrdenTrabajo: El nombre no debe de estar vacio");

            }
            respuesta = OrdenTrabajoDetalleDatos.InsertarOrdenesTrabajoDet(ordenesTrabajoDetalle);
            if (respuesta == null) {
                respuesta = "OrdenesTrabajo almacenada exitosamente";
            }
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Actualizar(OrdenesTrabajoDetalle ordenesTrabajoDetalle) {
        String respuesta = "Error";
        try {
            respuesta = OrdenTrabajoDetalleDatos.ActualizarOrdenesTrabajoDet(ordenesTrabajoDetalle);
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(OrdenesTrabajoDetalle ordenesTrabajoDetalle) {
        String respuesta = "Error";
        try {
            respuesta = OrdenTrabajoDetalleDatos.EliminarOrdenesTrabajoDet(ordenesTrabajoDetalle);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            return respuesta;
        }
    }
    
     public List<OrdenesTrabajoDetalle> Buscar(OrdenesTrabajoDetalle ordenesTrabajoDetalle) throws Exception {
        List<OrdenesTrabajoDetalle> listaOrdenesTrabajoDet = new ArrayList<>();
        try {
            listaOrdenesTrabajoDet = OrdenTrabajoDetalleDatos.BuscarOrdenesTrabajoDet(ordenesTrabajoDetalle);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaOrdenesTrabajoDet;
    }

}
