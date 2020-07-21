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
public class Tintura {
    private int codTintura;
    private String DesTintura;

    public Tintura() {
        super();
    }
    
    

    public Tintura(int codTintura, String DesTintura) {
        this.codTintura = codTintura;
        this.DesTintura = DesTintura;
    }
    
    

    public int getCodTintura() {
        return codTintura;
    }

    public void setCodTintura(int codTintura) {
        this.codTintura = codTintura;
    }

    public String getDesTintura() {
        return DesTintura;
    }

    public void setDesTintura(String DesTintura) {
        this.DesTintura = DesTintura;
    }
    
}
