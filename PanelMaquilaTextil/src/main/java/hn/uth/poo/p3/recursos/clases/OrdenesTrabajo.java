/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.recursos.clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author maureen
 * https://www.ejemplode.com/images/uploads/documentos/orden-trabajo.jpg
 */
public class OrdenesTrabajo {
    private int NumOrden;
    private int Folio;
    private Date Fecha;
    private String Lugar;
    private Clientes Cliente;
    private Date FechaEntrega;
    private String Descripcion;
    private String Observaciones;
    private ArrayList<Productos> ListaProductos;
    private double TotPagar;
    private double Adelanto;
    private double Restante;
    private String FormaPago;

    public OrdenesTrabajo() {
        super();
    }
    
    
    

    public OrdenesTrabajo(int NumOrden, int Folio, Date Fecha, String Lugar, Clientes Cliente, Date FechaEntrega, String Descripcion, String Observaciones, ArrayList<Productos> ListaProductos, double TotPagar, double Adelanto, double Restante, String FormaPago) {
        this.NumOrden = NumOrden;
        this.Folio = Folio;
        this.Fecha = Fecha;
        this.Lugar = Lugar;
        this.Cliente = Cliente;
        this.FechaEntrega = FechaEntrega;
        this.Descripcion = Descripcion;
        this.Observaciones = Observaciones;
        this.ListaProductos = ListaProductos;
        this.TotPagar = TotPagar;
        this.Adelanto = Adelanto;
        this.Restante = Restante;
        this.FormaPago = FormaPago;
    }
    
    

    public int getNumOrden() {
        return NumOrden;
    }

    public void setNumOrden(int NumOrden) {
        this.NumOrden = NumOrden;
    }

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public Clientes getCliente() {
        return Cliente;
    }

    public void setCliente(Clientes Cliente) {
        this.Cliente = Cliente;
    }

    public Date getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(Date FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public ArrayList<Productos> getListaProductos() {
        return ListaProductos;
    }

    public void setListaProductos(ArrayList<Productos> ListaProductos) {
        this.ListaProductos = ListaProductos;
    }

    public double getTotPagar() {
        return TotPagar;
    }

    public void setTotPagar(double TotPagar) {
        this.TotPagar = TotPagar;
    }

    public double getAdelanto() {
        return Adelanto;
    }

    public void setAdelanto(double Adelanto) {
        this.Adelanto = Adelanto;
    }

    public double getRestante() {
        return Restante;
    }

    public void setRestante(double Restante) {
        this.Restante = Restante;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }
    
    
    
    
    
}
