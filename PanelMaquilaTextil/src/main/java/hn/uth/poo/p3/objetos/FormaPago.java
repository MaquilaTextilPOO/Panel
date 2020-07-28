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
public class FormaPago {
    private int FormaPago;
    private String NomFormaPago;

    public FormaPago() {
        super();
    }
    
    

    public FormaPago(int FormaPago, String NomFormaPago) {
        this.FormaPago = FormaPago;
        this.NomFormaPago = NomFormaPago;
    }
    
    

    public int getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(int FormaPago) {
        this.FormaPago = FormaPago;
    }

    public String getNomFormaPago() {
        return NomFormaPago;
    }

    public void setNomFormaPago(String NomFormaPago) {
        this.NomFormaPago = NomFormaPago;
    }
    
}
