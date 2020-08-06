/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.Tintura;

import hn.uth.poo.p3.datos.Tintura.TinturaDatos;
import hn.uth.poo.p3.recursos.clases.Tintura;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARLON HERNANDEZ
 */
public class TinturaNegocio {
    
    public List<Tintura> Leer()throws Exception {
        List<Tintura> listaTintura = new ArrayList<>();
        try {
            listaTintura = TinturaDatos.LeerTintura();
        } catch (SQLException e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaTintura;
    }

    public String Insertar(Tintura tintura) throws Exception{
        String respuesta = "Error";
        try {
            if (tintura.getCodTintura() <= 0) {
                throw new Exception("Error Insertar Tintura: El Codigo no debe de ser menor o igual a 0");

            }
            if (tintura.getDesTintura().isEmpty()) {
                throw new Exception("Error Insertar Tintura: El nombre no debe de estar vacio");

            }
            respuesta = TinturaDatos.InsertarTintura(tintura);
            if (respuesta == null) {
                respuesta = "Tintura almacenada exitosamente";
            }
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    } 
    
     public String Actualizar(Tintura tintura) throws Exception {
        String respuesta = "Error";
        try {
            if (tintura.getDesTintura().isEmpty()) {
                throw new Exception("Error Actualizar: El nombre no debe de estar vacio");
            }
            respuesta = TinturaDatos.ActualizarTintura(tintura);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(Tintura tintura) throws Exception{
        String respuesta = "Error";
        try {
            respuesta = TinturaDatos.EliminarTintura(tintura);
        } catch (Exception e) {
             throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    }
    
     public List<Tintura> Buscar(Tintura tintura) throws Exception {
        List<Tintura> listaTintura = new ArrayList<>();
        try {
            listaTintura = TinturaDatos.BuscarTintura(tintura);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaTintura;
    }
}
