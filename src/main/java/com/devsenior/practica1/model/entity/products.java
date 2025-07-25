package com.devsenior.practica1.model.entity;

public class Products {
    private String name;
    private int cantidad;
    private String descricpcion;
    private double precio;
    private Long id;

    /*esencial para que Spring/Jackson pueda crear objetos
     Product a partir del JSON entrante en las peticiones POST */
    public Products() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescricpcion() {
        return descricpcion;
    }

    public void setDescricpcion(String descricpcion) {
        this.descricpcion = descricpcion;
    }

    public Products(String name, int cantidad, String descricpcion, double precio) {
        this.name = name;
        this.cantidad = cantidad;
        this.descricpcion = descricpcion;
        this.precio = precio;
    }

    public Products(String name, int cantidad, String descricpcion, double precio, Long id) {
        this.name = name;
        this.cantidad = cantidad;
        this.descricpcion = descricpcion;
        this.precio = precio;
        this.id = id;
    }

    
    
    @Override
    public String toString() {
        return "Products [name=" + name + ", cantidad=" + cantidad + ", descricpcion=" + descricpcion + ", precio="
                + precio + ", id=" + id + "]";
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter y Setter para id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
