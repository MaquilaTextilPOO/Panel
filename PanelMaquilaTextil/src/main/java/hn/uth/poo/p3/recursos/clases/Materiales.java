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
public class Materiales {
    private int codMateria;
    private String DescMateria;

    public Materiales() {
        super();
    }
    
    

    public Materiales(int codMateria, String DescMateria) {
        this.codMateria = codMateria;
        this.DescMateria = DescMateria;
    }
    
    

    public int getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public String getDescMateria() {
        return DescMateria;
    }

    public void setDescMateria(String DescMateria) {
        this.DescMateria = DescMateria;
    }
    
    
}
