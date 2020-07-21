
package hn.uth.poo.p3.objetos;

import java.util.Date;

/**
 *
 * @author maureen
 */
public class Persona {
    private int CodPersona;
    private String TigoPersona;
    private String Nombre;
    private Date FecCreacion;

    public Persona() {
    }
    
    
    

    public Persona(int CodPersona, String TigoPersona, String Nombre, Date FecCreacion) {
        this.CodPersona = CodPersona;
        this.TigoPersona = TigoPersona;
        this.Nombre = Nombre;
        this.FecCreacion = FecCreacion;
    }
    
    

    public int getCodigo() {
        return CodPersona;
    }

    public void setCodigo(int CodPersona) {
        this.CodPersona = CodPersona;
    }

    public String getTigoPersona() {
        return TigoPersona;
    }

    public void setTigoPersona(String TigoPersona) {
        this.TigoPersona = TigoPersona;
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
