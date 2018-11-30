/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
/**
 *
 * @author Alexander Dybala
 */
public class Material implements Serializable{
    String nombre, descripcion, noSerie, contenedor;
    Ubicacion location;
    int cantidad;
    
    public Material(String nombre, String noSerie, String contenedor, String descripcion, Ubicacion location, int cantidad){
        this.nombre = nombre;
        this.noSerie = noSerie;
        this.contenedor = contenedor;
        this.descripcion = descripcion;
        this.location = location;
        this.cantidad = cantidad;
    }

    /* -----------------------------------------------------------------------*/
    /*                          metodos SET
    /* -----------------------------------------------------------------------*/
    public void setNombre(String newName){ this.nombre = newName; }
    public void setSerie(String newSerie){ this.noSerie = newSerie; }
    public void setContenedor(String newCont){ this.contenedor = newCont; }
    public void setDescripcion(String descripcion){ this.descripcion = descripcion; }
    public void setUbicacion(Ubicacion location){ this.location = location; }
    public void setCantidad(int cantidad){ this.cantidad = cantidad; }
    
    /* -----------------------------------------------------------------------*/
    /*                          metodos GET
    /* -----------------------------------------------------------------------*/

    public String getNombre() { return nombre; }
    public String getContenedor() { return contenedor; }
    public String getDescripcion() { return descripcion; }
    public String getNoSerie() { return noSerie; }
    public Ubicacion getLocation() { return location; }
    public int getCantidad() { return cantidad; }

    @Override
    public String toString() {
        return "Material{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", noSerie=" + noSerie + ", contenedor=" + contenedor + ", location=" + location + ", cantidad=" + cantidad + '}';
    }
    
    
}
