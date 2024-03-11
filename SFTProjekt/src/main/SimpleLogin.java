package main;

import javax.swing.*;
import java.awt.event.*;
import com.sun.jna.platform.win32.Advapi32;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.platform.win32.WinBase;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.Advapi32;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.WinBase;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.platform.win32.WinNT.HANDLE;
import com.sun.jna.platform.win32.WinNT.HANDLEByReference;
import com.sun.jna.ptr.IntByReference;


public class SimpleLogin extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JRadioButton studentRadioButton;
    private JRadioButton teacherRadioButton;

    public SimpleLogin() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple Login");
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        JLabel usernameLabel = new JLabel("Benutzername:");
        JLabel passwordLabel = new JLabel("Passwort:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Anmelden");
        studentRadioButton = new JRadioButton("Schüler");
        teacherRadioButton = new JRadioButton("Lehrer");

        ButtonGroup roleGroup = new ButtonGroup();
        roleGroup.add(studentRadioButton);
        roleGroup.add(teacherRadioButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(usernameLabel)
                        .addComponent(passwordLabel)
                        .addComponent(studentRadioButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(usernameField)
                        .addComponent(passwordField)
                        .addComponent(teacherRadioButton)
                        .addComponent(loginButton))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(usernameLabel)
                        .addComponent(usernameField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordLabel)
                        .addComponent(passwordField))
                .addComponent(studentRadioButton)
                .addComponent(teacherRadioButton)
                .addComponent(loginButton)
        );

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (authenticateWithWindows(username, password)) {
            if (studentRadioButton.isSelected()) {
                JOptionPane.showMessageDialog(this, "Anmeldung als Schüler erfolgreich!");
            } else if (teacherRadioButton.isSelected()) {
                JOptionPane.showMessageDialog(this, "Anmeldung als Lehrer erfolgreich!");
            } else {
                JOptionPane.showMessageDialog(this, "Bitte wählen Sie eine Benutzerrolle aus.", "Fehler", JOptionPane.ERROR_MESSAGE);
            }
            openNavigation(); // Hier wird die Navigation geöffnet
            this.dispose(); // Schließt das Anmeldefenster
        } else {
            JOptionPane.showMessageDialog(this, "Falsche Anmeldeinformationen", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

       private boolean authenticateWithWindows(String username, String password) {
        HANDLEByReference phToken = new HANDLEByReference();
        boolean success = Advapi32.INSTANCE.LogonUser(username, "", password, 
                        WinBase.LOGON32_LOGON_NETWORK, WinBase.LOGON32_PROVIDER_DEFAULT, phToken);

        if (success) {
            // Authentifizierung erfolgreich
            Kernel32.INSTANCE.CloseHandle(phToken.getValue());
            return true;
        } else {
            // Authentifizierung fehlgeschlagen
            int error = Native.getLastError();
            System.err.println("Fehlercode: " + error);
            return false;
        }
    }

    private void openNavigation() {
        Navigation navigation = new Navigation();
        navigation.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleLogin().setVisible(true);
            }
        });
    }
}
