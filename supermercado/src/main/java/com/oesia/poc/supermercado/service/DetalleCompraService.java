package com.oesia.poc.supermercado.service;

import com.oesia.poc.supermercado.repository.DetalleCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleCompraService {
    @Autowired
    private DetalleCompraRepository detalleCompraRepository;

    public DetalleCompra createDetalleCompra(DetalleCompra detalleCompra) {
        return detalleCompraRepository.save(detalleCompra);
    }

    public List<DetalleCompra> getAllDetallesCompras() {
        return detalleCompraRepository.findAll();
    }

    public Optional<DetalleCompra> findDetalleCompraById(int id) {
        return detalleCompraRepository.findById(id);
    }

    public void deleteDetalleCompraById(int id) {
        detalleCompraRepository.deleteById(id);
    }
}
