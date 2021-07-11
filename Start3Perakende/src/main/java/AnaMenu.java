/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author burak
 */
public class AnaMenu extends javax.swing.JFrame {

    /**
     * Creates new form AnaMenu
     */
    public AnaMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnRetail = new javax.swing.JButton();
        BtnReports = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        LblAnaMenu = new javax.swing.JLabel();
        BtnSettings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnRetail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnRetail.setText("PERAKENDE SATIŞ");
        BtnRetail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRetail.setName(""); // NOI18N
        BtnRetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetailActionPerformed(evt);
            }
        });

        BtnReports.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnReports.setText("RAPORLAR");
        BtnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReportsActionPerformed(evt);
            }
        });

        BtnExit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnExit.setText("ÇIKIŞ");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        LblAnaMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LblAnaMenu.setForeground(new java.awt.Color(0, 0, 153));
        LblAnaMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblAnaMenu.setText("ANA MENÜ");

        BtnSettings.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnSettings.setText("AYARLAR");
        BtnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnReports, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnRetail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblAnaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSettings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblAnaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BtnRetail)
                .addGap(18, 18, 18)
                .addComponent(BtnReports)
                .addGap(18, 18, 18)
                .addComponent(BtnSettings)
                .addGap(18, 18, 18)
                .addComponent(BtnExit)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetailActionPerformed
        Sales Sales = new Sales();
        Sales.setVisible(true);

    }//GEN-LAST:event_BtnRetailActionPerformed

    private void BtnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReportsActionPerformed

    }//GEN-LAST:event_BtnReportsActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSettingsActionPerformed
        Settings Settings = new Settings();
        Settings.setVisible(true);
    }//GEN-LAST:event_BtnSettingsActionPerformed

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
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnReports;
    private javax.swing.JButton BtnRetail;
    private javax.swing.JButton BtnSettings;
    private javax.swing.JLabel LblAnaMenu;
    // End of variables declaration//GEN-END:variables
}