package Ventanas;

import Clases.*;
import Clases.Funciones_Texto_Objeto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static Funciones_Texto_Objeto.Escribir_Archivo_Material;
//import static Funciones_Texto_Objeto.Imprimir_Array_Material;
//import static aniadirMaterial.archivo;
import javax.swing.JOptionPane;

public class Almacen extends javax.swing.JFrame {
    
    ArrayList<Material> listaMat;
    public static final String archivo = "materiales.bin";
    
    public Almacen() {
        this.listaMat = new ArrayList<>();
        initComponents();
        fillTable();
        
        //Tamaño de columna 2
        tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
        
        this.setLocationRelativeTo(null);
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
        busqueda = new javax.swing.JButton();
        txtSerie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonCerrarSesion = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        botonShowAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Almacén");

        jLabel2.setText("Gestión del inventario");

        busqueda.setText("Buscar");
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });

        jLabel3.setText("No. serie : ");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "No. Serie", "Ubicación", "Contenedor", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        botonCerrarSesion.setText("Cerrar Sesión");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        botonBorrar.setLabel("Eliminar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        jButton3.setText("Añadir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        botonShowAll.setText("Mostrar todos");
        botonShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonShowAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCerrarSesion)
                        .addGap(18, 18, 18)
                        .addComponent(botonShowAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 99, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(busqueda)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)))
                .addGap(256, 256, 256))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busqueda)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        String serie;
        boolean bandFound = false;
        int pos = -1;
        
        if("".equals(txtSerie.getText())){
            JOptionPane.showMessageDialog(null, "Campo de busqueda vacío.", "Error ", JOptionPane.WARNING_MESSAGE);
        }else{
            serie = txtSerie.getText();
            txtSerie.setText("");
            for(int i = 0; i<listaMat.size(); i++){
                if(serie.equals(listaMat.get(i).getNoSerie())){
                    pos = i;
                    break;
                }
            }
        }
        
        if(pos >= 0){
            //Se encontró el elemento
            Material mat = listaMat.get(pos);
            listaMat.set(pos,listaMat.get(0));
            listaMat.set(0,mat);
            refreshTable();
            tabla.setValueAt(mat.getNombre(),0,0);
            tabla.setValueAt(mat.getNoSerie(),0,1);
            tabla.setValueAt(mat.getLocation(),0,2);
            tabla.setValueAt(mat.getContenedor(),0,3);
            tabla.setValueAt(mat.getCantidad(),0,4);
        }else{
            JOptionPane.showMessageDialog(null, "Material no encontrado.", "Error ", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_busquedaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        aniadirMaterial aniadir = new aniadirMaterial();
        aniadir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        Inicio_Sesion inicio = new Inicio_Sesion();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        
        if(tabla.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Primero seleccione una fila para borrar.", "Error ", JOptionPane.WARNING_MESSAGE);
        }else if(tabla.getSelectedRow() > (listaMat.size() - 1)){
            JOptionPane.showMessageDialog(null, "Seleccion no válida.", "Error ", JOptionPane.WARNING_MESSAGE);
        }else{
            refreshTable();
            listaMat.remove(tabla.getSelectedRow());
            try {
                Funciones_Texto_Objeto.Escribir_Archivo_Material(listaMat, archivo);
            } catch (Exception ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            }
            fillTable();
        }        
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    private void botonShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonShowAllActionPerformed
        refreshTable();
        fillTable();
    }//GEN-LAST:event_botonShowAllActionPerformed

    public void fillTable(){
        Funciones_Texto_Objeto.Leer_Archivo_Material(listaMat, archivo);
        for(int i = 0; i<listaMat.size(); i++){
            tabla.setValueAt(listaMat.get(i).getNombre(),i,0);
            tabla.setValueAt(listaMat.get(i).getNoSerie(),i,1);
            tabla.setValueAt(listaMat.get(i).getLocation(),i,2);
            tabla.setValueAt(listaMat.get(i).getContenedor(),i,3);
            tabla.setValueAt(listaMat.get(i).getCantidad(),i,4);
        }
    }
    
    public void refreshTable(){
        for(int i = 0; i<listaMat.size(); i++){
            
            tabla.setValueAt(" ",i,0);
            tabla.setValueAt(" ",i,1);
            tabla.setValueAt(" ",i,2);
            tabla.setValueAt(" ",i,3);
            tabla.setValueAt(" ",i,4);
        }
        
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
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonShowAll;
    private javax.swing.JButton busqueda;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
