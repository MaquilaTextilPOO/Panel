/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.recursos.clases;

import java.util.Date;

/**
 *
 * @author maureen
 */
public class Proveedores {

    private int CodProveedor;
    private String NomProveedor;

    public Proveedores() {
        super();
    }

    public Proveedores(int CodProveedor, String NomProveedor) {
        this.CodProveedor = CodProveedor;
        this.NomProveedor = NomProveedor;
    }

    public int getCodProveedor() {
        return CodProveedor;
    }

    public void setCodProveedor(int CodProveedor) {
        this.CodProveedor = CodProveedor;
    }

    public String getNomProveedor() {
        return NomProveedor;
    }

    public void setNomProveedor(String NomProveedor) {
        this.NomProveedor = NomProveedor;
    }

}
