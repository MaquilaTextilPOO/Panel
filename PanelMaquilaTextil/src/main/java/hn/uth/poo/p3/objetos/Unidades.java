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
    private String Unidad;
    private String Descripcion;

    public Unidades() {
        super();
    }
    
    

    public Unidades(String unidad, String descripcion) {
        this.Unidad = unidad;
        this.Descripcion = descripcion;
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
    
    
}
