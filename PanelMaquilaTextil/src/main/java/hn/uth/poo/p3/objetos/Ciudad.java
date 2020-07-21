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
public class Ciudad {
   private int CodCiudad;
   private String NomCiudad;

    public Ciudad() {
        super();
    }
   
   

    public Ciudad(int CodCiudad, String NomCiudad) {
        this.CodCiudad = CodCiudad;
        this.NomCiudad = NomCiudad;
    }
   
   

    public int getCodCiudad() {
        return CodCiudad;
    }

    public void setCodCiudad(int CodCiudad) {
        this.CodCiudad = CodCiudad;
    }

    public String getNomCiudad() {
        return NomCiudad;
    }

    public void setNomCiudad(String NomCiudad) {
        this.NomCiudad = NomCiudad;
    }
   
   
}
