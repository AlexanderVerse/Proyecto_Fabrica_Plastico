/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Inicio_Sesion extends javax.swing.JFrame {
     public static ArrayList<String> arreglo_matriculas=new ArrayList<String>();
     public static ArrayList<String> arreglo_nombres=new ArrayList<String>();
     private static ArrayList<Empleado> Arreglo_Empleados=new ArrayList<Empleado>();
     public static String campo2;
     public static int aux;
     public static String path;
     private static final String root = "CR7";
     private static final String root_password = "CR7";
     
    /**
     * Creates new form Interfaz
     */
    public Inicio_Sesion()
    {
        this.setTitle("Proyecto Final");
        initComponents();
        this.setLocationRelativeTo(null);
        jTextField1.grabFocus();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(400, 520));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(460, 546));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("  Bienvenido");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 210, 90);

        jLabel2.setText("ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 190, 20, 14);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(430, 10, 20, 20);

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 10, 20, 20);

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 333, 73, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(230, 180, 120, 40);

        jLabel3.setText("Password: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 230, 80, 40);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(230, 230, 120, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setExtendedState(Inicio_Sesion.CROSSHAIR_CURSOR); 
    }//GEN-LAST:event_jButton4ActionPerformed

   /*
    public void abrir_archivo2(String Archivo) throws Exception{
        FileReader fin=new FileReader(path+Archivo);
        BufferedReader in=new BufferedReader(fin);
        String line=null;
        int w=0;
        while((line=in.readLine()) !=null)
        {
            //Registro.arreglo_IDs.add(w,line);
            w=w+1;
        }
        in.close();
    }
    */
    public void muestraContenido() throws FileNotFoundException, IOException {
    }

    public static String regresaNom()
    {
        return arreglo_nombres.get(aux);
    }
    
    public static String regresaMatri()
    {
        return arreglo_matriculas.get(aux);
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        File currentDirectory = new File(new File(".").getAbsolutePath());
        String path ="";
        if( root.equals(jTextField1.getText()) && root_password.equals(jPasswordField1.getText()))
        {
            dispose();
            Administrador ventana_administrador = new Administrador();
            ventana_administrador.setVisible(true);
        }
        else
        {
            Empleado p;
            Arreglo_Empleados.clear();
        
            try {
                path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
            } catch (IOException e) {;}     
            try
            {   
                FileInputStream in=new FileInputStream(path+"Objeto.bin");
                ObjectInputStream b=new ObjectInputStream(in);    
                do
                {
                    System.out.println("STANLEEEEE");
                    p=(Empleado)b.readObject();
                    Arreglo_Empleados.add(p);
                }while(true);
            }catch(Exception e){System.out.println(e.getCause());}
    
            for (int i = 0; i < Arreglo_Empleados.size(); i++) 
            {
                if( jPasswordField1.getText().equals(Arreglo_Empleados.get(i).getContrasenia()) && jTextField1.getText().equals(String.valueOf(Arreglo_Empleados.get(i).getID())))
                {
                    System.out.println("FULANO DE TAL");
                    if(Arreglo_Empleados.get(i).getID()>=1 && Arreglo_Empleados.get(i).getID()<500)
                    {
                        dispose();

                        Administrador ventana_administrador = new Administrador();
                        ventana_administrador.setVisible(true);
                    }
                    else if(Arreglo_Empleados.get(i).getID()>=500 && Arreglo_Empleados.get(i).getID()<1000)
                    {
                        dispose();
                        //500 MANOLO
                        Almacen Frame_almacen = new Almacen();
                        Frame_almacen.setVisible(true);
                        
                    }
                    else if(Arreglo_Empleados.get(i).getID()>=1000 && Arreglo_Empleados.get(i).getID()<1500)
                    {
                        dispose();
                        //1000 y FISICA
                        Ventana_ventas Frame_Ventas = new Ventana_ventas();
                        Frame_Ventas.setVisible(true);
                    }
                    else 
                    {
                        System.out.println("PRODUCCION");
                        //1500, JKOL
                        dispose();
                        Produccion Frame_Produccion = new Produccion();
                        Frame_Produccion.setVisible(true);
                    }
                }
            }
            
        }
        
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    
    public int Comprobar_ID(String Archivo) throws Exception
    {
        int ID=0;
        File currentDirectory = new File(new File(".").getAbsolutePath());
        path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
        File f;  
        f= new File(path + Archivo);
        try{
            if(f.exists())
            {
                System.out.print("HEYY!!!");
               // abrir_archivo2(Archivo);
            }
            else{}
        }catch(Exception e){;}
        
        
        
        
        /*System.out.print(Registro.arreglo_IDs.size());
        for(int i=0; i< Registro.arreglo_IDs.size(); i++)
        {
            
            if( jTextField1.getText().equals(Registro.arreglo_IDs.get(i) ) )
            {
                System.out.print("FER");
                dispose();
                ID = Integer.parseInt(jTextField1.getText());
                System.out.println(ID);
                if( ID < 500)
                {
                    System.out.println("v e n t a s");
                    Ventas ventana_almacen =new Ventas();
                    ventana_almacen.setVisible(true);
                }
                else if( ID > 500 && ID < 1501)
                {
                    System.out.println("almacen");
                    Almacen ventana_almacen = new Almacen();
                    ventana_almacen.setVisible(true);
                    
                }
                else if( ID > 1500 && ID < 2501)
                {
                    System.out.println("prod");
                    Produccion ventana_produccion = new Produccion();
                    ventana_produccion.setVisible(true);
                }
            }
        }
        
        */
        return 1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Inicio_Sesion().setVisible(true);
            }
        });
    }

     public static void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
