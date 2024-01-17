package com.oesia.poc.supermercado.controller;

import com.oesia.poc.supermercado.model.*;
import com.oesia.poc.supermercado.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class Controlador {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private CestaCompraService cestaCompraService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private DetalleCompraService detalleCompraService;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private RolService rolService;

    @Autowired
    private HistorialCompraService historialCompraService;

    // Categoria
    @PostMapping("/categoria")
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        return categoriaService.createCategoria(categoria);
    }

    @GetMapping("/categoria")
    public List<Categoria> getAllCategorias() {
        return categoriaService.getAllCategorias();
    }

    @GetMapping("/categoria/{id}")
    public Optional<Categoria> findCategoriaById(@PathVariable int id) {
        return categoriaService.findCategoriaById(id);
    }

    @DeleteMapping("/categoria/{id}")
    public void deleteCategoriaById(@PathVariable int id) {
        categoriaService.deleteCategoriaById(id);
    }

    // CestaCompra
    @PostMapping("/cestacompra")
    public CestaCompra createCestaCompra(@RequestBody CestaCompra cestaCompra) {
        return cestaCompraService.createCestaCompra(cestaCompra);
    }

    @GetMapping("/cestacompra")
    public List<CestaCompra> getAllCestaCompras() {
        return cestaCompraService.getAllCestaCompras();
    }

  //  @GetMapping("/cestacompra/{id}")
  //  public Optional<CestaCompra> findCestaCompraById(@PathVariable int id) {
  //      return cestaCompraService.findCestaCompraById(id);
  //  }

    @DeleteMapping("/cestacompra/{id}")
    public void deleteCestaCompraById(@PathVariable int id) {
        cestaCompraService.deleteCestaCompraById(id);
    }

    @GetMapping("/cestacompra/{id}")
    public List<CestaCompra> findCestasByCliente(@PathVariable int id){
        return cestaCompraService.obtenerCestasPorCliente(id);
    }

    // Cliente
    @PostMapping("/cliente")
    public Cliente createCliente(@RequestBody Cliente cliente) { return clienteService.createCliente(cliente); }

    @GetMapping("/cliente")
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/cliente/{id}")
    public Optional<Cliente> findClienteById(@PathVariable int id) {
        return clienteService.findClienteById(id);
    }

    @PostMapping("/login")
    public Cliente login(@RequestBody Cliente cliente) {
        System.out.println(cliente);
        try {
            Cliente cliente1 = clienteService.findClienteByCorreo(cliente.getCorreo());
            if (cliente1.getClave().equals(cliente.getClave())) {
                return cliente1;
            }
            return null;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteClienteById(@PathVariable int id) {
        clienteService.deleteClienteById(id);
    }

    // DetalleCompra
    @PostMapping("/detallecompra")
    public DetalleCompra createDetalleCompra(@RequestBody DetalleCompra detalleCompra) {
        return detalleCompraService.createDetalleCompra(detalleCompra);
    }

    @GetMapping("/detallecompra")
    public List<DetalleCompra> getAllDetallesCompras() {
        return detalleCompraService.getAllDetallesCompras();
    }

    @GetMapping("/detallecompra/{id}")
    public Optional<DetalleCompra> findDetalleCompraById(@PathVariable int id) {
        return detalleCompraService.findDetalleCompraById(id);
    }

    @DeleteMapping("/detallecompra/{id}")
    public void deleteDetalleCompraById(@PathVariable int id) {
        detalleCompraService.deleteDetalleCompraById(id);
    }

    // Producto
    @PostMapping("/producto")
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.createProducto(producto);
    }

    @GetMapping("/producto")
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/producto/{id}")
    public Optional<Producto> findProductoById(@PathVariable int id) {
        return productoService.findProductoById(id);
    }

    @DeleteMapping("/producto/{id}")
    public void deleteProductoById(@PathVariable int id) {
        productoService.deleteProductoById(id);
    }

    // Rol
    @PostMapping("/rol")
    public Rol createRol(@RequestBody Rol rol) {
        return rolService.createRol(rol);
    }

    @GetMapping("/rol")
    public List<Rol> getAllRoles() {
        return rolService.getAllRoles();
    }

    @GetMapping("/rol/{id}")
    public Optional<Rol> findRolById(@PathVariable int id) {
        return rolService.findRolById(id);
    }

    @DeleteMapping("/rol/{id}")
    public void deleteRolById(@PathVariable int id) {
        rolService.deleteRolById(id);
    }
}
