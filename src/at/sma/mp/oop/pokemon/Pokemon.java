package at.sma.mp.oop.pokemon;

public class Pokemon {
    public String typ;
    public int level;
    public String zweiterTyp;
    public int alter;
    public int groesse;

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

    public String getZweiterTyp() {
        return zweiterTyp;
    }

    public void setZweiterTyp(String zweiterTyp) {
        this.zweiterTyp = zweiterTyp;
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

    public Pokemon(String typ, int level, String zweiterTyp, int alter, int groesse) {
        this.typ = typ;
        this.level = level;
        this.zweiterTyp = zweiterTyp;
        this.alter = alter;
        this.groesse = groesse;
    }

    public String info {
        if (this.getZweiterTyp() == "") {
            System.out.println("Das Pokemon ist vom Typ " + this.getTyp()
            + ", ist auf dem Level " + this.getLevel()
            + ", ist " + this.getAlter() + " Jahre alt und ist "
            + this.getGroesse() + " cm groß.");
        } else {
            System.out.println("Das Pokemon ist vom Typ " + this.getTyp()
                    + ", hat den sekundären Typ " + this.getZweiterTyp()
                    + ", ist auf dem Level " + this.getLevel()
                    + ", ist " + this.getAlter() + " Jahre alt und ist "
                    + this.getGroesse() + " cm groß.");
        }
    }
}
