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
public class Temporadas implements ITemporada{
    private String Temporada;
    private Date FechaInicial;
    private Date FechaFinal;

    public Temporadas() {
    }

    
    
    public Temporadas(String Temporada, Date FechaInicial, Date FechaFinal) {
        this.Temporada = Temporada;
        this.FechaInicial = FechaInicial;
        this.FechaFinal = FechaFinal;
    }
    
    

    public String getTemporada() {
        return Temporada;
    }

    public void setTemporada(String Temporada) {
        this.Temporada = Temporada;
    }

    public Date getFechaInicial() {
        return FechaInicial;
    }

    public void setFechaInicial(Date FechaInicial) {
        this.FechaInicial = FechaInicial;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    
    @Override
    public boolean ValidarTemporadaActiva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
