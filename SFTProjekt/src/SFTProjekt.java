
public class SFTProjekt {
 
    
    public static void main(String[] args) {
       
        Datenbank DB = new Datenbank();
        DB.dBConnector();
        DatenbankFenster fenster = new DatenbankFenster();
        fenster.setSize(1250, 750);
        fenster.setVisible(true);
        fenster.setTitle("Datenbank");
        fenster.toFront();
    }
    
   
}
