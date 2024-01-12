package com.oesia.poc.supermercado.repository;

import com.oesia.poc.supermercado.model.CestaCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CestaCompraRepository extends JpaRepository<CestaCompra, Integer> {

    List<CestaCompra> findByClienteIdCliente(int clienteId);
}
