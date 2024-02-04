package main;

import javax.swing.*;

public class PasswortAbfrage extends javax.swing.JDialog {

    private String korrektesPasswort = "geheim";

    public PasswortAbfrage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // Method to validate the entered password
    private boolean isPasswortKorrekt(String passwort) {
        return passwort.equals(korrektesPasswort);
    }

    // This method will be called when the "OK" button is clicked
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String passwort = passwortField.getText();
        if (isPasswortKorrekt(passwort)) {
            // Passwort ist korrekt, also die nächste GUI anzeigen
            DatenbankAnzeigen datenbankanzeigen = new DatenbankAnzeigen();
            datenbankanzeigen.setVisible(true);
            this.dispose(); // Schließen Sie das Passwortabfragefenster
        } else {
            // Passwort ist falsch, also eine Fehlermeldung anzeigen
            JOptionPane.showMessageDialog(this, "Falsches Passwort. Bitte versuchen Sie es erneut.", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Auto-generated code by GUI builder
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        passwortLabel = new javax.swing.JLabel();
        passwortField = new javax.swing.JPasswordField();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Passwort eingeben");
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        passwortLabel.setText("Passwort:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        getContentPane().add(passwortLabel, gridBagConstraints);

        passwortField.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        getContentPane().add(passwortField, gridBagConstraints);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        getContentPane().add(okButton, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    // Variables declaration - do not modify
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passwortField;
    private javax.swing.JLabel passwortLabel;
    // End of variables declaration
}
