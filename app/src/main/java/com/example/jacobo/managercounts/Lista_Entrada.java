package com.example.jacobo.managercounts;

/**
 * Created by admin on 13/03/2017.
 */

public class Lista_Entrada {
    private int idImagen;
    private String nombre, descripcion;

    public Lista_Entrada(int idImagen, String nombre, String descripcion) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}


