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
public class FormaPago {
    private int CodFormaPago;
    private String NomFormaPago;

    public FormaPago() {
        super();
    }
    
    

    public FormaPago(int FormaPago, String NomFormaPago) {
        this.CodFormaPago = FormaPago;
        this.NomFormaPago = NomFormaPago;
    }
    
    

    public int getCodFormaPago() {
        return CodFormaPago;
    }

    public void setCodFormaPago(int CodFormaPago) {
        this.CodFormaPago = CodFormaPago;
    }

    public String getNomFormaPago() {
        return NomFormaPago;
    }

    public void setNomFormaPago(String NomFormaPago) {
        this.NomFormaPago = NomFormaPago;
    }
    
}
