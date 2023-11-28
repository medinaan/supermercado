package com.oesia.poc.supermercado.service;

import com.oesia.poc.supermercado.model.Rol;
import com.oesia.poc.supermercado.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RolService {
    @Autowired
    private RolRepository rolRepository;

    public Rol createRol(Rol rol) {
        return rolRepository.save(rol);
    }

    public List<Rol> getAllRoles() {
        return rolRepository.findAll();
    }

    public Optional<Rol> findRolById(int id) {
        return rolRepository.findById(id);
    }

    public void deleteRolById(int id) {
        rolRepository.deleteById(id);
    }
}
