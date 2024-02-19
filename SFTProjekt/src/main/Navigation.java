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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Zurück = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        DatenHinzufügen = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Bewertungssystem = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel2.add(DatenHinzufügen, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Tabelle Anzeigen");
        jButton2.setMargin(new java.awt.Insets(35, 75, 35, 75));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel2.add(jButton2, gridBagConstraints);

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

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("Maps Anzeigen");
        jButton4.setMargin(new java.awt.Insets(35, 75, 35, 75));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel2.add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        setSize(new java.awt.Dimension(1037, 581));
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
        super.dispose();

    }//GEN-LAST:event_DatenHinzufügenActionPerformed

    private void BewertungssystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BewertungssystemActionPerformed
        DatenbankBewertung datenbankBewertung = new DatenbankBewertung();
        datenbankBewertung.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BewertungssystemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DatenbankTabelleAnzeigen datenbanktablleanzeigen = new DatenbankTabelleAnzeigen();
        datenbanktablleanzeigen.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MapFenster map = new MapFenster();
        map.runSketch(new String[]{"Map"}, map);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bewertungssystem;
    private javax.swing.JButton DatenHinzufügen;
    private javax.swing.JButton Zurück;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
