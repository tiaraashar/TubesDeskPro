/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubesdesktop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ASUS
 */
public class KelolaAkun extends javax.swing.JFrame {
    private boolean databaru;
    private final KoneksiDatabase koneksi = new KoneksiDatabase();
    /**
     * Creates new form KelolaAkun
     */
     public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");
 
        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }
      public static String toHexString(byte[] hash)
    {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);
 
        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));
 
        // Pad with leading zeros
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
 
        return hexString.toString();
    }
    public KelolaAkun() {
        initComponents();
        getData();
        databaru = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namaakun = new javax.swing.JLabel();
        txtnamaakun = new javax.swing.JTextField();
        website = new javax.swing.JLabel();
        txtwebsite = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        keterangan = new javax.swing.JLabel();
        txtketerangan = new javax.swing.JTextField();
        lblKelolaakun = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        daftarakun = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelakun = new javax.swing.JTable();
        btnexit = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setName("Kelola Akun"); // NOI18N

        namaakun.setText("Nama Akun");

        website.setText("Website / URL");

        txtwebsite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwebsiteActionPerformed(evt);
            }
        });

        username.setText("Username");

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        password.setText("Password");

        keterangan.setText("Keterangan / Deskripsi");

        txtketerangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtketeranganActionPerformed(evt);
            }
        });

        lblKelolaakun.setText("Kelola Akun");

        btndelete.setBackground(new java.awt.Color(204, 204, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(204, 204, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(204, 204, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        daftarakun.setText("Daftar Akun");

        tabelakun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Akun", "Website/URL", "Username", "Password", "Deskripsi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelakun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelakun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelakunMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelakun);

        btnexit.setBackground(new java.awt.Color(204, 204, 255));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnnew.setBackground(new java.awt.Color(204, 204, 255));
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKelolaakun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtketerangan)
                    .addComponent(keterangan)
                    .addComponent(daftarakun)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username)
                            .addComponent(namaakun)
                            .addComponent(txtnamaakun, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(txtusername))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(website)
                            .addComponent(txtwebsite)
                            .addComponent(password)
                            .addComponent(jPasswordField1))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(btnnew, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblKelolaakun, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaakun)
                    .addComponent(website))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamaakun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtwebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(password))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(keterangan)
                .addGap(18, 18, 18)
                .addComponent(txtketerangan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(daftarakun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtwebsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwebsiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwebsiteActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtketeranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtketeranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtketeranganActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
      try
        {
            String s1 = jPasswordField1.getText();
            jPasswordField1.setText("\n" + s1 + " : " + toHexString(getSHA(s1)));
 
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
        if(databaru) {
            
            try {
                String sql = "INSERT INTO desktop VALUES('%s', '%s', '%s', '%s', '%s')";
                
                sql = String.format(
                        sql,
                        txtnamaakun.getText(),
                        txtwebsite.getText(),
                        txtusername.getText(),
                        jPasswordField1.getText(),
                        txtketerangan.getText()
                );
                
                Connection conn = koneksi.getKoneksiDatabase();
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Disimpan" + ex);
            }
            
        } 
        
        getData();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tabelakunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelakunMouseClicked
        try {
            databaru = false;
            
            int row = tabelakun.getSelectedRow();
            
            String name = tabelakun.getModel().getValueAt(row, 0).toString();
            
            Connection conn = koneksi.getKoneksiDatabase();
            Statement stm = conn.createStatement();
            ResultSet sql = stm.executeQuery("SELECT * FROM desktop WHERE name='" + name + "'");
            
            if(sql.next()){
                txtnamaakun.setText(sql.getString("name"));
                txtwebsite.setText(sql.getString("website"));
                txtusername.setText(sql.getString("username"));
                jPasswordField1.setText(sql.getString("password"));
                txtketerangan.setText(sql.getString("keterangan"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelolaAkun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tabelakunMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            String name = txtnamaakun.getText();
            String website = txtwebsite.getText();
            String username = txtusername.getText();
            String password = jPasswordField1.getText();
            String keterangan = txtketerangan.getText();
            
            Connection conn = koneksi.getKoneksiDatabase();
            PreparedStatement pst = conn.prepareStatement("DELETE FROM desktop where name=?");
            
            pst.setString(1, name);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            btnnewActionPerformed(null);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal dihapus" + ex);
        }
        getData();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        databaru = true;
        
        txtnamaakun.setText("");
        txtwebsite.setText("");
        txtusername.setText("");
        jPasswordField1.setText("");
        txtketerangan.setText("");
        
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String sql = "UPDATE desktop set website=?, username=?, password=?, keterangan=? where name='"+txtnamaakun.getText()+"'";
            Connection conn = koneksi.getKoneksiDatabase();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, txtwebsite.getText());
            ps.setString(2, txtusername.getText());
            ps.setString(3, jPasswordField1.getText());
            ps.setString(4, txtketerangan.getText());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil diedit");
            txtwebsite.requestFocus();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal diedit" + ex);
            
        }
        getData();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    
    private void getData(){
        try {
        Connection conn = koneksi.getKoneksiDatabase();
        Statement stm = conn.createStatement();
        ResultSet result = stm.executeQuery("select * from desktop");
        
        DefaultTableModel model = (DefaultTableModel) tabelakun.getModel(); 
        
        // reset data tabel
        model.setRowCount(0);
        
        while(result.next()){
            String nama = result.getString("name");
            String website = result.getString("website");
            String username = result.getString("username");
            String password = result.getString("password");
            String keterangan = result.getString("keterangan");
            
            model.addRow(new Object[]{nama, website, username, password, keterangan});
        }
        } catch (SQLException ex){
            Logger.getLogger(KelolaAkun.class.getName()).log(Level.SEVERE, null, ex);
        }
}
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
            java.util.logging.Logger.getLogger(KelolaAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel daftarakun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keterangan;
    private javax.swing.JLabel lblKelolaakun;
    private javax.swing.JLabel namaakun;
    private javax.swing.JLabel password;
    private javax.swing.JTable tabelakun;
    private javax.swing.JTextField txtketerangan;
    private javax.swing.JTextField txtnamaakun;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtwebsite;
    private javax.swing.JLabel username;
    private javax.swing.JLabel website;
    // End of variables declaration//GEN-END:variables
}
