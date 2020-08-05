package hn.uth.poo.p3.recursos.clases;

import java.util.Date;

/**
 *
 * @author maureen
 */
public class Persona {

    private int CodPersona;
    private String TipoPersona;
    private String Nombre;
    private Date FecCreacion;

    public Persona() {
        super();
    }

    public Persona(int CodPersona, String TigoPersona, String Nombre, Date FecCreacion) {
        this.CodPersona = CodPersona;
        this.TipoPersona = TigoPersona;
        this.Nombre = Nombre;
        this.FecCreacion = FecCreacion;
    }

    public int getCodigo() {
        return CodPersona;
    }

    public void setCodigo(int CodPersona) {
        this.CodPersona = CodPersona;
    }

    public String getTipoPersona() {
        return TipoPersona;
    }

    public void setTipoPersona(String TipoPersona) {
        this.TipoPersona = TipoPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecCreacion() {
        return FecCreacion;
    }

    public void setFecCreacion(Date FecCreacion) {
        this.FecCreacion = FecCreacion;
    }

}
