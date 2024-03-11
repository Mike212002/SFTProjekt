package main;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import main.Datenbank;
import main.DatenbankBewertungBearbeiten;

/**
 *
 * @author miket
 */
public class BewertungsFenster extends javax.swing.JFrame {
    
    private ArrayList<String> betriebsIDsAndNames;
    private JComboBox<String> schriftGroesseComboBox;
    private Font standardFont;
    private Font groesserFont;
private Datenbank dbManager; // Instanz der Datenbankklasse
    public BewertungsFenster() {
        
       dbManager = new Datenbank(); // Datenbankinstanz initialisieren
        initComponents();
        initComponents2();
         String benutzername = System.getenv("USERNAME");

    Autor.setText(benutzername);
        
        dbManager = new Datenbank(); // Datenbankinstanz initialisieren
  
setIconImage(); // Call setIconImage after all components have been initialized
    }

    private BewertungsFenster bewertungsFenster; // Instanz Ihrer BewertungsFenster-Klasse

    // Methode zum Aufrufen und Setzen der BetriebsID im BewertungsFenster
    public void setBetriebsIDInBewertungsFenster(String betriebsID) {
        bewertungsFenster.setBetriebsIDTextField(betriebsID);
    }

    public void setBetriebsIDTextField(String value) {
        BetriebsIDtxtfield.setText(value);
    }

    public void initComponents2() {
   betriebsIDsAndNames = dbManager.getBetriebsIDsAndNamesFromDatabase();

if (betriebsIDsAndNames != null) {
    for (String betriebsIDAndName : betriebsIDsAndNames) {
        betriebsComboBox.addItem(betriebsIDAndName);
    }
} else {
    System.out.println("Die Liste betriebsIDsAndNames ist null. Es wurden keine Betriebsdaten gefunden.");
}
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
        Sterne = new javax.swing.JTextField();
        Beschreibung = new javax.swing.JTextField();
        Autor = new javax.swing.JTextField();
        Beschreibungtxtfield = new javax.swing.JLabel();
        Autortxtfield = new javax.swing.JLabel();
        Sternetxtfield = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        jPanel2 = new javax.swing.JPanel();
        Zurückbttn = new javax.swing.JButton();
        Einfügenbttn = new javax.swing.JButton();
        BetriebsIDtxtfield = new javax.swing.JTextField();
        BetrriebsIDLabel = new javax.swing.JLabel();
        betriebsComboBox = new javax.swing.JComboBox<>();
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
        jLabel1.setText("Bewertunganlegen");
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

        Sterne.setMaximumSize(new java.awt.Dimension(100, 20));
        Sterne.setMinimumSize(new java.awt.Dimension(20, 20));
        Sterne.setPreferredSize(new java.awt.Dimension(100, 20));
        Sterne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SterneActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(Sterne, gridBagConstraints);
        Sterne.getAccessibleContext().setAccessibleName("Betriebsname");
        Sterne.getAccessibleContext().setAccessibleDescription("");

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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(Beschreibung, gridBagConstraints);

        Autor.setEditable(false);
        Autor.setMaximumSize(new java.awt.Dimension(100, 20));
        Autor.setMinimumSize(new java.awt.Dimension(20, 20));
        Autor.setPreferredSize(new java.awt.Dimension(100, 20));
        Autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(Autor, gridBagConstraints);

        Beschreibungtxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Beschreibungtxtfield.setForeground(new java.awt.Color(255, 255, 255));
        Beschreibungtxtfield.setText("Beschreibung");
        Beschreibungtxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Beschreibungtxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(Beschreibungtxtfield, gridBagConstraints);

        Autortxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Autortxtfield.setForeground(new java.awt.Color(255, 255, 255));
        Autortxtfield.setText("Autor");
        Autortxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Autortxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(Autortxtfield, gridBagConstraints);

        Sternetxtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sternetxtfield.setForeground(new java.awt.Color(255, 255, 255));
        Sternetxtfield.setText("Sterne");
        Sternetxtfield.setMinimumSize(new java.awt.Dimension(20, 20));
        Sternetxtfield.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(Sternetxtfield, gridBagConstraints);
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler8, gridBagConstraints);
        jPanel1.add(filler9, new java.awt.GridBagConstraints());

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

        BetriebsIDtxtfield.setEditable(false);
        BetriebsIDtxtfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BetriebsIDtxtfieldMouseClicked(evt);
            }
        });
        BetriebsIDtxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetriebsIDtxtfieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        jPanel1.add(BetriebsIDtxtfield, gridBagConstraints);

        BetrriebsIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        BetrriebsIDLabel.setText("BetriebsID");
        BetrriebsIDLabel.setMaximumSize(new java.awt.Dimension(35, 20));
        BetrriebsIDLabel.setMinimumSize(new java.awt.Dimension(20, 20));
        BetrriebsIDLabel.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(BetrriebsIDLabel, gridBagConstraints);

        if (betriebsIDsAndNames != null) {
            betriebsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(betriebsIDsAndNames.toArray(new String[0])));
        } else {
            // Handle the case where betriebsIDsAndNames is null
        }
        betriebsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betriebsComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(betriebsComboBox, gridBagConstraints);

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
        DatenbankBewertungBearbeiten datenbankBewertungBearbeiten = new DatenbankBewertungBearbeiten();
        datenbankBewertungBearbeiten.setVisible(true);
    }//GEN-LAST:event_ZurückbttnActionPerformed

    private void EinfügenbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EinfügenbttnActionPerformed
       try {
        String sterneText = Sterne.getText();
        if (sterneText.isEmpty()) {
            throw new IllegalArgumentException("Fehler: Sterne sind leer.");
        }

        // Parsen der Sterne
        int sterneint = Integer.parseInt(sterneText);

        if (sterneint < 0 || sterneint > 5) {
            throw new IllegalArgumentException("Fehler: Sterne müssen im Bereich von 0 bis 5 liegen.");
        }

        String betriebsIDText = BetriebsIDtxtfield.getText();
        if (betriebsIDText.isEmpty()) {
            throw new IllegalArgumentException("Fehler: BetriebsID ist leer.");
        }

        String beschreibungText = Beschreibung.getText();
        if (beschreibungText.isEmpty()) {
            throw new IllegalArgumentException("Fehler: Beschreibung ist leer.");
        }

        String autorText = Autor.getText();
        if (autorText.isEmpty()) {
            throw new IllegalArgumentException("Fehler: Autor ist leer.");
        }

        // Parsen der BetriebsID
        int betriebsIDint = Integer.parseInt(betriebsIDText);

        Bewertung bewertung = new Bewertung(sterneint, betriebsIDint, beschreibungText, autorText);

        // Hier wird die Methode BewertDatenHinzufügen in Ihrer Datenbank-Klasse aufgerufen
        boolean erfolgreich = dbManager.BewertDatenHinzufügen(bewertung);

        if (erfolgreich) {
            JOptionPane.showMessageDialog(this, "Daten wurden erfolgreich hinzugefügt.", "Erfolg", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Daten wurden nicht erfolgreich hinzugefügt.", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Fehler: Sterne oder BetriebsID muss eine Zahl sein.", "Fehler", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Ein Fehler ist aufgetreten: " + ex.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_EinfügenbttnActionPerformed

    private void EinfügenbttnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EinfügenbttnKeyPressed

    }//GEN-LAST:event_EinfügenbttnKeyPressed

    private void BeschreibungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeschreibungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeschreibungActionPerformed

    private void BetriebsIDtxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetriebsIDtxtfieldActionPerformed

    }//GEN-LAST:event_BetriebsIDtxtfieldActionPerformed

    private void BetriebsIDtxtfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BetriebsIDtxtfieldMouseClicked
        // TODO add your handling code here:

        System.out.println("test");
    }//GEN-LAST:event_BetriebsIDtxtfieldMouseClicked

    private void betriebsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betriebsComboBoxActionPerformed
        String selectedValue = (String) betriebsComboBox.getSelectedItem();
        String[] parts = selectedValue.split(" - ");
        BetriebsIDtxtfield.setText(parts[0]); // Die BetriebsID ist der erste Teil des ausgewählten Werts


    }//GEN-LAST:event_betriebsComboBoxActionPerformed

    private void SterneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SterneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SterneActionPerformed

    private void AutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorActionPerformed
   

    private void setIconImage() {
    ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
    this.setIconImage(icon.getImage());
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Autor;
    private javax.swing.JLabel Autortxtfield;
    private javax.swing.JTextField Beschreibung;
    private javax.swing.JLabel Beschreibungtxtfield;
    private javax.swing.JTextField BetriebsIDtxtfield;
    private javax.swing.JLabel BetrriebsIDLabel;
    private javax.swing.JButton Einfügenbttn;
    private javax.swing.JTextField Sterne;
    private javax.swing.JLabel Sternetxtfield;
    private javax.swing.JButton Zurückbttn;
    private javax.swing.JComboBox<String> betriebsComboBox;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    

}
