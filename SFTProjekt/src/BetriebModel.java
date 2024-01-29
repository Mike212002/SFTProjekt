
/**
 *
 * @author miket
 */
public class BetriebModel {

    
    //Hier wird Variabeln gesetzt
    private int BetriebsID;
    String Betriebsname;
    String Straße;
    String Ort;
    int PLZ;
    String Ansprechpartner;
    String Website;

    public BetriebModel(String Betriebsname, String Straße, String Ort, int PLZ, String Ansprechpartner, String Website) {
        // Wenn ein neues Objekt erstellt wird, werden die Werte entsprechend der InstanzVariabeln hinzugefügt.
        this.Betriebsname = Betriebsname;
        this.Straße = Straße;
        this.Ort = Ort;
        this.PLZ = PLZ;
        this.Ansprechpartner = Ansprechpartner;
        this.Website = Website;
        
    }
}
