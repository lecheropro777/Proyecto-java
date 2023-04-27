import Conexion.Conectar;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class catalogoProductos extends javax.swing.JFrame {

    Conectar enlace=new Conectar();
    Connection conect=enlace.getConnection();
    
    public catalogoProductos() {
        initComponents();
        mostrarDatos();
        this.setTitle("Catalogo de productos");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconoImag/iconoescritorio.png")));
    }
    
    public void mostrarDatos (){
        DefaultTableModel tDatos=new DefaultTableModel();
        tDatos.addColumn("ID");
        tDatos.addColumn("Nombre");
        tDatos.addColumn("Cantidad total");
        tDatos.addColumn("Cantidad en tienda");
        tDatos.addColumn("Cantidad en bodega");
        tDatos.addColumn("Precio");
        
        tblProductos.setModel(tDatos);
        
        String [] datos=new String[6];
        
        try {
            Statement leer= conect.createStatement();
            ResultSet resultado= leer.executeQuery("Select * from datos");
            
            while(resultado.next()){
                datos[0]= resultado.getString(1);
                datos[1]= resultado.getString(2);
                datos[2]= resultado.getString(3);
                datos[3]= resultado.getString(4);
                datos[4]= resultado.getString(5);
                datos[5]= "$"+resultado.getString(6)+"MXN";
                
                tDatos.addRow(datos);
                
            }
            tblProductos.setModel(tDatos);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudieron mostrar los datos"+e);
        }
    }
    public void eliminar(){
        int fila=tblProductos.getSelectedRow(); 
        String valor =tblProductos.getValueAt(fila,0).toString();
        
        try {
            PreparedStatement delet=conect.prepareStatement("delete from datos where ID='"+valor+"' ");
            delet.executeUpdate();
            mostrarDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo eliminar"+e);
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        updatePrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        updateID = new javax.swing.JTextField();
        updateNombre = new javax.swing.JTextField();
        updateCT = new javax.swing.JTextField();
        updateTienda = new javax.swing.JTextField();
        updateBodega = new javax.swing.JTextField();
        guardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(5, 450));
        setResizable(false);
        setSize(getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 870, 190));

        btnActualizar.setText("Actualizar tabla");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnEliminar.setText("Eliminar fila");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        updatePrecio.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        updatePrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePrecioActionPerformed(evt);
            }
        });
        jPanel1.add(updatePrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 50, -1));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modificar CT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modificar Tienda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modificar Bodega");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modificar Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        updateID.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        updateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateIDActionPerformed(evt);
            }
        });
        jPanel1.add(updateID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, -1));

        updateNombre.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        updateNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNombreActionPerformed(evt);
            }
        });
        jPanel1.add(updateNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, -1));

        updateCT.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        updateCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCTActionPerformed(evt);
            }
        });
        jPanel1.add(updateCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 60, -1));

        updateTienda.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        updateTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(updateTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 60, -1));

        updateBodega.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        updateBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBodegaActionPerformed(evt);
            }
        });
        jPanel1.add(updateBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 60, -1));

        guardarCambios.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        guardarCambios.setText("Guardar Cambios");
        guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(guardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 890, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        this.dispose();
        catalogoProductos abrirPrinc=new catalogoProductos ();
        abrirPrinc.setVisible(true);
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void updatePrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePrecioActionPerformed

    private void updateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateIDActionPerformed

    private void updateNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNombreActionPerformed

    private void updateCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateCTActionPerformed

    private void updateTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTiendaActionPerformed

    private void updateBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBodegaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBodegaActionPerformed

    private void guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosActionPerformed
        try {
            PreparedStatement agregar = conect.prepareStatement("update datos set nombre=?,precio=?,cantidadTotal=?,cantidadTienda=?,cantidadBodega=? where id='"+updateID.getText()+"'");
            
            agregar.setString(1,updateNombre.getText());
            agregar.setString(2,updatePrecio.getText());
            agregar.setString(3,updateCT.getText());
            agregar.setString(4,updateTienda.getText());
            agregar.setString(5,updateBodega.getText());
            agregar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se insertaron los datos");
            updateID.setText("");
            updateNombre.setText("");
            updateCT.setText("");
            updateTienda.setText("");
            updateBodega.setText("");
            updatePrecio.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No insertaron los datos"+e);
        }
    }//GEN-LAST:event_guardarCambiosActionPerformed

    
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
            java.util.logging.Logger.getLogger(catalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(catalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(catalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(catalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new catalogoProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton guardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField updateBodega;
    private javax.swing.JTextField updateCT;
    private javax.swing.JTextField updateID;
    private javax.swing.JTextField updateNombre;
    private javax.swing.JTextField updatePrecio;
    private javax.swing.JTextField updateTienda;
    // End of variables declaration//GEN-END:variables
}
