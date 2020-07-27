/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.objetos;

/**
 *
 * @author maureen
 */
public class Inventarios  {
    private int CodInventario;
    private Productos Productos;
    private int CantidadInicial;
    private int CantidadExistencia;

    public Inventarios() {
        super();
    }
    
    

    public Inventarios(int CodInventario, Productos Productos, int CantidadInicial, int CantidadExistencia) {
        this.CodInventario = CodInventario;
        this.Productos = Productos;
        this.CantidadInicial = CantidadInicial;
        this.CantidadExistencia = CantidadExistencia;
    }
    
    

    public int getCodInventario() {
        return CodInventario;
    }

    public void setCodInventario(int CodInventario) {
        this.CodInventario = CodInventario;
    }

    public Productos getProductos() {
        return Productos;
    }

    public void setProductos(Productos Productos) {
        this.Productos = Productos;
    }

    public int getCantidadInicial() {
        return CantidadInicial;
    }

    public void setCantidadInicial(int CantidadInicial) {
        this.CantidadInicial = CantidadInicial;
    }

    public int getCantidadExistencia() {
        return CantidadExistencia;
    }

    public void setCantidadExistencia(int CantidadExistencia) {
        this.CantidadExistencia = CantidadExistencia;
    }
    
    
}
