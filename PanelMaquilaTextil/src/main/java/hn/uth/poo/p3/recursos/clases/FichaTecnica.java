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
 * *https://docplayer.es/docs-images/70/63531861/images/128-1.jpg
 */
public class FichaTecnica {
   private  int codFicha;
   private Date fecActualizacion;
   private Date fecEmision;
   private int PosicionArancelaria;
   private int CodProducto;
   private String Tejido;
   private String UsoFinal;
   private int CodTintura;

    public FichaTecnica() {
        super();
    }
   
   

    public FichaTecnica(int codFicha, Date fecActualizacion, Date fecEmision, int PosicionArancelaria, int CodProducto, String Tejido, String UsoFinal, int CodTintura) {
        this.codFicha = codFicha;
        this.fecActualizacion = fecActualizacion;
        this.fecEmision = fecEmision;
        this.PosicionArancelaria = PosicionArancelaria;
        this.CodProducto = CodProducto;
        this.Tejido = Tejido;
        this.UsoFinal = UsoFinal;
        this.CodTintura = CodTintura;
    }
   
   

    public int getCodFicha() {
        return codFicha;
    }

    public void setCodFicha(int codFicha) {
        this.codFicha = codFicha;
    }

    public Date getFecActualizacion() {
        return fecActualizacion;
    }

    public void setFecActualizacion(Date fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    public Date getFecEmision() {
        return fecEmision;
    }

    public void setFecEmision(Date fecEmision) {
        this.fecEmision = fecEmision;
    }

    public int getPosicionArancelaria() {
        return PosicionArancelaria;
    }

    public void setPosicionArancelaria(int PosicionArancelaria) {
        this.PosicionArancelaria = PosicionArancelaria;
    }

    public int getCodProducto() {
        return CodProducto;
    }

    public void setCodProducto(int CodProducto) {
        this.CodProducto = CodProducto;
    }

    public String getTejido() {
        return Tejido;
    }

    public void setTejido(String Tejido) {
        this.Tejido = Tejido;
    }

    public String getUsoFinal() {
        return UsoFinal;
    }

    public void setUsoFinal(String UsoFinal) {
        this.UsoFinal = UsoFinal;
    }

    public int getCodTintura() {
        return CodTintura;
    }

    public void setCodTintura(int CodTintura) {
        this.CodTintura = CodTintura;
    }
   
   
   
}
