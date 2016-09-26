/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author matinal
 */
public class ProductoMarshalling {
    public static void main(String[] args) {
        Producto p;
        Productos ps;
        
        p = new Producto(0,"nombre","categoria",0, "descripcion","imagen","unidad_mediad",0);
        ps = new Productos();
        ps.addProducto(p);
        
        p = new Producto(1,"nombre","categoria",0, "descripcion","imagen","unidad_mediad",0);
        ps.addProducto(p);
        try{
       JAXBContext jaxbContext = JAXBContext.newInstance(ps.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            //Marshal the employees list in file
            jaxbMarshaller.marshal(ps, new File("productos.xml"));
        } catch (JAXBException ex) {
           System.out.println(ex.getLocalizedMessage());
        }
    }
}
