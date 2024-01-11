import java.util.Random;

class Regie {
    private Spieler spieler;
    Random random;
 //   Spieler[] gegner;
    int gegnerzahl = 10;
    List<Spieler> gegnerliste = new List();
    
    public Regie(String spielerName, String gegnerName) {

        
      
        random = new Random();
        spieler = new Spieler(spielerName, 0, 5, 100, 8);
        for (int i = 0; i < gegnerzahl; i++) {
          (gegnerName + " " + (i + 1), 10 + i * 2, 3, 100, 7);
        }
    }

    public void starteKampf() {
        System.out.println("Kampf beginnt!");

        while (spieler.gibLebenspunkte() > 0 && minLebenspunkte(gegner) > 0) {
            System.out.println("\n--- Neuer Angriff ---");

            int spielerPos = spieler.gibXPos();
            
            boolean istTreffer = false;
            for (int i = 0; i < gegnerzahl; i++) {
                istTreffer = prüfeTreffer(spielerPos);
                if (istTreffer) {
                    spieler.greifeGegnerAn(gegner[i], this);
                    break;
                }
            }

            if (!istTreffer) {
                System.out.println(spieler.gibName() + " verfehlt die Gegner.");
            }

            if (minLebenspunkte(gegner) > 0) {
                for (int i = 0; i < gegnerzahl; i++) {
                    int zufallszahl = random.nextInt(2);
                    if (zufallszahl == 1) {
                        gegnerliste[i].greifeGegnerAn(spieler, this);
                    } else {
                        System.out.println(gegnerliste[i].gibName() + " verfehlt " + spieler.gibName() + ".");
                    }
                }
            }
        }

        if (spieler.gibLebenspunkte() <= 0) {
            System.out.println("\nDu hast den Kampf verloren. Spielende!");
        } else {
            System.out.println("\nGlückwunsch! Du hast den Kampf gewonnen. Spielende!");
        }
    }

    private boolean prüfeTreffer(int xPosSchuss) {
        boolean treffer = false;
        for (int i = 0; i < gegnerzahl; i++) {
            int prüfePos = gegner[i].gibXPos();
            treffer = (xPosSchuss == gegner[i].gibXPos());
            if (treffer) {
                return true;
            }
        }
        return false;
    }

    private int minLebenspunkte(Spieler[] gegner) {
        int minLebenspunkte = Integer.MAX_VALUE;
        for (Spieler g : gegner) {
            if (g.gibLebenspunkte() < minLebenspunkte) {
                minLebenspunkte = g.gibLebenspunkte();
            }
        }
        return minLebenspunkte;
    }

    public static int berechneEntfernung(int pos1, int pos2) {
        return Math.abs(pos1 - pos2);
    }

    public int berechneTrefferwirkung(int stärke, int rüstung, int entfernung) {
        // Logik, um die Wirkung des Treffers auf die Lebenspunkte zu berechnen
        // Hier wird die Auswirkung des Treffers berechnet und als Integer zurückgegeben
        return (stärke - rüstung) / entfernung; // Beispiel: vereinfachte Berechnung
    }
}