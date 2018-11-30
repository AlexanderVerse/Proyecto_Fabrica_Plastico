package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido implements Serializable
{
    private int ID;
    private String Nombre_Cliente;
    private ArrayList<String> Productos;
    private String Contenedor;
    private String Estado;
    private String Fecha_Entrega;
    private float Cuota_Total;
    private final String nombre_pedido;
    private final int cantidad;

    
    public Pedido(int ID, String Nombre_Cliente, String nombre_pedido, int cantidad, String Contenedor, String Estado, String Fecha_Entrega, float Cuota_Total)
    {
        this.ID = ID;
        this.Nombre_Cliente = Nombre_Cliente;
        this.nombre_pedido = nombre_pedido;
        this.cantidad = cantidad;
        this.Contenedor = Contenedor;
        this.Estado = Estado;
        this.Fecha_Entrega = Fecha_Entrega;
        this.Cuota_Total = Cuota_Total;
        
    }

    public int getID() {return this.ID;}
    
    public String getNombre(){return this.Nombre_Cliente;}
    public ArrayList<String> getProductos(){ return this.Productos;}
    public String getContenedor(){return this.Contenedor;}
    public String getEstado(){ return this.Estado;}
    public String getFecha(){ return this.Fecha_Entrega;}
    public float getCuota(){ return this.Cuota_Total;}
    //plubic float calcular_Cuota_Total(){return };

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public String getFecha_Entrega() {
        return Fecha_Entrega;
    }

    public float getCuota_Total() {
        return Cuota_Total;
    }

    public String getNombre_pedido() {
        return nombre_pedido;
    }
    
    
    public void setEstado(String Estado){ this.Estado = Estado;}

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public void setProductos(ArrayList<String> Productos) {
        this.Productos = Productos;
    }

    public void setContenedor(String Contenedor) {
        this.Contenedor = Contenedor;
    }

    public void setFecha_Entrega(String Fecha_Entrega) {
        this.Fecha_Entrega = Fecha_Entrega;
    }

    public void setCuota_Total(float Cuota_Total) {
        this.Cuota_Total = Cuota_Total;
    }

    public ArrayList<String> obtener_productos()
    {
        return this.Productos;
        
    }

    public int getTamPedidos() {
        return this.Productos.size();
    }
    
}
