/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.negocio.Productos;


import hn.uth.poo.p3.datos.Productos.ProductosDatos;
import hn.uth.poo.p3.recursos.clases.Productos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maureen
 */
public class ProductosNegocio {
    public List<Productos> Leer() {
        List<Productos> listaProductos = new ArrayList<>();
        try {
            listaProductos = ProductosDatos.LeerProductos();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("error Leer" + e.getMessage());
        }
        return listaProductos;
    }

    public String Insertar(Productos productos)  throws Exception{
        String respuesta = "Error";
        try {
            
            if (productos.getCodProducto() <= 0) {
                throw new Exception("Error Insertar Productos: El Codigo no debe de ser menor o igual a 0");

            }
            if (productos.getDescProducto().isEmpty()) {
                throw new Exception("Error Insertar Productos: El nombre no debe de estar vacio");

            }
            respuesta = ProductosDatos.InsertarProducto(productos);
            if (respuesta == null) {
                respuesta = "Productos almacenada exitosamente";
            }
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    }

    public String Actualizar(Productos productos) throws Exception {
        String respuesta = "Error";
        try {
            if (productos.getDescProducto().isEmpty()) {
                throw new Exception("Error Actualizar: El nombre no debe de estar vacio");
            }
            respuesta = ProductosDatos.ActualizarProducto(productos);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    }

    public String Eliminar(Productos productos) throws Exception {
        String respuesta = "Error";
        try {
            respuesta = ProductosDatos.EliminarProductos(productos);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        } finally {
            return respuesta;
        }
    }
    
     public List<Productos> Buscar(Productos productos) throws Exception {
        List<Productos> listaProductos = new ArrayList<>();
        try {
            listaProductos = ProductosDatos.BuscarProductos(productos);
        } catch (Exception e) {
            throw new Exception ("error Buscar" + e.getMessage());
        }
        return listaProductos;
    }
}
