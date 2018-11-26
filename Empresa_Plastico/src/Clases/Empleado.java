package Clases;
import java.io.Serializable;
public class Empleado implements Serializable{

    int id;
    float salario;
    String nombre, apellidoM, apellidoP, telefono, seguroS, direccion, contrasenia;
    char turno;
    
    public static int id_produccion = 1501;
    public static int id_almacen = 501;
    public static int id_administrador = 0;
    public static int id_ventas = 151;
    

    public Empleado(String nombre, String apellidoP,String apellidoM,int id,String telefono,String seguroS,String direccion,String contrasenia,float salario,char turno){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.id = id;
        this.telefono = telefono;
        this.seguroS = seguroS;
        this.direccion = direccion;
        this.contrasenia = contrasenia;
        this.salario = salario;
        this.turno = turno;

    }
    public Empleado()
            {
                
            }


    /* -------------------------------------------------------------------------------------------*/
    /*                                          Metodos SET
    /* -------------------------------------------------------------------------------------------*/
    public void setNombre(String newNombre){ this.nombre = newNombre; }

    public void setApellidoP(String newAp){ this.apellidoP = newAp; }

    public void setApellidoM(String newAp){ this.apellidoM = newAp; }

    public void setID(int newID){ this.id = newID; }

    public void setTelefono(String newTel){ this.telefono = newTel; }

    public void setSeguro(String newSS){ this.seguroS = newSS; }

    public void setDireccion(String newDir){ this.direccion = newDir; }

    public void setContrasenia(String newPass){ this.contrasenia = newPass; }

    public void setSalario(float newSalario){ this.salario = newSalario; }

    public void setTurno(char newTurno){ this.turno = newTurno; }

    /* -------------------------------------------------------------------------------------------*/
    /*                                          Metodos GET
    /* -------------------------------------------------------------------------------------------*/
    public String getNombre(){ return this.nombre; }

    public String getApellidoM(){ return this.apellidoM; }

    public int getID(){ return this.id; }

    public String getTelefono(){ return this.telefono; }

    public String getSeguro(){ return this.seguroS; }

    public String getDireccion(){ return this.direccion; } 

    public String getContrasenia(){ return this.contrasenia; }

    public float getSalario(){ return this.salario; }

    public String getApellidoP(){ return this.apellidoP; }
    
    public char getTurno(){ return this.turno; }

    /* --------------------------------------------------------------------------------------------*/

    public String getType(){
        return this.getClass().getSimpleName(); }
    /*this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.id = id;
        this.telefono = telefono;
        this.seguroS = seguroS;
        this.direccion = direccion;
        this.contrasenia = contrasenia;
        this.salario = salario;
        this.turno = turno;*/
    public String toString(){
    String cadena = "Nombre: "+ nombre + "\nApellidos: "+ apellidoP + " " + apellidoM + "\nid: "+ id + "\ntelefono"
    +telefono+"\nNum seguro: " + seguroS+ "\ndireccion: " + direccion+"\ncontraseña: " + contrasenia+"\nsalario"+salario
     +"\nturno: "+turno;
    return cadena;
    }
}