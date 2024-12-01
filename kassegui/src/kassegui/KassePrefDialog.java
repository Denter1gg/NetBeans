/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */  
package kassegui;

import java.awt.event. *;


public class KassePrefDialog extends javax.swing.JDialog {

    private MarktKasse marktKasse;
    private KasseFrame kasseFrame;
    
    
    public KassePrefDialog(KasseFrame parent, boolean modal) {
        super (parent, modal);
        kasseFrame = parent;    
        marktKasse = kasseFrame.getMarktKasse();
        initComponents();
        
        
        KeyHandler handler = new KeyHandler();
        kassiererNameTextField.addKeyListener(handler);
        kassenStandTextField.addKeyListener(handler);
        kassiererNummerTextField.addKeyListener(handler);
        verkauftTextField.addKeyListener(handler);
        okButton.addKeyListener(handler);
        abbrechenButton.addKeyListener(handler);
        //getRootPane().addKeyListener(handler);
        
        
        kassiererNameTextField.setText(kasseFrame.getKassName());
        kassenStandTextField.setText(String.valueOf(kasseFrame.getKassStand()));
        kassiererNummerTextField.setText(String.valueOf(kasseFrame.getKassNum()));
        verkauftTextField.setText(String.valueOf(kasseFrame.getVerkauft()));
    }
      
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(KassePrefDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KassePrefDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KassePrefDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KassePrefDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //KassePrefDialog dialog = new KassePrefDialog(new KasseFrame(new MarktKasse()), true);
                //dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    //@Override
                    //public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    //}
                //});
                //dialog.setVisible(true);
            }
        });
    }
    
    public void changeData() {
        
        try {
            marktKasse.setKassPersName(String.valueOf(kassiererNameTextField.getText()));
            marktKasse.setKassPersNum(Integer.parseInt(kassiererNummerTextField.getText()));
            marktKasse.setBalanceN(Integer.parseInt(kassenStandTextField.getText()));
            marktKasse.setVerkauft(Integer.parseInt(verkauftTextField.getText()));
            kasseFrame.setMarktKasse();
        } catch (NumberFormatException e) {
            return;
        }
        dispose();
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        northPanel = new javax.swing.JPanel();
        kassiererNameLabel = new javax.swing.JLabel();
        kassiererNummerLabel = new javax.swing.JLabel();
        kassenStandLabel = new javax.swing.JLabel();
        verkauftLabel = new javax.swing.JLabel();
        kassiererNameTextField = new javax.swing.JTextField();
        kassiererNummerTextField = new javax.swing.JTextField();
        kassenStandTextField = new javax.swing.JTextField();
        verkauftTextField = new javax.swing.JTextField();
        southPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        abbrechenButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 200));

        northPanel.setName(""); // NOI18N
        northPanel.setLayout(new java.awt.GridBagLayout());

        kassiererNameLabel.setText("Kassierer Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(kassiererNameLabel, gridBagConstraints);

        kassiererNummerLabel.setText("Kassierer Nummer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(kassiererNummerLabel, gridBagConstraints);

        kassenStandLabel.setText("Kassen Stand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(kassenStandLabel, gridBagConstraints);

        verkauftLabel.setText("Anzahl verkaufter Artikel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(verkauftLabel, gridBagConstraints);

        kassiererNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kassiererNameTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(kassiererNameTextField, gridBagConstraints);

        kassiererNummerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kassiererNummerTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(kassiererNummerTextField, gridBagConstraints);

        kassenStandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kassenStandTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(kassenStandTextField, gridBagConstraints);

        verkauftTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verkauftTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(verkauftTextField, gridBagConstraints);

        getContentPane().add(northPanel, java.awt.BorderLayout.PAGE_START);

        southPanel.setMinimumSize(new java.awt.Dimension(200, 100));

        okButton.setText("ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        southPanel.add(okButton);

        abbrechenButton.setText("Abbrechen");
        abbrechenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abbrechenButtonActionPerformed(evt);
            }
        });
        southPanel.add(abbrechenButton);

        getContentPane().add(southPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        changeData(); 
    }//GEN-LAST:event_okButtonActionPerformed

    private void abbrechenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abbrechenButtonActionPerformed
        dispose();
    }//GEN-LAST:event_abbrechenButtonActionPerformed

    private void kassiererNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kassiererNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kassiererNameTextFieldActionPerformed

    private void kassiererNummerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kassiererNummerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kassiererNummerTextFieldActionPerformed

    private void kassenStandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kassenStandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kassenStandTextFieldActionPerformed

    private void verkauftTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verkauftTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verkauftTextFieldActionPerformed
    
    class KeyHandler implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        //System.out.println(e.getKeyCode());
            switch (e.getKeyCode()) {
                case KeyEvent.VK_ESCAPE:
                    dispose();
                    System.out.println("closed");
                    break;
                case KeyEvent.VK_ENTER:
                    changeData();
                    System.out.println("changed");
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
        
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abbrechenButton;
    private javax.swing.JLabel kassenStandLabel;
    private javax.swing.JTextField kassenStandTextField;
    private javax.swing.JLabel kassiererNameLabel;
    private javax.swing.JTextField kassiererNameTextField;
    private javax.swing.JLabel kassiererNummerLabel;
    private javax.swing.JTextField kassiererNummerTextField;
    private javax.swing.JPanel northPanel;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel southPanel;
    private javax.swing.JLabel verkauftLabel;
    private javax.swing.JTextField verkauftTextField;
    // End of variables declaration//GEN-END:variables
}
