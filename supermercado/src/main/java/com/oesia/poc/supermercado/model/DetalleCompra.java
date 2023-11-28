package com.oesia.poc.supermercado.model;

import javax.persistence.*;

@Entity
@Table(name = "Detalle_Compra")
@IdClass(DetalleCompraPk.class)
public class DetalleCompra {
    @Id
    private int cestaId;

    @Id
    private int productoId;

    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idCesta")
    private CestaCompra cestaCompra;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

    private int precioUnidad;

    private int precioTotal;

    // Getters and setters


    public int getCestaId() {
        return cestaId;
    }

    public void setCestaId(int cestaId) {
        this.cestaId = cestaId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CestaCompra getCestaCompra() {
        return cestaCompra;
    }

    public void setCestaCompra(CestaCompra cestaCompra) {
        this.cestaCompra = cestaCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
}
