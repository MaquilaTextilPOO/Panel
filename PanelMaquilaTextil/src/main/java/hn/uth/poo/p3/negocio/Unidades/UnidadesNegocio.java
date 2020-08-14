/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.Unidades;

import hn.uth.poo.p3.datos.Unidades.UnidadesDatos;
import hn.uth.poo.p3.recursos.clases.Unidades;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gisell Aguilera
 */
public class UnidadesNegocio {
    public List<Unidades> Leer() {
        List<Unidades> listaUnidades = new ArrayList<>();
        try {
            listaUnidades = UnidadesDatos.LeerUnidades();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("error Leer" + e.getMessage());
        }
        return listaUnidades;
    }

    public String Insertar(Unidades unidades) {
        String respuesta = "Error";
        try {
            
            if (unidades.getUnidades <= 0) {
                throw new Exception("Error Insertar Unidad: La Unidad no debe de ser menor o igual a 0");

            }
            if (unidades.getDescripcion().isEmpty()) {
                throw new Exception("Error Insertar Descripcion: La Descripcion no debe de estar vacia");

            }
            respuesta = UnidadesDatos.InsertarUnidades(unidades);
            if (respuesta == null) {
                respuesta = "Unidad almacenada exitosamente";
            }
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Actualizar(Unidades unidades) {
        String respuesta = "Error";
        try {
            if (unidades.getDescripcion().isEmpty()) {
                throw new Exception("Error Actualizar: La Descripcion no debe de estar vacia");
            }
            respuesta = UnidadesDatos.ActualizarUnidades (unidades);
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(Unidades unidades) {
        String respuesta = "Error";
        try {
            respuesta = UnidadesDatos.EliminarUnidades(unidades);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            return respuesta;
        }
    }
    
     public List<Unidades> Buscar(Unidades unidades) throws Exception {
        List<Unidades> listaUnidades = new ArrayList<>();
        try {
            listaUnidades = UnidadesDatos.BuscarUnidades(unidades);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaUnidades;
    }

}


