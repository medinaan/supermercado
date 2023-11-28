package com.oesia.poc.supermercado.model;

import java.io.Serializable;

public class DetalleCompraPk implements Serializable {
    private int cestaId;
    private int productoId;

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
}
