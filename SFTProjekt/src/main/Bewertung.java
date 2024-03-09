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
    private String Autor;

    public Bewertung(int BewertID, int Sterne, String Beschreibung) {
        this.BewertID = BewertID;
        this.Sterne = Sterne;
        this.BetriebsID = BetriebsID;
        this.Beschreibung = Beschreibung;
        
        this.Autor = Autor;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     *
     * @param BewertID
     * @param Sterne
     * @param Beschreibung
     */


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
    
    public int getBetriebsID() {
        return BetriebsID;
    }
    public void setBetriebsID(int BetriebsID) {
        this.BetriebsID = BetriebsID;
    }

    
    
    
}
