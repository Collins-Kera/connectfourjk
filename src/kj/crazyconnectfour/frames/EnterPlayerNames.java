/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.frames;

/**
 *
 * @author Jeanette
 */
public class EnterPlayerNames extends javax.swing.JFrame {

    /**
     * Creates new form EnterPlayerNames
     */
    public EnterPlayerNames() {
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

        j = new javax.swing.JLabel();
        jpPlayerNames = new javax.swing.JPanel();
        jpPlayerTitle = new javax.swing.JPanel();
        jlPlayerTitle = new javax.swing.JLabel();
        jpPlayerForm = new javax.swing.JPanel();
        jtPlayerText = new javax.swing.JTextField();
        playerNameInput = new javax.swing.JTextField();
        playerContinueButton = new javax.swing.JButton();

        j.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enter Player Names");
        setAlwaysOnTop(true);

        jpPlayerNames.setBackground(new java.awt.Color(204, 255, 204));
        jpPlayerNames.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jpPlayerTitle.setBackground(new java.awt.Color(204, 255, 204));

        jlPlayerTitle.setFont(new java.awt.Font("HanziPen SC", 1, 18)); // NOI18N
        jlPlayerTitle.setForeground(new java.awt.Color(102, 102, 255));
        jlPlayerTitle.setText("Enter the name of the player below:");

        javax.swing.GroupLayout jpPlayerTitleLayout = new javax.swing.GroupLayout(jpPlayerTitle);
        jpPlayerTitle.setLayout(jpPlayerTitleLayout);
        jpPlayerTitleLayout.setHorizontalGroup(
            jpPlayerTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPlayerTitleLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlPlayerTitle)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jpPlayerTitleLayout.setVerticalGroup(
            jpPlayerTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPlayerTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlPlayerTitle)
                .addContainerGap())
        );

        jpPlayerForm.setBackground(new java.awt.Color(204, 255, 204));

        jtPlayerText.setBackground(new java.awt.Color(204, 255, 204));
        jtPlayerText.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        jtPlayerText.setText("Player Name:");
        jtPlayerText.setBorder(null);

        javax.swing.GroupLayout jpPlayerFormLayout = new javax.swing.GroupLayout(jpPlayerForm);
        jpPlayerForm.setLayout(jpPlayerFormLayout);
        jpPlayerFormLayout.setHorizontalGroup(
            jpPlayerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPlayerFormLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jtPlayerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpPlayerFormLayout.setVerticalGroup(
            jpPlayerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPlayerFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPlayerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPlayerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        playerContinueButton.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        playerContinueButton.setText("Continue");

        javax.swing.GroupLayout jpPlayerNamesLayout = new javax.swing.GroupLayout(jpPlayerNames);
        jpPlayerNames.setLayout(jpPlayerNamesLayout);
        jpPlayerNamesLayout.setHorizontalGroup(
            jpPlayerNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPlayerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpPlayerNamesLayout.createSequentialGroup()
                .addGroup(jpPlayerNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPlayerNamesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpPlayerForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPlayerNamesLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(playerContinueButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPlayerNamesLayout.setVerticalGroup(
            jpPlayerNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPlayerNamesLayout.createSequentialGroup()
                .addComponent(jpPlayerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPlayerForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerContinueButton)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPlayerNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPlayerNames, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//     public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EnterPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EnterPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EnterPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EnterPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EnterPlayerNames().setVisible(true);
//            }
//        });
//   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel j;
    private javax.swing.JLabel jlPlayerTitle;
    private javax.swing.JPanel jpPlayerForm;
    private javax.swing.JPanel jpPlayerNames;
    private javax.swing.JPanel jpPlayerTitle;
    private javax.swing.JTextField jtPlayerText;
    private javax.swing.JButton playerContinueButton;
    private javax.swing.JTextField playerNameInput;
    // End of variables declaration//GEN-END:variables
}
