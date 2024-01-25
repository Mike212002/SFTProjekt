
public class SFTProjekt {
 
    
    public static void main(String[] args) {
       
        Datenbank DB = new Datenbank();
        DB.dBConnector();
        DatenbankFenster fenster = new DatenbankFenster();
       fenster.setVisible(true);
       LoginDaten LD = new LoginDaten();
//       login fenster2 = new login();
//       fenster2.setVisible(true);
//      
       
       
    }
    
   
}
