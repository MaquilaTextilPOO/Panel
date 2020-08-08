/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.FormaPago;

import hn.uth.poo.p3.datos.FormaPago.FormaPagoDatos;
import hn.uth.poo.p3.recursos.clases.FormaPago;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gisell Aguilera
 */
public class FormaPagoNegocio {
    public List<FormaPago> Leer() {
        List<FormaPago> listaFormaPago = new ArrayList<>();
        try {
            listaFormaPago = FormaPagoDatos.LeerFormaPago();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("error Leer" + e.getMessage());
        }
        return listaFormaPago;
    }

    public String Insertar(FormaPago formaPago) {
        String respuesta = "Error";
        try {
            
            if (formaPago.getFormaPago() <= 0) {
                throw new Exception("Error Insertar FormaPago: La forma de pago no debe de ser menor o igual a 0");

            }
            if (formaPago.getNomFormaPago().isEmpty()) {
                throw new Exception("Error Insertar Forma de Pago: El Nombre no debe de estar vacio");

            }
            respuesta = FormaPagoDatos.InsertarFormaPago(formaPago);
            if (respuesta == null) {
                respuesta = "Forma de Pago almacenada exitosamente";
            }
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Actualizar(FormaPago formaPago) {
        String respuesta = "Error";
        try {
            if (formaPago.getNomFormaPago().isEmpty()) {
                throw new Exception("Error Actualizar: El nombre no debe de estar vacio");
            }
            respuesta = FormaPagoDatos.ActualizarFormaPago(formaPago);
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(FormaPago formaPago) {
        String respuesta = "Error";
        try {
            respuesta = FormaPagoDatos.EliminarFormaPago(formaPago);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            return respuesta;
        }
    }
    
     public List<FormaPago> Buscar(FormaPago formaPago) throws Exception {
        List<FormaPago> listaFormaPago = new ArrayList<>();
        try {
            listaFormaPago = FormaPagoDatos.BuscarFormaPago(formaPago);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaFormaPago;
    }

}

