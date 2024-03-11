package main;

// @author Mike Tim Nowak


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Datenbank {

    private final String url = "jdbc:mysql://localhost:3306/db_427829_1";
    private final String user = "root";
    private final String password = "";

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
    
      
    

  public ArrayList<Bewertung> holeAlleBewertungen() {
        ArrayList<Bewertung> alleBewertungen = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Datenbank Verbunden");
            String statement = "SELECT * FROM Bewertungssystem";
            try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
                ResultSet result = preparedStatement.executeQuery();
                while (result.next()) {
                    Bewertung bewertung = new Bewertung();
                    bewertung.setBewertID(result.getInt("BewertID"));
                    bewertung.setSterne(result.getInt("Sterne"));
                    bewertung.setBeschreibung(result.getString("Beschreibung"));
                    bewertung.setBetriebsID(result.getInt("BetriebsID"));
                    bewertung.setAutor(result.getString("Autor"));
                    alleBewertungen.add(bewertung);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return alleBewertungen;
    }
  
  
public boolean aktualisiereBewertungen(Bewertung bewertung) {
    try (Connection connection = DriverManager.getConnection(url, user, password)) {
        connection.setAutoCommit(false); // Setze AutoCommit auf false, um Transaktionen zu steuern
        String statement = "UPDATE Bewertungssystem SET Sterne = ?, Beschreibung = ?, Autor = ? WHERE BewertID = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
            preparedStatement.setInt(1, bewertung.getSterne());
            preparedStatement.setString(2, bewertung.getBeschreibung());
            preparedStatement.setString(3, bewertung.getAutor());
            preparedStatement.setInt(4, bewertung.getBewertID());

            int affectedRows = preparedStatement.executeUpdate();

            connection.commit(); // Transaktion abschließen

            return affectedRows > 0;
            
        } catch (SQLException e) {
            connection.rollback(); // Rollback im Fehlerfall
            System.out.println("SQL-Fehler beim Ausführen des Statements: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    } catch (SQLException e) {
        System.out.println("Fehler beim Herstellen der Verbindung zur Datenbank: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}

  
  
 
  
   public boolean löscheBewertungen(int BewertID) {
    try (Connection connection = DriverManager.getConnection(url, user, password)) {
        System.out.println("Datenbank Verbunden");
        String statement = "DELETE FROM Bewertungssystem WHERE BewertID = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
            System.out.println("Ausgeführter SQL-Befehl: " + statement);
            System.out.println("Zu löschende Bewertungs-ID: " + BewertID);
            
            preparedStatement.setInt(1, BewertID);

            int affectedRows = preparedStatement.executeUpdate();

            System.out.println("Anzahl der betroffenen Zeilen: " + affectedRows);

            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println("SQL-Fehler beim Ausführen des Statements: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    } catch (SQLException e) {
        System.out.println("Fehler beim Herstellen der Verbindung zur Datenbank: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}
  
 public boolean BewertDatenHinzufügen(Bewertung bewertung) {
    try (Connection connection = DriverManager.getConnection(url, user, password)) {
        System.out.println("Datenbank verbunden");
        
        // Überprüfen, ob die Betriebs-ID in der Bewertung korrekt gesetzt ist
        System.out.println("Betriebs-ID in Bewertung: " + bewertung.getBetriebsID());
        
        // SQL-Befehl zum Einfügen der Daten in die Bewertungstabelle
        String statement = "INSERT INTO Bewertungssystem(Sterne,BetriebsID ,Beschreibung, Autor ) VALUES (?, ?, ?,?)";
        System.out.println("SQL-Befehl: " + statement);
        
        
        
        
        System.out.println("Sterne:"+bewertung.getSterne());
             System.out.println("BetriebsID:"+bewertung.getBetriebsID());
            System.out.println("Beschreibung:"+bewertung.getBeschreibung());
           System.out.println("Autor:"+bewertung.getAutor());
           
           
           
           
        try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
            preparedStatement.setInt(1, bewertung.getSterne());
            preparedStatement.setInt(2, bewertung.getBetriebsID());
            preparedStatement.setString(3, bewertung.getBeschreibung());
            preparedStatement.setString(4, bewertung.getAutor());
            
            
             
            System.out.println("SQL-Befehl: " + statement);
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            // Drucken Sie eventuelle Fehlermeldungen aus
            System.out.println("Fehler beim Ausführen des SQL-Befehls: " + e.getMessage());
            e.printStackTrace();
        }
    } catch (SQLException e) {
        System.out.println("Fehler beim Herstellen der Verbindung zur Datenbank: " + e.getMessage());
        e.printStackTrace();
    }
    return false;
}
  
  
 public ArrayList<String> getBetriebsIDsAndNamesFromDatabase() {
    ArrayList<String> betriebsIDAndNameList = new ArrayList<>();
    try (Connection connection = DriverManager.getConnection(url, user, password)) {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT BetriebsID, Betriebsname FROM Betrieb");
        while (resultSet.next()) {
            String betriebsID = resultSet.getString("BetriebsID");
            String betriebsName = resultSet.getString("Betriebsname");
            String betriebsIDAndName = betriebsID + " - " + betriebsName; // Combine ID and Name
            betriebsIDAndNameList.add(betriebsIDAndName);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    System.out.println("Datenbankabfrage erfolgreich");
    return betriebsIDAndNameList;
}
 
 public boolean addBewertung(Bewertung bewertung) {
    try (Connection connection = DriverManager.getConnection(url, user, password)) {
        String statement = "INSERT INTO Bewertung (BetriebsID, Sterne, Beschreibung, Autor) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
            preparedStatement.setInt(1, bewertung.getBetriebsID());
            preparedStatement.setInt(2, bewertung.getSterne());
            preparedStatement.setString(3, bewertung.getBeschreibung());
            preparedStatement.setString(4, bewertung.getAutor());
            
            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println("SQL-Fehler beim Einfügen der Bewertung: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    } catch (SQLException e) {
        System.out.println("Fehler beim Herstellen der Verbindung zur Datenbank: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}

}
