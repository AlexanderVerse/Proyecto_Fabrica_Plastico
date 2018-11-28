import java.util.*;

public class Pedido
{
    private int ID;
    private String Nombre_Cliente;
    private ArrayList<String> Productos;
    private String Contenedor;
    private String Estado;
    private String Fecha_Entrega;
    private float Cuota_Total;

    
    public Pedido(int ID, String Nombre_Cliente, ArrayList<String> Productos, String Contenedor, String Estado, String Fecha_Entrega, float Cuota_Total)
    {
        this.ID = ID;
        this.Nombre_Cliente =Nombre_Cliente;
        this.Productos= Productos;
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
    
    public void setEstado(String Estado){ this.Estado = Estado;}
}
