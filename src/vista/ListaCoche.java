/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorAuto;
import javax.swing.table.DefaultTableModel;

/**
 *
<<<<<<< Upstream, based on origin/master
 * @author Domenika Delgado
=======
 * @author Carmen Bravo
>>>>>>> 79f8887 Creación de la factura
 */
public class ListaCoche extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaCoche
     */
    AnadirCoche anadirCoche;
    ControladorAuto controladorAuto;
    
    //Tabla
    DefaultTableModel dtm;
    Object[] o = new Object[6];
    
    String email;
    
    public ListaCoche(String emai) {
        initComponents();
        email=emai;
        //Tabla
        dtm = (DefaultTableModel)jTable1.getModel();
        controladorAuto= new ControladorAuto();
        llenarTabla();
    }
    
    public void llenarTabla(){
        dtm.setRowCount(0);
        dtm = (DefaultTableModel) jTable1.getModel();
        String ObjetoS[]=new String [6];
        controladorAuto.llenarTabla(controladorAuto.buscar(email), dtm,o);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Coches");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Placa", "Color", "Asientos", "Tipo Auto", "Modelo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(0, 95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(anadirCoche == null || !anadirCoche.isVisible()){
        anadirCoche = new AnadirCoche();
        BlaBlaCar.jDesktopPane1.add(anadirCoche);
        anadirCoche.toFront();
        anadirCoche.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
