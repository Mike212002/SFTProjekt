package main;

/**
 *
 * @author a.franz
 */
public class Bewertung {

    private int BewertID;
    private int Sterne;
    private int BetriebsID;
    private String Beschreibung;

    public Bewertung(int BewertID, int Sterne, String Beschreibung) {
        this.BewertID = BewertID;
        this.Sterne = Sterne;
        this.Beschreibung = Beschreibung;
        this.BetriebsID = BetriebsID;
    }

    /**
     *
     * @param BewertID
     * @param Sterne
     * @param Beschreibung
     */
    public Bewertung(int Sterne, String Beschreibung) {

        
        this.Sterne = Sterne;
        this.Beschreibung = Beschreibung;
    }

    Bewertung() {
        
    }

    public int getBewertID() {
        return BewertID;
    }

    public void setBewertID(int BewertID) {
        this.BewertID = BewertID;
    }

    public int getSterne() {
        return Sterne;
    }

    public void setSterne(int Sterne) {
        this.Sterne = Sterne;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String Beschreibung) {
        this.Beschreibung = Beschreibung;
    }

    public void setBetriebsID(int BetriebsID) {
        this.BetriebsID = BetriebsID;
    }
    
    Object getBetriebsID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
