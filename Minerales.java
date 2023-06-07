package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Minerales {
    private int Id;
    private String nombre;
    private String tipo;
    private String color;
    private String dureza;
    private String url;

    public Minerales() {
    }

    public Minerales(int id, String nombre, String tipo, String color, String dureza, String url) {
        Id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.dureza = dureza;
        this.url = url;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public String getDureza() {
        return dureza;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Minerales{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color=" + color +
                ", dureza='" + dureza + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImage =new URL(this.url);
        return new ImageIcon(urlImage);
    }
}
