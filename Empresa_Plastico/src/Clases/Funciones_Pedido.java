/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
/**
 *
 * @author Alexander Dybala
 */
public class Funciones_Pedido {
    
    
    public static void Leer_Archivo_Pedido(ArrayList<Pedido> arraylist, String Archivo)
    {
        //arraylist.clear();
        File currentDirectory = new File(new File(".").getAbsolutePath());
        String path ="";
        Pedido pedido;
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
                pedido=(Pedido)b.readObject();
                arraylist.add(pedido);
            }while(true);
        }catch(Exception e){System.out.println(e.getCause());}
        
    }
    
    
    public static void Update_Archivo(ArrayList<Pedido> arraylist, String Archivo )
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
   
    
    
    
    public static void Escribir_Archivo_Objeto(ArrayList<Pedido> arraylist ,String Archivo, String nombre, String apellidoP,String apellidoM,int id,String telefono,String seguroS,String direccion,String contrasenia,float salario,char turno ) throws Exception
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
                //Pedido emp = new Pedido(nombre, apellidoP, apellidoM, id, telefono, seguroS, direccion, contrasenia, salario, turno2 );
                //arraylist.add(emp);
                
                for(int i=0; i < arraylist.size(); i++)
                {
                    
                    f.writeObject(arraylist.get(i));
                }
                f.close();
            } catch (Exception ex) {;}
    }
    
    public static void Iprimir(ArrayList<Pedido> array)
    {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getEstado());
        }
    }
}
