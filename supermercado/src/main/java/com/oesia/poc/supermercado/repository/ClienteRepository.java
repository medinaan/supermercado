package com.oesia.poc.supermercado.repository;

import com.oesia.poc.supermercado.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Optional<Cliente> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String correo);

}
