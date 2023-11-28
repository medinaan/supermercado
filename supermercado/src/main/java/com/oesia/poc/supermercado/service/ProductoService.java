package com.oesia.poc.supermercado.service;

import com.oesia.poc.supermercado.model.Producto;
import com.oesia.poc.supermercado.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> findProductoById(int id) {
        return productoRepository.findById(id);
    }

    public void deleteProductoById(int id) {
        productoRepository.deleteById(id);
    }
}
