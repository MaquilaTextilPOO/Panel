/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.Persona;

import hn.uth.poo.p3.datos.Persona.PersonaDatos;
import hn.uth.poo.p3.recursos.clases.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maureen
 */
public class PersonaNegocio {

    public List<Persona> Leer() throws Exception {
        List<Persona> listaPersona = new ArrayList<>();
        try {
            listaPersona = PersonaDatos.LeerPersona();
        } catch (Exception e) {
            throw new Exception("error Leer Persona" + e.getMessage());
        }
        return listaPersona;
    }

    public String Insertar(Persona persona) throws Exception {
        String respuesta = "Error";
        try {
            if (persona.getCodigo() <= 0) {
                throw new Exception("Error Insertar Persona: El Codigo no debe de ser menor o igual a 0");

            }
            if (persona.getNombre().isEmpty()) {
                throw new Exception("Error Insertar Nombre: El nombre no debe de estar vacio");

            }

            respuesta = PersonaDatos.InsertarPersona(persona);
            if (respuesta == null) {
                respuesta = "Persona almacenada exitosamente";
            }
        } catch (Exception e) {
            throw new Exception("error Insert Persona" + e.getMessage());
        } finally {
            return respuesta;
        }
    }

    public String Actualizar(Persona persona) throws Exception {
        String respuesta = "Error";
        try {
            if (persona.getNombre().isEmpty()) {
                throw new Exception("Error Actualizar: El nombre no debe de estar vacio");
            }
            respuesta = PersonaDatos.ActualizarPersona(persona);
        } catch (Exception e) {
            throw new Exception("error Actualizar Persona" + e.getMessage());
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(Persona persona) throws Exception {
        String respuesta = "Error";
        try {
            respuesta = PersonaDatos.EliminarPersona(persona);
        } catch (Exception e) {
            throw new Exception("error Eliminar Persona" + e.getMessage());
        } finally {
            return respuesta;
        }
    }

    public List<Persona> Buscar(Persona persona) throws Exception {
        List<Persona> listaPersona = new ArrayList<>();
        try {
            listaPersona = PersonaDatos.BuscarPersona(persona);
        } catch (Exception e) {
            throw new Exception("error Buscar" + e.getMessage());
        }
        return listaPersona;
    }
}
