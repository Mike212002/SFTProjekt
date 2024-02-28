package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author miket
 */
public class DatenbankFenster extends javax.swing.JFrame {

    private JComboBox<String> schriftGroesseComboBox;
    private Font standardFont;
    private Font groesserFont;

    public DatenbankFenster() {
        initComponents();
        initCustomComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Betriebsname = new javax.swing.JTextField();
        Straße = new javax.swing.JTextField();
        Postleitzahl = new javax.swing.JTextField();
        Ort = new javax.swing.JTextField();
        Ansprechpartner = new javax.swing.JTextField();
        EMail = new javax.swing.JTextField();
        Orttxtfield = new javax.swing.JLabel();
        Ansprechpartnertxtfield = new javax.swing.JLabel();
        Websitetxtfield = new javax.swing.JLabel();
        Straßetxtfield = new javax.swing.JLabel();
        PLZtxtfield = new javax.swing.JLabel();
        Betriebsnametxtfield = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        Website = new javax.swing.JTextField();
        EMailtxtfield = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        jPanel2 = new javax.swing.JPanel();
        Zurückbttn = new javax.swing.JButton();
        Einfügenbttn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daten Anlegen");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 480));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(25, 118, 211));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("Daten Anlegen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(65, 65));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jPanel3, gridBagConstraints);

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jScrollPane1.setMinimumSize(new java.awt.Dimension(100, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 500));
        jScrollPane1.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        Betriebsname.setMaximumSize(new java.awt.Dimension(100, 20));
        Betriebsname.setMinimumSize(new java.awt.Dimension(20, 20));
        Betriebsname.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(Betriebsname, gridBagConstraints);
        Betriebsname.getAccessibleContext().setAccessibleName("Betriebsname");
        Betriebsname.getAccessibleContext().setAccessibleDescription("");

        Straße.setMaximumSize(new java.awt.Dimension(100, 20));
        Straße.setMinimumSize(new java.awt.Dimension(20, 20));
        Straße.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(Straße, gridBagConstraints);

        Postleitzahl.setMaximumSize(new java.awt.Dimension(100, 20));
        Postleitzahl.setMinimumSize(new java.awt.Dimension(20, 20));
        Postleitzahl.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(Postleitzahl, gridBagConstraints);

        Ort.setMaximumSize(new java.awt.Dimension(100, 20));
        Ort.setMinimumSize(new java.awt.Dimension(20, 20));
        Ort.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(Ort, gridBagConstraints);

        Ansprechpartner.setMaximumSize(new java.awt.Dimension(100, 20));
        Ansprechpartner.setMinimumSize(new java.awt.Dimension(20, 20));
        Ansprechpartner.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(Ansprechpartner, gridBagConstraints);

        EMail.setMaximumSize(new java.awt.Dimension(100, 20));
        EMail.setMinimumSize(new java.awt.Dimension(20, 20));
        EMail.setPreferredSize(new java.awt.Dimension(100, 20));
        EMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(EMail, gridBagConstraints);

        Orttxtfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Orttxtfield.setForeground(new java.awt.Color(255, 255, 255));
        Orttxtfield.setText("Ort");
        Orttxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Orttxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Orttxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(Orttxtfield, gridBagConstraints);

        Ansprechpartnertxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ansprechpartnertxtfield.setForeground(new java.awt.Color(255, 255, 255));
        Ansprechpartnertxtfield.setText("Ansprechpartner");
        Ansprechpartnertxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Ansprechpartnertxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(Ansprechpartnertxtfield, gridBagConstraints);

        Websitetxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Websitetxtfield.setForeground(new java.awt.Color(255, 255, 255));
        Websitetxtfield.setText("E-Mail");
        Websitetxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Websitetxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(Websitetxtfield, gridBagConstraints);

        Straßetxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Straßetxtfield.setForeground(new java.awt.Color(255, 255, 255));
        Straßetxtfield.setText("Straße");
        Straßetxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Straßetxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(Straßetxtfield, gridBagConstraints);

        PLZtxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PLZtxtfield.setForeground(new java.awt.Color(255, 255, 255));
        PLZtxtfield.setText("PLZ");
        PLZtxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        PLZtxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(PLZtxtfield, gridBagConstraints);

        Betriebsnametxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Betriebsnametxtfield.setForeground(new java.awt.Color(255, 255, 255));
        Betriebsnametxtfield.setText("Betriebsname");
        Betriebsnametxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Betriebsnametxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(Betriebsnametxtfield, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel1.add(filler5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel1.add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(filler7, gridBagConstraints);

        Website.setMaximumSize(new java.awt.Dimension(100, 20));
        Website.setMinimumSize(new java.awt.Dimension(20, 20));
        Website.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(Website, gridBagConstraints);

        EMailtxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EMailtxtfield.setForeground(new java.awt.Color(255, 255, 255));
        EMailtxtfield.setText("Website");
        EMailtxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        EMailtxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(EMailtxtfield, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler9, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 60));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        Zurückbttn.setBackground(new java.awt.Color(255, 255, 255));
        Zurückbttn.setText("Zurück");
        Zurückbttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Zurückbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        Zurückbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZurückbttnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 5);
        jPanel2.add(Zurückbttn, gridBagConstraints);

        Einfügenbttn.setBackground(new java.awt.Color(255, 255, 255));
        Einfügenbttn.setText("Einfügen");
        Einfügenbttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Einfügenbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        Einfügenbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EinfügenbttnActionPerformed(evt);
            }
        });
        Einfügenbttn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EinfügenbttnKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 50);
        jPanel2.add(Einfügenbttn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jPanel2, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Textgröße kleiner", "Textgröße größer" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jComboBox1, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 0.15;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 10, 40);
        jPanel4.add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel4.add(filler2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ZurückbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZurückbttnActionPerformed
        this.dispose();
        DatenbankAnzeigen datenbankAnzeigen = new DatenbankAnzeigen();
        datenbankAnzeigen.setVisible(true);
    }//GEN-LAST:event_ZurückbttnActionPerformed

    private void EinfügenbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EinfügenbttnActionPerformed
        try {

            String betriebsnameText = Betriebsname.getText();
            if (betriebsnameText.isEmpty()) {
                throw new IllegalArgumentException("Fehler: Betriebsname ist leer.");
            }

            String straßeText = Straße.getText();
            if (straßeText.isEmpty()) {
                throw new IllegalArgumentException("Fehler: Straße ist leer.");
            }

            String plzText = Postleitzahl.getText();
            if (plzText.isEmpty()) {
                throw new IllegalArgumentException("Fehler: Postleitzahl ist leer.");
            }

            String OrtText = Ort.getText();
            if (OrtText.isEmpty()) {
                throw new IllegalArgumentException("Fehler: Ort ist leer.");
            }

            int plz = Integer.parseInt(plzText);

            Betrieb betrieb = new Betrieb(Betriebsname.getText(), Straße.getText(), Ort.getText(), plz, Ansprechpartner.getText(), Website.getText(), EMail.getText());

            Datenbank Alfred = new Datenbank();
            boolean erfolgreich = Alfred.DatenHinzufügen(betrieb);

            if (erfolgreich) {
                JOptionPane.showMessageDialog(this, "Daten wurden erfolgreich hinzugefügt.", "Erfolg", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Daten wurden nicht erfolgreich hinzugefügt.", "Fehler", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Fehler: Postleitzahl muss eine Zahl sein.", "Fehler", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ein Fehler ist aufgetreten: " + ex.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_EinfügenbttnActionPerformed

    private void EMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMailActionPerformed

    }//GEN-LAST:event_EMailActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int selectedIndex = jComboBox1.getSelectedIndex();

        switch (selectedIndex) {
            case 0:

                setzeSchriftgröße(16);
                break;
            case 1:

                setzeSchriftgröße(18);
                break;
            default:

                break;
        }


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked


    }//GEN-LAST:event_jComboBox1MouseClicked

    private void EinfügenbttnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EinfügenbttnKeyPressed

    }//GEN-LAST:event_EinfügenbttnKeyPressed
    private void setzeSchriftgröße(int schriftgröße) {
        // Neue Schriftart mit der angegebenen Schriftgröße erstellen
        Font neueSchriftart = new Font("Arial", Font.PLAIN, schriftgröße);

        // Schriftgröße für alle relevanten Komponenten setzen
        Betriebsname.setFont(neueSchriftart);
        Straße.setFont(neueSchriftart);
        Postleitzahl.setFont(neueSchriftart);
        Ort.setFont(neueSchriftart);
        Ansprechpartner.setFont(neueSchriftart);
        Website.setFont(neueSchriftart);
        Zurückbttn.setFont(neueSchriftart);
        Einfügenbttn.setFont(neueSchriftart);
        Betriebsnametxtfield.setFont(neueSchriftart);
        Straßetxtfield.setFont(neueSchriftart);
        Straßetxtfield.setFont(neueSchriftart);
        Orttxtfield.setFont(neueSchriftart);
        Ansprechpartnertxtfield.setFont(neueSchriftart);
        EMailtxtfield.setFont(neueSchriftart);
        Websitetxtfield.setFont(neueSchriftart);
        jLabel1.setFont(neueSchriftart);
        PLZtxtfield.setFont(neueSchriftart);

        Dimension neueTextfeldGröße = new Dimension(150, schriftgröße + 8); // Breite bleibt gleich, Höhe ändert sich

        System.out.println("Schriftgröße aktualisiert: " + schriftgröße);
    }

    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());
        jComboBox1.setBackground(Color.WHITE);
        jComboBox1.setForeground(Color.BLACK);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ansprechpartner;
    private javax.swing.JLabel Ansprechpartnertxtfield;
    private javax.swing.JTextField Betriebsname;
    private javax.swing.JLabel Betriebsnametxtfield;
    private javax.swing.JTextField EMail;
    private javax.swing.JLabel EMailtxtfield;
    private javax.swing.JButton Einfügenbttn;
    private javax.swing.JTextField Ort;
    private javax.swing.JLabel Orttxtfield;
    private javax.swing.JLabel PLZtxtfield;
    private javax.swing.JTextField Postleitzahl;
    private javax.swing.JTextField Straße;
    private javax.swing.JLabel Straßetxtfield;
    private javax.swing.JTextField Website;
    private javax.swing.JLabel Websitetxtfield;
    private javax.swing.JButton Zurückbttn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
