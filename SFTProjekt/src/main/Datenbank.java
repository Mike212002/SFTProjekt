package main;

// @author Mike Tim Nowak
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Datenbank {

    private final String url = "jdbc:mysql://mike007.lima-db.de:3306/db_427829_1";
    private final String user = "USER427829";
    private final String password = "Milka123mo";

    public Datenbank() {
    }

    public void dBConnector() {

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database connected!");

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public ArrayList<Betrieb> holeAlleBetriebe() {
        ArrayList<Betrieb> alleBetriebe = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database connected!");
            String statement = "SELECT * FROM Betrieb";
            try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
                ResultSet result = preparedStatement.executeQuery();
                while (result.next()) {
                    Betrieb betrieb = new Betrieb();
                    betrieb.setBetriebsID(result.getInt("BetriebsID"));
                    betrieb.setBetriebsname(result.getString("Betriebsname"));
                    betrieb.setStraße(result.getString("Straße"));
                    betrieb.setOrt(result.getString("Ort"));
                    betrieb.setPLZ(result.getInt("PLZ"));
                    betrieb.setAnsprechpartner(result.getString("Ansprechpartner"));
                    betrieb.setWebsite(result.getString("Website"));
                    betrieb.setEMail(result.getString("EMail"));

                    alleBetriebe.add(betrieb);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return alleBetriebe;
    }

    public boolean createBetrieb(Betrieb betrieb) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database connected!");
            String statement = "INSERT INTO Betrieb(Betriebsname, Straße, Ort, PLZ, Ansprechpartner, Website, EMail) VALUES (?, ?, ?, ?, ?, ?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
                preparedStatement.setString(1, betrieb.getBetriebsname());
                preparedStatement.setString(2, betrieb.getStraße());
                preparedStatement.setString(3, betrieb.getOrt());
                preparedStatement.setInt(4, betrieb.getPLZ());
                preparedStatement.setString(5, betrieb.getAnsprechpartner());
                preparedStatement.setString(6, betrieb.getWebsite());
                preparedStatement.setString(7, betrieb.getEMail());
                preparedStatement.execute();

                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows > 0) {
                    return true;
                } else {
                    return false;

                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);

        }
        return false;
    }

}
