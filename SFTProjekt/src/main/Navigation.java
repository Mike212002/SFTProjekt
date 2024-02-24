package main;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author miket
 */
public class Navigation extends javax.swing.JFrame {

    public Navigation() {
        initComponents();
        initCustomComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Zurück = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        DatenHinzufügen = new javax.swing.JButton();
        TabelleAnzeigen = new javax.swing.JButton();
        Bewertungssystem = new javax.swing.JButton();
        MapsAnzeigen = new javax.swing.JButton();
        InformationenButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(917, 470));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 300));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        Zurück.setText("Ausloggen");
        Zurück.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZurückActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 0.05;
        jPanel4.add(Zurück, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(175, 300));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        DatenHinzufügen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatenHinzufügen.setText("Daten bearbeiten (Lehrer)");
        DatenHinzufügen.setActionCommand("jbutton1");
        DatenHinzufügen.setAlignmentX(0.5F);
        DatenHinzufügen.setMargin(new java.awt.Insets(35, 35, 35, 35));
        DatenHinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatenHinzufügenActionPerformed(evt);
            }
        });
        jPanel2.add(DatenHinzufügen, new java.awt.GridBagConstraints());

        TabelleAnzeigen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TabelleAnzeigen.setText("Tabelle Anzeigen");
        TabelleAnzeigen.setMargin(new java.awt.Insets(35, 75, 35, 75));
        TabelleAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelleAnzeigenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel2.add(TabelleAnzeigen, gridBagConstraints);

        Bewertungssystem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Bewertungssystem.setText("Bewertungssystem");
        Bewertungssystem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bewertungssystem.setMargin(new java.awt.Insets(35, 105, 35, 105));
        Bewertungssystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BewertungssystemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel2.add(Bewertungssystem, gridBagConstraints);

        MapsAnzeigen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MapsAnzeigen.setText("Maps Anzeigen");
        MapsAnzeigen.setMargin(new java.awt.Insets(35, 75, 35, 75));
        MapsAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapsAnzeigenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel2.add(MapsAnzeigen, gridBagConstraints);

        InformationenButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InformationenButton.setText("Informationen");
        InformationenButton.setMargin(new java.awt.Insets(35, 125, 35, 125));
        InformationenButton.setMaximumSize(new java.awt.Dimension(363, 99));
        InformationenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationenButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel2.add(InformationenButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        setSize(new java.awt.Dimension(1118, 687));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ZurückActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZurückActionPerformed
        Login fenster = new Login();
        fenster.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_ZurückActionPerformed

    private void DatenHinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatenHinzufügenActionPerformed

        PasswortAbfrage passwortAbfrage = new PasswortAbfrage(null, true);
        passwortAbfrage.setVisible(true);
        this.dispose();
     
    }//GEN-LAST:event_DatenHinzufügenActionPerformed

    private void BewertungssystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BewertungssystemActionPerformed
        DatenbankBewertungBearbeiten datenbankBewertungBearbeiten = new DatenbankBewertungBearbeiten();
        datenbankBewertungBearbeiten.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BewertungssystemActionPerformed

    private void TabelleAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelleAnzeigenActionPerformed
        DatenbankTabelleAnzeigen datenbanktablleanzeigen = new DatenbankTabelleAnzeigen();
        datenbanktablleanzeigen.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_TabelleAnzeigenActionPerformed

    private void MapsAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapsAnzeigenActionPerformed
        MapFenster map = new MapFenster();
        map.runSketch(new String[]{"Map"}, map);
    }//GEN-LAST:event_MapsAnzeigenActionPerformed

    private void InformationenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationenButtonActionPerformed
        NewJFrame newJFrame = new NewJFrame();
        newJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InformationenButtonActionPerformed

    
    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bewertungssystem;
    private javax.swing.JButton DatenHinzufügen;
    private javax.swing.JButton InformationenButton;
    private javax.swing.JButton MapsAnzeigen;
    private javax.swing.JButton TabelleAnzeigen;
    private javax.swing.JButton Zurück;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
