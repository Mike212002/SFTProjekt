package main;


/**
 *
 * @author miket
 */
public class Betrieb {
    private int BetriebsID;
    private String Betriebsname;
    private String Straße;
    private String Ort;
    private int PLZ;
    private String Ansprechpartner;
    private String Website;
    private String EMail;

    public Betrieb(int BetriebsId, String Betriebsname, String Straße, String Ort, int PLZ, String Ansprechpartner, String Website, String EMail) {
        this.Betriebsname = Betriebsname;
        this.Straße = Straße;
        this.Ort = Ort;
        this.PLZ = PLZ;
        this.Ansprechpartner = Ansprechpartner;
        this.Website = Website;
        this.EMail = EMail;
    }
    
    public Betrieb(String Betriebsname, String Straße, String Ort, int PLZ, String Ansprechpartner, String Website, String EMail) {
        this.Betriebsname = Betriebsname;
        this.Straße = Straße;
        this.Ort = Ort;
        this.PLZ = PLZ;
        this.Ansprechpartner = Ansprechpartner;
        this.Website = Website;
        this.EMail = EMail;
    }
    
    public Betrieb() {
    }

    /**
     * @return the BetriebsID
     */
    public int getBetriebsID() {
        return BetriebsID;
    }

    /**
     * @param BetriebsID the BetriebsID to set
     */
    public void setBetriebsID(int BetriebsID) {
        this.BetriebsID = BetriebsID;
    }

    /**
     * @return the Betriebsname
     */
    public String getBetriebsname() {
        return Betriebsname;
    }

    /**
     * @param Betriebsname the Betriebsname to set
     */
    public void setBetriebsname(String Betriebsname) {
        this.Betriebsname = Betriebsname;
    }

    /**
     * @return the Straße
     */
    public String getStraße() {
        return Straße;
    }

    /**
     * @param Straße the Straße to set
     */
    public void setStraße(String Straße) {
        this.Straße = Straße;
    }

    /**
     * @return the Ort
     */
    public String getOrt() {
        return Ort;
    }

    /**
     * @param Ort the Ort to set
     */
    public void setOrt(String Ort) {
        this.Ort = Ort;
    }

    /**
     * @return the PLZ
     */
    public int getPLZ() {
        return PLZ;
    }

    /**
     * @param PLZ the PLZ to set
     */
    public void setPLZ(int PLZ) {
        this.PLZ = PLZ;
    }

    /**
     * @return the Ansprechpartner
     */
    public String getAnsprechpartner() {
        return Ansprechpartner;
    }

    /**
     * @param Ansprechpartner the Ansprechpartner to set
     */
    public void setAnsprechpartner(String Ansprechpartner) {
        this.Ansprechpartner = Ansprechpartner;
    }

    /**
     * @return the Website
     */
    public String getWebsite() {
        return Website;
    }

    /**
     * @param Website the Website to set
     */
    public void setWebsite(String Website) {
        this.Website = Website;
    }

    /**
     * @return the EMail
     */
    public String getEMail() {
        return EMail;
    }

    /**
     * @param EMail the EMail to set
     */
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

}
