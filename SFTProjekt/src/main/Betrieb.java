package main;


/**
 *
 * @author miket
 */
public class Betrieb {

    private int BetriebsID;
    String Betriebsname;
    String Straße;
    String Ort;
    int PLZ;
    String Ansprechpartner;
    String Website;
    String EMail;

    public Betrieb(String Betriebsname, String Straße, String Ort, int PLZ, String Ansprechpartner, String Website, String EMail) {
        this.Betriebsname = Betriebsname;
        this.Straße = Straße;
        this.Ort = Ort;
        this.PLZ = PLZ;
        this.Ansprechpartner = Ansprechpartner;
        this.Website = Website;
        this.EMail = EMail;
    }

    

}
