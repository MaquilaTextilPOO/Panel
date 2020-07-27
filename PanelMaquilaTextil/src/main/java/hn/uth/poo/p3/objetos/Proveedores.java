/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.objetos;

import java.util.Date;

/**
 *
 * @author maureen
 */
public class Proveedores extends Persona{
    private int CodProveedor;
    private String TipoProveedor;

    public Proveedores() {
        super();
    }
    
    

    public Proveedores(int CodProveedor, String TipoProveedor, int CodPersona, String TigoPersona, String Nombre, Date FecCreacion) {
        super(CodPersona, TigoPersona, Nombre, FecCreacion);
        this.CodProveedor = CodProveedor;
        this.TipoProveedor = TipoProveedor;
    }
    
    

    public int getCodProveedor() {
        return CodProveedor;
    }

    public void setCodProveedor(int CodProveedor) {
        this.CodProveedor = CodProveedor;
    }

    public String getTipoProveedor() {
        return TipoProveedor;
    }

    public void setTipoProveedor(String TipoProveedor) {
        this.TipoProveedor = TipoProveedor;
    }
    
    
}
