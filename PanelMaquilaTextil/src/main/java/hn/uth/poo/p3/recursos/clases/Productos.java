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
public class Productos implements IProducto {

    private int CodProducto;
    private String NomProducto;
    private String descProducto;
    private double precio;
    private String Ruta;

    public Productos() {
        super();
    }

    public Productos(int CodProducto, String NomProducto, String descProducto, double precio, String Ruta) {
        this.CodProducto = CodProducto;
        this.NomProducto = NomProducto;
        this.descProducto = descProducto;
        this.precio = precio;
        this.Ruta = Ruta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public String getNomProducto() {
        return NomProducto;
    }

    public void setNomProducto(String NomProducto) {
        this.NomProducto = NomProducto;
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
