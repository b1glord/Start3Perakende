/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author burak
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        BtnVazgeç = new javax.swing.JButton();
        LblKasiyer = new javax.swing.JLabel();
        CbKasiyerNo = new javax.swing.JComboBox<>();
        BtnTemizle = new javax.swing.JButton();
        ShowPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        LblUsername = new javax.swing.JLabel();
        LblPassword = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        BtnTamam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnVazgeç.setBackground(new java.awt.Color(204, 0, 0));
        BtnVazgeç.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BtnVazgeç.setForeground(new java.awt.Color(255, 255, 255));
        BtnVazgeç.setText("Vazgeç");
        BtnVazgeç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVazgeçActionPerformed(evt);
            }
        });

        LblKasiyer.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LblKasiyer.setForeground(new java.awt.Color(0, 0, 153));
        LblKasiyer.setText("Kasiyer");

        CbKasiyerNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02" }));

        BtnTemizle.setBackground(new java.awt.Color(255, 255, 0));
        BtnTemizle.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BtnTemizle.setForeground(new java.awt.Color(255, 255, 255));
        BtnTemizle.setText("Temizle");
        BtnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTemizleActionPerformed(evt);
            }
        });

        ShowPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\burak\\Desktop\\Program\\shoppingcard.png")); // NOI18N
        jLabel1.setText("SET B2B");

        LblUsername.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LblUsername.setForeground(new java.awt.Color(0, 0, 153));
        LblUsername.setText("Kullanıcı");

        LblPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LblPassword.setForeground(new java.awt.Color(0, 0, 153));
        LblPassword.setText("Şifre");

        Username.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        Password.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        BtnTamam.setBackground(new java.awt.Color(0, 0, 153));
        BtnTamam.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BtnTamam.setForeground(new java.awt.Color(255, 255, 255));
        BtnTamam.setText("Tamam");
        BtnTamam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTamamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnVazgeç, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LblKasiyer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password)
                            .addComponent(Username)
                            .addComponent(CbKasiyerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtnTamam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnTemizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblKasiyer)
                    .addComponent(CbKasiyerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUsername)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPassword)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ShowPassword)
                .addGap(18, 18, 18)
                .addComponent(BtnTamam)
                .addGap(18, 18, 18)
                .addComponent(BtnTemizle)
                .addGap(18, 18, 18)
                .addComponent(BtnVazgeç)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void BtnVazgeçActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.exit(0);
    }                                         

    private void BtnTemizleActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Username.setText("");
        Password.setText("");
    }                                          

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (ShowPassword.isSelected()) {
            Password.setEchoChar((char) 0);
        } else {
            Password.setEchoChar('*');
        }
    }                                            

    private void BtnTamamActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //set enter BtnTamam
        getRootPane().setDefaultButton(BtnTamam);
        //
        // start code
        SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(User.class)
        .buildSessionFactory();

        //Unit of Work
        Session session = factory.getCurrentSession();

        session.beginTransaction();
        Select * from
        L_CAPIUSER;
        session.getTransaction().commit();
        System.out.println("Giriş Başarılı");
        factory.close();

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BtnTamam;
    private javax.swing.JButton BtnTemizle;
    private javax.swing.JButton BtnVazgeç;
    private javax.swing.JComboBox<String> CbKasiyerNo;
    private javax.swing.JLabel LblKasiyer;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblUsername;
    private javax.swing.JPasswordField Password;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
