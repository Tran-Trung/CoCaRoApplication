package Game_CoCaRo.GUI;

import java.awt.CardLayout;

public class Register_LoginGUI extends javax.swing.JFrame {
    
    CardLayout cardLayout;
    public Register_LoginGUI() {
        initComponents();
        cardLayout = (CardLayout)(jP_MainRL.getLayout());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_MainRL = new javax.swing.JPanel();
        jP_Login = new javax.swing.JPanel();
        jLb_Mail1 = new javax.swing.JLabel();
        jTF_Mail1 = new javax.swing.JTextField();
        jLb_Pass1 = new javax.swing.JLabel();
        jPF_Pass1 = new javax.swing.JPasswordField();
        jLb_btLogin = new javax.swing.JLabel();
        jLb_MissPass = new javax.swing.JLabel();
        jP_Register = new javax.swing.JPanel();
        jLb_AccName = new javax.swing.JLabel();
        jLb_Re_Pass = new javax.swing.JLabel();
        jLb_Mail = new javax.swing.JLabel();
        jLb_Pass = new javax.swing.JLabel();
        jTF_AccName = new javax.swing.JTextField();
        jTF_Mail = new javax.swing.JTextField();
        jPF_Pass = new javax.swing.JPasswordField();
        jPF_RePass = new javax.swing.JPasswordField();
        jLb_btRegister = new javax.swing.JLabel();
        jLb_btReset = new javax.swing.JLabel();
        jP_ResetPassword = new javax.swing.JPanel();
        jTF_Mail2 = new javax.swing.JTextField();
        jLb_Mail2 = new javax.swing.JLabel();
        jLb_OldPass = new javax.swing.JLabel();
        jPF_OldPass = new javax.swing.JPasswordField();
        jPF_ReNewPass = new javax.swing.JPasswordField();
        jLb_Re_NewPass = new javax.swing.JLabel();
        jLb_NewPass = new javax.swing.JLabel();
        jPF_NewPass = new javax.swing.JPasswordField();
        jLb_btUpdateNewPass = new javax.swing.JLabel();
        jMB_RegisrLog = new javax.swing.JMenuBar();
        jM_Register = new javax.swing.JMenu();
        jM_Login = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tài khoản cờ Caro");
        setResizable(false);

        jP_MainRL.setBackground(new java.awt.Color(52, 73, 94));
        jP_MainRL.setLayout(new java.awt.CardLayout());

        jP_Login.setBackground(new java.awt.Color(52, 73, 94));
        jP_Login.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đăng nhập tài khoản", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jP_Login.setForeground(new java.awt.Color(255, 255, 255));

        jLb_Mail1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Mail1.setForeground(new java.awt.Color(255, 255, 255));
        jLb_Mail1.setText("Mail:");

        jTF_Mail1.setBackground(new java.awt.Color(108, 122, 137));
        jTF_Mail1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTF_Mail1.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Mail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_Mail1ActionPerformed(evt);
            }
        });

        jLb_Pass1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Pass1.setForeground(new java.awt.Color(255, 255, 255));
        jLb_Pass1.setText("Mật khẩu:");

        jPF_Pass1.setBackground(new java.awt.Color(108, 122, 137));
        jPF_Pass1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPF_Pass1.setForeground(new java.awt.Color(255, 255, 255));

        jLb_btLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_login.png"))); // NOI18N

        jLb_MissPass.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLb_MissPass.setForeground(new java.awt.Color(195, 57, 43));
        jLb_MissPass.setText("Quên mật khẩu?");
        jLb_MissPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLb_MissPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jP_LoginLayout = new javax.swing.GroupLayout(jP_Login);
        jP_Login.setLayout(jP_LoginLayout);
        jP_LoginLayout.setHorizontalGroup(
            jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_LoginLayout.createSequentialGroup()
                .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jP_LoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLb_MissPass))
                    .addGroup(jP_LoginLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLb_Mail1)
                            .addComponent(jLb_Pass1))
                        .addGap(18, 18, 18)
                        .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPF_Pass1)
                            .addComponent(jTF_Mail1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                    .addGroup(jP_LoginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLb_btLogin)))
                .addGap(90, 90, 90))
        );
        jP_LoginLayout.setVerticalGroup(
            jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_LoginLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTF_Mail1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_Mail1))
                .addGap(30, 30, 30)
                .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPF_Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_Pass1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLb_MissPass)
                .addGap(18, 18, 18)
                .addComponent(jLb_btLogin)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jP_MainRL.add(jP_Login, "jP_Login");

        jP_Register.setBackground(new java.awt.Color(52, 73, 94));
        jP_Register.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đăng ký tài khoản", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLb_AccName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_AccName.setForeground(new java.awt.Color(255, 255, 255));
        jLb_AccName.setText("Tên tài khoản:");

        jLb_Re_Pass.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Re_Pass.setForeground(new java.awt.Color(255, 255, 255));
        jLb_Re_Pass.setText("Nhập lại mật khẩu:");

        jLb_Mail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Mail.setForeground(new java.awt.Color(255, 255, 255));
        jLb_Mail.setText("Mail:");

        jLb_Pass.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Pass.setForeground(new java.awt.Color(255, 255, 255));
        jLb_Pass.setText("Mật khẩu:");

        jTF_AccName.setBackground(new java.awt.Color(108, 122, 137));
        jTF_AccName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTF_AccName.setForeground(new java.awt.Color(255, 255, 255));
        jTF_AccName.setPreferredSize(new java.awt.Dimension(6, 25));

        jTF_Mail.setBackground(new java.awt.Color(108, 122, 137));
        jTF_Mail.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTF_Mail.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_MailActionPerformed(evt);
            }
        });

        jPF_Pass.setBackground(new java.awt.Color(108, 122, 137));
        jPF_Pass.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPF_Pass.setForeground(new java.awt.Color(255, 255, 255));

        jPF_RePass.setBackground(new java.awt.Color(108, 122, 137));
        jPF_RePass.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPF_RePass.setForeground(new java.awt.Color(255, 255, 255));

        jLb_btRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_register.png"))); // NOI18N
        jLb_btRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLb_btRegisterMouseClicked(evt);
            }
        });

        jLb_btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_reset.png"))); // NOI18N

        javax.swing.GroupLayout jP_RegisterLayout = new javax.swing.GroupLayout(jP_Register);
        jP_Register.setLayout(jP_RegisterLayout);
        jP_RegisterLayout.setHorizontalGroup(
            jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_RegisterLayout.createSequentialGroup()
                .addGroup(jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_RegisterLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLb_btRegister)
                        .addGap(57, 57, 57)
                        .addComponent(jLb_btReset))
                    .addGroup(jP_RegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLb_Re_Pass)
                            .addComponent(jLb_Mail)
                            .addComponent(jLb_AccName)
                            .addComponent(jLb_Pass))
                        .addGap(18, 18, 18)
                        .addGroup(jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF_Mail, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jPF_Pass)
                            .addComponent(jPF_RePass)
                            .addComponent(jTF_AccName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jP_RegisterLayout.setVerticalGroup(
            jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_RegisterLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jP_RegisterLayout.createSequentialGroup()
                        .addGroup(jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTF_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jP_RegisterLayout.createSequentialGroup()
                                .addGroup(jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLb_AccName)
                                    .addComponent(jTF_AccName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jLb_Mail)))
                        .addGap(30, 30, 30)
                        .addComponent(jLb_Pass))
                    .addComponent(jPF_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_Re_Pass)
                    .addComponent(jPF_RePass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jP_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLb_btRegister)
                    .addComponent(jLb_btReset))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jP_MainRL.add(jP_Register, "jP_Register");

        jP_ResetPassword.setBackground(new java.awt.Color(52, 73, 94));
        jP_ResetPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đặt lại mật khẩu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jTF_Mail2.setBackground(new java.awt.Color(108, 122, 137));
        jTF_Mail2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTF_Mail2.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Mail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_Mail2ActionPerformed(evt);
            }
        });

        jLb_Mail2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Mail2.setForeground(new java.awt.Color(255, 255, 255));
        jLb_Mail2.setText("Mail:");

        jLb_OldPass.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_OldPass.setForeground(new java.awt.Color(255, 255, 255));
        jLb_OldPass.setText("Mật khẩu cũ:");

        jPF_OldPass.setBackground(new java.awt.Color(108, 122, 137));
        jPF_OldPass.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPF_OldPass.setForeground(new java.awt.Color(255, 255, 255));

        jPF_ReNewPass.setBackground(new java.awt.Color(108, 122, 137));
        jPF_ReNewPass.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPF_ReNewPass.setForeground(new java.awt.Color(255, 255, 255));

        jLb_Re_NewPass.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Re_NewPass.setForeground(new java.awt.Color(255, 255, 255));
        jLb_Re_NewPass.setText("Nhập lại mật khẩu:");

        jLb_NewPass.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_NewPass.setForeground(new java.awt.Color(255, 255, 255));
        jLb_NewPass.setText("Mật khẩu mới:");

        jPF_NewPass.setBackground(new java.awt.Color(108, 122, 137));
        jPF_NewPass.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPF_NewPass.setForeground(new java.awt.Color(255, 255, 255));

        jLb_btUpdateNewPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_updatenewpass.png"))); // NOI18N

        javax.swing.GroupLayout jP_ResetPasswordLayout = new javax.swing.GroupLayout(jP_ResetPassword);
        jP_ResetPassword.setLayout(jP_ResetPasswordLayout);
        jP_ResetPasswordLayout.setHorizontalGroup(
            jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_btUpdateNewPass)
                    .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                        .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLb_Mail2)
                                    .addComponent(jLb_OldPass)
                                    .addComponent(jLb_NewPass))
                                .addGap(18, 18, 18))
                            .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                                .addComponent(jLb_Re_NewPass)
                                .addGap(18, 18, 18)))
                        .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPF_NewPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_Mail2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPF_OldPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPF_ReNewPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jP_ResetPasswordLayout.setVerticalGroup(
            jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                        .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTF_Mail2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLb_Mail2))
                        .addGap(30, 30, 30)
                        .addComponent(jLb_OldPass))
                    .addComponent(jPF_OldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPF_NewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_NewPass))
                .addGap(30, 30, 30)
                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPF_ReNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_Re_NewPass))
                .addGap(30, 30, 30)
                .addComponent(jLb_btUpdateNewPass)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jP_MainRL.add(jP_ResetPassword, "jP_ResetPassword");

        jMB_RegisrLog.setBackground(new java.awt.Color(243, 156, 18));

        jM_Register.setForeground(new java.awt.Color(255, 255, 255));
        jM_Register.setText("Đăng ký");
        jM_Register.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jM_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jM_RegisterMouseClicked(evt);
            }
        });
        jMB_RegisrLog.add(jM_Register);

        jM_Login.setForeground(new java.awt.Color(255, 255, 255));
        jM_Login.setText("Đăng nhập");
        jM_Login.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jM_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jM_LoginMouseClicked(evt);
            }
        });
        jMB_RegisrLog.add(jM_Login);

        setJMenuBar(jMB_RegisrLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_MainRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_MainRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jM_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_RegisterMouseClicked
        cardLayout.show(jP_MainRL, "jP_Register");
    }//GEN-LAST:event_jM_RegisterMouseClicked

    private void jM_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_LoginMouseClicked
        cardLayout.show(jP_MainRL, "jP_Login");
    }//GEN-LAST:event_jM_LoginMouseClicked

    private void jTF_MailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_MailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_MailActionPerformed

    private void jLb_btRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_btRegisterMouseClicked
        cardLayout.show(jP_MainRL, "jP_Login");
    }//GEN-LAST:event_jLb_btRegisterMouseClicked

    private void jTF_Mail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_Mail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_Mail1ActionPerformed

    private void jLb_MissPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_MissPassMouseClicked
        cardLayout.show(jP_MainRL, "jP_ResetPassword");
    }//GEN-LAST:event_jLb_MissPassMouseClicked

    private void jTF_Mail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_Mail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_Mail2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLb_AccName;
    private javax.swing.JLabel jLb_Mail;
    private javax.swing.JLabel jLb_Mail1;
    private javax.swing.JLabel jLb_Mail2;
    private javax.swing.JLabel jLb_MissPass;
    private javax.swing.JLabel jLb_NewPass;
    private javax.swing.JLabel jLb_OldPass;
    private javax.swing.JLabel jLb_Pass;
    private javax.swing.JLabel jLb_Pass1;
    private javax.swing.JLabel jLb_Re_NewPass;
    private javax.swing.JLabel jLb_Re_Pass;
    private javax.swing.JLabel jLb_btLogin;
    private javax.swing.JLabel jLb_btRegister;
    private javax.swing.JLabel jLb_btReset;
    private javax.swing.JLabel jLb_btUpdateNewPass;
    private javax.swing.JMenuBar jMB_RegisrLog;
    private javax.swing.JMenu jM_Login;
    private javax.swing.JMenu jM_Register;
    private javax.swing.JPasswordField jPF_NewPass;
    private javax.swing.JPasswordField jPF_OldPass;
    private javax.swing.JPasswordField jPF_Pass;
    private javax.swing.JPasswordField jPF_Pass1;
    private javax.swing.JPasswordField jPF_ReNewPass;
    private javax.swing.JPasswordField jPF_RePass;
    private javax.swing.JPanel jP_Login;
    private javax.swing.JPanel jP_MainRL;
    private javax.swing.JPanel jP_Register;
    private javax.swing.JPanel jP_ResetPassword;
    private javax.swing.JTextField jTF_AccName;
    private javax.swing.JTextField jTF_Mail;
    private javax.swing.JTextField jTF_Mail1;
    private javax.swing.JTextField jTF_Mail2;
    // End of variables declaration//GEN-END:variables
}
