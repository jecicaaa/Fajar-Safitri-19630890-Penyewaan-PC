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
public class fkomputer extends javax.swing.JFrame {
    private String[] JudulKolom={"No Komputer","Nama Komputer"};
    private int[]LebarKolom ={340,300};
    private String SQL="SELECT * FROM komputer";
    String dateChooser;

    public fkomputer() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        new configdb().setJudulTabel(tabel_komputer, JudulKolom);
        new configdb().tampilTabel(tabel_komputer, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
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
        nokomp = new javax.swing.JTextField();
        namakomp = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        carikomp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_komputer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("KOMPUTER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("No Komputer");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama Komputer");

        nokomp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        namakomp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        bsave.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Save-32.png")); // NOI18N
        bsave.setText("Save");
        bsave.setAlignmentY(0.0F);
        bsave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bsave.setDisabledIcon(null);
        bsave.setDisabledSelectedIcon(null);
        bsave.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bsave.setIconTextGap(0);
        bsave.setMargin(new java.awt.Insets(2, 10, 2, 10));
        bsave.setMaximumSize(new java.awt.Dimension(80, 40));
        bsave.setMinimumSize(new java.awt.Dimension(80, 40));
        bsave.setOpaque(false);
        bsave.setPreferredSize(new java.awt.Dimension(81, 40));
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bubah.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Text-Editor-32.png")); // NOI18N
        bubah.setText("Ubah");
        bubah.setAlignmentY(0.0F);
        bubah.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bubah.setDisabledIcon(null);
        bubah.setDisabledSelectedIcon(null);
        bubah.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bubah.setIconTextGap(0);
        bubah.setMargin(new java.awt.Insets(2, 10, 2, 10));
        bubah.setMaximumSize(null);
        bubah.setOpaque(false);
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bhapus.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Data-Delete-32.png")); // NOI18N
        bhapus.setText("Hapus");
        bhapus.setAlignmentY(0.0F);
        bhapus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bhapus.setDisabledIcon(null);
        bhapus.setDisabledSelectedIcon(null);
        bhapus.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bhapus.setIconTextGap(0);
        bhapus.setMargin(new java.awt.Insets(2, 10, 2, 10));
        bhapus.setMaximumSize(null);
        bhapus.setOpaque(false);
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bbatal.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Cancel-32.png")); // NOI18N
        bbatal.setText("Batal");
        bbatal.setAlignmentY(0.0F);
        bbatal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bbatal.setDisabledIcon(null);
        bbatal.setDisabledSelectedIcon(null);
        bbatal.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bbatal.setIconTextGap(0);
        bbatal.setMargin(new java.awt.Insets(2, 10, 2, 10));
        bbatal.setMaximumSize(null);
        bbatal.setOpaque(false);
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        keluar.setIcon(new javax.swing.ImageIcon("A:\\Kuliah\\PROJECT\\Sewa Pc\\Out-32.png")); // NOI18N
        keluar.setText("Keluar");
        keluar.setAlignmentY(0.0F);
        keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        keluar.setDisabledIcon(null);
        keluar.setDisabledSelectedIcon(null);
        keluar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        keluar.setIconTextGap(0);
        keluar.setMargin(new java.awt.Insets(2, 10, 2, 10));
        keluar.setMaximumSize(null);
        keluar.setOpaque(false);
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        jLabel4.setText("Cari Data");

        carikomp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carikompKeyReleased(evt);
            }
        });

        tabel_komputer.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_komputer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_komputerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_komputer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(carikomp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(57, 57, 57)
                        .addComponent(nokomp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addComponent(namakomp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nokomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(namakomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(bsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(carikomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bsave.getAccessibleContext().setAccessibleName("");
        bubah.getAccessibleContext().setAccessibleName("");
        bhapus.getAccessibleContext().setAccessibleName("");
        bbatal.getAccessibleContext().setAccessibleName("");
        keluar.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // TODO add your handling code here:
        String[] Fieldnya ={"no_komputer","nama_komputer"};
        String[] Valuenya = {nokomp.getText(),namakomp.getText()};
        new configdb().Ubah("komputer","no_komputer",nokomp.getText(), Fieldnya, Valuenya);
        JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        new configdb().setJudulTabel(tabel_komputer, JudulKolom);
        new configdb().tampilTabel(tabel_komputer, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
                                        
                
    }//GEN-LAST:event_bubahActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String[] Fieldnya ={"no_komputer","nama_komputer"};
        String[] Valuenya = {nokomp.getText(),namakomp.getText()};
        
        if ( new configdb().DuplikasiPrimeryKey("komputer","no_komputer",nokomp.getText()))
            {
              JOptionPane.showMessageDialog(null,"No Komputer Sudah Ada");
        }else{
                 new configdb().Simpan("komputer",Fieldnya, Valuenya);
                 JOptionPane.showMessageDialog(null,"Data Berhasil di Simpan");
                 new configdb().setJudulTabel(tabel_komputer, JudulKolom);
                 new configdb().tampilTabel(tabel_komputer, JudulKolom, SQL);
                 new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
                }
    }//GEN-LAST:event_bsaveActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        String[] Fieldnya ={"no_komputer","nama_komputer"};
        String[] Valuenya = {nokomp.getText(),namakomp.getText()};
        new configdb().Hapus("komputer","no_komputer",nokomp.getText());
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        new configdb().setJudulTabel(tabel_komputer, JudulKolom);
        new configdb().tampilTabel(tabel_komputer, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        // TODO add your handling code here:
        nokomp.setText("");
        namakomp.setText("");
    }//GEN-LAST:event_bbatalActionPerformed

    private void tabel_komputerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_komputerMouseClicked
        // TODO add your handling code here:
        int row = tabel_komputer.getSelectedRow();
         
        nokomp.setText(tabel_komputer.getModel().getValueAt(row,0).toString());
        namakomp.setText(tabel_komputer.getModel().getValueAt(row,1).toString());
    }//GEN-LAST:event_tabel_komputerMouseClicked

    private void carikompKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carikompKeyReleased
        // TODO add your handling code here:
       String SQLCari ="SELECT*FROM komputer WHERE no_komputer LIKE'%"+carikomp.getText()+"%' OR nama_komputer LIKE '%"+carikomp.getText()+"%'";
       new configdb().setJudulTabel(tabel_komputer, JudulKolom);
       new configdb().tampilTabel(tabel_komputer, JudulKolom, SQLCari);
       new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
    }//GEN-LAST:event_carikompKeyReleased

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
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
            java.util.logging.Logger.getLogger(fkomputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fkomputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fkomputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fkomputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fkomputer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bubah;
    private javax.swing.JTextField carikomp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField namakomp;
    private javax.swing.JTextField nokomp;
    private javax.swing.JTable tabel_komputer;
    // End of variables declaration//GEN-END:variables
}
