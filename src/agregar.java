
import java.sql.*;
import Conexion.Conectar;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class agregar extends javax.swing.JFrame {
    
    Conectar enlace=new Conectar();
    Connection conect=enlace.getConnection();

    
    
    public agregar() {
        initComponents();
        
        this.setTitle("Ventana Para Agregar Productos");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconoImag/iconoescritorio.png")));
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InventarioR = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtCantienda = new javax.swing.JTextField();
        txtCantBod = new javax.swing.JTextField();
        txtNomProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(5, 90));
        setResizable(false);

        InventarioR.setBackground(new java.awt.Color(102, 102, 102));
        InventarioR.setPreferredSize(new java.awt.Dimension(1274, 322));
        InventarioR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setName("INVENTARIO SUCURSAL PARRAL"); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        InventarioR.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 170, 90));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad Total:");
        InventarioR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 170, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad en Tienda: ");
        InventarioR.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 230, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad en Bodega:");
        InventarioR.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 230, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio:");
        InventarioR.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, 110, 50));

        txtTotal.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        InventarioR.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 170, 50));

        txtCantienda.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtCantienda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantienda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        InventarioR.add(txtCantienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 230, 50));

        txtCantBod.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtCantBod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantBod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        InventarioR.add(txtCantBod, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 230, 50));

        txtNomProducto.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtNomProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        InventarioR.add(txtNomProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 250, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre del producto:");
        InventarioR.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 250, 50));

        txtId.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        InventarioR.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("idProducto: ");
        InventarioR.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 50));

        txtPrecio.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        InventarioR.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 100, 110, 50));

        btnLimpiar.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        btnLimpiar.setText("Limpiar texto");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        InventarioR.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 170, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InventarioR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InventarioR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
       
        try {
            PreparedStatement agregar = conect.prepareStatement("Insert Into datos(id,nombre,precio,cantidadTotal,cantidadTienda,cantidadBodega) "
                    + "Values(?,?,?,?,?,?)");
            agregar.setString(1,txtId.getText());
            agregar.setString(2,txtNomProducto.getText());
            agregar.setString(3,txtPrecio.getText());
            agregar.setString(4,txtTotal.getText());
            agregar.setString(5,txtCantienda.getText());
            agregar.setString(6,txtCantBod.getText());
            agregar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se insertaron los datos");
            txtId.setText("");
            txtNomProducto.setText("");
            txtPrecio.setText("");
            txtTotal.setText("");
            txtCantienda.setText("");
            txtCantBod.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No insertaron los datos"+e);
        }
       
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
            txtId.setText("");
            txtNomProducto.setText("");
            txtPrecio.setText("");
            txtTotal.setText("");
            txtCantienda.setText("");
            txtCantBod.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
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
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InventarioR;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCantBod;
    private javax.swing.JTextField txtCantienda;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

