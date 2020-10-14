package Game_CoCaRo.GUI;

import java.awt.CardLayout;

public class LoginGUI extends javax.swing.JFrame {
    
    CardLayout cardLayout;
    public LoginGUI() {
        initComponents();
        setSize(420, 370);
        cardLayout = (CardLayout)(jP_Main.getLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Main = new javax.swing.JPanel();
        jP_Login = new javax.swing.JPanel();
        jLb_Mail = new javax.swing.JLabel();
        jTF_Mail = new javax.swing.JTextField();
        jLb_Password = new javax.swing.JLabel();
        jPF_ResetPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLb_btLogin = new javax.swing.JLabel();
        jP_ResetPassword = new javax.swing.JPanel();
        jLb_Mail1 = new javax.swing.JLabel();
        jTF_Mail1 = new javax.swing.JTextField();
        jLb_OldPassword = new javax.swing.JLabel();
        jPF_OldResetPass = new javax.swing.JPasswordField();
        jLb_newPassword = new javax.swing.JLabel();
        jPF_newPassword = new javax.swing.JPasswordField();
        jLb_RenewPassword = new javax.swing.JLabel();
        jPF_RenewPassword = new javax.swing.JPasswordField();
        jLb_btUpdatePass = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_Register = new javax.swing.JMenu();
        jM_Login = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cờ Caro");
        setPreferredSize(new java.awt.Dimension(400, 370));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 337));

        jP_Main.setLayout(new java.awt.CardLayout());

        jP_Login.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đăng nhập tài khoản", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jLb_Mail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Mail.setText("Mail:");

        jTF_Mail.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTF_Mail.setText("jTextField1");
        jTF_Mail.setPreferredSize(new java.awt.Dimension(170, 25));

        jLb_Password.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Password.setText("Mật khẩu:");

        jPF_ResetPass.setText("jPasswordField1");
        jPF_ResetPass.setPreferredSize(new java.awt.Dimension(170, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Quên mật khẩu?");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLb_btLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_login.png"))); // NOI18N

        javax.swing.GroupLayout jP_LoginLayout = new javax.swing.GroupLayout(jP_Login);
        jP_Login.setLayout(jP_LoginLayout);
        jP_LoginLayout.setHorizontalGroup(
            jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_LoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_btLogin)
                    .addComponent(jLabel1)
                    .addGroup(jP_LoginLayout.createSequentialGroup()
                        .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLb_Password)
                            .addComponent(jLb_Mail))
                        .addGap(18, 18, 18)
                        .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF_Mail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPF_ResetPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jP_LoginLayout.setVerticalGroup(
            jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_LoginLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTF_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_Mail))
                .addGap(30, 30, 30)
                .addGroup(jP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_Password)
                    .addComponent(jPF_ResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLb_btLogin)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jP_Main.add(jP_Login, "jP_Login");

        jP_ResetPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đặt lại mật khẩu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jLb_Mail1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Mail1.setText("Mail:");

        jTF_Mail1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTF_Mail1.setPreferredSize(new java.awt.Dimension(170, 25));
        jTF_Mail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_Mail1ActionPerformed(evt);
            }
        });

        jLb_OldPassword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_OldPassword.setText("Mật khẩu cũ:");

        jPF_OldResetPass.setPreferredSize(new java.awt.Dimension(170, 25));

        jLb_newPassword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_newPassword.setText("Mật khẩu mới:");

        jPF_newPassword.setPreferredSize(new java.awt.Dimension(170, 25));

        jLb_RenewPassword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_RenewPassword.setText("Nhập lại mật khẩu:");

        jPF_RenewPassword.setPreferredSize(new java.awt.Dimension(170, 25));

        jLb_btUpdatePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_updatenewpass.png"))); // NOI18N

        javax.swing.GroupLayout jP_ResetPasswordLayout = new javax.swing.GroupLayout(jP_ResetPassword);
        jP_ResetPassword.setLayout(jP_ResetPasswordLayout);
        jP_ResetPasswordLayout.setHorizontalGroup(
            jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_btUpdatePass)
                    .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                        .addComponent(jLb_RenewPassword)
                        .addGap(18, 18, 18)
                        .addComponent(jPF_RenewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                        .addComponent(jLb_newPassword)
                        .addGap(18, 18, 18)
                        .addComponent(jPF_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                        .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLb_OldPassword)
                            .addComponent(jLb_Mail1))
                        .addGap(18, 18, 18)
                        .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF_Mail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPF_OldResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_ResetPasswordLayout.setVerticalGroup(
            jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ResetPasswordLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTF_Mail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_Mail1))
                .addGap(20, 20, 20)
                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_OldPassword)
                    .addComponent(jPF_OldResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_newPassword)
                    .addComponent(jPF_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jP_ResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_RenewPassword)
                    .addComponent(jPF_RenewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLb_btUpdatePass)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jP_Main.add(jP_ResetPassword, "jP_ResetPassword");

        jMenuBar1.setPreferredSize(new java.awt.Dimension(400, 21));

        jM_Register.setText("Đăng ký");
        jM_Register.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jMenuBar1.add(jM_Register);

        jM_Login.setText("Đăng nhập");
        jM_Login.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jMenuBar1.add(jM_Login);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jP_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_Mail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_Mail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_Mail1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cardLayout.show(jP_Main, "jP_ResetPassword");
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLb_Mail;
    private javax.swing.JLabel jLb_Mail1;
    private javax.swing.JLabel jLb_OldPassword;
    private javax.swing.JLabel jLb_Password;
    private javax.swing.JLabel jLb_RenewPassword;
    private javax.swing.JLabel jLb_btLogin;
    private javax.swing.JLabel jLb_btUpdatePass;
    private javax.swing.JLabel jLb_newPassword;
    private javax.swing.JMenu jM_Login;
    private javax.swing.JMenu jM_Register;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPF_OldResetPass;
    private javax.swing.JPasswordField jPF_RenewPassword;
    private javax.swing.JPasswordField jPF_ResetPass;
    private javax.swing.JPasswordField jPF_newPassword;
    private javax.swing.JPanel jP_Login;
    private javax.swing.JPanel jP_Main;
    private javax.swing.JPanel jP_ResetPassword;
    private javax.swing.JTextField jTF_Mail;
    private javax.swing.JTextField jTF_Mail1;
    // End of variables declaration//GEN-END:variables
}
