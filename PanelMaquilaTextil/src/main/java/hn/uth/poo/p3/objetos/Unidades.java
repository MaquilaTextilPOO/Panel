/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.objetos;

/**
 *
 * @author maureen
 */
public class Unidades  {
    private String unidad;
    private String descripcion;

    public Unidades() {
        super();
    }
    
    

    public Unidades(String unidad, String descripcion) {
        this.unidad = unidad;
        this.descripcion = descripcion;
    }
    
    

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
