
import Conexion.Conectar;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;


public class inicioSesion extends javax.swing.JFrame {

   
    
    public inicioSesion() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Bienvenido a REAPERS CREW PARRAL");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconoImag/iconoescritorio.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bacG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        Logo = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bacG.setBackground(new java.awt.Color(255, 255, 255));
        bacG.setPreferredSize(new java.awt.Dimension(1360, 768));
        bacG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("   USUARIO");
        bacG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, 160, 30));

        txtUsuario.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bacG.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 170, 30));

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bacG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 360, 170, 10));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTRASEÑA");
        bacG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 390, 170, 30));

        txtContraseña.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bacG.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, 170, 30));

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoImag/RPC.jpg"))); // NOI18N
        bacG.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 220, 170));

        btnEntrar.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        bacG.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 110, 50));

        btnSalir.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        bacG.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 490, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoImag/PELONCHAS.png"))); // NOI18N
        bacG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 840, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bacG, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bacG, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       
        String usuario, contraseña; 
        usuario = txtUsuario.getText();
        contraseña = txtContraseña.getText();
        
        if(usuario.equals("admin") && contraseña.equals("password")){
            principal abrir = new principal ();
            abrir.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "La contraseña o usuario son incorrectos");
          txtUsuario.setText("");
          txtContraseña.setText("");
        }
        
       
        
       
       
       
        
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel bacG;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
        
