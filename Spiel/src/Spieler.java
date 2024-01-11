class Spieler {

    private String name;
    private int xPos;
    private int rüstungswert;
    private int lebenspunkte;
    private int aktuelleWaffenstärke;

    public Spieler(String name, int xPos, int rüstungswert, int lebenspunkte, int aktuelleWaffenstärke) {
        this.name = name;
        this.xPos = xPos;
        this.rüstungswert = rüstungswert;
        this.lebenspunkte = lebenspunkte;
        this.aktuelleWaffenstärke = aktuelleWaffenstärke;
    }

    public int gibXPos() {
        return xPos;
    }

    public int gibWaffenstärke() {
        return aktuelleWaffenstärke;
    }

    public int gibRüstungswert() {
        return rüstungswert;
    }

    public int gibLebenspunkte() {
        return lebenspunkte;
    }

    public String gibName() {
        return name;
    }

    public void greifeGegnerAn(Spieler gegner, Regie regie) {
        int entfernung = regie.berechneEntfernung(this.gibXPos(), gegner.gibXPos());
        int wirkung = regie.berechneTrefferwirkung(this.gibWaffenstärke(), gegner.gibRüstungswert(), entfernung);

        if (wirkung > 0) {
            int neueLebenspunkte = gegner.gibLebenspunkte() - wirkung;
            gegner.setzeLebenspunkte(neueLebenspunkte);
            System.out.println(this.gibName() + " trifft " + gegner.gibName() + " und verursacht " + wirkung + " Schaden.");
        } else {
            System.out.println(this.gibName() + " verfehlt " + gegner.gibName() + ".");
        }
    }

    public void setzeLebenspunkte(int neueWert) {
        lebenspunkte = neueWert;
    }
}