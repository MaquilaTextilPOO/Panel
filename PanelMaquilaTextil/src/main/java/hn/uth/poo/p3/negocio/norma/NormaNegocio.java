/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.norma;

import hn.uth.poo.p3.datos.Norma.NormaDatos;
import hn.uth.poo.p3.recursos.clases.Norma;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARLON HERNANDEZ
 */
public class NormaNegocio {
    
    public List<Norma> Leer() {
        List<Norma> listaNorma = new ArrayList<>();
        try {
            listaNorma = NormaDatos.LeerNorma();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("error Leer" + e.getMessage());
        }
        return listaNorma;
    }

    public String Insertar(Norma norma) {
        String respuesta = "Error";
        try {
            
            if (norma.getCodNorma().isEmpty()) {
                throw new Exception("Error Insertar Norma: El Codigo no debe de ser menor o igual a 0");

            }
            if (norma.getDescripcion().isEmpty()) {
                throw new Exception("Error Insertar Norma: El nombre no debe de estar vacio");

            }
            respuesta = NormaDatos.InsertarNorma(norma);
            if (respuesta == null) {
                respuesta = "Norma almacenada exitosamente";
            }
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Actualizar(Norma norma) {
        String respuesta = "Error";
        try {
            if (norma.getDescripcion().isEmpty()) {
                throw new Exception("Error Actualizar: El nombre no debe de estar vacio");
            }
            respuesta = NormaDatos.ActualizarNorma(norma);
        } catch (Exception e) {
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(Norma norma) {
        String respuesta = "Error";
        try {
            respuesta = NormaDatos.EliminarNorma(norma);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            return respuesta;
        }
    }
    
     public List<Norma> Buscar(Norma norma) throws Exception {
        List<Norma> listaNorma = new ArrayList<>();
        try {
            listaNorma = NormaDatos.BuscarNorma(norma);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaNorma;
    }
}
