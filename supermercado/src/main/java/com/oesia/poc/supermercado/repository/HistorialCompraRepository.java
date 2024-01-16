package com.oesia.poc.supermercado.repository;// Asegúrate de importar las clases necesarias
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HistorialCompraRepository extends JpaRepository<HistorialCompra, Long> {
    List<HistorialCompra> findByClienteId(String clienteId);
    // Puedes agregar más consultas según tus necesidades
}
