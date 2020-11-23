package Client;

public class WaitRoomGUI extends javax.swing.JFrame {

    public WaitRoomGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_InfoAccount = new javax.swing.JPanel();
        jLb_Name = new javax.swing.JLabel();
        jLb_Mail = new javax.swing.JLabel();
        jLb_Phone = new javax.swing.JLabel();
        jLb_Sex = new javax.swing.JLabel();
        jLb_Date = new javax.swing.JLabel();
        jP_Achievements = new javax.swing.JPanel();
        jLb_Date1 = new javax.swing.JLabel();
        jLb_Date2 = new javax.swing.JLabel();
        jLb_Date3 = new javax.swing.JLabel();
        jLb_Date4 = new javax.swing.JLabel();
        jLb_Date5 = new javax.swing.JLabel();
        jLb_txtPointAchievements = new javax.swing.JLabel();
        jLb_txtMatchWin = new javax.swing.JLabel();
        jLb_txtMatchLose = new javax.swing.JLabel();
        jLb_txtChainWin = new javax.swing.JLabel();
        jLb_txtChainLose = new javax.swing.JLabel();
        jLb_txtName = new javax.swing.JLabel();
        jLb_txtMail = new javax.swing.JLabel();
        jLb_txtPhone = new javax.swing.JLabel();
        jLb_txtSex = new javax.swing.JLabel();
        jLb_txtDate = new javax.swing.JLabel();
        jBt_Logout = new javax.swing.JButton();
        jP_ListRoom = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jP_ListPlayer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cờ Caro");
        setResizable(false);

        jP_InfoAccount.setBackground(new java.awt.Color(255, 255, 255));
        jP_InfoAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin tài khoản", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13))); // NOI18N
        jP_InfoAccount.setPreferredSize(new java.awt.Dimension(300, 439));

        jLb_Name.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Name.setText("Họ tên:");

        jLb_Mail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Mail.setText("Mail:");

        jLb_Phone.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Phone.setText("Số điện thoại:");

        jLb_Sex.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Sex.setText("Giới tính:");

        jLb_Date.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Date.setText("Ngày sinh:");

        jP_Achievements.setBackground(new java.awt.Color(255, 255, 255));
        jP_Achievements.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thành tích", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13))); // NOI18N
        jP_Achievements.setPreferredSize(new java.awt.Dimension(228, 220));

        jLb_Date1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Date1.setText("Trận thắng:");

        jLb_Date2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Date2.setText("Trận thua:");

        jLb_Date3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Date3.setText("Chuỗi trận thắng:");

        jLb_Date4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Date4.setText("Chuỗi trận thua:");

        jLb_Date5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLb_Date5.setText("Tổng điểm thành tích:");

        jLb_txtPointAchievements.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtPointAchievements.setText("0");

        jLb_txtMatchWin.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtMatchWin.setText("0");

        jLb_txtMatchLose.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtMatchLose.setText("0");

        jLb_txtChainWin.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtChainWin.setText("0");

        jLb_txtChainLose.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtChainLose.setText("0");

        javax.swing.GroupLayout jP_AchievementsLayout = new javax.swing.GroupLayout(jP_Achievements);
        jP_Achievements.setLayout(jP_AchievementsLayout);
        jP_AchievementsLayout.setHorizontalGroup(
            jP_AchievementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_AchievementsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_AchievementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_AchievementsLayout.createSequentialGroup()
                        .addComponent(jLb_Date1)
                        .addGap(18, 18, 18)
                        .addComponent(jLb_txtMatchWin))
                    .addGroup(jP_AchievementsLayout.createSequentialGroup()
                        .addComponent(jLb_Date2)
                        .addGap(18, 18, 18)
                        .addComponent(jLb_txtMatchLose))
                    .addGroup(jP_AchievementsLayout.createSequentialGroup()
                        .addComponent(jLb_Date3)
                        .addGap(18, 18, 18)
                        .addComponent(jLb_txtChainWin))
                    .addGroup(jP_AchievementsLayout.createSequentialGroup()
                        .addComponent(jLb_Date4)
                        .addGap(18, 18, 18)
                        .addComponent(jLb_txtChainLose))
                    .addGroup(jP_AchievementsLayout.createSequentialGroup()
                        .addComponent(jLb_Date5)
                        .addGap(18, 18, 18)
                        .addComponent(jLb_txtPointAchievements)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jP_AchievementsLayout.setVerticalGroup(
            jP_AchievementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_AchievementsLayout.createSequentialGroup()
                .addGroup(jP_AchievementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Date5)
                    .addComponent(jLb_txtPointAchievements))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_AchievementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Date1)
                    .addComponent(jLb_txtMatchWin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_AchievementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Date2)
                    .addComponent(jLb_txtMatchLose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_AchievementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Date3)
                    .addComponent(jLb_txtChainWin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_AchievementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Date4)
                    .addComponent(jLb_txtChainLose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLb_txtName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtName.setText("Trần Quốc Trung");

        jLb_txtMail.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtMail.setText("tranquoctrung20071999@gmail.com");

        jLb_txtPhone.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtPhone.setText("0963059318");

        jLb_txtSex.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtSex.setText("Nam");

        jLb_txtDate.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLb_txtDate.setText("20-07-1999");

        jBt_Logout.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jBt_Logout.setText("Đăng xuất");

        javax.swing.GroupLayout jP_InfoAccountLayout = new javax.swing.GroupLayout(jP_InfoAccount);
        jP_InfoAccount.setLayout(jP_InfoAccountLayout);
        jP_InfoAccountLayout.setHorizontalGroup(
            jP_InfoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Achievements, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jP_InfoAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_InfoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBt_Logout)
                    .addGroup(jP_InfoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jP_InfoAccountLayout.createSequentialGroup()
                            .addComponent(jLb_Name)
                            .addGap(18, 18, 18)
                            .addComponent(jLb_txtName))
                        .addGroup(jP_InfoAccountLayout.createSequentialGroup()
                            .addComponent(jLb_Mail)
                            .addGap(18, 18, 18)
                            .addComponent(jLb_txtMail))
                        .addGroup(jP_InfoAccountLayout.createSequentialGroup()
                            .addComponent(jLb_Phone)
                            .addGap(18, 18, 18)
                            .addComponent(jLb_txtPhone))
                        .addGroup(jP_InfoAccountLayout.createSequentialGroup()
                            .addComponent(jLb_Sex)
                            .addGap(18, 18, 18)
                            .addComponent(jLb_txtSex))
                        .addGroup(jP_InfoAccountLayout.createSequentialGroup()
                            .addComponent(jLb_Date)
                            .addGap(18, 18, 18)
                            .addComponent(jLb_txtDate)))))
        );
        jP_InfoAccountLayout.setVerticalGroup(
            jP_InfoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_InfoAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_InfoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Name)
                    .addComponent(jLb_txtName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_InfoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Mail)
                    .addComponent(jLb_txtMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_InfoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Phone)
                    .addComponent(jLb_txtPhone))
                .addGap(13, 13, 13)
                .addGroup(jP_InfoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Sex)
                    .addComponent(jLb_txtSex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_InfoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Date)
                    .addComponent(jLb_txtDate))
                .addGap(12, 12, 12)
                .addComponent(jBt_Logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jP_Achievements, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jP_ListRoom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách Phòng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13))); // NOI18N

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jP_ListRoomLayout = new javax.swing.GroupLayout(jP_ListRoom);
        jP_ListRoom.setLayout(jP_ListRoomLayout);
        jP_ListRoomLayout.setHorizontalGroup(
            jP_ListRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_ListRoomLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jP_ListRoomLayout.setVerticalGroup(
            jP_ListRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jP_ListPlayer.setBackground(new java.awt.Color(255, 255, 255));
        jP_ListPlayer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách người chơi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13))); // NOI18N

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jP_ListPlayerLayout = new javax.swing.GroupLayout(jP_ListPlayer);
        jP_ListPlayer.setLayout(jP_ListPlayerLayout);
        jP_ListPlayerLayout.setHorizontalGroup(
            jP_ListPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jP_ListPlayerLayout.setVerticalGroup(
            jP_ListPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jP_InfoAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_ListRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_ListPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jP_ListRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_ListPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jP_InfoAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaitRoomGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBt_Logout;
    private javax.swing.JLabel jLb_Date;
    private javax.swing.JLabel jLb_Date1;
    private javax.swing.JLabel jLb_Date2;
    private javax.swing.JLabel jLb_Date3;
    private javax.swing.JLabel jLb_Date4;
    private javax.swing.JLabel jLb_Date5;
    private javax.swing.JLabel jLb_Mail;
    private javax.swing.JLabel jLb_Name;
    private javax.swing.JLabel jLb_Phone;
    private javax.swing.JLabel jLb_Sex;
    private javax.swing.JLabel jLb_txtChainLose;
    private javax.swing.JLabel jLb_txtChainWin;
    private javax.swing.JLabel jLb_txtDate;
    private javax.swing.JLabel jLb_txtMail;
    private javax.swing.JLabel jLb_txtMatchLose;
    private javax.swing.JLabel jLb_txtMatchWin;
    private javax.swing.JLabel jLb_txtName;
    private javax.swing.JLabel jLb_txtPhone;
    private javax.swing.JLabel jLb_txtPointAchievements;
    private javax.swing.JLabel jLb_txtSex;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jP_Achievements;
    private javax.swing.JPanel jP_InfoAccount;
    private javax.swing.JPanel jP_ListPlayer;
    private javax.swing.JPanel jP_ListRoom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
