package at.sma.mp.oop.auto;

import java.util.ArrayList;

public class Garage {
    private int stellplaetze;
    private String addresse;
    private int einfahrtshoehe;
    private double preisstunde;
    private ArrayList<Auto> autoListe;

    public int getStellplaetze() {
        return stellplaetze;
    }

    public String getAddresse() {
        return addresse;
    }

    public int getEinfahrtshoehe() {
        return einfahrtshoehe;
    }

    public double getPreisstunde() {
        return preisstunde;
    }

    public ArrayList<Auto> getAutoListe() {
        return autoListe;
    }

    public Garage(int stellplaetze, String addresse, int einfahrtshoehe, double preisstunde) {
        this.stellplaetze = stellplaetze;
        this.addresse = addresse;
        this.einfahrtshoehe = einfahrtshoehe;
        this.preisstunde = preisstunde;
        this.autoListe = new ArrayList<Auto>();
    }

    public int getGesamtFahrzeugeUebereinander() {
        int wert = 0;
        for (Auto a : autoListe ) {
            wert += a.getFahrzeughoehe();
        }
        return wert;
    }

    //Wir suchen nach Autos mit Farbe x
    //Suche Autos mit Leistung von, bis

    public int getAutosmitFarbe(String Farbe) {
        int wert = 0;
        for (Auto a : autoListe ) {
            if (a.getsFarbe() == Farbe) {
                wert += 1;
            }
        }
        return wert;
    }

    public int getAutosmitLeistung(int oberGrenze, int unterGrenze) {
        int wert = 0;
        int zwischenSpeicher;
        if (oberGrenze < unterGrenze) {
            zwischenSpeicher = oberGrenze;
            oberGrenze = unterGrenze;
            unterGrenze = zwischenSpeicher;
        }
        for (Auto a : autoListe ) {
            if (unterGrenze < a.getiLeistung()) {
                if (oberGrenze > a.getiLeistung()) {
                    wert += 1;
                }
            }
        }
        return wert;
    }


    public int getAutosinGarage() {
        return this.autoListe.size();
    }

    public int getFreiePlaetze(){
        return this.stellplaetze - getAutosinGarage();
    }

    public void addAutoGarage(Auto auto){
        if (auto.getFahrzeughoehe() > this.einfahrtshoehe) {
            System.out.println("Hoi hast a hohes Auto, leider nid i dera garage!!! Maxhoehe ist " + this.einfahrtshoehe + ". Din Auto isch aber " + auto.getFahrzeughoehe());
        } else if (this.getFreiePlaetze() > 0) {
            this.autoListe.add(auto);
        } else  {
            System.out.println("Upps, Garage keinen Platz mehr frei, versuche es später nocheinmal!!");
        }
    }

    public void loescheAutosFarbe(String farbe) {
        //aus der Liste entfernen
        int counter = 0;
        for (int i = autoListe.size() -1; i>=0; i--) {
            if (autoListe.get(i).getsFarbe().equals(farbe)) {
                autoListe.remove(i);
                counter++;
            }
        }
        System.out.println("Es wurden " + counter + " Autos gelöscht!");
    }
}
