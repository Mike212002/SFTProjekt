/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miket
 */
public class DatenbankFenster extends javax.swing.JFrame {

    /**
     * Creates new form DatenbankFenster
     */
    public DatenbankFenster() {
        initComponents();
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Zurück = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        Betriebsname = new javax.swing.JTextField();
        BetriebsnameTextfield = new javax.swing.JLabel();
        Postleitzahl = new javax.swing.JTextField();
        PLZtextfield = new javax.swing.JLabel();
        Straße = new javax.swing.JTextField();
        Straßetextfield = new javax.swing.JLabel();
        Websitetextfield = new javax.swing.JLabel();
        Website = new javax.swing.JTextField();
        Ansprechpartner = new javax.swing.JTextField();
        Ansprechpartnertextfield = new javax.swing.JLabel();
        Einfüge = new javax.swing.JButton();
        Ort = new javax.swing.JTextField();
        Orttextfield = new javax.swing.JLabel();
        Schließtast = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(920, 470));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(920, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N

        Zurück.setText("Zurück");
        Zurück.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 64)); // NOI18N
        jLabel2.setText("Daten einüfgen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zurück, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(81, 81, 81)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(Zurück, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 490));

        Panel.setBackground(new java.awt.Color(25, 118, 211));

        Betriebsname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Betriebsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetriebsnameActionPerformed(evt);
            }
        });

        BetriebsnameTextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BetriebsnameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        BetriebsnameTextfield.setText("Betriebsname");

        Postleitzahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostleitzahlActionPerformed(evt);
            }
        });

        PLZtextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PLZtextfield.setForeground(new java.awt.Color(255, 255, 255));
        PLZtextfield.setText("PLZ");

        Straße.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Straße.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StraßeActionPerformed(evt);
            }
        });

        Straßetextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Straßetextfield.setForeground(new java.awt.Color(255, 255, 255));
        Straßetextfield.setText("Straße");

        Websitetextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Websitetextfield.setForeground(new java.awt.Color(255, 255, 255));
        Websitetextfield.setText("Website");

        Ansprechpartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnsprechpartnerActionPerformed(evt);
            }
        });

        Ansprechpartnertextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ansprechpartnertextfield.setForeground(new java.awt.Color(255, 255, 255));
        Ansprechpartnertextfield.setText("Ansprechpartner");

        Einfüge.setBackground(new java.awt.Color(255, 255, 255));
        Einfüge.setForeground(new java.awt.Color(51, 51, 255));
        Einfüge.setText("Einfügen");
        Einfüge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Einfüge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EinfügeActionPerformed(evt);
            }
        });

        Ort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrtActionPerformed(evt);
            }
        });

        Orttextfield.setForeground(new java.awt.Color(255, 255, 255));
        Orttextfield.setText("Ort");
        Orttextfield.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Schließtast.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Schließtast.setForeground(new java.awt.Color(255, 255, 255));
        Schließtast.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Schließtast.setText("X");
        Schließtast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Schließtast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SchließtastMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(Websitetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Website, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PLZtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Orttextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Straßetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ansprechpartnertextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Straße, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(Ort, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Postleitzahl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ansprechpartner, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                        .addComponent(BetriebsnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Betriebsname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(Schließtast, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(Einfüge, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Schließtast, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BetriebsnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Betriebsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Straßetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Straße, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Orttextfield))
                .addGap(28, 28, 28)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Postleitzahl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLZtextfield))
                .addGap(25, 25, 25)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ansprechpartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ansprechpartnertextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Website, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Websitetextfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(Einfüge, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Ort.getAccessibleContext().setAccessibleName("");

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 470, 470));

        setSize(new java.awt.Dimension(920, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BetriebsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetriebsnameActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_BetriebsnameActionPerformed

    private void StraßeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StraßeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StraßeActionPerformed

    private void EinfügeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EinfügeActionPerformed
     BetriebModel betrieb = new BetriebModel(Betriebsname.getText(),Straße.getText(),Ort.getText(), Integer.valueOf(Postleitzahl.getText()), Ansprechpartner.getText(),Website.getText());
     System.out.println(betrieb.Ansprechpartner);
     Datenbank Alfred = new Datenbank();
     Alfred.createBetrieb(betrieb);
     
    }//GEN-LAST:event_EinfügeActionPerformed

    private void AnsprechpartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnsprechpartnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnsprechpartnerActionPerformed

    private void OrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrtActionPerformed

    private void PostleitzahlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostleitzahlActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PostleitzahlActionPerformed

    private void SchließtastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SchließtastMouseClicked
         System.exit(0);
    }//GEN-LAST:event_SchließtastMouseClicked
        
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ansprechpartner;
    private javax.swing.JLabel Ansprechpartnertextfield;
    private javax.swing.JTextField Betriebsname;
    private javax.swing.JLabel BetriebsnameTextfield;
    private javax.swing.JButton Einfüge;
    private javax.swing.JTextField Ort;
    private javax.swing.JLabel Orttextfield;
    private javax.swing.JLabel PLZtextfield;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField Postleitzahl;
    private javax.swing.JLabel Schließtast;
    private javax.swing.JTextField Straße;
    private javax.swing.JLabel Straßetextfield;
    private javax.swing.JTextField Website;
    private javax.swing.JLabel Websitetextfield;
    private javax.swing.JButton Zurück;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
