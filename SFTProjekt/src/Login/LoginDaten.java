/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author leon.effenberger
 */
public class LoginDaten{

    String benutzernameEingabe;
    String passwortEingabe;
    String lehrerPasswort = "Platzhalter1";
    String schülerPasswort = "Platzhalter2";

    public void passwortWillWiederNet() {
        // Lehrer-Login
        if (benutzernameEingabe == "Administrator") {
            if (passwortEingabe == lehrerPasswort) {
            } else {
                System.out.println("Falsche Login daten");
            }
        } // Schüler-Login
        else if (benutzernameEingabe == "Schüler") {
            if (passwortEingabe == schülerPasswort) {
            } else {
                System.out.println("Falsche Login Daten");
            }

        }//Ungültiger login
        else {
            System.out.println("Falsche Login Daten");
        }
    }
}