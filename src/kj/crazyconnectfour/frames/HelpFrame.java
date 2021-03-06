/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.frames;

import kj.crazyconnectfour.menu.views.HelpMenuView;

/**
 *
 * @author Jeanette
 */
public class HelpFrame extends javax.swing.JFrame {

    /**
     * Creates new form HelpFrame
     */
    public HelpFrame() {
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

        hPanel1 = new javax.swing.JPanel();
        hPanel2 = new javax.swing.JPanel();
        hCrazyButton = new javax.swing.JButton();
        hBoardButton = new javax.swing.JButton();
        hComputerButton = new javax.swing.JButton();
        hRegularButton = new javax.swing.JButton();
        hTokenButton = new javax.swing.JButton();
        hTLocationButton = new javax.swing.JButton();
        hExitButton = new javax.swing.JButton();
        helpLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hPanel1.setBackground(new java.awt.Color(204, 255, 204));
        hPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hPanel2.setBackground(new java.awt.Color(204, 204, 255));
        hPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hCrazyButton.setFont(new java.awt.Font("HanziPen SC", 0, 18)); // NOI18N
        hCrazyButton.setText("Game");
        hCrazyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hCrazyButtonActionPerformed(evt);
            }
        });

        hBoardButton.setFont(new java.awt.Font("HanziPen SC", 0, 18)); // NOI18N
        hBoardButton.setText("Board");
        hBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hBoardButtonActionPerformed(evt);
            }
        });

        hComputerButton.setFont(new java.awt.Font("HanziPen SC", 0, 18)); // NOI18N
        hComputerButton.setText("Computer Player");
        hComputerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hComputerButtonActionPerformed(evt);
            }
        });

        hRegularButton.setFont(new java.awt.Font("HanziPen SC", 0, 18)); // NOI18N
        hRegularButton.setText("Regular Player");
        hRegularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hRegularButtonActionPerformed(evt);
            }
        });

        hTokenButton.setFont(new java.awt.Font("HanziPen SC", 0, 18)); // NOI18N
        hTokenButton.setText("Token");
        hTokenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hTokenButtonActionPerformed(evt);
            }
        });

        hTLocationButton.setFont(new java.awt.Font("HanziPen SC", 0, 18)); // NOI18N
        hTLocationButton.setText("Token Location");
        hTLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hTLocationButtonActionPerformed(evt);
            }
        });

        hExitButton.setFont(new java.awt.Font("HanziPen SC", 0, 18)); // NOI18N
        hExitButton.setText("Exit Help Menu");
        hExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hPanel2Layout = new javax.swing.GroupLayout(hPanel2);
        hPanel2.setLayout(hPanel2Layout);
        hPanel2Layout.setHorizontalGroup(
            hPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(hComputerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hBoardButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hCrazyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hRegularButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hTokenButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hTLocationButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hExitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hPanel2Layout.setVerticalGroup(
            hPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(hCrazyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hBoardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hComputerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hRegularButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hTokenButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hTLocationButton)
                .addGap(30, 30, 30)
                .addComponent(hExitButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        helpLabel.setFont(new java.awt.Font("HanziPen SC", 1, 36)); // NOI18N
        helpLabel.setForeground(new java.awt.Color(153, 153, 255));
        helpLabel.setText("Help Menu");

        hTextArea.setColumns(20);
        hTextArea.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        hTextArea.setLineWrap(true);
        hTextArea.setRows(5);
        hTextArea.setText("Welcome to the Help Menu! To learn more about a part of the game, click on the desired button for an explanation. ");
        hTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(hTextArea);

        javax.swing.GroupLayout hPanel1Layout = new javax.swing.GroupLayout(hPanel1);
        hPanel1.setLayout(hPanel1Layout);
        hPanel1Layout.setHorizontalGroup(
            hPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(hPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(hPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(helpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        hPanel1Layout.setVerticalGroup(
            hPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(hPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hPanel1Layout.createSequentialGroup()
                        .addComponent(helpLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_hExitButtonActionPerformed

    private void hCrazyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hCrazyButtonActionPerformed
        hTextArea.setText("");
        hTextArea.append("The objective of the game is to be the first player to reach 5 points. "
                + "To get a point the player has to connect four tokens vertically or horizontally. "
                + "Each player takes turns placing their token in one of the locations in the "
                + "grid. The first player to get \"four-in-a-row\" is the winner of the round. "
                + "If no one connects four in a round, then the score board shows a tie and "
                + "then another round begins.");
        
    }//GEN-LAST:event_hCrazyButtonActionPerformed

    private void hBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hBoardButtonActionPerformed
        hTextArea.setText("");
        hTextArea.append("The game board for Crazy Connect Four consists of a 6x6 grid. "
                + "Players choose which column they want to play their "
                + "token in. The token will go into the next empty slot. Each column "
                + "only holds 6 tokens.");
    }//GEN-LAST:event_hBoardButtonActionPerformed

    private void hComputerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hComputerButtonActionPerformed
        hTextArea.setText("");
        hTextArea.append("A computer based player takes its turn after the real player "
                + "has played their token on the board.");

    }//GEN-LAST:event_hComputerButtonActionPerformed

    private void hRegularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hRegularButtonActionPerformed
        hTextArea.setText("");
        hTextArea.append("A real player manually takes their turn by placing their token "
                + "in an unused location in the grid board.");

    }//GEN-LAST:event_hRegularButtonActionPerformed

    private void hTokenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hTokenButtonActionPerformed
        hTextArea.setText("");
        hTextArea.append("The human player can pick their color of token in the options menu. "
                + "The tokens are displayed as the first letter of the color. "
                + "The computer is letter 'C'.");

    }//GEN-LAST:event_hTokenButtonActionPerformed

    private void hTLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hTLocationButtonActionPerformed
        hTextArea.setText("");
        hTextArea.append("A location on the grid where the player or computer places their token.");

    }//GEN-LAST:event_hTLocationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hBoardButton;
    private javax.swing.JButton hComputerButton;
    private javax.swing.JButton hCrazyButton;
    private javax.swing.JButton hExitButton;
    private javax.swing.JPanel hPanel1;
    private javax.swing.JPanel hPanel2;
    private javax.swing.JButton hRegularButton;
    private javax.swing.JButton hTLocationButton;
    private javax.swing.JTextArea hTextArea;
    private javax.swing.JButton hTokenButton;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
