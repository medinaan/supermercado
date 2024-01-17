package com.oesia.poc.supermercado.service;

import com.oesia.poc.supermercado.model.CestaCompra;
import com.oesia.poc.supermercado.repository.CestaCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CestaCompraService {
    @Autowired
    private CestaCompraRepository cestaCompraRepository;

    public CestaCompra createCestaCompra(CestaCompra cestaCompra) {
        return cestaCompraRepository.save(cestaCompra);
    }

    public List<CestaCompra> getAllCestaCompras() {
        return cestaCompraRepository.findAll();
    }

    public Optional<CestaCompra> findCestaCompraById(int id) {
        return cestaCompraRepository.findById(id);
    }

    public List<CestaCompra> obtenerCestasPorCliente(int clienteId){
        return cestaCompraRepository.findByClienteIdCliente(clienteId);
    }

    public void deleteCestaCompraById(int id) {
        cestaCompraRepository.deleteById(id);
    }
}
