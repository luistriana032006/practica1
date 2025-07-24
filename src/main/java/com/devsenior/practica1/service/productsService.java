package com.devsenior.practica1.service;

import java.util.ArrayList;
import java.util.List;

import com.devsenior.practica1.model.entity.products;

public class productsService {

    private List<products> producto;

    public productsService() {
        producto = new ArrayList<>();
        producto.add(new products("Laptop", 10, "Portátil de alto rendimiento", 1200.00));
        producto.add(new products("Mouse", 50, "Mouse óptico inalámbrico", 25.00));
        producto.add(new products("Teclado", 30, "Teclado mecánico retroiluminado", 45.00));
        producto.add(new products("Monitor", 15, "Monitor LED 24 pulgadas", 300.00));
        producto.add(new products("Impresora", 8, "Impresora multifunción láser", 150.00));
        producto.add(new products("Tablet", 12, "Tablet Android 10 pulgadas", 350.00));
        producto.add(new products("Smartphone", 25, "Smartphone gama media", 800.00));
        producto.add(new products("Auriculares", 40, "Auriculares bluetooth", 60.00));
        producto.add(new products("Webcam", 20, "Webcam HD 1080p", 40.00));
        producto.add(new products("Microfono", 18, "Micrófono profesional USB", 70.00));
        producto.add(new products("Silla Gamer", 5, "Silla ergonómica para gamers", 200.00));
        producto.add(new products("Router", 22, "Router WiFi doble banda", 90.00));
        producto.add(new products("Disco SSD", 35, "SSD 512GB NVMe", 110.00));
        producto.add(new products("Memoria RAM", 28, "Memoria RAM DDR4 16GB", 80.00));
        producto.add(new products("Fuente de poder", 14, "Fuente de poder 600W", 50.00));
    }

    public List<products> getProducto() {
        return producto;
    }

    public void setProducto(List<products> producto) {
        this.producto = producto;
    }


    
}
