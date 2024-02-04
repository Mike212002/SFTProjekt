package main;

// @author Mike Tim Nowak
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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


    public boolean createBetrieb(Betrieb betrieb) {
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

    

   



