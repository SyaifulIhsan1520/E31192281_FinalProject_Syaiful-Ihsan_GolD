package login;
import javax.swing.*;
import java.sql.*;;
/**
 *
 * @author Ihsan
 */
public class input_transaksi extends javax.swing.JFrame {
Connection conn = koneksi.getkoneksi();
    ResultSet rs = null;
    PreparedStatement pst = null;
    public input_transaksi() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        pemasukan = new javax.swing.JTextField();
        pengeluaran = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("TANGGAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 140, 40));

        jLabel2.setText("PEMASUKAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 160, 40));

        jLabel3.setText("PENGELUARAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 180, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INPUT TRANSAKSI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 230, 40));
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 220, 40));
        getContentPane().add(pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 220, 40));
        getContentPane().add(pengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 220, 40));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/asek.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 483));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   Menu_Owner rqf = new Menu_Owner();
                    rqf.setVisible(true);
                    rqf.pack();;
                    rqf.setLocationRelativeTo(null);
                    rqf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql = "insert into menu_owner values(?,?,?)";
        try {
            if (tanggal.getText().equals("") || pemasukan.getText().equals("") || pengeluaran.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Data Tidak Boleh Kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
                tanggal.setText("");
                pemasukan.setText("");
                pengeluaran.setText("");
            } else {
                pst = conn.prepareStatement(sql);
                pst.setString(1, tanggal.getText());
                pst.setString(2, pemasukan.getText());
                pst.setString(3, pengeluaran.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "berhasil");
                tanggal.setText("");
                pengeluaran.setText("");
                pemasukan.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal" + e);
            tanggal.setText("");
            pemasukan.setText("");
            pengeluaran.setText("");

        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tanggal.setText("");
        pemasukan.setText("");
        pengeluaran.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(input_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_transaksi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pemasukan;
    private javax.swing.JTextField pengeluaran;
    private javax.swing.JTextField tanggal;
    // End of variables declaration//GEN-END:variables
}