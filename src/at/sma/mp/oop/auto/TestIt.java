package at.sma.mp.oop.auto;

import java.util.ArrayList;
import java.util.Random;

public class TestIt {
    public static void main(String[] args){
        Random r = new Random();
        Auto auto = new Auto();
        Garage garage = new Garage(30,"Lustenauerstrasse 11, 6850 Dornbirn",180,10.0);
        System.out.println("Garage-Adresse: " + garage.getAddresse());
        System.out.println(auto.getInfoAuto());
        auto.setsFarbe("Blau");
        auto.setiLeistung(340);
        auto.setiRäder(4);
        System.out.println(auto.getInfoAuto());

        Auto auto2 = new Auto(340,"Blau",4,170);
        System.out.println(auto2.getInfoAuto());

        ArrayList<Auto> aAutoListe = new ArrayList<>();
        String[] aFarben = {"blau","rot","gruen", "violett","gelb", "pink","türkis"};
        for (var i = 1; i <=100; i++){
            //max = 500 min = 50
            int ps = r.nextInt(500+1-50)+50;
            //max =4 min min =3
            int ra = r.nextInt(4+1-3)+3;
            //Dont forget array zugriff mit index start bei 0!!
            int fa = r.nextInt(aFarben.length-1);
            int fahrzeughoehe = r.nextInt(200 +1 -110) + 110;
            aAutoListe.add(new Auto(ps, aFarben[fa], ra, fahrzeughoehe));

        }
        for(Auto a : aAutoListe){
            System.out.println(a.getInfoAuto());
            garage.addAutoGarage(a);
            System.out.println(garage.getStellplaetze() + " stell - frei " + garage.getFreiePlaetze());
        }


    }
}
