/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.recursos.clases;

import java.util.List;

/**
 *
 * @author maureen
 */
public class Unidades  {
    private String Unidad;
    private String Descripcion;
    public int getUnidades;

    public Unidades() {
        super();
    }
    
    

    public Unidades(String Unidad, String Descripcion) {
        this.Unidad = Unidad;
        this.Descripcion = Descripcion;
    }
    
    

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String unidad) {
        this.Unidad = unidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public void setUnidades(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Unidades> Buscar(Unidades unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getUnidades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String Insertar(Unidades unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Unidades> Leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
