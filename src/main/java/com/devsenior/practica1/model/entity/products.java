package com.devsenior.practica1.model.entity;

public class products {
    private String name;
    private int cantidad;
    private String descricpcion;

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

    public products(String name, int cantidad, String descricpcion) {
        this.name = name;
        this.cantidad = cantidad;
        this.descricpcion = descricpcion;
    }

    @Override
    public String toString() {
        return "products [name=" + name + ", cantidad=" + cantidad + ", descricpcion=" + descricpcion + "]";
    }

}
