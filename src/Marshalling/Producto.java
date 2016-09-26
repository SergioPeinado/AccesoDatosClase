/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marshalling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matinal
 */
@XmlRootElement(name = "producto")
@XmlAccessorType (XmlAccessType.FIELD)
public class Producto {
    @XmlAttribute
    private int id;
    @XmlElement
    private String nombre;
    @XmlElement
    private String categoria;
    @XmlElement
    private double precio;
    @XmlElement
    private String descripion;
    @XmlElement
    private String imagen;
    @XmlElement
    private String unidadMedidas;
    @XmlElement
    private double unidadPrecio;

    public Producto() {
    }      
    
    public Producto(int id, String nombre, String categoria, double precio, String descripion, String imagen, String unidadMedidas, double unidadPrecio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descripion = descripion;
        this.imagen = imagen;
        this.unidadMedidas = unidadMedidas;
        this.unidadPrecio = unidadPrecio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getUnidadMedidas() {
        return unidadMedidas;
    }

    public void setUnidadMedidas(String unidadMedidas) {
        this.unidadMedidas = unidadMedidas;
    }

    public double getUnidadPrecio() {
        return unidadPrecio;
    }

    public void setUnidadPrecio(double unidadPrecio) {
        this.unidadPrecio = unidadPrecio;
    }
    
    
}
