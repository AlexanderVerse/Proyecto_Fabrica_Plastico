/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

//import static Ventanas.Interfaz.arreglo_leyenda;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Clases.*;
/**
 *
 * @author Alexander
 */


public class Registro extends javax.swing.JFrame {
    public static String path;

    /**
     * Creates new form Registro
     */
    
    public static ArrayList <Empleado> ObjetosEmpleados=new ArrayList <Empleado>();
    
    private String valor_Combobox;
    
    
    public Registro() {
        this.setTitle("Proyecto Final");
        initComponents();
        this.setLocationRelativeTo(null);
        Asignar_ID_Campo();                 
    }

    public void Asignar_ID_Campo()
    {
        
        Empleado p;
        int ID;
        FileInputStream in = null;
        File currentDirectory = new File(new File(".").getAbsolutePath());
       
        try {
             path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
             
            in = new FileInputStream(path + "Objetos.bin");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception e){   
            
        }
        
        ObjectInputStream f = null;
        try {
            f = new ObjectInputStream(in);
        } catch (IOException ex) {
            
            
        }catch(Exception e){
        
        }

      try{
      	  do{
             
              p=(Empleado)f.readObject();
              
              ObjetosEmpleados.add(p);
      	     
      	    }while(true);
         }catch(EOFException e){
         	 ;
         }
        catch(ClassNotFoundException e){;}
        catch(IOException e){;}
        catch(Exception e){
            
        }
      
      
        int id;
        valor_Combobox = (String)jComboBox1.getSelectedItem();
        
        for(int i = 0; i < ObjetosEmpleados.size(); i++)
        {
            
            if(ObjetosEmpleados.get(i).getID() < 500 && ObjetosEmpleados.get(i).getID() > 0)
            {
                jTextField1.setText(String.valueOf(Administrador.id));
            }
        }
        
        if( ObjetosEmpleados.size() == 0 )
        {
            if(valor_Combobox.equals("Admin Ventas"))
            {
                jTextField1.setText(String.valueOf(Empleado.id_ventas));
            }
            else if(valor_Combobox.equals("Admin Almacen"))
            {
                jTextField1.setText(String.valueOf(Empleado.id_almacen));
            }
            else if(valor_Combobox.equals("Administrador"))
            {
                jTextField1.setText(String.valueOf(Empleado.id_administrador));
            }
            else
            {
                jTextField1.setText(String.valueOf(Empleado.id_produccion));
            }
        }
        
    }
    
    
    
    /*
    public int Leer_Archivo(String Archivo, int min, int max)
    {
        int ID_regreso = 0;
        //File f=new File(path + Archivo);
        File currentDirectory = new File(new File(".").getAbsolutePath());
        try {
            path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
        } catch (IOException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        File f=new File(path + Archivo);
        try
        {
            if(f.exists())
            {
                System.out.print( "HEY!!" );
                FileReader fin=new FileReader(path + Archivo);
                BufferedReader in=new BufferedReader(fin);
                String line=null;
                int w=0;
                while((line=in.readLine()) !=null)
                {
                    arreglo_IDs.add(w,line);
                    w=w+1;
                }
                in.close();
                boolean band = false;
                System.out.print( arreglo_IDs.size() );
                w=min;
                for(int i=0; i< arreglo_IDs.size(); i++)
                {
                    w=Integer.parseInt(arreglo_IDs.get(i));
                    if( w > min && w < max)
                    {
                        if( ID_regreso < w )
                        {
                            band = true;
                            ID_regreso = w;
                        }
                        
                    }
                }
                
                if(!band)//Si no se modifico ni una vez
                {
                    ID_regreso = min;
                }
            }
            else
            {
                System.out.print( "ENSEÑAME" );
            }
        }catch(Exception e){;}
        
        if(arreglo_IDs.size() == 0)
        {
            if(min == 0)
            {
                return ID_regreso+1;
            }            
            else if(min == 501)
            {
                ID_regreso = 501;
                
            }
            else
            {
                ID_regreso = 1501;
                
            }
        }
        return ID_regreso+1;   
    }
    
    public void abrir_archivo2(String Archivo) throws Exception
    {   
      
    }
    */
    
    public void cerrar(){
    Object [] opciones ={"SI","NO"};
    int eleccion = JOptionPane.showOptionDialog(rootPane,"¿DESEAS SALIR COMPLETAMENTE DEL PROGRAMA?","Mensaje de Confirmacion",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
    if (eleccion == JOptionPane.YES_OPTION)
    {
        System.exit(0);
        mensaje("HAS CERRADO SESION");
    }   
    else{}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 520));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 476));
        getContentPane().setLayout(null);

        jLabel1.setText("Tipo_Administrador:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 120, 14);

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 120, 80, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Registro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 10, 87, 29);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 480, 100, 23);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 0, 20, 20);

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 480, 90, 23);

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(360, 0, 20, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin Ventas", "Admin Almacen", "Admin Produccion", "Administrador" }));
        jComboBox1.setName("Combo_box_Admin"); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(160, 50, 150, 20);

        jLabel4.setText("ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 80, 70, 14);

        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 240, 60, 14);

        jLabel6.setText("Seguro Social:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 280, 80, 14);

        jLabel7.setText("Direccion:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 320, 100, 14);

        jLabel8.setText("Contraseña:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 360, 80, 14);

        jTextField1.setEditable(false);
        jTextField1.setName("Seguro"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 80, 130, 30);

        jTextField2.setName("Direccion"); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 120, 130, 30);

        jTextField3.setName("Telefono"); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 160, 130, 30);

        jTextField4.setName("Password"); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(160, 200, 130, 30);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(160, 280, 130, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(160, 320, 130, 30);

        jLabel9.setText("Apellido Paterno:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 160, 100, 14);

        jLabel10.setText("Apellido Materno:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 200, 120, 14);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(160, 360, 130, 30);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(160, 400, 130, 30);

        jLabel11.setText("Salario:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 410, 80, 14);

        jLabel12.setText("Turno:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 450, 100, 14);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11);
        jTextField11.setBounds(160, 440, 130, 30);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12);
        jTextField12.setBounds(160, 240, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        Inicio_Sesion Ventana_Inicio =  new Inicio_Sesion();
        Ventana_Inicio.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cerrar();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setExtendedState(Registro.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int var=0;
        int w=0;
        Empleado p;
        File currentDirectory = new File(new File(".").getAbsolutePath());
        try {
            path = currentDirectory.getCanonicalPath()+"\\src\\Archivos\\";
        } catch (IOException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }                
        String line=null;
        FileOutputStream out = null;
        if( jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") ||
            jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField7.getText().equals("") || 
                jTextField8.getText().equals("") ||jTextField9.getText().equals("") || jTextField10.getText().equals("") ||
                jTextField11.getText().equals("") || jTextField12.getText().equals(""))
        {
            mensaje("TODOS LOS CAMPOS TIENEN QUE SER RELLENADOS");
        }
        else
        {
            
            try {
                out = new FileOutputStream(path+"Objeto.bin");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            ObjectOutputStream f=null;
            try {
                f = new ObjectOutputStream(out);
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }

                Empleado prueba = new Empleado();
                char turno = jTextField11.getText().charAt(0);
            try {
                Empleado emp = new Empleado(jTextField2.getText(),jTextField3.getText(),jTextField4.getText(),Integer.parseInt(jTextField1.getText()),jTextField12.getText(),jTextField7.getText(),jTextField8.getText(),jTextField9.getText(),Float.parseFloat(jTextField10.getText()),turno );
                f.writeObject(emp);
                f.close();
               System.out.println(emp);
            } catch (Exception ex) {
               //Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            try
            {
                
              FileInputStream in=new FileInputStream(path+"Objeto.bin");
               ObjectInputStream b=new ObjectInputStream(in);
                
      	  do{
      	     p=(Empleado)b.readObject();
      	     System.out.println(p);
      	    }while(true);
            }catch(Exception e){
                System.out.println(e.getCause());
            }
           
         

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Asignar_ID_Campo();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
