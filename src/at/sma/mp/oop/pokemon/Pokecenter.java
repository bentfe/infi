package at.sma.mp.oop.pokemon;

import java.util.ArrayList;

public class Pokecenter {
    private int pokeballKapazitaet;
    private int maxRaumHoehe;
    private String ort;
    private ArrayList<Pokemon> pokemonListe;

    public int getPokeballKapazitaet() {
        return pokeballKapazitaet;
    }

    public void setPokeballKapazitaet(int pokeballKapazitaet) {
        this.pokeballKapazitaet = pokeballKapazitaet;
    }

    public int getMaxRaumHoehe() {
        return maxRaumHoehe;
    }

    public void setMaxRaumHoehe(int maxRaumHoehe) {
        this.maxRaumHoehe = maxRaumHoehe;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public ArrayList<Pokemon> getPokemonListe() {
        return pokemonListe;
    }

    public void setPokemonListe(ArrayList<Pokemon> pokemonListe) {
        this.pokemonListe = pokemonListe;
    }

    public Pokecenter(int pokeballKapazitaet, int maxRaumHoehe, String ort) {
        this.pokeballKapazitaet = pokeballKapazitaet;
        this.maxRaumHoehe = maxRaumHoehe;
        this.ort = ort;
        this.pokemonListe = new ArrayList<Pokemon>();
    }

    public int getGesamtPokemonUebereinander() {
        int wert = 0;
        for (Pokemon a : pokemonListe ) {
            wert += a.getGroesse();
        }
        return wert;
    }

    public void getPokemonMitTyp(String Typ) {
        for (Pokemon a : pokemonListe ) {
            if (a.getTyp() == Typ) {
                a.info();
            }
        }
    }

    public void getPokemonMitLevel(int oberGrenze, int unterGrenze) {
        int zwischenSpeicher;
        if (oberGrenze < unterGrenze) {
            zwischenSpeicher = oberGrenze;
            oberGrenze = unterGrenze;
            unterGrenze = zwischenSpeicher;
        }
        for (Pokemon a : pokemonListe ) {
            if (unterGrenze < a.getLevel()) {
                if (oberGrenze > a.getLevel()) {
                    a.info();
                }
            }
        }
    }

    public int getPokemonInPokecenter() {
        return this.pokemonListe.size();
    }

    public int getFreiePlaetze(){
        return this.pokeballKapazitaet - this.pokemonListe.size();
    }

    public void addPokemonPokecenter(Pokemon pokemon){
        if (pokemon.getGroesse() > this.maxRaumHoehe) {
            System.out.println("Hoi hast a großes Pokemon, leider nid i dem Pokecenter!!! Maxgröße ist " + this.maxRaumHoehe + ". Din Pokemon isch aber " + pokemon.getGroesse());
        } else if (this.getFreiePlaetze() > 0) {
            this.pokemonListe.add(pokemon);
        } else  {
            System.out.println("Upps, Pokecenter keinen Platz mehr frei, versuche es später nocheinmal!!");
        }
    }

    public void loeschePokemonMitTyp(String typ) {
        //aus der Liste entfernen
        int counter = 0;
        for (int i = pokemonListe.size() -1; i>=0; i--) {
            if (pokemonListe.get(i).getTyp().equals(typ)) {
                pokemonListe.remove(i);
                counter++;
            }
        }
        System.out.println("Es wurden " + counter + " Pokemons gelöscht!");
    }
}
