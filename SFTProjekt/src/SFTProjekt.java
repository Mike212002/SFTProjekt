
public class SFTProjekt {
 
    
    public static void main(String[] args) {
       
        Datenbank DB = new Datenbank();
        DB.dBConnector();
//        DatenbankFenster fenster = new DatenbankFenster();
//       fenster.setVisible(true);
       LoginDaten LD = new LoginDaten();
       login fenster = new login();
       fenster.setVisible(true);
      
       
       
    }
    
   
}
