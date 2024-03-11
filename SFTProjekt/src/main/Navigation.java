package main;


import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
import static java.awt.Color.WHITE;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;

/**
 *
 * @author miket
 */
public class Navigation extends javax.swing.JFrame {
PasswortAbfrage passwortAbfrage = new PasswortAbfrage(this, true);

public Navigation() {
        initComponents();
        initCustomComponents();
        DatenHinzufügen.setBackground(WHITE);
       TabelleAnzeigen.setBackground(WHITE);
       Bewertungssystem.setBackground(WHITE);
       InformationenButton.setBackground(WHITE);
       Zurück.setBackground(WHITE);
       Zurück.setForeground(BLACK);
    
     
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Zurück = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        DatenHinzufügen = new javax.swing.JButton();
        TabelleAnzeigen = new javax.swing.JButton();
        Bewertungssystem = new javax.swing.JButton();
        InformationenButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(317, 470));
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

        Zurück.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Zurück.setText("Ausloggen");
        Zurück.setBorder(null);
        Zurück.setMargin(new java.awt.Insets(12, 14, 12, 14));
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
        DatenHinzufügen.setText("Daten Hinzufügen");
        DatenHinzufügen.setActionCommand("jbutton1");
        DatenHinzufügen.setAlignmentX(0.5F);
        DatenHinzufügen.setMargin(new java.awt.Insets(35, 60, 35, 65));
        DatenHinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatenHinzufügenActionPerformed(evt);
            }
        });
        jPanel2.add(DatenHinzufügen, new java.awt.GridBagConstraints());

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
        Bewertungssystem.setText("Bewertungen hinzufügen");
        Bewertungssystem.setToolTipText("Bewertungen hinzufügen");
        Bewertungssystem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bewertungssystem.setMargin(new java.awt.Insets(35, 30, 35, 45));
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

        InformationenButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InformationenButton.setText("Informationen");
        InformationenButton.setMargin(new java.awt.Insets(35, 85, 35, 75));
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

        setSize(new java.awt.Dimension(862, 592));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ZurückActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZurückActionPerformed
        SimpleLogin fenster = new SimpleLogin();
        fenster.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_ZurückActionPerformed

    private void DatenHinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatenHinzufügenActionPerformed

        
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
    private javax.swing.JButton TabelleAnzeigen;
    private javax.swing.JButton Zurück;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

    
}
