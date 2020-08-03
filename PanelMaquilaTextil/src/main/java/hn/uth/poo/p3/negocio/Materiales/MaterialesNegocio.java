/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.Materiales;

import hn.uth.poo.p3.datos.Materiales.MaterialesDatos;
import hn.uth.poo.p3.datos.conexion.conexion;
import hn.uth.poo.p3.recursos.clases.Materiales;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maureen
 */
public class MaterialesNegocio {

    public List<Materiales> Leer() {
        List<Materiales> listaMateriales = new ArrayList<>();
        try {
            listaMateriales = MaterialesDatos.LeerMateriales();
        } catch (SQLException e) {
            System.err.println("error Leer" + e.getMessage());
        }
        return listaMateriales;
    }

    public String Insertar(Materiales materiales) {
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
            respuesta = e.getMessage();
        } finally {
            return respuesta;
        }
    }  
    
}
