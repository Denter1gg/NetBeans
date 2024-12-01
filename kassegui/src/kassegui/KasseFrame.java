/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kassegui;

import java.awt.event. *;

public class KasseFrame extends javax.swing.JFrame {
    
    private MarktKasse marktKasse;
    private KassePrefDialog kassePrefDialog;
    
    public KasseFrame(MarktKasse marktKasse) {
        
        this.marktKasse = marktKasse;
        
        initComponents();
        
        kassierernameAnzeigeLabel.setText("belomeda");
        personalnummerAnzeigeLabel.setText("123045");
        
    }
    
    //get Methoden
    
    public MarktKasse getMarktKasse() {
        return marktKasse;
    }
    
    public String getKassName() {
        String kassName = kassierernameAnzeigeLabel.getText();
        return kassName;
    }
    
    public String getKassNum() {
        String kassNum = personalnummerAnzeigeLabel.getText();
        return kassNum;
    }
    
    public String getKassStand() {
        String kassStand = String.valueOf(kassenStandAnzeigeLabel.getText());
        return kassStand;
    }
    
    public int getVerkauft() {
        int vkft = Integer.parseInt(verkauftAnzeigeLabel.getText());
        return vkft;
    }
    
    //set Methoden
    
    public void setMarktKasse() {
        kassierernameAnzeigeLabel.setText(String.valueOf(marktKasse.getKassName()));
        personalnummerAnzeigeLabel.setText(String.valueOf(marktKasse.getKassPersN()));
        kassenStandAnzeigeLabel.setText(String.valueOf(marktKasse.getBalance()));
        verkauftAnzeigeLabel.setText(String.valueOf(marktKasse.getVerkauft()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        northPanel = new javax.swing.JPanel();
        presiLabel = new javax.swing.JLabel();
        preisTextField = new javax.swing.JTextField();
        anzahlLabel = new javax.swing.JLabel();
        anzahlTextField = new javax.swing.JTextField();
        kassenStandLabel = new javax.swing.JLabel();
        kassenStandAnzeigeLabel = new javax.swing.JLabel();
        verkauftAnzahlLabel = new javax.swing.JLabel();
        verkauftAnzeigeLabel = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        verkaufenButton = new javax.swing.JButton();
        southPanel = new javax.swing.JPanel();
        personalnummerLabel = new javax.swing.JLabel();
        personalnummerAnzeigeLabel = new javax.swing.JLabel();
        kassierernameLabel = new javax.swing.JLabel();
        kassierernameAnzeigeLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        finishItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        prefDialog = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(300, 300));

        northPanel.setLayout(new java.awt.GridBagLayout());

        presiLabel.setText("Preis: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(presiLabel, gridBagConstraints);

        preisTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preisTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(preisTextField, gridBagConstraints);

        anzahlLabel.setText("Anzahl: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(anzahlLabel, gridBagConstraints);

        anzahlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anzahlTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(anzahlTextField, gridBagConstraints);

        kassenStandLabel.setText("Aktueller Kassenstand: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(kassenStandLabel, gridBagConstraints);

        kassenStandAnzeigeLabel.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(kassenStandAnzeigeLabel, gridBagConstraints);

        verkauftAnzahlLabel.setText("Verkaufte Artikel:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(verkauftAnzahlLabel, gridBagConstraints);

        verkauftAnzeigeLabel.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        northPanel.add(verkauftAnzeigeLabel, gridBagConstraints);

        getContentPane().add(northPanel, java.awt.BorderLayout.NORTH);

        verkaufenButton.setText("Verkaufen");
        verkaufenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verkaufenButtonMouseClicked(evt);
            }
        });
        centerPanel.add(verkaufenButton);

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

        southPanel.setLayout(new java.awt.GridBagLayout());

        personalnummerLabel.setText("Personalnummer:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        southPanel.add(personalnummerLabel, gridBagConstraints);

        personalnummerAnzeigeLabel.setText("0000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        southPanel.add(personalnummerAnzeigeLabel, gridBagConstraints);

        kassierernameLabel.setText("Kassierername:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        southPanel.add(kassierernameLabel, gridBagConstraints);

        kassierernameAnzeigeLabel.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        southPanel.add(kassierernameAnzeigeLabel, gridBagConstraints);

        getContentPane().add(southPanel, java.awt.BorderLayout.SOUTH);

        fileMenu.setText("Datei");

        finishItem.setText("Beenden");
        finishItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishItemActionPerformed(evt);
            }
        });
        fileMenu.add(finishItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Bearbeiten");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        prefDialog.setText("Einstellungen");
        prefDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefDialogActionPerformed(evt);
            }
        });
        editMenu.add(prefDialog);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anzahlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anzahlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anzahlTextFieldActionPerformed

    private void preisTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preisTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preisTextFieldActionPerformed

    private void verkaufenButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verkaufenButtonMouseClicked
        
        if (!preisTextField.getText().isEmpty() && !anzahlTextField.getText().isEmpty()) {
            int preis = Integer.parseInt(preisTextField.getText());
            int anzahl = Integer.parseInt(anzahlTextField.getText());
            marktKasse.verkaufen(preis,anzahl);
            kassenStandAnzeigeLabel.setText(String.valueOf(marktKasse.getBalance()));
            verkauftAnzeigeLabel.setText(String.valueOf(marktKasse.getVerkauft()));
        }
    }//GEN-LAST:event_verkaufenButtonMouseClicked

    private void finishItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_finishItemActionPerformed

    private void prefDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefDialogActionPerformed
        KassePrefDialog kassePrefDialog = new KassePrefDialog(this, true);
        kassePrefDialog.setVisible(true);
    }//GEN-LAST:event_prefDialogActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenuActionPerformed
    
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
            java.util.logging.Logger.getLogger(KasseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new KasseFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anzahlLabel;
    private javax.swing.JTextField anzahlTextField;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem finishItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel kassenStandAnzeigeLabel;
    private javax.swing.JLabel kassenStandLabel;
    private javax.swing.JLabel kassierernameAnzeigeLabel;
    private javax.swing.JLabel kassierernameLabel;
    private javax.swing.JPanel northPanel;
    private javax.swing.JLabel personalnummerAnzeigeLabel;
    private javax.swing.JLabel personalnummerLabel;
    private javax.swing.JMenuItem prefDialog;
    private javax.swing.JTextField preisTextField;
    private javax.swing.JLabel presiLabel;
    private javax.swing.JPanel southPanel;
    private javax.swing.JButton verkaufenButton;
    private javax.swing.JLabel verkauftAnzahlLabel;
    private javax.swing.JLabel verkauftAnzeigeLabel;
    // End of variables declaration//GEN-END:variables
}
