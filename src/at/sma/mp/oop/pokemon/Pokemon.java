package at.sma.mp.oop.pokemon;

import java.util.ArrayList;


public class Pokemon {
    private String pokemon;
    private int level;
    private String typ;
    private int alter;
    private int groesse;
    private ArrayList<Pokemon> pokemonListe;



    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public ArrayList<Pokemon> getPokemonListe() {
        return pokemonListe;
    }

    public void setPokemonListe(ArrayList<Pokemon> pokemonListe) {
        this.pokemonListe = pokemonListe;
    }

    public Pokemon(String pokemon, String typ, int level, int alter, int groesse) {
        this.pokemon = pokemon;
        this.typ = typ;
        this.level = level;
        this.alter = alter;
        this.groesse = groesse;
    }

    public Pokemon() {
        this.pokemon = "";
        this.typ = "";
        this.level = 0;
        this.alter = 0;
        this.groesse = 0;
    }

    public void info() {
        System.out.println("Das Pokemon " + this.getPokemon()
                + " ist vom Typ " + this.getTyp()
                + ", ist auf dem Level " + this.getLevel()
                + ", ist " + this.getAlter() + " Jahre alt und ist "
                + this.getGroesse() + " cm groß.");
    }


}

