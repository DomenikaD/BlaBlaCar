/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author GerardoG
 */
public class BuscarViaje extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarViaje
     */
    public BuscarViaje() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSalida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLlegar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        comboBoxHora = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        spinnerCantidadAsientos = new javax.swing.JSpinner();
        btnContinuar = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();

        setTitle("Buscar Viaje");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("¿A dónde quieres ir?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("¿Desde dónde sales exactamente?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));
        getContentPane().add(txtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 390, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("¿A dónde quieres ir?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        getContentPane().add(txtLlegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 390, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("¿Cuándo vas a viajar?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        getContentPane().add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        comboBoxHora.setFont(new java.awt.Font("Tempus Sans ITC", 2, 14)); // NOI18N
        comboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        getContentPane().add(comboBoxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Plazas que quieres reservar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));
        getContentPane().add(spinnerCantidadAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        btnContinuar.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnContinuar.setText("Continuar");
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarViajes.jpg"))); // NOI18N
        getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> comboBoxHora;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner spinnerCantidadAsientos;
    private javax.swing.JTextField txtLlegar;
    private javax.swing.JTextField txtSalida;
    // End of variables declaration//GEN-END:variables
}