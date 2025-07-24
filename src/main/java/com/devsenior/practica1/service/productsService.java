package com.devsenior.practica1.service;

import java.util.ArrayList;
import java.util.List;

import com.devsenior.practica1.model.entity.products;

public class productsService {

    private List<products> producto;

    public productsService() {
        producto = new ArrayList<>();
        producto.add(new products("Laptop", 10, "Portátil de alto rendimiento"));
        producto.add(new products("Mouse", 50, "Mouse óptico inalámbrico"));
        producto.add(new products("Teclado", 30, "Teclado mecánico retroiluminado"));
        producto.add(new products("Monitor", 15, "Monitor LED 24 pulgadas"));
        producto.add(new products("Impresora", 8, "Impresora multifunción láser"));
        producto.add(new products("Tablet", 12, "Tablet Android 10 pulgadas"));
        producto.add(new products("Smartphone", 25, "Smartphone gama media"));
        producto.add(new products("Auriculares", 40, "Auriculares bluetooth"));
        producto.add(new products("Webcam", 20, "Webcam HD 1080p"));
        producto.add(new products("Microfono", 18, "Micrófono profesional USB"));
        producto.add(new products("Silla Gamer", 5, "Silla ergonómica para gamers"));
        producto.add(new products("Router", 22, "Router WiFi doble banda"));
        producto.add(new products("Disco SSD", 35, "SSD 512GB NVMe"));
        producto.add(new products("Memoria RAM", 28, "Memoria RAM DDR4 16GB"));
        producto.add(new products("Fuente de poder", 14, "Fuente de poder 600W"));
    }

    public List<products> getProducto() {
        return producto;
    }

    public void setProducto(List<products> producto) {
        this.producto = producto;
    }


    
}
