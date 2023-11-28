package com.oesia.poc.supermercado.service;

import com.oesia.poc.supermercado.model.Cliente;
import com.oesia.poc.supermercado.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente createCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findClienteById(int id) {
        return clienteRepository.findById(id);
    }

    public void deleteClienteById(int id) {
        clienteRepository.deleteById(id);
    }
}
