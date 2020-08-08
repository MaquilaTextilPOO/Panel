/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.recursos.clases;

/**
 *
 * @author maureen
 */
public  class Productos implements IProducto {

    private int CodProducto;
    private String descProducto;
    private String Ruta;
    private String Nombre;

    public Productos() {
        super();
    }

    public Productos(int CodProducto, String descProducto, String Ruta, String Nombre) {
        this.CodProducto = CodProducto;
        this.descProducto = descProducto;
        this.Ruta = Ruta;
        this.Nombre = Nombre;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodProducto() {
        return CodProducto;
    }

    public void setCodProducto(int CodProducto) {
        this.CodProducto = CodProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    @Override
    public double CalcularPrecioVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
