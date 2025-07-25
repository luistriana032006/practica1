package com.devsenior.practica1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.practica1.model.entity.Products;
import com.devsenior.practica1.service.ProductsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("api/products")
public class productsController {

    private final ProductsService productsService;

    @Autowired // anotacion necesaria para proyectos antiguos conocer que esta inyectando
               // dependencias
    public productsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    /*
     * trae todos los productos mediante ese endpoint
     */
    @GetMapping

    public List<Products> obtenerTodos() {
        return productsService.getProducto();
    }

    /**
     * trae un producto por un ID
     * 
     * @param id
     * @return el producto con el ID especifico
     */
    @GetMapping("/{id}")

    public Products getProductById(@PathVariable Long id) {
        for (Products producto : productsService.getProducto()) {
            // Si el id es el índice, compara con la posición
            // Si tienes un atributo id en Products, compara con producto.getId()
            // Aquí se asume que id es el índice
            int index = productsService.getProducto().indexOf(producto);
            if (index == id) {
                return producto;
            }
        }
        return null; // O puedes lanzar una excepción
    }

    /* post para agregar un nuevo producto */

    @PostMapping
    public Products addProducts(@RequestBody Products newProduct) {
        productsService.addProducto(newProduct);
        return newProduct;
    }

    // delete para eliminar un producto segun su id 
    
    @DeleteMapping("/{id}")
    public String deleteProducts(@PathVariable Long id) {
        productsService.deleteProductById(id);
        return "Producto con el ID " + id + " eliminado exitosamente.";
    }
}
