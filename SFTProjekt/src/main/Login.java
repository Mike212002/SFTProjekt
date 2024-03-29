package main;

import com.password4j.Hash;
import com.password4j.Password;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Airajaxx also nur den Code, der rest Mike Tim Nowak, außer nicht
 * sehen und sehen und init CustomComponents, das war auch Mike Tim Nowak
 */
public class Login extends javax.swing.JFrame {

    private String LetzBenutzteBenutzername;
    private String LetzBenutztePasswort;
    private final Datenbank datenbank;

    public Login() {
        initComponents();
        initCustomComponents();
        datenbank = new Datenbank();
        datenbank.dBConnector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Anmeldeanzeige = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BenutzerPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        BenutzerAnzeige = new javax.swing.JLabel();
        Benutzername = new javax.swing.JTextField();
        UserBild = new javax.swing.JLabel();
        PasswordPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        PasswortAnzeige = new javax.swing.JLabel();
        txtpasswort = new javax.swing.JPasswordField();
        nichtsehen = new javax.swing.JLabel();
        sehen = new javax.swing.JLabel();
        AnmeldeButton = new javax.swing.JButton();
        PasswortButtons = new javax.swing.JPanel();
        Passwortmerken = new javax.swing.JCheckBox();
        PasswortVergessen = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(2, 2));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg-login.png"))); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel2.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        Anmeldeanzeige.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Anmeldeanzeige.setForeground(new java.awt.Color(255, 255, 255));
        Anmeldeanzeige.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anmeldeanzeige.setText("Anmelden");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(Anmeldeanzeige, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jPanel4, gridBagConstraints);

        BenutzerPanel.setBackground(new java.awt.Color(25, 118, 211));
        BenutzerPanel.setLayout(new java.awt.GridBagLayout());

        jPanel7.setBackground(new java.awt.Color(25, 118, 211));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.setMinimumSize(new java.awt.Dimension(300, 60));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        BenutzerAnzeige.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        BenutzerAnzeige.setForeground(new java.awt.Color(199, 226, 255));
        BenutzerAnzeige.setText("Benutzername");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(BenutzerAnzeige, gridBagConstraints);

        Benutzername.setBackground(new java.awt.Color(25, 118, 211));
        Benutzername.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Benutzername.setForeground(new java.awt.Color(255, 255, 255));
        Benutzername.setToolTipText("");
        Benutzername.setBorder(null);
        Benutzername.setPreferredSize(new java.awt.Dimension(170, 16));
        Benutzername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BenutzernameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 177;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel7.add(Benutzername, gridBagConstraints);

        BenutzerPanel.add(jPanel7, new java.awt.GridBagConstraints());

        UserBild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 6, 0);
        BenutzerPanel.add(UserBild, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel2.add(BenutzerPanel, gridBagConstraints);

        PasswordPanel.setBackground(new java.awt.Color(25, 118, 211));
        PasswordPanel.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBackground(new java.awt.Color(25, 118, 211));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel6.setMinimumSize(new java.awt.Dimension(300, 60));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        PasswortAnzeige.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        PasswortAnzeige.setForeground(new java.awt.Color(199, 226, 255));
        PasswortAnzeige.setText("Passwort");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        jPanel6.add(PasswortAnzeige, gridBagConstraints);

        txtpasswort.setBackground(new java.awt.Color(25, 118, 211));
        txtpasswort.setFont(txtpasswort.getFont().deriveFont(txtpasswort.getFont().getSize()+2f));
        txtpasswort.setForeground(new java.awt.Color(255, 255, 255));
        txtpasswort.setToolTipText("");
        txtpasswort.setBorder(null);
        txtpasswort.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpasswort.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtpasswort.setPreferredSize(new java.awt.Dimension(170, 16));
        txtpasswort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswortActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 177;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel6.add(txtpasswort, gridBagConstraints);

        PasswordPanel.add(jPanel6, new java.awt.GridBagConstraints());

        nichtsehen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nichtsehen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        nichtsehen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nichtsehen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nichtsehenMouseClicked(evt);
            }
        });
        PasswordPanel.add(nichtsehen, new java.awt.GridBagConstraints());

        sehen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sehen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        sehen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sehen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sehenMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PasswordPanel.add(sehen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel2.add(PasswordPanel, gridBagConstraints);

        AnmeldeButton.setBackground(new java.awt.Color(255, 255, 255));
        AnmeldeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AnmeldeButton.setForeground(new java.awt.Color(25, 118, 211));
        AnmeldeButton.setText("Anmelden");
        AnmeldeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AnmeldeButton.setMaximumSize(new java.awt.Dimension(300, 1000));
        AnmeldeButton.setMinimumSize(new java.awt.Dimension(200, 50));
        AnmeldeButton.setPreferredSize(new java.awt.Dimension(20, 40));
        AnmeldeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnmeldeButtonActionPerformed(evt);
            }
        });
        AnmeldeButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AnmeldeButtonKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(30, 25, 10, 25);
        jPanel2.add(AnmeldeButton, gridBagConstraints);

        PasswortButtons.setBackground(new java.awt.Color(25, 118, 211));
        PasswortButtons.setMinimumSize(new java.awt.Dimension(200, 60));
        PasswortButtons.setPreferredSize(new java.awt.Dimension(280, 28));
        PasswortButtons.setLayout(new java.awt.GridBagLayout());

        Passwortmerken.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Passwortmerken.setForeground(new java.awt.Color(199, 226, 255));
        Passwortmerken.setText("Passwort merken");
        Passwortmerken.setOpaque(false);
        Passwortmerken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswortmerkenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        PasswortButtons.add(Passwortmerken, gridBagConstraints);

        PasswortVergessen.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        PasswortVergessen.setForeground(new java.awt.Color(199, 226, 255));
        PasswortVergessen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PasswortVergessen.setText("Passwort Vergessen");
        PasswortVergessen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PasswortVergessen.setMinimumSize(new java.awt.Dimension(125, 27));
        PasswortVergessen.setPreferredSize(new java.awt.Dimension(125, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        PasswortButtons.add(PasswortVergessen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(PasswortButtons, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel2.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(filler2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        setSize(new java.awt.Dimension(1046, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswortActionPerformed

    }//GEN-LAST:event_txtpasswortActionPerformed

    private void AnmeldeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnmeldeButtonActionPerformed
        String username = Benutzername.getText();
        String password = new String(txtpasswort.getPassword());

        if (datenbank.überprüfeAnmeldung(username, password)) {

            Navigation navigationsfenster = new Navigation();
            navigationsfenster.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Falsche Anmeldeinformationen", "Fehler", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_AnmeldeButtonActionPerformed

    private void PasswortmerkenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswortmerkenActionPerformed
        //TODO add your handling code here:
    }//GEN-LAST:event_PasswortmerkenActionPerformed

    private void nichtsehenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nichtsehenMouseClicked
        txtpasswort.setEchoChar((char) 0);
        nichtsehen.setVisible(false);
        nichtsehen.setEnabled(false);
        sehen.setEnabled(true);
        sehen.setEnabled(true);
    }//GEN-LAST:event_nichtsehenMouseClicked

    private void sehenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sehenMouseClicked
        txtpasswort.setEchoChar((char) 8226);
        nichtsehen.setVisible(true);
        nichtsehen.setEnabled(true);
        sehen.setEnabled(false);
        sehen.setEnabled(false);
    }//GEN-LAST:event_sehenMouseClicked

    private void AnmeldeButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnmeldeButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            anmelden();
        }
    }//GEN-LAST:event_AnmeldeButtonKeyPressed

    private void BenutzernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BenutzernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BenutzernameActionPerformed

    private void anmelden() {
        String username = Benutzername.getText();
        String password = new String(txtpasswort.getPassword());

        if (datenbank.überprüfeAnmeldung(username, password)) {

            if (Passwortmerken.isSelected()) {
                LetzBenutzteBenutzername = username;
                LetzBenutztePasswort = password;
            }

            Navigation navigationsfenster = new Navigation();
            navigationsfenster.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Falsche Anmeldeinformationen", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());
        if (LetzBenutzteBenutzername != null && LetzBenutztePasswort != null) {
            Benutzername.setText(LetzBenutzteBenutzername);
            txtpasswort.setText(LetzBenutztePasswort);
            Passwortmerken.setSelected(true); // Check the "Passwort merken" checkbox
        }
        Benutzername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    anmelden();
                }
            }
        });

        txtpasswort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    anmelden();
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnmeldeButton;
    private javax.swing.JLabel Anmeldeanzeige;
    private javax.swing.JLabel BenutzerAnzeige;
    private javax.swing.JPanel BenutzerPanel;
    private javax.swing.JTextField Benutzername;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JLabel PasswortAnzeige;
    private javax.swing.JPanel PasswortButtons;
    private javax.swing.JLabel PasswortVergessen;
    private javax.swing.JCheckBox Passwortmerken;
    private javax.swing.JLabel UserBild;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel nichtsehen;
    private javax.swing.JLabel sehen;
    private javax.swing.JPasswordField txtpasswort;
    // End of variables declaration//GEN-END:variables
}
