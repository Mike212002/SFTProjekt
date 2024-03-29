package main;

import static java.awt.Color.WHITE;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;


/**
 *
 * @author miket
 */
public class DatenbankBewertungBearbeiten extends javax.swing.JFrame {

    private Timer hideMessageTimer;
    private boolean isSearchTriggered = false;

    public DatenbankBewertungBearbeiten() {
        
      initComponents();
      setTableContents();
      
      AddBewertung.setBackground(WHITE);
        Eingabe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EingabeFocusLost(evt);
            }
        });

        Eingabe.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable();
            }
        });

    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabelle = new javax.swing.JTable();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(100, 100));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel6 = new javax.swing.JPanel();
        Eingabe = new javax.swing.JTextField();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel4 = new javax.swing.JPanel();
        DatenAnlegenbttn = new javax.swing.JButton();
        DatenLöschenbttn = new javax.swing.JButton();
        Zurückbttn = new javax.swing.JButton();
        AddBewertung = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Sterne = new javax.swing.JTextField();
        Straßetxtfield = new javax.swing.JLabel();
        PLZtxtfield = new javax.swing.JLabel();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        jPanel8 = new javax.swing.JPanel();
        DatenAktualisierenbttn = new javax.swing.JButton();
        DatenZurücksetztenbttn = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Beschreibung = new javax.swing.JTextField();
        AutorField = new javax.swing.JTextField();
        Autorlabel = new javax.swing.JLabel();
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

        Tabelle.setAutoCreateRowSorter(true);
        Tabelle.setBackground(new java.awt.Color(220, 232, 245));
        Tabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BewertID", "Sterne", "BetriebsID", "Beschreibung", "Autor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabelle.setMinimumSize(new java.awt.Dimension(105, 200));
        Tabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabelle);
        if (Tabelle.getColumnModel().getColumnCount() > 0) {
            Tabelle.getColumnModel().getColumn(0).setResizable(false);
            Tabelle.getColumnModel().getColumn(1).setResizable(false);
            Tabelle.getColumnModel().getColumn(2).setResizable(false);
            Tabelle.getColumnModel().getColumn(3).setResizable(false);
            Tabelle.getColumnModel().getColumn(4).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.015;
        jPanel3.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.015;
        jPanel3.add(filler3, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 118, 211), 4));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        Eingabe.setText("Betriebe Durchsuchen");
        Eingabe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EingabeFocusLost(evt);
            }
        });
        Eingabe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EingabeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EingabeMouseExited(evt);
            }
        });
        Eingabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EingabeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0E-6;
        jPanel6.add(Eingabe, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(filler5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.001;
        jPanel3.add(jPanel6, gridBagConstraints);

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
        DatenAnlegenbttn.setText("Eintrag Hinzufügen");
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

        DatenLöschenbttn.setBackground(new java.awt.Color(255, 255, 255));
        DatenLöschenbttn.setText("Eintrag Löschen");
        DatenLöschenbttn.setMaximumSize(new java.awt.Dimension(0, 0));
        DatenLöschenbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        DatenLöschenbttn.setPreferredSize(new java.awt.Dimension(2, 2));
        DatenLöschenbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatenLöschenbttnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
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

        AddBewertung.setText("Bewertungen und Sterne hinzufügen");
        AddBewertung.setBorder(null);
        AddBewertung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBewertungActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(AddBewertung, gridBagConstraints);

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

        Sterne.setMaximumSize(new java.awt.Dimension(100, 20));
        Sterne.setMinimumSize(new java.awt.Dimension(20, 20));
        Sterne.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel7.add(Sterne, gridBagConstraints);

        Straßetxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Straßetxtfield.setText("Sterne");
        Straßetxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Straßetxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel7.add(Straßetxtfield, gridBagConstraints);

        PLZtxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PLZtxtfield.setText("Beschreibung");
        PLZtxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        PLZtxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel7.add(PLZtxtfield, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel7.add(filler14, gridBagConstraints);

        filler15.setBackground(new java.awt.Color(102, 102, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel7.add(filler15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        jPanel7.add(filler16, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel7.add(filler17, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel7.add(filler19, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 118, 211), 4));
        jPanel8.setPreferredSize(new java.awt.Dimension(24, 32));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        DatenAktualisierenbttn.setBackground(new java.awt.Color(255, 255, 255));
        DatenAktualisierenbttn.setText("Daten Aktualisieren");
        DatenAktualisierenbttn.setMaximumSize(new java.awt.Dimension(0, 0));
        DatenAktualisierenbttn.setMinimumSize(new java.awt.Dimension(0, 0));
        DatenAktualisierenbttn.setPreferredSize(new java.awt.Dimension(2, 2));
        DatenAktualisierenbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatenAktualisierenbttnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel8.add(DatenAktualisierenbttn, gridBagConstraints);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel8.add(DatenZurücksetztenbttn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(jPanel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(filler8, gridBagConstraints);

        Beschreibung.setMaximumSize(new java.awt.Dimension(100, 20));
        Beschreibung.setMinimumSize(new java.awt.Dimension(20, 20));
        Beschreibung.setPreferredSize(new java.awt.Dimension(100, 20));
        Beschreibung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeschreibungActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel7.add(Beschreibung, gridBagConstraints);

        AutorField.setEditable(false);
        AutorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel7.add(AutorField, gridBagConstraints);

        Autorlabel.setText("Autor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel7.add(Autorlabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 19;
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jPanel5, gridBagConstraints);

        BetriebeÜbersicht.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        BetriebeÜbersicht.setText("Bewertung bearbeiten");
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

        setSize(new java.awt.Dimension(1161, 675));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


     private void setTableContents() {
        Datenbank datenbank = new Datenbank();
        ArrayList<Bewertung> alleBewertungen = datenbank.holeAlleBewertungen();

        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"BewertID","Sterne","BetriebsID","Beschreibung","Autor"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {

                return false;
            }
        };

        for (Bewertung bewertung : alleBewertungen) {
            Object[] rowData = {
                bewertung.getBewertID(),
                bewertung.getSterne(),
                bewertung.getBetriebsID(),
                bewertung.getBeschreibung(),
                bewertung.getAutor()
            };

            tableModel.addRow(rowData);
        }

        Tabelle.setModel(tableModel);
    }
     
     
     private void filterTable() {
        String eingabe = Eingabe.getText().trim();
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(Tabelle.getModel());
        Tabelle.setRowSorter(sorter);
        if (eingabe.isEmpty()) {
            sorter.setRowFilter(null); // Entfernen Sie den Filter, um die gesamte Tabelle anzuzeigen
        } else {
            RowFilter<TableModel, Object> filter = RowFilter.regexFilter("(?i)" + eingabe); // Case-insensitive Suche
            sorter.setRowFilter(filter);
        }
    }

    @SuppressWarnings("unchecked")
     
     
    
     
    private void TabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelleMouseClicked
       int selectedRow = Tabelle.getSelectedRow();

    if (selectedRow != -1) {
        try {
            String sterne = "";
            String beschreibung = "";
            String autor = "";

            Object value;

            // Sterne
            value = Tabelle.getValueAt(selectedRow, 1);
            if (value != null) {
                sterne = value.toString();
            }

            // Beschreibung
            value = Tabelle.getValueAt(selectedRow, 3);
            if (value != null) {
                beschreibung = value.toString();
            }
            
            // Autor
            value = Tabelle.getValueAt(selectedRow, 4);
            if (value != null) {
                autor = value.toString();
            }
            
            // Setzen der Werte in die entsprechenden Textfelder
            Sterne.setText(sterne);
            Beschreibung.setText(beschreibung);
            AutorField.setText(autor);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Fehler beim Abrufen der Daten aus der Tabelle: " + ex.getMessage());
        }
    } else {
        System.out.println("Es wurde keine Zeile ausgewählt.");
    
}    }//GEN-LAST:event_TabelleMouseClicked

    
    private void updateTable() {
    DefaultTableModel model = (DefaultTableModel) Tabelle.getModel();
    model.setRowCount(0);

    Datenbank datenbank = new Datenbank();
    ArrayList<Bewertung> bewertungen = datenbank.holeAlleBewertungen();
    for (Bewertung bewertung : bewertungen) {
        Object[] row = {bewertung.getBewertID(), bewertung.getSterne(), bewertung.getBetriebsID(), bewertung.getBeschreibung(), bewertung.getAutor()};
        model.addRow(row);
    }

        
        

    }
    
    private void suchenInTabelle() {
        if (!isSearchTriggered) {
            return; // Suche nur ausführen, wenn der Such-Button geklickt wurde
        }

        String eingabe = Eingabe.getText().trim();

        DefaultTableModel model = (DefaultTableModel) Tabelle.getModel();
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        Tabelle.setRowSorter(sorter);

        if (eingabe.isEmpty()) {
            sorter.setRowFilter(null);
            return;
        }

        RowFilter<TableModel, Object> filter = new RowFilter<TableModel, Object>() {
            public boolean include(RowFilter.Entry<? extends TableModel, ? extends Object> entry) {
                for (int i = 0; i < entry.getValueCount(); i++) {
                    if (entry.getStringValue(i).equals(eingabe)) {
                        return true;
                    }
                }
                return false;
            }
        };

        sorter.setRowFilter(filter);

        if (sorter.getViewRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Eintrag '" + eingabe + "' nicht gefunden.");
            sorter.setRowFilter(null);
            isSearchTriggered = false;
        }
    }
    
    
    
    
    
   

    private void ZurückbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZurückbttnActionPerformed
        this.dispose();
        Navigation navigation = new Navigation();
        navigation.setVisible(true);
    }//GEN-LAST:event_ZurückbttnActionPerformed

    private void EingabeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EingabeMouseClicked
        Eingabe.setText("");
    }//GEN-LAST:event_EingabeMouseClicked

    private void EingabeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EingabeFocusLost
if (Eingabe.getText().isEmpty()) {
            Eingabe.setText("Betriebe Durchsuchen");
            alleDatenAnzeigen();
        }

    }//GEN-LAST:event_EingabeFocusLost

    
     private void alleDatenAnzeigen() {
        DefaultTableModel model = (DefaultTableModel) Tabelle.getModel();
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        Tabelle.setRowSorter(sorter);
        sorter.setRowFilter(null);
    }
     
     
    private void EingabeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EingabeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EingabeMouseExited

    private void EingabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EingabeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EingabeActionPerformed

    
    
    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());

    }
    private void DatenZurücksetztenbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatenZurücksetztenbttnActionPerformed
             
        Sterne.setText("");
        Beschreibung.setText("");
        AutorField.setText("");
    }//GEN-LAST:event_DatenZurücksetztenbttnActionPerformed

    private void DatenAktualisierenbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatenAktualisierenbttnActionPerformed
  int selectedRow = Tabelle.getSelectedRow();

if (selectedRow != -1) {
    try {
        int bewertungID = (int) Tabelle.getValueAt(selectedRow, 0); // Annahme, dass die Bewertungs-ID in der ersten Spalte ist
        int sterne = Integer.parseInt(Sterne.getText());
        String beschreibung = Beschreibung.getText();
        String autor = AutorField.getText();

        Bewertung bewertung = new Bewertung();
        bewertung.setBewertID(bewertungID);
        bewertung.setSterne(sterne);
        bewertung.setBeschreibung(beschreibung);
        bewertung.setAutor(autor);

        Datenbank datenbank = new Datenbank();
        boolean updateErfolgreich = datenbank.aktualisiereBewertungen(bewertung);

        if (updateErfolgreich) {
            updateTable(); // Hier rufen Sie die Methode updateTable() auf, um die GUI-Tabelle zu aktualisieren
        } else {
            JOptionPane.showMessageDialog(this, "Fehler beim Aktualisieren der Bewertung.", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Fehler beim Konvertieren der Bewertung oder der Sterne in eine Zahl.", "Fehler", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Fehler beim Aktualisieren der Bewertung: " + ex.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this, "Bitte wählen Sie eine Zeile in der Tabelle aus.", "Fehler", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_DatenAktualisierenbttnActionPerformed

    private void DatenAnlegenbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatenAnlegenbttnActionPerformed
        BewertungsFenster bewertungsFenster = new BewertungsFenster();
        bewertungsFenster.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DatenAnlegenbttnActionPerformed

    private void DatenLöschenbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatenLöschenbttnActionPerformed
 int[] selectedRows = Tabelle.getSelectedRows();

    if (selectedRows.length > 0) {
        StringBuilder messageBuilder = new StringBuilder("Möchten Sie den folgenden Eintrag wirklich löschen?\n");
        for (int i = 0; i < selectedRows.length; i++) {
            try {
                
                String sterneString = Tabelle.getValueAt(selectedRows[i], 1).toString();
                
                String beschreibung = Tabelle.getValueAt(selectedRows[i], 3).toString();
                String autor = Tabelle.getValueAt(selectedRows[i], 4).toString();

                messageBuilder
                        .append("\nSterne: ").append(sterneString)
                        .append("\nBeschreibung: ").append(beschreibung)
                        .append("\nAutor: ").append(autor)
                        .append("\n----------------------\n");
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println("Fehler beim Abrufen der Einträge aus der Tabelle: " + ex.getMessage());
                JOptionPane.showMessageDialog(this, "Fehler beim Abrufen der Einträge aus der Tabelle.", "Fehler", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int response = JOptionPane.showConfirmDialog(this, messageBuilder.toString(), "Bestätigung - Eintrag löschen", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            try {
                for (int i = selectedRows.length - 1; i >= 0; i--) {
                    int bewertID = Integer.parseInt(Tabelle.getValueAt(selectedRows[i], 0).toString());

                    Datenbank datenbank = new Datenbank();
                    if (datenbank.löscheBewertungen(bewertID)) {
                        updateTable();
                        JOptionPane.showMessageDialog(this, "Der Eintrag für den Betrieb mit folgender BewertungsID: '" + bewertID + "' wurde erfolgreich gelöscht.", "Eintrag erfolgreich gelöscht", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Fehler beim Löschen des Betriebs.", "Fehler", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println("Fehler beim Löschen der Einträge: " + ex.getMessage());
                JOptionPane.showMessageDialog(this, "Fehler beim Löschen der Einträge.", "Fehler", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Bitte wählen Sie mindestens eine Zeile in der Tabelle aus.", "Fehler", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_DatenLöschenbttnActionPerformed

    private void AutorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorFieldActionPerformed

    private void BeschreibungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeschreibungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeschreibungActionPerformed

    private void AddBewertungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBewertungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBewertungActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBewertung;
    private javax.swing.JTextField AutorField;
    private javax.swing.JLabel Autorlabel;
    private javax.swing.JTextField Beschreibung;
    private javax.swing.JLabel BetriebeÜbersicht;
    private javax.swing.JButton DatenAktualisierenbttn;
    private javax.swing.JButton DatenAnlegenbttn;
    private javax.swing.JButton DatenLöschenbttn;
    private javax.swing.JButton DatenZurücksetztenbttn;
    private javax.swing.JTextField Eingabe;
    private javax.swing.JLabel PLZtxtfield;
    private javax.swing.JTextField Sterne;
    private javax.swing.JLabel Straßetxtfield;
    private javax.swing.JTable Tabelle;
    private javax.swing.JButton Zurückbttn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
