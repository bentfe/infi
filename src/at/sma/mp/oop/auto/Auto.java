package at.sma.mp.oop.auto;

public class Auto {
    private int iLeistung;
    private String sFarbe;
    private int iRäder;

    private int fahrzeughoehe;

    public Auto() {
        this.iLeistung = 0;
        this.sFarbe = "keine Angabe";
        this.iRäder = 0;
        this.fahrzeughoehe = 0;
    }

    public Auto(int iLeistung, String sFarbe, int iRäder, int fahrzeughoehe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
        this.iRäder = iRäder;
        this.fahrzeughoehe = fahrzeughoehe;
    }

    public int getFahrzeughoehe() {
        return fahrzeughoehe;
    }

    public void setFahrzeughoehe(int fahrzeughoehe) {
        this.fahrzeughoehe = fahrzeughoehe;
    }

    public int getiRäder() {
        return iRäder;
    }

    public void setiRäder(int iRäder) {
        this.iRäder = iRäder;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public String getInfoAuto(){
        return "Auto Farbe ist " + this.getsFarbe() +
                " Leistung ist " + this.getiLeistung() +
                " Räder sind " + this.getiRäder();
    }
}
