/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19630890;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author Windows 8.1
 */
public class fpelanggan extends javax.swing.JFrame {
 private String[] JudulKolom={"Nama User","Nama","Alamat","Telp"};
    private int[]LebarKolom ={132,150,100,100};
    private String SQL="SELECT * FROM pelanggan";
    /**
     * Creates new form framemember
     */
    public fpelanggan() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        new configdb().setJudulTabel(tabel_member, JudulKolom);
        new configdb().tampilTabel(tabel_member, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_member, LebarKolom);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        notelp = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_member = new javax.swing.JTable();
        bhapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA PELANGGAN");

        jLabel2.setText("Nama User");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("Telepon");

        user.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        nama.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        alamat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        notelp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        bsave.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Save-32.png")); // NOI18N
        bsave.setText("Save");
        bsave.setAlignmentY(0.0F);
        bsave.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bsave.setIconTextGap(0);
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bubah.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Text-Editor-32.png")); // NOI18N
        bubah.setText("Ubah");
        bubah.setAlignmentY(0.0F);
        bubah.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bubah.setIconTextGap(0);
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bbatal.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Cancel-32.png")); // NOI18N
        bbatal.setText("Batal");
        bbatal.setAlignmentY(0.0F);
        bbatal.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bbatal.setIconTextGap(0);
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        jLabel6.setText("Cari Data");

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        tabel_member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_memberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_member);

        bhapus.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Data-Delete-32.png")); // NOI18N
        bhapus.setText("Hapus");
        bhapus.setAlignmentY(0.0F);
        bhapus.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bhapus.setIconTextGap(0);
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        keluar.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Out-32.png")); // NOI18N
        keluar.setText("Keluar");
        keluar.setAlignmentY(0.0F);
        keluar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        keluar.setIconTextGap(0);
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44)
                        .addComponent(notelp, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bsave)
                        .addGap(6, 6, 6)
                        .addComponent(bubah)
                        .addGap(6, 6, 6)
                        .addComponent(bbatal)
                        .addGap(10, 10, 10)
                        .addComponent(bhapus)
                        .addGap(10, 10, 10)
                        .addComponent(keluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(55, 55, 55)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsave)
                    .addComponent(bubah)
                    .addComponent(bbatal)
                    .addComponent(bhapus)
                    .addComponent(keluar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
       String[] Fieldnya ={"nama_user","nama","alamat","telp"};
       String[] Valuenya = {user.getText(),nama.getText(),alamat.getText(),notelp.getText()};
       new configdb().Hapus("pelanggan","nama_user",user.getText());
       JOptionPane.showMessageDialog(null,"Data Berhasil di Ubah");
       new configdb().setJudulTabel(tabel_member, JudulKolom);
       new configdb().tampilTabel(tabel_member, JudulKolom, SQL);
       new configdb().setLebarKolomTabel(tabel_member, LebarKolom);
    }//GEN-LAST:event_bhapusActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
       String[] Fieldnya ={"nama_user","nama","alamat","telp"};
       String[] Valuenya = {user.getText(),nama.getText(),alamat.getText(),notelp.getText()};
        if ( new configdb().DuplikasiPrimeryKey("pelanggan","nama_user",user.getText()))
           {
              JOptionPane.showMessageDialog(null,"User Member Sudah Ada");
            }else{
                 new configdb().Simpan("pelanggan",Fieldnya, Valuenya);
                 JOptionPane.showMessageDialog(null,"Data Berhasil di Simpan");
                 new configdb().setJudulTabel(tabel_member, JudulKolom);
                 new configdb().tampilTabel(tabel_member, JudulKolom, SQL);
                 new configdb().setLebarKolomTabel(tabel_member, LebarKolom);
                } 
    }//GEN-LAST:event_bsaveActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // TODO add your handling code here:
       String[] Fieldnya ={"nama_user","nama","alamat","telp"};
       String[] Valuenya = {user.getText(),nama.getText(),alamat.getText(),notelp.getText()};
       new configdb().Ubah("pelanggan","nama_user",user.getText(),Fieldnya, Valuenya);
       JOptionPane.showMessageDialog(null,"Data Berhasil di Ubah");
       new configdb().setJudulTabel(tabel_member, JudulKolom);
       new configdb().tampilTabel(tabel_member, JudulKolom, SQL);
       new configdb().setLebarKolomTabel(tabel_member, LebarKolom);
    }//GEN-LAST:event_bubahActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        // TODO add your handling code here:
        user.setText("");
        nama.setText("");
        alamat.setText("");
        notelp.setText("");
        
    }//GEN-LAST:event_bbatalActionPerformed

    private void tabel_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_memberMouseClicked
        // TODO add your handling code here:
        int row = tabel_member.getSelectedRow();
         
        user.setText(tabel_member.getModel().getValueAt(row,0).toString());
        nama.setText(tabel_member.getModel().getValueAt(row,1).toString());
        alamat.setText(tabel_member.getModel().getValueAt(row,2).toString());
        notelp.setText(tabel_member.getModel().getValueAt(row,3).toString());
    }//GEN-LAST:event_tabel_memberMouseClicked

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        // TODO add your handling code here:
       String SQLCari ="SELECT * FROM pelanggan WHERE nama_user LIKE'%"+cari.getText()+"%' OR nama LIKE '%"+cari.getText()+"%'";
       new configdb().setJudulTabel(tabel_member, JudulKolom);
       new configdb().tampilTabel(tabel_member, JudulKolom, SQLCari);
       new configdb().setLebarKolomTabel(tabel_member, LebarKolom);
    }//GEN-LAST:event_cariKeyReleased

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(fpelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fpelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fpelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fpelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fpelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bubah;
    private javax.swing.JTextField cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField notelp;
    private javax.swing.JTable tabel_member;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}