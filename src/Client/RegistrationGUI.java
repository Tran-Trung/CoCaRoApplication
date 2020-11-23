package Client;

public class RegistrationGUI extends javax.swing.JFrame {

    public RegistrationGUI() {
        initComponents();
        //setSize(430, 455);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btG_Sex = new javax.swing.ButtonGroup();
        jP_Reigister = new javax.swing.JPanel();
        jLb_Username = new javax.swing.JLabel();
        jTF_Username = new javax.swing.JTextField();
        jLb_Mail = new javax.swing.JLabel();
        jTF_Mail = new javax.swing.JTextField();
        jLb_Sex = new javax.swing.JLabel();
        jRbt_Male = new javax.swing.JRadioButton();
        jRbt_Female = new javax.swing.JRadioButton();
        jLb_Birthday = new javax.swing.JLabel();
        jLb_Password = new javax.swing.JLabel();
        jPF_Password = new javax.swing.JPasswordField();
        jPF_RePassword = new javax.swing.JPasswordField();
        jLb_RePassword = new javax.swing.JLabel();
        jLb_btRegister = new javax.swing.JLabel();
        jLb_btReset = new javax.swing.JLabel();
        jMB_RegisLog = new javax.swing.JMenuBar();
        jM_Register = new javax.swing.JMenu();
        jM_Login = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cờ Caro");
        setResizable(false);
        setSize(new java.awt.Dimension(400, 421));

        jP_Reigister.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đăng ký tài khoản", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jLb_Username.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Username.setText("Họ và tên:");

        jTF_Username.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTF_Username.setPreferredSize(new java.awt.Dimension(170, 25));

        jLb_Mail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Mail.setText("Mail:");

        jTF_Mail.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTF_Mail.setPreferredSize(new java.awt.Dimension(170, 25));

        jLb_Sex.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Sex.setText("Giới Tính:");

        btG_Sex.add(jRbt_Male);
        jRbt_Male.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRbt_Male.setText("Nam");

        btG_Sex.add(jRbt_Female);
        jRbt_Female.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRbt_Female.setText("Nữ");

        jLb_Birthday.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Birthday.setText("Ngày sinh:");

        jLb_Password.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_Password.setText("Mật khẩu:");

        jPF_Password.setPreferredSize(new java.awt.Dimension(170, 25));

        jPF_RePassword.setPreferredSize(new java.awt.Dimension(170, 25));

        jLb_RePassword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLb_RePassword.setText("Nhập lại mật khẩu:");

        jLb_btRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_register.png"))); // NOI18N

        jLb_btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_reset.png"))); // NOI18N

        javax.swing.GroupLayout jP_ReigisterLayout = new javax.swing.GroupLayout(jP_Reigister);
        jP_Reigister.setLayout(jP_ReigisterLayout);
        jP_ReigisterLayout.setHorizontalGroup(
            jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_ReigisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLb_btRegister)
                .addGap(66, 66, 66)
                .addComponent(jLb_btReset)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_ReigisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_Username)
                    .addComponent(jLb_Sex)
                    .addComponent(jLb_Mail)
                    .addComponent(jLb_Birthday)
                    .addComponent(jLb_Password)
                    .addComponent(jLb_RePassword))
                .addGap(18, 18, 18)
                .addGroup(jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_ReigisterLayout.createSequentialGroup()
                        .addComponent(jRbt_Male)
                        .addGap(18, 18, 18)
                        .addComponent(jRbt_Female)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_ReigisterLayout.createSequentialGroup()
                        .addGroup(jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTF_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPF_Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTF_Mail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPF_RePassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))))
        );
        jP_ReigisterLayout.setVerticalGroup(
            jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ReigisterLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTF_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_Username))
                .addGap(18, 18, 18)
                .addGroup(jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTF_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_Mail))
                .addGap(18, 18, 18)
                .addGroup(jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Sex)
                    .addComponent(jRbt_Male)
                    .addComponent(jRbt_Female))
                .addGap(18, 18, 18)
                .addComponent(jLb_Birthday)
                .addGap(18, 18, 18)
                .addGroup(jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLb_Password)
                    .addComponent(jPF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPF_RePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_RePassword))
                .addGap(30, 30, 30)
                .addGroup(jP_ReigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLb_btRegister)
                    .addComponent(jLb_btReset))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jMB_RegisLog.setPreferredSize(new java.awt.Dimension(400, 21));

        jM_Register.setText("Đăng ký");
        jM_Register.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jMB_RegisLog.add(jM_Register);

        jM_Login.setText("Đăng nhập");
        jM_Login.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jMB_RegisLog.add(jM_Login);

        setJMenuBar(jMB_RegisLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_Reigister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jP_Reigister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btG_Sex;
    private javax.swing.JLabel jLb_Birthday;
    private javax.swing.JLabel jLb_Mail;
    private javax.swing.JLabel jLb_Password;
    private javax.swing.JLabel jLb_RePassword;
    private javax.swing.JLabel jLb_Sex;
    private javax.swing.JLabel jLb_Username;
    private javax.swing.JLabel jLb_btRegister;
    private javax.swing.JLabel jLb_btReset;
    private javax.swing.JMenuBar jMB_RegisLog;
    private javax.swing.JMenu jM_Login;
    private javax.swing.JMenu jM_Register;
    private javax.swing.JPasswordField jPF_Password;
    private javax.swing.JPasswordField jPF_RePassword;
    private javax.swing.JPanel jP_Reigister;
    private javax.swing.JRadioButton jRbt_Female;
    private javax.swing.JRadioButton jRbt_Male;
    private javax.swing.JTextField jTF_Mail;
    private javax.swing.JTextField jTF_Username;
    // End of variables declaration//GEN-END:variables
}
