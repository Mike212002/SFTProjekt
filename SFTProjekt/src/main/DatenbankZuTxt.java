/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author leon.effenberger
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatenbankZuTxt {

    private static final String DB_URL = "jdbc:mysql://mike007.lima-db.de:3306/db_427829_1";
    private static final String USER = "USER427829";
    private static final String PASSWORD = "Milka123mo";

    public static void main(String[] args) {
        // Hier wird der Code für die GUI generiert (z. B. Buttons, ActionListener).
    }

    private static void exportDataToTxt() {
        System.out.println("button geklickt");
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            String sql = "SELECT * FROM deineTabelle";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("datenbankdaten.txt"))) {
                while (resultSet.next()) {
                    // Annahme: Du hast zwei Spalten in der Tabelle (Spalte1 und Spalte2).
                    String data = resultSet.getString("BetriebsID") + "\t" + resultSet.getString("Sterne");
                    writer.write(data);
                    writer.newLine();
                }
            }

            System.out.println("Daten wurden erfolgreich in die Textdatei exportiert.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
