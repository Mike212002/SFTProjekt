
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

                       
    private static final String DB_URL = "jdbc:mysql://localhost:3306/meineDatenbank";                 // Was zum teufel ist DB_Url, damit kriegst du nirgends eine DB Verbindung hin 
    private static final String USER = "benutzername";                                                  // Wie wärs mit Fragen stellen, ob wir schon irgendwo die Verbidnung mit der Datenbank haben????????
    private static final String PASSWORD = "passwort";                                                      // Diese 3 Zeilen haben hier in der Klasse nichts verloren, denn du willst die Tabelle ausdrucken und nicht die Verbindung mit der Datenbank
    public static void main(String[] args) {    
        // Hier wird der Code für die GUI generiert (z. B. Buttons, ActionListener).
    }

    private static void exportDataToTxt() {
        System.out.println("button geklickt");                                                              //Welchen Button haben wir denn geklickt???????????? // Schonmal überlegt das diese Zeile kein Sinn macht???????????????? Ergibt das jetzt jedes Mal aus
        try {                                                                                                     // ohne das man ein Button gecdrückt hat?????? Erkläre mir den Sinn, hinter dem System.out..............??????
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            String sql = "SELECT * FROM deineTabelle";                                                                              //deine Tabelle????? Welche Tabelle meinst du denn? Was soll er dort auswählen???
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("datenbankdaten.txt"))) {                            //Überlegt euch ein neuen Namen, ergibt null Sinn, es datenbankdaten zu nennen. Der Kunde hat also ein random Textdokumetn auf sein PC, ohne zu 
                while (resultSet.next()) {                                                                                              //wissen was er dort überhaupt hat. Nicht benutzerfreundlich
                    // Annahme: Du hast zwei Spalten in der Tabelle (Spalte1 und Spalte2).
                    String data = resultSet.getString("BetriebsID") + "\t" + resultSet.getString("Sterne");   // Wir haben  mehr als 2 Spalten??? Wie kommst du darauf, dass wir nus 2 Spalten haben????  Was ist Sterne? Sowas haben wir nicht in der Datenbank ??????????
                    writer.write(data);
                    writer.newLine();
                }
            }

            System.out.println("Daten wurden erfolgreich in die Textdatei exportiert.");                       // Wenn ihr nicht wisst, wie ihr anfangen müsst, oder was die Voraaussetzungen sind, wie das hier überhaupt funktioniert, wieso fragt ihr nicht einfach??
       
                                                                                                            // Ihr wisst nicht einmal wie unsere Datenbank überhautp aussieht. Hört auf alles 1 zu 1 aus Chatgpt zu nehmen ohne es zu hinterfragen, obs 
        } catch (SQLException | IOException e) {                q                                           //Überhaupt sinn macht, was ihr da klaut. Fangt endlich an zu arbeiten und zu fragen, wenn ihr was nicht wisst, oder wollt ihr eine 6 kassieren?
            e.printStackTrace();    
        }
    }
}
