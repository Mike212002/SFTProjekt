package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Schriftgrößeanpassen extends JFrame {
    private JLabel label;
    private JRadioButton smallFontButton;
    private JRadioButton largeFontButton;

    public Schriftgrößeanpassen() {
        setTitle("Schriftgröße wählen");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Beispieltext", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 12));

        smallFontButton = new JRadioButton("Kleine Schriftgröße");
        largeFontButton = new JRadioButton("Große Schriftgröße");

        ButtonGroup group = new ButtonGroup();
        group.add(smallFontButton);
        group.add(largeFontButton);

        smallFontButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Arial", Font.PLAIN, 12));
            }
        });

        largeFontButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Arial", Font.PLAIN, 24));
            }
        });

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(2, 1));
        radioPanel.add(smallFontButton);
        radioPanel.add(largeFontButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(label, BorderLayout.CENTER);
        getContentPane().add(radioPanel, BorderLayout.SOUTH);
    }

    
}