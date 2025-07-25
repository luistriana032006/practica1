package com.devsenior.practica1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devsenior.practica1.model.entity.Products;

@Service
public class ProductsService {

    private List<Products> producto;

    public ProductsService() {
        producto = new ArrayList<>();
        producto.add(new Products("Laptop", 10, "Portátil de alto rendimiento", 1200.00, 1L));
        producto.add(new Products("Mouse", 50, "Mouse óptico inalámbrico", 25.00, 2L));
        producto.add(new Products("Teclado", 30, "Teclado mecánico retroiluminado", 45.00, 3L));
        producto.add(new Products("Monitor", 15, "Monitor LED 24 pulgadas", 300.00, 4L));
        producto.add(new Products("Impresora", 8, "Impresora multifunción láser", 150.00, 5L));
        producto.add(new Products("Tablet", 12, "Tablet Android 10 pulgadas", 350.00, 6L));
        producto.add(new Products("Smartphone", 25, "Smartphone gama media", 800.00, 7L));
        producto.add(new Products("Auriculares", 40, "Auriculares bluetooth", 60.00, 8L));
        producto.add(new Products("Webcam", 20, "Webcam HD 1080p", 40.00, 9L));
        producto.add(new Products("Microfono", 18, "Micrófono profesional USB", 70.00, 10L));
        producto.add(new Products("Silla Gamer", 5, "Silla ergonómica para gamers", 200.00, 11L));
        producto.add(new Products("Router", 22, "Router WiFi doble banda", 90.00, 12L));
        producto.add(new Products("Disco SSD", 35, "SSD 512GB NVMe", 110.00, 13L));
        producto.add(new Products("Memoria RAM", 28, "Memoria RAM DDR4 16GB", 80.00, 14L));
        producto.add(new Products("Fuente de poder", 14, "Fuente de poder 600W", 50.00, 15L));
    }

    public List<Products> getProducto() {
        return producto;
    }

    public void setProducto(List<Products> producto) {
        this.producto = producto;
    }

    // para agregar un nuevo producto 
    public void addProducto(Products producto) {
        this.producto.add(producto);
    }

    // para borrar un producto 

  
      public void deleteProductById(Long id) {
    // removeIf recorre la lista y elimina el elemento que cumpla la condición.
    // La condición es: el ID del producto (p.getId()) debe ser igual al ID que recibimos.
    
    this.producto.removeIf(p -> p.getId().equals(id));
}
    }

