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
public class Norma {
    private int CodNorma;
    private String Descripcion;

    public Norma() {
        super();
    }

    public Norma(int CodNorma, String Descripcion) {
        this.CodNorma = CodNorma;
        this.Descripcion = Descripcion;
    }

    public int getCodNorma() {
        return CodNorma;
    }

    public void setCodNorma(int CodNorma) {
        this.CodNorma = CodNorma;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
