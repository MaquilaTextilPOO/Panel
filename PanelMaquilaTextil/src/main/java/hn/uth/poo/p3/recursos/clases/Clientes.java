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
public class Clientes extends Persona {
    private int codCliente;
    private int limCredito;

    public Clientes() {
        super();
    }

    public Clientes(int codCliente, int limCredito, int CodPersona, String TigoPersona, String Nombre, Date FecCreacion) {
        super(CodPersona, TigoPersona, Nombre, FecCreacion);
        this.codCliente = codCliente;
        this.limCredito = limCredito;
    }
      

    public int getLimCredito() {
        return limCredito;
    }

    public void setLimCredito(int limCredito) {
        this.limCredito = limCredito;
    }
    
    

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
    
}
