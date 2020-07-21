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
public class PersonaJuridica extends Persona {
    private int RTN;
    private String RazonSocial;
    private String NombreComercial;
    private String Giro;
    private String DireccionComercial;
    private String codCiudad;
    private String Email;
    private String TelefonoPrincipal;
    private String RepresentanteL;
    private String IDRepresentanteL;

    public PersonaJuridica() {
        super();
        
    }
    
    

    public PersonaJuridica(int RTN, String RazonSocial, String NombreComercial, String Giro, String DireccionComercial, String codCiudad, String Email, String TelefonoPrincipal, String RepresentanteL, String IDRepresentanteL, int CodPersona, String TigoPersona, String Nombre, Date FecCreacion) {
        super(CodPersona, TigoPersona, Nombre, FecCreacion);
        this.RTN = RTN;
        this.RazonSocial = RazonSocial;
        this.NombreComercial = NombreComercial;
        this.Giro = Giro;
        this.DireccionComercial = DireccionComercial;
        this.codCiudad = codCiudad;
        this.Email = Email;
        this.TelefonoPrincipal = TelefonoPrincipal;
        this.RepresentanteL = RepresentanteL;
        this.IDRepresentanteL = IDRepresentanteL;
    }
    
    

    public int getRTN() {
        return RTN;
    }

    public void setRTN(int RTN) {
        this.RTN = RTN;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getNombreComercial() {
        return NombreComercial;
    }

    public void setNombreComercial(String NombreComercial) {
        this.NombreComercial = NombreComercial;
    }

    public String getGiro() {
        return Giro;
    }

    public void setGiro(String Giro) {
        this.Giro = Giro;
    }

    public String getDireccionComercial() {
        return DireccionComercial;
    }

    public void setDireccionComercial(String DireccionComercial) {
        this.DireccionComercial = DireccionComercial;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefonoPrincipal() {
        return TelefonoPrincipal;
    }

    public void setTelefonoPrincipal(String TelefonoPrincipal) {
        this.TelefonoPrincipal = TelefonoPrincipal;
    }

    public String getRepresentanteL() {
        return RepresentanteL;
    }

    public void setRepresentanteL(String RepresentanteL) {
        this.RepresentanteL = RepresentanteL;
    }

    public String getIDRepresentanteL() {
        return IDRepresentanteL;
    }

    public void setIDRepresentanteL(String IDRepresentanteL) {
        this.IDRepresentanteL = IDRepresentanteL;
    }
    
    
}
