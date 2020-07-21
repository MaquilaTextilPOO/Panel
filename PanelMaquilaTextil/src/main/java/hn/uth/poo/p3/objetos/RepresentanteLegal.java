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
public class RepresentanteLegal extends Persona {
    private boolean indRepresentante;

    public RepresentanteLegal() {
        super();
    }
    
    

    public RepresentanteLegal(boolean indRepresentante, int CodPersona, String TigoPersona, String Nombre, Date FecCreacion) {
        super(CodPersona, TigoPersona, Nombre, FecCreacion);
        this.indRepresentante = indRepresentante;
    }

    
    public boolean isIndRepresentante() {
        return indRepresentante;
    }

    public void setIndRepresentante(boolean indRepresentante) {
        this.indRepresentante = indRepresentante;
    }
    
}
