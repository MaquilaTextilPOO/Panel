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
public class Tintura {
    private int CodTintura;
    private String DesTintura;

    public Tintura() {
        super();
    }
    
    

    public Tintura(int CodTintura, String DesTintura) {
        this.CodTintura = CodTintura;
        this.DesTintura = DesTintura;
    }
    
    

    public int getCodTintura() {
        return CodTintura;
    }

    public void setCodTintura(int CodTintura) {
        this.CodTintura = CodTintura;
    }

    public String getDesTintura() {
        return DesTintura;
    }

    public void setDesTintura(String DesTintura) {
        this.DesTintura = DesTintura;
    }
    
}
