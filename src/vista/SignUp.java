/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorUsuario;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author GerardoG
 */
public class SignUp extends javax.swing.JFrame {

    ControladorUsuario controladorUsuario;
    Principal ventanaPrincipal;
    BlaBlaCar blablacar;
    String genero;
    
    Format dateFormat=new SimpleDateFormat("dd/MM/yy");


    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        setLocationRelativeTo(null);
        controladorUsuario=new ControladorUsuario();
        
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
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        comboBoxGenero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        imagen3 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUp");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Email");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombres");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));
        getContentPane().add(DateFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Genero");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        comboBoxGenero.setForeground(new java.awt.Color(51, 51, 51));
        comboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre" }));
        comboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 240, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SignUp");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 80, -1));

        btnSignUp.setBackground(new java.awt.Color(255, 255, 255));
        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSignUp.setText("SignUp");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, -1));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 80, -1));

        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signup.jpg"))); // NOI18N
        getContentPane().add(imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signup.jpg"))); // NOI18N
        getContentPane().add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 300, 160));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signup.jpg"))); // NOI18N
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ventanaPrincipal=new Principal();
        ventanaPrincipal.setVisible(true);
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
      boolean a=controladorUsuario.buscarUsuario(txtEmail.getText());
      
        if(txtApellidos.equals("") || txtEmail.equals("") || txtNombres.equals("") || txtPassword.equals("") || txtTelefono.equals("")){//cadenas de texto string
            JOptionPane.showMessageDialog(null,"Llenar celdas", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if (a==true){
                JOptionPane.showMessageDialog(null,"Datos mal Ingresados", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Usuario usu=new Usuario();
                usu.setId(controladorUsuario.llenarId());
                usu.setEmail(txtEmail.getText());
                usu.setNombre(txtNombres.getText());
                usu.setApellido(txtApellidos.getText());
                
                String fechaNacimeinto=dateFormat.format(DateFechaNacimiento.getDate());
                usu.setFechaNacimiento(fechaNacimeinto);
                usu.setPassword(txtPassword.getText());
                usu.setTelefono(txtTelefono.getText());
                usu.setGenero(genero);
                if(controladorUsuario.crearUsuario(usu)==true){
                    JOptionPane.showMessageDialog(null,"Datos Creados Correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    blablacar=new BlaBlaCar(usu.getNombre());
                    blablacar.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo guardar los datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void comboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGeneroActionPerformed
        genero=comboBoxGenero.getSelectedItem().toString();
    }//GEN-LAST:event_comboBoxGeneroActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateFechaNacimiento;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> comboBoxGenero;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
