
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Datenbank {

    private final String url = "jdbc:mysql://localhost:3306/software_projekt";
    private final String user = "root";
    private final String password = "";

    public Datenbank() {
    }

    public void dBConnector() {

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database connected!");

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void createBetrieb(BetriebModel betrieb) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database connected!");
            String statement = "INSERT INTO Betrieb(Betriebsname, Straße, Ort, PLZ, Ansprechpartner, Website) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
                preparedStatement.setString(1, betrieb.Betriebsname);
                preparedStatement.setString(2, betrieb.Straße);
                preparedStatement.setString(3, betrieb.Ort);
                preparedStatement.setInt(4, betrieb.PLZ);
                preparedStatement.setString(5, betrieb.Ansprechpartner);
                preparedStatement.setString(6, betrieb.Website);
                preparedStatement.execute();
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}

//Er stellt die Verbindung mit der Datenbank her.
//Dort wird ausgegeben das er mit der Datenbank die Verbindung hergestellt wird
// Hier wird der Fehler ausgegeben

