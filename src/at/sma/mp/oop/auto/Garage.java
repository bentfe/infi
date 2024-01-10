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
}
