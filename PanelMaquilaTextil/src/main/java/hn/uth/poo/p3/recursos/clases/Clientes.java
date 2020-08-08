/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.recursos.clases;

/**
 *
 * @author maureen
 */
public class Clientes {
    private int CodCliente;
    private double LimCredito;
    private String NomCliente;
    private String Direccion;
    private int Telefono;
    private String Email;
    private String TipoCliente;
    

    public Clientes() {
        super();
    
}

    public Clientes(int CodCliente, double LimCredito, String NomCliente, String Direccion, int Telefono, String Email, String TipoCliente) {
        this.CodCliente = CodCliente;
        this.LimCredito = LimCredito;
        this.NomCliente = NomCliente;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
        this.TipoCliente = TipoCliente;
    }

    public int getCodCliente() {
        return CodCliente;
    }

    public void setCodCliente(int CodCliente) {
        this.CodCliente = CodCliente;
    }

    public double getLimCredito() {
        return LimCredito;
    }

    public void setLimCredito(double LimCredito) {
        this.LimCredito = LimCredito;
    }

    public String getNomCliente() {
        return NomCliente;
    }

    public void setNomCliente(String NomCliente) {
        this.NomCliente = NomCliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }
    
}