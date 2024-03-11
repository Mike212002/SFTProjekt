/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.swing.*;

public class BewertungsFrame extends javax.swing.JFrame {

    private javax.swing.JButton addButton;
    private javax.swing.JLabel bewertIDLabel;
    private javax.swing.JTextField bewertIDTextField;
    private javax.swing.JLabel beschreibungLabel;
    private javax.swing.JTextField beschreibungTextField;
    private javax.swing.JLabel sterneLabel;
    private javax.swing.JTextField sterneTextField;

    public BewertungsFrame() {
        initComponents();
    }

    private void initComponents() {

        sterneLabel = new javax.swing.JLabel();
        sterneTextField = new javax.swing.JTextField();
        beschreibungLabel = new javax.swing.JLabel();
        beschreibungTextField = new javax.swing.JTextField();
        bewertIDLabel = new javax.swing.JLabel();
        bewertIDTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bewertung hinzufügen");

        sterneLabel.setText("Sterne:");

        beschreibungLabel.setText("Beschreibung:");

        bewertIDLabel.setText("Bewertungs-ID:");

        addButton.setText("Bewertung hinzufügen");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBewertungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sterneLabel)
                            .addComponent(beschreibungLabel)
                            .addComponent(bewertIDLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sterneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(beschreibungTextField)
                            .addComponent(bewertIDTextField)))
                    .addComponent(addButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sterneLabel)
                    .addComponent(sterneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beschreibungLabel)
                    .addComponent(beschreibungTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bewertIDLabel)
                    .addComponent(bewertIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }

    private void AddBewertungActionPerformed(java.awt.event.ActionEvent evt) {
        int sterne = Integer.parseInt(sterneTextField.getText());
        String beschreibung = beschreibungTextField.getText();
        int bewertID = Integer.parseInt(bewertIDTextField.getText());

        // Hier können Sie Ihre Logik für das Hinzufügen der Bewertung implementieren
        // Zum Beispiel können Sie eine Methode Ihrer Datenbankklasse aufrufen, um die Bewertung hinzuzufügen

        // Hier können Sie auch weitere Aktionen ausführen, wie das Aktualisieren der Tabelle usw.
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BewertungsFrame().setVisible(true);
            }
        });
    }
}
