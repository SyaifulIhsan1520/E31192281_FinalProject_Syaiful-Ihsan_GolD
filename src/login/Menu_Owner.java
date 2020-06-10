package login;
import javax.swing.JFrame;
/**
 *
 * @author Ihsan
 */
public class Menu_Owner extends javax.swing.JFrame {
    public Menu_Owner() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<String>();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txttransaksi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txttransaksi1 = new javax.swing.JButton();
        txtstockbarang = new javax.swing.JButton();
        txtdatabarang = new javax.swing.JButton();
        txtdatatransaksi = new javax.swing.JButton();
        txtlogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("LOG OUT");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("TRANSAKSI");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("STOCK BARANG");

        txttransaksi.setText("DATA BARANG");
        txttransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttransaksiActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttransaksi1.setText("TRANSAKSI");
        txttransaksi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttransaksi1ActionPerformed(evt);
            }
        });
        jPanel1.add(txttransaksi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 250, 50));

        txtstockbarang.setText("STOCK BARANG");
        txtstockbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockbarangActionPerformed(evt);
            }
        });
        jPanel1.add(txtstockbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 250, 50));

        txtdatabarang.setText("INPUT DATA BARANG");
        txtdatabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatabarangActionPerformed(evt);
            }
        });
        jPanel1.add(txtdatabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 250, 50));

        txtdatatransaksi.setText("INPUT DATA TRANSAKSI");
        txtdatatransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatatransaksiActionPerformed(evt);
            }
        });
        jPanel1.add(txtdatatransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 250, 50));

        txtlogout.setText("LOGOUT");
        txtlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(txtlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/asek.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 768, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    private void txttransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttransaksiActionPerformed
    private void txttransaksi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttransaksi1ActionPerformed
    menu_transaksi lgf = new menu_transaksi();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_txttransaksi1ActionPerformed
    private void txtstockbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockbarangActionPerformed
      stock_barang lgf = new stock_barang();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_txtstockbarangActionPerformed

    private void txtdatabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatabarangActionPerformed
     input_barang lgf = new input_barang();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_txtdatabarangActionPerformed

    private void txtdatatransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatatransaksiActionPerformed
   input_transaksi lgf = new input_transaksi();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_txtdatatransaksiActionPerformed

    private void txtlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlogoutActionPerformed
      Login_Owner lgf = new Login_Owner();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_txtlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton txtdatabarang;
    private javax.swing.JButton txtdatatransaksi;
    private javax.swing.JButton txtlogout;
    private javax.swing.JButton txtstockbarang;
    private javax.swing.JButton txttransaksi;
    private javax.swing.JButton txttransaksi1;
    // End of variables declaration//GEN-END:variables
}