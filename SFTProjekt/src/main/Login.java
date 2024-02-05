package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import java.awt.Color;
//import javax.swing.BorderFactory;
import com.password4j.Hash;
import com.password4j.Password;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//import javax.swing.border.Border;

/**
 *
 * @author Mike Tim Nowak
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        initCustomComponents();

//          txtBenutzername.setForeground(Color.BLACK);
//    txtpasswort.setForeground(Color.BLACK);
     txtBenutzername.setOpaque(false); // Stellen Sie sicher, dass das Textfeld nicht deckend ist
////    txtBenutzername = new TransparentTextField();
        txtpasswort.setOpaque(false);
        this.


//        txtBenutzername.setBackground(new java.awt.Color(0, 0, 0, 1));
//        txtpasswort.setBackground(new java.awt.Color(0, 0, 0, 1));
//    
jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png")));
txtBenutzername.setText(""); // Clear the text field
txtpasswort.setText("");      // Clear the password field



    }
           


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Anmeldeanzeige = new javax.swing.JLabel();
        BenutzernameAnzeige = new javax.swing.JLabel();
        Strich = new javax.swing.JLabel();
        txtBenutzername = new javax.swing.JTextField();
        UserBild = new javax.swing.JLabel();
        PasswortAnzeige = new javax.swing.JLabel();
        txtpasswort = new javax.swing.JPasswordField();
        Strich2 = new javax.swing.JLabel();
        nichtsehen = new javax.swing.JLabel();
        Sehen = new javax.swing.JLabel();
        Passwortmerken = new javax.swing.JCheckBox();
        PasswortVergessen = new javax.swing.JLabel();
        AnmeldeButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg-login.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 500, 340));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Anmeldeanzeige.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Anmeldeanzeige.setForeground(new java.awt.Color(255, 255, 255));
        Anmeldeanzeige.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anmeldeanzeige.setText("Anmelden");
        jPanel2.add(Anmeldeanzeige, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, 41));

        BenutzernameAnzeige.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        BenutzernameAnzeige.setForeground(new java.awt.Color(199, 226, 255));
        BenutzernameAnzeige.setText("Benutzername");
        jPanel2.add(BenutzernameAnzeige, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 123, 341, -1));

        Strich.setForeground(new java.awt.Color(255, 255, 255));
        Strich.setText("_________________________________________");
        Strich.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Strich, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 147, 290, 39));

        txtBenutzername.setFont(txtBenutzername.getFont().deriveFont(txtBenutzername.getFont().getSize()+2f));
        txtBenutzername.setForeground(new java.awt.Color(255, 255, 255));
        txtBenutzername.setBorder(null);
        txtBenutzername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBenutzernameActionPerformed(evt);
            }
        });
        jPanel2.add(txtBenutzername, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 140, 240, 30));

        UserBild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(UserBild, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 147, 40, 39));

        PasswortAnzeige.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        PasswortAnzeige.setForeground(new java.awt.Color(199, 226, 255));
        PasswortAnzeige.setText("Passwort");
        jPanel2.add(PasswortAnzeige, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 192, 341, -1));

        txtpasswort.setFont(txtpasswort.getFont().deriveFont(txtpasswort.getFont().getSize()+2f));
        txtpasswort.setForeground(new java.awt.Color(255, 255, 255));
        txtpasswort.setBorder(null);
        txtpasswort.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpasswort.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtpasswort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswortActionPerformed(evt);
            }
        });
        jPanel2.add(txtpasswort, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, 30));

        Strich2.setForeground(new java.awt.Color(255, 255, 255));
        Strich2.setText("_________________________________________");
        jPanel2.add(Strich2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 216, 290, 40));

        nichtsehen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nichtsehen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        nichtsehen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nichtsehen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nichtsehenMouseClicked(evt);
            }
        });
        jPanel2.add(nichtsehen, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 216, 40, 40));

        Sehen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sehen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        Sehen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sehen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SehenMouseClicked(evt);
            }
        });
        jPanel2.add(Sehen, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 216, 40, 40));

        Passwortmerken.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Passwortmerken.setForeground(new java.awt.Color(199, 226, 255));
        Passwortmerken.setText("Passwort merken");
        Passwortmerken.setOpaque(false);
        Passwortmerken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswortmerkenActionPerformed(evt);
            }
        });
        jPanel2.add(Passwortmerken, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        PasswortVergessen.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        PasswortVergessen.setForeground(new java.awt.Color(199, 226, 255));
        PasswortVergessen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PasswortVergessen.setText("Passwort Vergessen");
        PasswortVergessen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(PasswortVergessen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 121, 27));

        AnmeldeButton.setBackground(new java.awt.Color(255, 255, 255));
        AnmeldeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AnmeldeButton.setForeground(new java.awt.Color(25, 118, 211));
        AnmeldeButton.setText("Anmelden");
        AnmeldeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AnmeldeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnmeldeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AnmeldeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 341, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 420, 470));

        setSize(new java.awt.Dimension(932, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nichtsehenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nichtsehenMouseClicked
        txtpasswort.setEchoChar((char) 0);
        nichtsehen.setVisible(false);
        nichtsehen.setEnabled(false);
        Sehen.setEnabled(true);
        Sehen.setEnabled(true);
    }//GEN-LAST:event_nichtsehenMouseClicked

    private void SehenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SehenMouseClicked
        txtpasswort.setEchoChar((char) 8226);
        nichtsehen.setVisible(true);
        nichtsehen.setEnabled(true);
        Sehen.setEnabled(false);
        Sehen.setEnabled(false);
    }//GEN-LAST:event_SehenMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened


    private void txtBenutzernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBenutzernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBenutzernameActionPerformed

    private void txtpasswortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswortActionPerformed

    private void AnmeldeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnmeldeButtonActionPerformed
        String username = txtBenutzername.getText();
        String password = new String(txtpasswort.getPassword());

        // Check if username or password is empty
        if (username.isEmpty() || password.isEmpty()) {
            // If either field is empty, show a message and return without further processing
            JOptionPane.showMessageDialog(this, "Falsche Anmelde Daten.");
            return;
        }
        
        //todo: Zu Test-Zwecken hier eingefügt
        Hash hashedPasswort = Password.hash("password").addPepper().withBcrypt();
        String gespeichertesPasswort = hashedPasswort.getResult();
        boolean validiert = Password.check(password, gespeichertesPasswort).addPepper().withBcrypt();
        
        if(username.equals("schüler") && validiert){
            Navigation navigationsfenster = new Navigation();
            navigationsfenster.setVisible(true);
            this.dispose(); // Close the login window 
        } else if (username.equals("Lehrer") && password.equals("password2")) {
            // access fur Lehrer
            Navigation navigationsfenster = new Navigation();
            navigationsfenster.setVisible(true);
            this.dispose(); // Close the login window 
        } else {
            // Invalid username or password
            JOptionPane.showMessageDialog(this, "Falsche Anmelde Daten.");
        }
    }//GEN-LAST:event_AnmeldeButtonActionPerformed

    private void PasswortmerkenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswortmerkenActionPerformed
        //TODO add your handling code here:
    }//GEN-LAST:event_PasswortmerkenActionPerformed
//public class TransparentTextField extends JTextField {
//    public TransparentTextField() {
//        setOpaque(false); // Stellen Sie sicher, dass das Textfeld nicht deckend ist
//        Border border = BorderFactory.createEmptyBorder(); // Erstellen Sie einen leeren Rahmen, um den Hintergrund transparent zu halten
//        setBorder(border); // Setzen Sie den leeren Rahmen als Rahmen für das Textfeld
//    }

    private void initCustomComponents(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnmeldeButton;
    private javax.swing.JLabel Anmeldeanzeige;
    private javax.swing.JLabel BenutzernameAnzeige;
    private javax.swing.JLabel PasswortAnzeige;
    private javax.swing.JLabel PasswortVergessen;
    private javax.swing.JCheckBox Passwortmerken;
    private javax.swing.JLabel Sehen;
    private javax.swing.JLabel Strich;
    private javax.swing.JLabel Strich2;
    private javax.swing.JLabel UserBild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nichtsehen;
    private javax.swing.JTextField txtBenutzername;
    private javax.swing.JPasswordField txtpasswort;
    // End of variables declaration//GEN-END:variables
}