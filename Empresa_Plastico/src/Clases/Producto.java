/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

/**
 *
 * @author Estudiante
 * 
 * 
 */
import java.util.*;


public class Producto
{
    private String Nombre;
    private int Cantidad;
    private float Precio_Unitario;
    private String Contenedor;
    private ArrayList<String> pasos_elaboracion;
    //private ArrayList<Material> materiales;
    
    public Producto(String Nombre, int Cantidad, float Precio_unitario)
    {
        this.Nombre = Nombre;
        this.Precio_Unitario = Precio_Unitario;
        this.Cantidad = Cantidad;
    }
    
    public String getNombre(){return this.Nombre;}
    public int getCantidad(){ return this.Cantidad;}
    public float getprecio(){ return this.Precio_Unitario;}
    public void Anadir_material(){};
    public void eliminar_material(){};
    
    //public String getmateriales(){ return this.;}
        
    
}
