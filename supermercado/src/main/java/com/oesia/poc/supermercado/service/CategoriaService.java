package com.oesia.poc.supermercado.service;

import com.oesia.poc.supermercado.model.Categoria;
import com.oesia.poc.supermercado.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria createCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> findCategoriaById(int id) {
        return categoriaRepository.findById(id);
    }

    public void deleteCategoriaById(int id) {
        categoriaRepository.deleteById(id);
    }
}
