/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marshalling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matinal
 */
@XmlRootElement(name = "productos")
@XmlAccessorType (XmlAccessType.FIELD)
public class Productos {
    @XmlElement(name ="producto")
    List <Producto> productos;

    public Productos(List<Producto> producto) {
        this.productos = producto;
    }

    public Productos() {
        this.productos = new ArrayList();
    }

    public List<Producto> getProducto() {
        return productos;
    }

    public void setProductos(List<Producto> producto) {
        this.productos = producto;
    }
    public void addProducto(Producto p){
        this.productos.add(p);
    }
}
