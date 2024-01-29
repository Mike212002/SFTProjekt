// @author Mike Tim Nowak

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Datenbank {
//Die URL für die Datenabnk in XAMPP      
    private final String url = "jdbc:mysql://localhost:3306/software_projekt";
    //Allgemeine Benutzername in Datenbanken
    private final String user = "root";    
     //Falls vorhanden, sollte dort ein Passwort stehen, damit die Connection erfolgreich wird
    private final String password = "";                                                    

    public Datenbank() {
    }

    public void dBConnector() {
        //Hier wird die Verbindung mit der Datenbank hergestellt, mithilfe der url, user, password
        try (Connection connection = DriverManager.getConnection(url, user, password)) {   
             //Gibt in der Ausgabenliste, das aus was im System.out..., wenn die Datenbank erflogreich verunden wurde
            System.out.println("Database connected!");                                             
    // sollte ein Fehler passieren, wird ein Fehler ausgegeben, der hinweiß darauf gibt, warum der Fehler kam
        } catch (SQLException e) {                                                                
            System.out.println(e);
        }

    }

    public void createBetrieb(BetriebModel betrieb) {
        //Hier wird ebenso die Connection hergestellt um die Daten einfügen zu können
        try (Connection connection = DriverManager.getConnection(url, user, password)) {  
             //Gibt in der Ausgabenliste, das aus was im System.out..., wenn die Datenbank erflogreich verunden wurde.
            System.out.println("Database connected!");       
              //Definiert die SQL ANweisungen, die Daten die in der Datenbank eingefügt werden soll.
            String statement = "INSERT INTO Betrieb(Betriebsname, Straße, Ort, PLZ, Ansprechpartner, Website) VALUES (?, ?, ?, ?, ?, ?)"; 
             // Hier werden SQL Anweisung mit Platzhaltern ausgestattet. Connection stellt die Verbidnung der Datenbank her umd die Statements herzustellen 
            try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {      
                // Die Platzhalter werden hier durch die Tatsächlichen Werte einzusetzen, die aus der Tabelle Betrieb ausgelesen werden. 
                preparedStatement.setString(1, betrieb.Betriebsname);                                                                               
                preparedStatement.setString(2, betrieb.Straße);
                preparedStatement.setString(3, betrieb.Ort);
                preparedStatement.setInt(4, betrieb.PLZ);
                preparedStatement.setString(5, betrieb.Ansprechpartner);
                preparedStatement.setString(6, betrieb.Website);
             // Hier wird es ausgeführt.  Dadurch, werden die Daten in die Tabelle der Datenbank eingeführt
                preparedStatement.execute();
               // sollte ein Fehler passieren, wird ein Fehler ausgegeben, der hinweiß darauf gibt, warum der Fehler kam
            } catch (Exception e) {                                                                                                        
                System.out.println(e);
            }
           // Gibt ein Fehler aus, wenn ein Fehler mit den Platzhaltern passiert
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
