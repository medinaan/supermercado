package com.oesia.poc.supermercado.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Cesta_Compra")
public class CestaCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCesta;

    private Date fechaCompra;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    // Getters and setters

    public int getIdCesta() {
        return idCesta;
    }

    public void setIdCesta(int idCesta) {
        this.idCesta = idCesta;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
