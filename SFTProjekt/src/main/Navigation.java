package main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


/**
 *
 * @author mike.tim.nowak
 */
public class Navigation extends javax.swing.JFrame {

    
    public Navigation() {
        initComponents();
        initCustomComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ausloggenbttn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        DatenHinzufügen = new javax.swing.JButton();
        TabelleAnzeigen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        Ausloggenbttn.setText("Ausloggen");
        Ausloggenbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AusloggenbttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 273, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ausloggenbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                .addComponent(Ausloggenbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Betriebsbewertungen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DatenHinzufügen.setBackground(new java.awt.Color(255, 255, 255));
        DatenHinzufügen.setText("Danten hinzufügen (Leher)");
        DatenHinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatenHinzufügenActionPerformed(evt);
            }
        });

        TabelleAnzeigen.setText("Tabelle Anzegien");
        TabelleAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelleAnzeigenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatenHinzufügen, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabelleAnzeigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(DatenHinzufügen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabelleAnzeigen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 0, 440, 470));

        setSize(new java.awt.Dimension(932, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DatenbankBewertung datenbankBewertung = new DatenbankBewertung();
        datenbankBewertung.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AusloggenbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AusloggenbttnActionPerformed
        this.dispose();

    }//GEN-LAST:event_AusloggenbttnActionPerformed

    private void DatenHinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatenHinzufügenActionPerformed
        PasswortAbfrage passwortAbfrage = new PasswortAbfrage(null, true);
        passwortAbfrage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DatenHinzufügenActionPerformed

    private void TabelleAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelleAnzeigenActionPerformed
 DatenbankTabelleAnzeigen datenbanktablleanzeigen = new DatenbankTabelleAnzeigen();
       datenbanktablleanzeigen.setVisible(true);
        this.dispose();
        
       
    }//GEN-LAST:event_TabelleAnzeigenActionPerformed



    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ausloggenbttn;
    private javax.swing.JButton DatenHinzufügen;
    private javax.swing.JButton TabelleAnzeigen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
