
package Game_CoCaRo.GUI;

public class GameScreenGUI extends javax.swing.JFrame {

    public GameScreenGUI() {
        initComponents();
        setSize(700,625);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSP_Chessboard = new javax.swing.JScrollPane();
        jP_Chatbox = new javax.swing.JPanel();
        jTF_Writechat = new javax.swing.JTextField();
        jLb_btSend = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_Box = new javax.swing.JTextArea();
        jP_Timeturn = new javax.swing.JPanel();
        jLb_TimeTurn = new javax.swing.JLabel();
        jP_Option = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jP_Roomnumber = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jP_TimeMatch = new javax.swing.JPanel();
        jLb_TimeTurn1 = new javax.swing.JLabel();
        jP_Player1 = new javax.swing.JPanel();
        jRBt_Player1 = new javax.swing.JRadioButton();
        jLb_Result1 = new javax.swing.JLabel();
        jLb_iconX = new javax.swing.JLabel();
        jP_Player2 = new javax.swing.JPanel();
        jRBt_Player2 = new javax.swing.JRadioButton();
        jLb_Result2 = new javax.swing.JLabel();
        jLb_iconO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cờ Caro");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 600));

        jSP_Chessboard.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bàn cờ:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jSP_Chessboard.setPreferredSize(new java.awt.Dimension(400, 414));

        jP_Chatbox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trò chuyện:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jTF_Writechat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLb_btSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_Send.png"))); // NOI18N

        jTA_Box.setColumns(20);
        jTA_Box.setRows(5);
        jScrollPane1.setViewportView(jTA_Box);

        javax.swing.GroupLayout jP_ChatboxLayout = new javax.swing.GroupLayout(jP_Chatbox);
        jP_Chatbox.setLayout(jP_ChatboxLayout);
        jP_ChatboxLayout.setHorizontalGroup(
            jP_ChatboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_ChatboxLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jTF_Writechat, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLb_btSend)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jP_ChatboxLayout.setVerticalGroup(
            jP_ChatboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_ChatboxLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_ChatboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLb_btSend)
                    .addComponent(jTF_Writechat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jP_Timeturn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời gian đánh:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jP_Timeturn.setPreferredSize(new java.awt.Dimension(120, 58));
        jP_Timeturn.setRequestFocusEnabled(false);

        jLb_TimeTurn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLb_TimeTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_TimeTurn.setText("30");

        javax.swing.GroupLayout jP_TimeturnLayout = new javax.swing.GroupLayout(jP_Timeturn);
        jP_Timeturn.setLayout(jP_TimeturnLayout);
        jP_TimeturnLayout.setHorizontalGroup(
            jP_TimeturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLb_TimeTurn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        jP_TimeturnLayout.setVerticalGroup(
            jP_TimeturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_TimeturnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLb_TimeTurn)
                .addContainerGap())
        );

        jP_Option.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tùy chọn:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jP_Option.setPreferredSize(new java.awt.Dimension(270, 115));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_Matchstart.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_Redu.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_outMatch.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bt_newMatch.png"))); // NOI18N

        javax.swing.GroupLayout jP_OptionLayout = new javax.swing.GroupLayout(jP_Option);
        jP_Option.setLayout(jP_OptionLayout);
        jP_OptionLayout.setHorizontalGroup(
            jP_OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_OptionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jP_OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jP_OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );
        jP_OptionLayout.setVerticalGroup(
            jP_OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_OptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jP_OptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jP_Roomnumber.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số phòng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jP_Roomnumber.setPreferredSize(new java.awt.Dimension(680, 41));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("01");

        javax.swing.GroupLayout jP_RoomnumberLayout = new javax.swing.GroupLayout(jP_Roomnumber);
        jP_Roomnumber.setLayout(jP_RoomnumberLayout);
        jP_RoomnumberLayout.setHorizontalGroup(
            jP_RoomnumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jP_RoomnumberLayout.setVerticalGroup(
            jP_RoomnumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jP_TimeMatch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời gian trận đấu:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jP_TimeMatch.setPreferredSize(new java.awt.Dimension(120, 58));
        jP_TimeMatch.setRequestFocusEnabled(false);

        jLb_TimeTurn1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLb_TimeTurn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_TimeTurn1.setText("10:00");

        javax.swing.GroupLayout jP_TimeMatchLayout = new javax.swing.GroupLayout(jP_TimeMatch);
        jP_TimeMatch.setLayout(jP_TimeMatchLayout);
        jP_TimeMatchLayout.setHorizontalGroup(
            jP_TimeMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLb_TimeTurn1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        jP_TimeMatchLayout.setVerticalGroup(
            jP_TimeMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_TimeMatchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLb_TimeTurn1)
                .addContainerGap())
        );

        jP_Player1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Người chơi 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13))); // NOI18N
        jP_Player1.setPreferredSize(new java.awt.Dimension(170, 110));

        jRBt_Player1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRBt_Player1.setText("Trung Ngo");

        jLb_Result1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLb_Result1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_Result1.setText("0");

        jLb_iconX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/X.png"))); // NOI18N

        javax.swing.GroupLayout jP_Player1Layout = new javax.swing.GroupLayout(jP_Player1);
        jP_Player1.setLayout(jP_Player1Layout);
        jP_Player1Layout.setHorizontalGroup(
            jP_Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Player1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLb_iconX)
                .addContainerGap(67, Short.MAX_VALUE))
            .addComponent(jLb_Result1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRBt_Player1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jP_Player1Layout.setVerticalGroup(
            jP_Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Player1Layout.createSequentialGroup()
                .addComponent(jLb_iconX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(jRBt_Player1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLb_Result1)
                .addGap(5, 5, 5))
        );

        jP_Player2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Người chơi 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13))); // NOI18N
        jP_Player2.setPreferredSize(new java.awt.Dimension(170, 110));

        jRBt_Player2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRBt_Player2.setText("Tri Nguyen");

        jLb_Result2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLb_Result2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_Result2.setText("0");

        jLb_iconO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/O.png"))); // NOI18N

        javax.swing.GroupLayout jP_Player2Layout = new javax.swing.GroupLayout(jP_Player2);
        jP_Player2.setLayout(jP_Player2Layout);
        jP_Player2Layout.setHorizontalGroup(
            jP_Player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Player2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLb_iconO)
                .addContainerGap(67, Short.MAX_VALUE))
            .addComponent(jLb_Result2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRBt_Player2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jP_Player2Layout.setVerticalGroup(
            jP_Player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Player2Layout.createSequentialGroup()
                .addComponent(jLb_iconO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jRBt_Player2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLb_Result2)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_Roomnumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSP_Chessboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jP_Player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jP_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jP_Chatbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jP_Option, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jP_Timeturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jP_TimeMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jP_Roomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jP_Player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jP_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jP_Option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jP_Timeturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jP_TimeMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jP_Chatbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSP_Chessboard, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameScreenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLb_Result1;
    private javax.swing.JLabel jLb_Result2;
    private javax.swing.JLabel jLb_TimeTurn;
    private javax.swing.JLabel jLb_TimeTurn1;
    private javax.swing.JLabel jLb_btSend;
    private javax.swing.JLabel jLb_iconO;
    private javax.swing.JLabel jLb_iconX;
    private javax.swing.JPanel jP_Chatbox;
    private javax.swing.JPanel jP_Option;
    private javax.swing.JPanel jP_Player1;
    private javax.swing.JPanel jP_Player2;
    private javax.swing.JPanel jP_Roomnumber;
    private javax.swing.JPanel jP_TimeMatch;
    private javax.swing.JPanel jP_Timeturn;
    private javax.swing.JRadioButton jRBt_Player1;
    private javax.swing.JRadioButton jRBt_Player2;
    private javax.swing.JScrollPane jSP_Chessboard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTA_Box;
    private javax.swing.JTextField jTF_Writechat;
    // End of variables declaration//GEN-END:variables

}
