package com.oesia.poc.supermercado.repository;

import com.oesia.poc.supermercado.model.DetalleCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleCompraRepository extends JpaRepository<DetalleCompra, Integer> {

    List<DetalleCompraDTO> getHistorialComprasUsuario(String clienteId);

    List<DetalleCompra> findByClienteId(int clienteId);
}
