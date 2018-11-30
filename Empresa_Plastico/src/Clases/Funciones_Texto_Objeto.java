/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.io.*;
import java.util.*;
/**
 *
 * @author Alexander Dybala
 */
public class Funciones_Texto_Objeto {
    
    
    public static void Escribir_Archivo_Objeto(ArrayList<Empleado> arraylist ,String Archivo, String nombre, String apellidoP,String apellidoM,int id,String telefono,String seguroS,String direccion,String contrasenia,float salario,char turno ) throws Exception
    {
        File currentDirectory = new File(new File(".").getAbsolutePath());
        FileOutputStream out = null;
        ObjectOutputStream f=null;
        String path ="";
        try {
            path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
        } catch (IOException e) {;}     
        
        try{
            out = new FileOutputStream(path+Archivo);
        } catch (FileNotFoundException e){;}
        
        try{
            f = new ObjectOutputStream(out);
        }catch (IOException ex) {;}
            char turno2 = turno;
            try {
                Empleado emp = new Empleado(nombre, apellidoP, apellidoM, id, telefono, seguroS, direccion, contrasenia, salario, turno2 );
                arraylist.add(emp);
                
                for(int i=0; i < arraylist.size(); i++)
                {
                    
                    f.writeObject(arraylist.get(i));
                }
                f.close();
            } catch (Exception ex) {;}
    }
    
    
    
    public static void Leer_Archivo_Objeto(ArrayList<Empleado> arraylist,String Archivo)
    {
        File currentDirectory = new File(new File(".").getAbsolutePath());
        String path ="";
        Empleado p;
        arraylist.clear();
        
        try {
            path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
        } catch (IOException e) {;}     
        try
        {   
            FileInputStream in=new FileInputStream(path+Archivo);
            ObjectInputStream b=new ObjectInputStream(in);    
            do
            {
                System.out.println("STANLEEEEE");
                
                p=(Empleado)b.readObject();
                arraylist.add(p);
            }while(true);
        }catch(Exception e){System.out.println(e.getCause());}
    }
    
    
    
    
    public static void Update_Archivo(ArrayList<Empleado> arraylist, String Archivo )
    {     
        File currentDirectory = new File(new File(".").getAbsolutePath());
        FileOutputStream out = null;
        ObjectOutputStream f=null;
        String path ="";
        try {
            path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
        } catch (IOException e) {;}     
        
        try{
            out = new FileOutputStream(path+Archivo);
        } catch (FileNotFoundException e){;}
        
        try{
            f = new ObjectOutputStream(out);
        }catch (IOException ex){;}
            try {
                for(int i=0; i < arraylist.size(); i++)
                {   
                    f.writeObject(arraylist.get(i));
                }
                f.close();
            } catch (Exception ex) {;}
    }
    
    
    public static void Imprimir_Array(ArrayList<Empleado> arraylist)
    {
        for (int i = 0; i < arraylist.size(); i++) 
        {
            System.out.println(arraylist.get(i));
        }
    }
    
    
    //Metodos hechos por Erick
    
    public static void Imprimir_Array_Material(ArrayList<Material> arraylist)
    {
        for (int i = 0; i < arraylist.size(); i++) 
        {
            System.out.println(arraylist.get(i));
        }
    }

    
    
    public static void Escribir_Archivo_Material(ArrayList<Material> arraylist ,String Archivo) throws Exception
    {
        File currentDirectory = new File(new File(".").getAbsolutePath());
        FileOutputStream out = null;
        ObjectOutputStream f=null;
        String path ="";
        try {
            path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
        } catch (IOException e) {;}     
        
        try{
            out = new FileOutputStream(path+Archivo);
        } catch (FileNotFoundException e){;}
        
        try{
            f = new ObjectOutputStream(out);
        }catch (IOException ex) {;}
            try {                
                for(int i=0; i < arraylist.size(); i++)
                {
                    
                    f.writeObject(arraylist.get(i));
                }
                f.close();
            } catch (Exception ex) {;}
    }
    
    
    public static void Leer_Archivo_Material(ArrayList<Material> arraylist,String Archivo)
    {
        File currentDirectory = new File(new File(".").getAbsolutePath());
        String path ="";
        Material p;
        arraylist.clear();
        
        try {
            path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
        } catch (IOException e) {;}     
        try
        {   
            FileInputStream in=new FileInputStream(path+Archivo);
            ObjectInputStream b=new ObjectInputStream(in);    
            do
            {
                p=(Material)b.readObject();
                arraylist.add(p);
            }while(true);
        }catch(Exception e){System.out.println(e.getCause());}
    }
}
