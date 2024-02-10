package main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.password4j.*;
import javax.swing.JFrame;
import com.formdev.flatlaf.FlatLaf;


public class SFTProjekt {
 
    public static void main(String[] args) {
//         Datenbank DB = new Datenbank();
//         DB.dBConnec tor();


//     
        Login fenster = new Login();
        fenster.setVisible(true);
        



         FlatLaf.registerCustomDefaultsSource("main.DatenbankTabelleAnzeigen");

        
        FlatMacDarkLaf.setup();
//        DatenbankTabelleAnzeigen t = new DatenbankTabelleAnzeigen();
//        t.setVisible(true);
    }
}
