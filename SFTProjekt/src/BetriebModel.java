
/**
 *
 * @author miket
 */
public class BetriebModel {

    private int BetriebsID;
    String Betriebsname;
    String Straße;
    String Ort;
    int PLZ;
    String Ansprechpartner;
    String Website;

    public BetriebModel(String Betriebsname, String Straße, String Ort, int PLZ, String Ansprechpartner, String Website) {
        this.Betriebsname = Betriebsname;
        this.Straße = Straße;
        this.Ort = Ort;
        this.PLZ = PLZ;
        this.Ansprechpartner = Ansprechpartner;
        this.Website = Website;
        
    }
}