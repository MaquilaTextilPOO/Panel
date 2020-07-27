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
public class RepresentanteLegal extends PersonaJuridica {
    private boolean indRepresentante;

    public RepresentanteLegal() {
        super();
    }

    public RepresentanteLegal(boolean indRepresentante, int RTN, String RazonSocial, String NombreComercial, String Giro, String DireccionComercial, hn.uth.poo.p3.objetos.Ciudad Ciudad, String Email, String TelefonoPrincipal, String RepresentanteL, String IDRepresentanteL, int CodPersona, String TigoPersona, String Nombre, Date FecCreacion) {
        super(RTN, RazonSocial, NombreComercial, Giro, DireccionComercial, Ciudad, Email, TelefonoPrincipal, RepresentanteL, IDRepresentanteL, CodPersona, TigoPersona, Nombre, FecCreacion);
        this.indRepresentante = indRepresentante;
    }
       

   
    
    public boolean isIndRepresentante() {
        return indRepresentante;
    }

    public void setIndRepresentante(boolean indRepresentante) {
        this.indRepresentante = indRepresentante;
    }
    
}
