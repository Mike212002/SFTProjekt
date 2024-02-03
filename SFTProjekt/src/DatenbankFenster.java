
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
        initCustomComponents();
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        BetriebsnameTextfield = new javax.swing.JLabel();
        Betriebsname = new javax.swing.JTextField();
        PLZtextfield = new javax.swing.JLabel();
        Postleitzahl = new javax.swing.JTextField();
        Straßetextfield = new javax.swing.JLabel();
        Straße = new javax.swing.JTextField();
        Websitetextfield = new javax.swing.JLabel();
        Website = new javax.swing.JTextField();
        Ansprechpartnertextfield = new javax.swing.JLabel();
        Ansprechpartner = new javax.swing.JTextField();
        Orttextfield = new javax.swing.JLabel();
        Ort = new javax.swing.JTextField();
        Einfüge = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daten Anlegen");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(200, 400));
        setSize(new java.awt.Dimension(200, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        Panel.setBackground(new java.awt.Color(25, 118, 211));
        java.awt.GridBagLayout PanelLayout = new java.awt.GridBagLayout();
        PanelLayout.columnWidths = new int[] {0, 5, 0, 5, 0};
        PanelLayout.rowHeights = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0};
        PanelLayout.columnWeights = new double[] {5.0};
        PanelLayout.rowWeights = new double[] {5.0};
        Panel.setLayout(PanelLayout);

        BetriebsnameTextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BetriebsnameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        BetriebsnameTextfield.setText("Betriebsname");
        Panel.add(BetriebsnameTextfield, new java.awt.GridBagConstraints());

        Betriebsname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Betriebsname.setMinimumSize(new java.awt.Dimension(100, 200));
        Betriebsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetriebsnameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        Panel.add(Betriebsname, gridBagConstraints);

        PLZtextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PLZtextfield.setForeground(new java.awt.Color(255, 255, 255));
        PLZtextfield.setText("PLZ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        Panel.add(PLZtextfield, gridBagConstraints);

        Postleitzahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostleitzahlActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        Panel.add(Postleitzahl, gridBagConstraints);

        Straßetextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Straßetextfield.setForeground(new java.awt.Color(255, 255, 255));
        Straßetextfield.setText("Straße");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        Panel.add(Straßetextfield, gridBagConstraints);

        Straße.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Straße.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StraßeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        Panel.add(Straße, gridBagConstraints);

        Websitetextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Websitetextfield.setForeground(new java.awt.Color(255, 255, 255));
        Websitetextfield.setText("Website");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        Panel.add(Websitetextfield, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        Panel.add(Website, gridBagConstraints);

        Ansprechpartnertextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ansprechpartnertextfield.setForeground(new java.awt.Color(255, 255, 255));
        Ansprechpartnertextfield.setText("Ansprechpartner");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        Panel.add(Ansprechpartnertextfield, gridBagConstraints);

        Ansprechpartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnsprechpartnerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        Panel.add(Ansprechpartner, gridBagConstraints);

        Orttextfield.setForeground(new java.awt.Color(255, 255, 255));
        Orttextfield.setText("Ort");
        Orttextfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        Panel.add(Orttextfield, gridBagConstraints);

        Ort.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Ort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        Panel.add(Ort, gridBagConstraints);
        Ort.getAccessibleContext().setAccessibleName("");

        Einfüge.setBackground(new java.awt.Color(255, 255, 255));
        Einfüge.setForeground(new java.awt.Color(51, 51, 255));
        Einfüge.setText("Einfügen");
        Einfüge.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Einfüge.setMinimumSize(new java.awt.Dimension(0, 0));
        Einfüge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EinfügeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        Panel.add(Einfüge, gridBagConstraints);

        getContentPane().add(Panel, new java.awt.GridBagConstraints());

        setSize(new java.awt.Dimension(634, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initCustomComponents(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());
    }
    
    private void EinfügeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EinfügeActionPerformed
        BetriebModel betrieb = new BetriebModel(Betriebsname.getText(),Straße.getText(),Ort.getText(), Integer.valueOf(Postleitzahl.getText()), Ansprechpartner.getText(),Website.getText());

        Datenbank Alfred = new Datenbank();
        boolean erfolgreich = Alfred.createBetrieb(betrieb);

        if (erfolgreich) {
            JOptionPane.showMessageDialog(this, "Daten wurden erfolgreich hinzugefügt.", "Erfolg", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Daten wurden nicht erfolgreich hinzugefügt.", "Fehler", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_EinfügeActionPerformed

    private void OrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrtActionPerformed

    private void AnsprechpartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnsprechpartnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnsprechpartnerActionPerformed

    private void StraßeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StraßeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StraßeActionPerformed

    private void PostleitzahlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostleitzahlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PostleitzahlActionPerformed

    private void BetriebsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetriebsnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BetriebsnameActionPerformed
        
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
    private javax.swing.JTextField Straße;
    private javax.swing.JLabel Straßetextfield;
    private javax.swing.JTextField Website;
    private javax.swing.JLabel Websitetextfield;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
