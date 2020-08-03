/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.recursos.clases;

import java.util.Date;

/**
 *
 * @author maureen
 */
public class FichaTecnicaDetalle extends FichaTecnica{
    private String Caracteristicas;
    private String Unidad;
    private String Estandar;
    private String Norma;

    public FichaTecnicaDetalle() {
        super();
    }
    
    

    public FichaTecnicaDetalle(String Caracteristicas, String Unidad, String Estandar, String Norma, int codFicha, Date fecActualizacion, Date fecEmision, int PosicionArancelaria, int CodProducto, String Tejido, String UsoFinal, int CodTintura) {
        super(codFicha, fecActualizacion, fecEmision, PosicionArancelaria, CodProducto, Tejido, UsoFinal, CodTintura);
        this.Caracteristicas = Caracteristicas;
        this.Unidad = Unidad;
        this.Estandar = Estandar;
        this.Norma = Norma;
    }
    
    

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public String getEstandar() {
        return Estandar;
    }

    public void setEstandar(String Estandar) {
        this.Estandar = Estandar;
    }

    public String getNorma() {
        return Norma;
    }

    public void setNorma(String Norma) {
        this.Norma = Norma;
    }
    
    
}
