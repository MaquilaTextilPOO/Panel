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
 */
public class OrdenesTrabajoDetalle extends OrdenesTrabajo {

    private int NumOrdenDetalle;
    private int CodProductos;
    private int CantProducto;
    private String NomProducto;
    private double Precio;
    private double Total;

    public OrdenesTrabajoDetalle() {
        super();
    }

    public OrdenesTrabajoDetalle(int NumOrdenDetalle, int CodProductos, int CantProducto, String NomProducto, double Precio, double Total, int NumOrden, int Folio, Date Fecha, String LugarEntrega, int CodCliente, Date FechaEntrega, String Descripcion, String Observaciones, ArrayList<Productos> ListaProductos, double TotPagar, double Adelanto, double Restante, String FormaPago, String EstOrden) {
        super(NumOrden, Folio, Fecha, LugarEntrega, CodCliente, FechaEntrega, Descripcion, Observaciones, ListaProductos, TotPagar, Adelanto, Restante, FormaPago, EstOrden);
        this.NumOrdenDetalle = NumOrdenDetalle;
        this.CodProductos = CodProductos;
        this.CantProducto = CantProducto;
        this.NomProducto = NomProducto;
        this.Precio = Precio;
        this.Total = Total;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getNomProducto() {
        return NomProducto;
    }

    public void setNomProducto(String NomProducto) {
        this.NomProducto = NomProducto;
    }

    public int getNumOrdenDetalle() {
        return NumOrdenDetalle;
    }

    public void setNumOrdenDetalle(int NumOrdenDetalle) {
        this.NumOrdenDetalle = NumOrdenDetalle;
    }

    public int getCodProductos() {
        return CodProductos;
    }

    public void setCodProductos(int CodProductos) {
        this.CodProductos = CodProductos;
    }

    public int getCantProducto() {
        return CantProducto;
    }

    public void setCantProducto(int CantProdducto) {
        this.CantProducto = CantProdducto;
    }

    public double getTotal() {

        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

}
