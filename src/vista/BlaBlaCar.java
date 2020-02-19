/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JMenu;

/**
 *
 * @author Domenika Delgado
 */
public class BlaBlaCar extends javax.swing.JFrame {

    
    Principal principal;
    
    PublicarViaje publicarViaje;
    
    ListaViajes listaViajes;
    TransferenciaPendientes transferenciaPendientes;
    BuscarViaje buscarViaje;
    Perfil perfil;
    /**
     * Creates new form BlaBlaCar
     */
    public BlaBlaCar(String usuario) {
        initComponents();
        setLocationRelativeTo(null);
        
        jMenuPerfil.setText(usuario);
        
        
        
    }

    private BlaBlaCar() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuPerfil = new javax.swing.JMenu();
        menuItemViajes = new javax.swing.JMenuItem();
        menuItemMensajes = new javax.swing.JMenuItem();
        menuItemPerfil = new javax.swing.JMenuItem();
        menuItemTransferencia1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuPublicarViaje = new javax.swing.JMenu();
        menuBuscar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1073, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );

        jMenuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N

        menuItemViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/viajes.jpg"))); // NOI18N
        menuItemViajes.setText("Tus Viajes");
        menuItemViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemViajesActionPerformed(evt);
            }
        });
        jMenuPerfil.add(menuItemViajes);

        menuItemMensajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mensajes.png"))); // NOI18N
        menuItemMensajes.setText("Mensajes");
        menuItemMensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMensajesActionPerformed(evt);
            }
        });
        jMenuPerfil.add(menuItemMensajes);

        menuItemPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/preferencias perfel.png"))); // NOI18N
        menuItemPerfil.setText("Perfil");
        menuItemPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPerfilActionPerformed(evt);
            }
        });
        jMenuPerfil.add(menuItemPerfil);

        menuItemTransferencia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/transferencia.png"))); // NOI18N
        menuItemTransferencia1.setText("Transferencias Pendientes");
        menuItemTransferencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTransferencia1ActionPerformed(evt);
            }
        });
        jMenuPerfil.add(menuItemTransferencia1);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturas.png"))); // NOI18N
        jMenuItem5.setText("Facturas");
        jMenuPerfil.add(jMenuItem5);

        menuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.jpg"))); // NOI18N
        menuItemCerrarSesion.setText("Cerrar Sesión");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuPerfil.add(menuItemCerrarSesion);

        jMenuBar.add(jMenuPerfil);

        menuPublicarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        menuPublicarViaje.setText("Publicar Viaje");
        menuPublicarViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuPublicarViajeMousePressed(evt);
            }
        });
        jMenuBar.add(menuPublicarViaje);

        menuBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        menuBuscar.setText("Buscar");
        menuBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuBuscarMousePressed(evt);
            }
        });
        jMenuBar.add(menuBuscar);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        // TODO add your handling code here:
        principal = new Principal();
        setVisible(false);
        principal.setVisible(true);
        
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBuscarMousePressed
        // TODO add your handling code here:
        if(buscarViaje == null || !buscarViaje.isVisible()){
        buscarViaje = new BuscarViaje();
        jDesktopPane1.add(buscarViaje);
        buscarViaje.show();
        }
    }//GEN-LAST:event_menuBuscarMousePressed

    private void menuItemMensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMensajesActionPerformed

    }//GEN-LAST:event_menuItemMensajesActionPerformed

    private void menuItemPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPerfilActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(perfil == null || !perfil.isVisible()){
        perfil = new Perfil();
        jDesktopPane1.add(perfil);
        perfil.show();
        }
    }//GEN-LAST:event_menuItemPerfilActionPerformed

    private void menuItemTransferencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTransferencia1ActionPerformed
        if(transferenciaPendientes == null || !transferenciaPendientes.isVisible()){
        transferenciaPendientes = new TransferenciaPendientes();
        jDesktopPane1.add(transferenciaPendientes);
        transferenciaPendientes.show();
        }
    }//GEN-LAST:event_menuItemTransferencia1ActionPerformed

    private void menuItemViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemViajesActionPerformed
        // TODO add your handling code here:
        if(listaViajes == null || !listaViajes.isVisible()){
        listaViajes = new ListaViajes();
        jDesktopPane1.add(listaViajes);
        listaViajes.show();
        }
    }//GEN-LAST:event_menuItemViajesActionPerformed

    private void menuPublicarViajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPublicarViajeMousePressed
        // TODO add your handling code here:
        if(publicarViaje == null || !publicarViaje.isVisible()){
        publicarViaje = new PublicarViaje();
        jDesktopPane1.add(publicarViaje);
        publicarViaje.show();
        }
    }//GEN-LAST:event_menuPublicarViajeMousePressed

    
    
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
            java.util.logging.Logger.getLogger(BlaBlaCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlaBlaCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlaBlaCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlaBlaCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlaBlaCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemMensajes;
    private javax.swing.JMenuItem menuItemPerfil;
    private javax.swing.JMenuItem menuItemTransferencia1;
    private javax.swing.JMenuItem menuItemViajes;
    private javax.swing.JMenu menuPublicarViaje;
    // End of variables declaration//GEN-END:variables
}
