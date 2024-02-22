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
            System.out.println("Datenbank Verbunden");

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public boolean aktualisiereBetrieb(Betrieb betrieb) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Datenbank Verbunden");
            String statement = "UPDATE Betrieb SET Betriebsname = ?, Straße = ?, Ort = ?, PLZ = ?, Ansprechpartner = ?, Website = ?, EMail = ? WHERE BetriebsID = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
                preparedStatement.setString(1, betrieb.getBetriebsname());
                preparedStatement.setString(2, betrieb.getStraße());
                preparedStatement.setString(3, betrieb.getOrt());
                preparedStatement.setInt(4, betrieb.getPLZ()); // PLZ hinzugefügt
                preparedStatement.setString(5, betrieb.getAnsprechpartner());
                preparedStatement.setString(6, betrieb.getWebsite());
                preparedStatement.setString(7, betrieb.getEMail());
                preparedStatement.setInt(8, betrieb.getBetriebsID());

                int affectedRows = preparedStatement.executeUpdate();

                return affectedRows > 0;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean löscheBetrieb(int betriebsID) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Datenbank Verbunden");
            String statement = "DELETE FROM Betrieb WHERE BetriebsID = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
                preparedStatement.setInt(1, betriebsID);

                int affectedRows = preparedStatement.executeUpdate();

                return affectedRows > 0;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public ArrayList<Betrieb> holeAlleBetriebe() {
        ArrayList<Betrieb> alleBetriebe = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Datenbank Verbunden");
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

    public boolean DatenHinzufügen(Betrieb betrieb) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Datenbank Verbunden");
            String statement = "INSERT INTO Betrieb(Betriebsname, Straße, Ort, PLZ, Ansprechpartner, Website, EMail) VALUES (?, ?, ?, ?, ?, ?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
                preparedStatement.setString(1, betrieb.getBetriebsname());
                preparedStatement.setString(2, betrieb.getStraße());
                preparedStatement.setString(3, betrieb.getOrt());
                preparedStatement.setInt(4, betrieb.getPLZ());
                preparedStatement.setString(5, betrieb.getAnsprechpartner());
                preparedStatement.setString(6, betrieb.getWebsite());
                preparedStatement.setString(7, betrieb.getEMail());

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
    
    
  public boolean überprüfeAnmeldung(String username, String password) {
        try (Connection connection = DriverManager.getConnection(url, user, this.password)) {
            String sql = "SELECT Password FROM LoginDaten WHERE Benutzername = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        String storedPassword = resultSet.getString("Password");
                        return password.equals(storedPassword);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
