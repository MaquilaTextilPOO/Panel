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
public abstract class Productos implements IProducto{
   private int CodProducto;
   private String descProducto;
   private Proveedores Proveedores;

    public Productos() {
        super();
    }
   
   

    public Productos(int CodProducto, String descProducto, Proveedores Proveedores) {
        this.CodProducto = CodProducto;
        this.descProducto = descProducto;
        this.Proveedores = Proveedores;
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

    public Proveedores getProveedores() {
        return Proveedores;
    }

    public void setProveedores(Proveedores Proveedores) {
        this.Proveedores = Proveedores;
    }
   
   
}
