import java.awt.Toolkit;


public class principal extends javax.swing.JFrame {

    
    public principal() {
        initComponents();
         this.setExtendedState(MAXIMIZED_BOTH);
         this.setTitle("Ventana de menu principal");
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconoImag/iconoescritorio.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        MenuR = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnInventarioC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("INVENTARIO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuR.setBackground(new java.awt.Color(0, 0, 0));
        MenuR.setPreferredSize(new java.awt.Dimension(1360, 768));
        MenuR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        btnAgregar.setText("Agregar Productos");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        MenuR.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 50));

        btnInventarioC.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        btnInventarioC.setText("Ver productos");
        btnInventarioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioCActionPerformed(evt);
            }
        });
        MenuR.add(btnInventarioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 350, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoImag/pulp pictionnn.png"))); // NOI18N
        jLabel1.setText(".");
        MenuR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1110, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        agregar abrir = new agregar(); 
        abrir.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnInventarioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioCActionPerformed
        catalogoProductos abrir2= new catalogoProductos();
        abrir2.setVisible(true);
    }//GEN-LAST:event_btnInventarioCActionPerformed

    
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuR;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnInventarioC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
