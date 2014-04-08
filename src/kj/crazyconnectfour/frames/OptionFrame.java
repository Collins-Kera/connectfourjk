/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.frames;

import kj.crazyconnectfour.controls.OptionsMenuControl;

/**
 *
 * @author Jeanette
 */
public class OptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form OptionFrame
     */
    public OptionFrame() {
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

        oPanel1 = new javax.swing.JPanel();
        oPanel2 = new javax.swing.JPanel();
        oNameButton = new javax.swing.JButton();
        oExitButton = new javax.swing.JButton();
        oLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oPanel1.setBackground(new java.awt.Color(204, 255, 204));
        oPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oPanel2.setBackground(new java.awt.Color(204, 204, 255));
        oPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oNameButton.setFont(new java.awt.Font("HanziPen SC", 0, 18)); // NOI18N
        oNameButton.setText("Change Player Name");
        oNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oNameButtonActionPerformed(evt);
            }
        });

        oExitButton.setFont(new java.awt.Font("HanziPen SC", 0, 18)); // NOI18N
        oExitButton.setText("Exit Option Menu");
        oExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout oPanel2Layout = new javax.swing.GroupLayout(oPanel2);
        oPanel2.setLayout(oPanel2Layout);
        oPanel2Layout.setHorizontalGroup(
            oPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oNameButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        oPanel2Layout.setVerticalGroup(
            oPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(oNameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oExitButton)
                .addGap(12, 12, 12))
        );

        oLabel1.setFont(new java.awt.Font("HanziPen SC", 1, 36)); // NOI18N
        oLabel1.setForeground(new java.awt.Color(153, 153, 255));
        oLabel1.setText("Option Menu");

        javax.swing.GroupLayout oPanel1Layout = new javax.swing.GroupLayout(oPanel1);
        oPanel1.setLayout(oPanel1Layout);
        oPanel1Layout.setHorizontalGroup(
            oPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oPanel1Layout.createSequentialGroup()
                .addGroup(oPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(oPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(oPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(oLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        oPanel1Layout.setVerticalGroup(
            oPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oPanel1Layout.createSequentialGroup()
                .addComponent(oLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oNameButtonActionPerformed
        EnterPlayerNames name = new EnterPlayerNames();
        name.setVisible(true);
    }//GEN-LAST:event_oNameButtonActionPerformed

    private void oExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_oExitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton oExitButton;
    private javax.swing.JLabel oLabel1;
    private javax.swing.JButton oNameButton;
    private javax.swing.JPanel oPanel1;
    private javax.swing.JPanel oPanel2;
    // End of variables declaration//GEN-END:variables
}
