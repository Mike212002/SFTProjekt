public class SFTProjekt {
 
    public static void main(String[] args) {
         Datenbank DB = new Datenbank();
         DB.dBConnector();
         DatenbankFensterNew fenster = new DatenbankFensterNew();
         fenster.setVisible(true);
      
//        
//        login fenster = new login();
//        fenster.setVisible(true);
        
    }
}