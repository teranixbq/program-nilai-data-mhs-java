/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassemester2;
import javax.swing.JOptionPane;
/**
 *
 * @author TeranixBQ
 */
public class MasukMhs extends javax.swing.JFrame {
    ClassMhs mhs = new ClassMhs();
    /**
     * Creates new form MasukMhs
     */
    String nama;
    String nim2;
    public MasukMhs() {
        initComponents();
       
    }
    
    void nonaktif(){
    tmasuk.setEnabled(false);
    }
    
    void aktif(){
    tmasuk.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tmasuk = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        tketentuan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/NicePng_individual-icon-png_3729331 (3).png"))); // NOI18N
        jLabel1.setText("  Nama   :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 67, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mbrilogin_99599 (1).png"))); // NOI18N
        jLabel2.setText(" Nim    :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, -1));

        tnama.setToolTipText("Nama");
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });
        jPanel2.add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, -1));

        tnim.setToolTipText("Nim");
        tnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnimActionPerformed(evt);
            }
        });
        tnim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnimKeyTyped(evt);
            }
        });
        jPanel2.add(tnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/20210615_152733 (2).png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 60, 40));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setText("PROGRAM ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("NUSA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 40, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("MANDIRI");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 60, 17));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 341, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel7.setText("NILAI SEMESTER MHS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        tmasuk.setBackground(new java.awt.Color(153, 153, 255));
        tmasuk.setText("Masuk");
        tmasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmasukActionPerformed(evt);
            }
        });
        jPanel2.add(tmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, -1));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel11.setText("UNIVERSITAS");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/rm222-mind-20 (5).jpg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 440));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(236,184,252));
        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1486506264-hamburger-list-menu-options-bars-stack_81469 (2).png"))); // NOI18N

        tketentuan.setText("Ketentuan");
        tketentuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tketentuanMouseClicked(evt);
            }
        });
        tketentuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tketentuanActionPerformed(evt);
            }
        });
        jMenu1.add(tketentuan);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(385, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tketentuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tketentuanActionPerformed
    JOptionPane.showMessageDialog(null, "Nilai Akhir diambil dari perhitungan 4 komponen :\nUTS       : 25%\nUAS       : 30%\nTUGAS     : 25%\nKEHADIRAN : 20%", "Ketentuan", JOptionPane.PLAIN_MESSAGE);
    
    
    }//GEN-LAST:event_tketentuanActionPerformed

    private void tketentuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tketentuanMouseClicked

      
    }//GEN-LAST:event_tketentuanMouseClicked

    private void tmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmasukActionPerformed
        if (tnama.getText().equals("")||tnim.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data Nama atau Nim harus di isi","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }      
        else{
            nama = tnama.getText();
            nim2 = tnim.getText();
            FormMhs form = new FormMhs(nama,nim2);
            form.setVisible(true);
            this.dispose();
        }  
    }//GEN-LAST:event_tmasukActionPerformed

    private void tnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnimActionPerformed

    }//GEN-LAST:event_tnimActionPerformed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void tnimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnimKeyTyped
    mhs.angka(evt);
    }//GEN-LAST:event_tnimKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MasukMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasukMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasukMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasukMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MasukMhs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem tketentuan;
    private javax.swing.JButton tmasuk;
    public static final javax.swing.JTextField tnama = new javax.swing.JTextField();
    public static final javax.swing.JTextField tnim = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
