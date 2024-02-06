package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miket
 */
public class DatenbankAnzeigen extends javax.swing.JFrame {

    public DatenbankAnzeigen() {
        initComponents();
        initCustomComponents();
        setTableContents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(100, 100));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel4 = new javax.swing.JPanel();
        DatenAnlegenbttn = new javax.swing.JButton();
        DatenAktualisierenbttn = new javax.swing.JButton();
        Drukenbttn = new javax.swing.JButton();
        DatenZurücksetztenbttn = new javax.swing.JButton();
        DatenLöschenbttn = new javax.swing.JButton();
        Zurückbttn = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
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
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        Website = new javax.swing.JTextField();
        EMailtxtfield = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        BetriebeÜbersicht = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(650, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(102, 156, 214)));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(220, 232, 245));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BetriebsID", "Betriebsname", "Straße", "Ort", "PLZ", "Ansprechpartner", "Website", "E-Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setMinimumSize(new java.awt.Dimension(105, 200));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.015;
        jPanel3.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.015;
        jPanel3.add(filler3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(500, 74));
        jLabel2.setMinimumSize(new java.awt.Dimension(300, 100));
        jLabel2.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.75;
        jPanel1.add(filler1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jPanel1, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 118, 211), 4));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        DatenAnlegenbttn.setBackground(new java.awt.Color(255, 255, 255));
        DatenAnlegenbttn.setText("Daten anlegen");
        DatenAnlegenbttn.setMaximumSize(new java.awt.Dimension(0, 0));
        DatenAnlegenbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        DatenAnlegenbttn.setPreferredSize(new java.awt.Dimension(2, 2));
        DatenAnlegenbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatenAnlegenbttnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(DatenAnlegenbttn, gridBagConstraints);

        DatenAktualisierenbttn.setBackground(new java.awt.Color(255, 255, 255));
        DatenAktualisierenbttn.setText("Daten Aktualisieren");
        DatenAktualisierenbttn.setMaximumSize(new java.awt.Dimension(0, 0));
        DatenAktualisierenbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        DatenAktualisierenbttn.setPreferredSize(new java.awt.Dimension(2, 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(DatenAktualisierenbttn, gridBagConstraints);

        Drukenbttn.setBackground(new java.awt.Color(255, 255, 255));
        Drukenbttn.setText("Drucken");
        Drukenbttn.setMaximumSize(new java.awt.Dimension(0, 0));
        Drukenbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        Drukenbttn.setPreferredSize(new java.awt.Dimension(2, 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(Drukenbttn, gridBagConstraints);

        DatenZurücksetztenbttn.setBackground(new java.awt.Color(255, 255, 255));
        DatenZurücksetztenbttn.setText("Zurücksetzen");
        DatenZurücksetztenbttn.setMaximumSize(new java.awt.Dimension(0, 0));
        DatenZurücksetztenbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        DatenZurücksetztenbttn.setPreferredSize(new java.awt.Dimension(2, 2));
        DatenZurücksetztenbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatenZurücksetztenbttnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(DatenZurücksetztenbttn, gridBagConstraints);

        DatenLöschenbttn.setBackground(new java.awt.Color(255, 255, 255));
        DatenLöschenbttn.setText("Eintrag Löschen");
        DatenLöschenbttn.setMaximumSize(new java.awt.Dimension(0, 0));
        DatenLöschenbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        DatenLöschenbttn.setPreferredSize(new java.awt.Dimension(2, 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(DatenLöschenbttn, gridBagConstraints);

        Zurückbttn.setBackground(new java.awt.Color(255, 255, 255));
        Zurückbttn.setText("Zurück");
        Zurückbttn.setMaximumSize(new java.awt.Dimension(0, 0));
        Zurückbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        Zurückbttn.setPreferredSize(new java.awt.Dimension(2, 2));
        Zurückbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZurückbttnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(Zurückbttn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        jPanel2.add(jPanel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weighty = 0.03;
        jPanel2.add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.015;
        jPanel2.add(filler7, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 118, 211), 4));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        Betriebsname.setMaximumSize(new java.awt.Dimension(100, 20));
        Betriebsname.setMinimumSize(new java.awt.Dimension(20, 20));
        Betriebsname.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel7.add(Betriebsname, gridBagConstraints);

        Straße.setMaximumSize(new java.awt.Dimension(100, 20));
        Straße.setMinimumSize(new java.awt.Dimension(20, 20));
        Straße.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel7.add(Straße, gridBagConstraints);

        Postleitzahl.setMaximumSize(new java.awt.Dimension(100, 20));
        Postleitzahl.setMinimumSize(new java.awt.Dimension(20, 20));
        Postleitzahl.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel7.add(Postleitzahl, gridBagConstraints);

        Ort.setMaximumSize(new java.awt.Dimension(100, 20));
        Ort.setMinimumSize(new java.awt.Dimension(20, 20));
        Ort.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel7.add(Ort, gridBagConstraints);

        Ansprechpartner.setMaximumSize(new java.awt.Dimension(100, 20));
        Ansprechpartner.setMinimumSize(new java.awt.Dimension(20, 20));
        Ansprechpartner.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel7.add(Ansprechpartner, gridBagConstraints);

        EMail.setMaximumSize(new java.awt.Dimension(100, 20));
        EMail.setMinimumSize(new java.awt.Dimension(20, 20));
        EMail.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel7.add(EMail, gridBagConstraints);

        Orttxtfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Orttxtfield.setText("Ort");
        Orttxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Orttxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Orttxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel7.add(Orttxtfield, gridBagConstraints);

        Ansprechpartnertxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ansprechpartnertxtfield.setText("Ansprechpartner");
        Ansprechpartnertxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Ansprechpartnertxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel7.add(Ansprechpartnertxtfield, gridBagConstraints);

        Websitetxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Websitetxtfield.setText("E-Mail");
        Websitetxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Websitetxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel7.add(Websitetxtfield, gridBagConstraints);

        Straßetxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Straßetxtfield.setText("Straße");
        Straßetxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Straßetxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel7.add(Straßetxtfield, gridBagConstraints);

        PLZtxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PLZtxtfield.setText("PLZ");
        PLZtxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        PLZtxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel7.add(PLZtxtfield, gridBagConstraints);

        Betriebsnametxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Betriebsnametxtfield.setText("Betriebsname");
        Betriebsnametxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Betriebsnametxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel7.add(Betriebsnametxtfield, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel7.add(filler14, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel7.add(filler15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel7.add(filler16, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel7.add(filler17, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel7.add(filler18, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel7.add(filler19, gridBagConstraints);

        Website.setMaximumSize(new java.awt.Dimension(100, 20));
        Website.setMinimumSize(new java.awt.Dimension(20, 20));
        Website.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel7.add(Website, gridBagConstraints);

        EMailtxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EMailtxtfield.setText("Website");
        EMailtxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        EMailtxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel7.add(EMailtxtfield, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jPanel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.015;
        jPanel5.add(filler4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jPanel5, gridBagConstraints);

        BetriebeÜbersicht.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        BetriebeÜbersicht.setText("Betriebe Übersicht");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        jPanel2.add(BetriebeÜbersicht, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        setBounds(0, 0, 649, 626);
    }// </editor-fold>//GEN-END:initComponents

    private void setTableContents() {
    Datenbank datenbank = new Datenbank();
    ArrayList<Betrieb> alleBetriebe = datenbank.holeAlleBetriebe();

    DefaultTableModel tableModel = new DefaultTableModel(new Object []{"BetriebsID", "Betriebsname", "Straße", "Ort", "PLZ", "Ansprechpartner", "Website", "EMail"}, 0);

    for (Betrieb betrieb : alleBetriebe) {
        Object[] rowData = {
            betrieb.getBetriebsID(),
            betrieb.getBetriebsname(),
            betrieb.getStraße(),
            betrieb.getOrt(),
            betrieb.getPLZ(),
            betrieb.getAnsprechpartner(),
            betrieb.getWebsite(),
            betrieb.getEMail()
        };

        tableModel.addRow(rowData);
    }

    jTable1.setModel(tableModel);
}
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void DatenZurücksetztenbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatenZurücksetztenbttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatenZurücksetztenbttnActionPerformed

    private void DatenAnlegenbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatenAnlegenbttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatenAnlegenbttnActionPerformed

    private void ZurückbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZurückbttnActionPerformed
        this.dispose();
        Navigation navigation = new Navigation();
        navigation.setVisible(true);
    }//GEN-LAST:event_ZurückbttnActionPerformed

    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ansprechpartner;
    private javax.swing.JLabel Ansprechpartnertxtfield;
    private javax.swing.JLabel BetriebeÜbersicht;
    private javax.swing.JTextField Betriebsname;
    private javax.swing.JLabel Betriebsnametxtfield;
    private javax.swing.JButton DatenAktualisierenbttn;
    private javax.swing.JButton DatenAnlegenbttn;
    private javax.swing.JButton DatenLöschenbttn;
    private javax.swing.JButton DatenZurücksetztenbttn;
    private javax.swing.JButton Drukenbttn;
    private javax.swing.JTextField EMail;
    private javax.swing.JLabel EMailtxtfield;
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
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
