package com.oesia.poc.supermercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleCompraRepository extends JpaRepository<DetalleCompra, Integer> {

    List<DetalleCompra> findByClienteId(int clienteId);
}
