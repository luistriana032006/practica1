package com.devsenior.practica1.model.entity;

public class products {
    private String name;
    private int cantidad;
    private String descricpcion;
    private double precio;


    /*esencial para que Spring/Jackson pueda crear objetos
     Product a partir del JSON entrante en las peticiones POST */
    public products() {

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

    public products(String name, int cantidad, String descricpcion, double precio) {
        this.name = name;
        this.cantidad = cantidad;
        this.descricpcion = descricpcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "products [name=" + name + ", cantidad=" + cantidad + ", descricpcion=" + descricpcion + ", precio="
                + precio + "]";
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
