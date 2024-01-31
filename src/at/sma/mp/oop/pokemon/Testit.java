package at.sma.mp.oop.pokemon;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Pokemon> aPokemonListe = new ArrayList<>();
        Pokecenter pokecenter = new Pokecenter(100,200,"Dornbirn");
        String[] aPokemons = {"Pikachu","Voltoball","Blitza","Plusle","Minun",
                "Glumanda","Fukano","Vulpix","Ponita","Magmar","Flamara","Flemmli","Floink",
                "Bisasam", "Serpifeu","Endivie","Sonnflora","Geckarbor","Knilz","Tuska",
                "Schiggy","Enton","Quapsel","Krabby","Goldini","Karpador","Aquana","Ottaro",
                "Mew", "Woingenau","Abra","Traumato","Psiana","Isso",
                "Rettan","Smogon","Sleima",
                "Lunala","Piepi","Feelinara","Pummeluff",
                "Rattfratz","Mauzi","Schlurp","Evoli","Wiesor","Yorkleff",
                "Menki","Praktibalk","Lin-Fu","Kicklee",
                "Sandan","Digda","Knogga",
                "Mogelbaum","Kiesling","Wuffels","Kleinstein","Onix",
                "Raupy","Smettbo","Hornliu","Bibor","Sichlor",
                "Traunfugil","Shuppet","Zwirrlicht","Nebulak","Lichtel",
                "Klikk","Stahlos","Stollunior",
                "Glaziola","Gelatini","Petznief","Rossana","Quiekel","Seemops",
                "Dratini","Milza","Dragoran","Altaria","Latias",
                "Fiffyen","Darkrai","Felilou","Kramurx","Hunduster","Zobiris"};
        for (var i = 0; i <= 150; i++) {
            int level = r.nextInt(100) + 1;
            int groesse = r.nextInt(150-50) + 1+50;
            int iPokemon = r.nextInt(aPokemons.length);
            String pokemonName = aPokemons[iPokemon];
            int alter = r.nextInt(40) + 1;
            String typ = "";
            switch (pokemonName) {
                case "Pikachu","Voltoball","Blitza","Plusle","Minun":
                    typ = "Elektro";
                    break;
                case "Glumanda","Fukano","Vulpix","Ponita","Magmar","Flamara","Flemmli","Floink":
                    typ = "Feuer";
                    break;
                case "Bisasam", "Serpifeu","Endivie","Sonnflora","Geckarbor","Knilz","Tuska":
                    typ = "Pflanze";
                    break;
                case "Schiggy","Enton","Quapsel","Krabby","Goldini","Karpador","Aquana","Ottaro":
                    typ = "Wasser";
                    break;
                case "Mew", "Woingenau","Abra","Traumato","Psiana","Isso":
                    typ = "Psycho";
                    break;
                case "Rettan","Smogon","Sleima":
                    typ = "Gift";
                    break;
                case "Lunala","Piepi","Feelinara","Pummeluff":
                    typ = "Fee";
                    break;
                case "Rattfratz","Mauzi","Schlurp","Evoli","Wiesor","Yorkleff":
                    typ = "Normal";
                    break;
                case "Menki","Praktibalk","Lin-Fu","Kicklee":
                    typ = "Kampf";
                    break;
                case "Sandan","Digda","Knogga":
                    typ = "Boden";
                    break;
                case "Mogelbaum","Kiesling","Wuffels","Kleinstein","Onix":
                    typ = "Gestein";
                    break;
                case "Raupy","Smettbo","Hornliu","Bibor","Sichlor":
                    typ = "Käfer";
                    break;
                case "Traunfugil","Shuppet","Zwirrlicht","Nebulak","Lichtel":
                    typ = "Geist";
                    break;
                case "Klikk","Stahlos","Stollunior":
                    typ = "Stahl";
                    break;
                case "Glaziola","Gelatini","Petznief","Rossana","Quiekel","Seemops":
                    typ = "Eis";
                    break;
                case "Dratini","Milza","Dragoran","Altaria","Latias":
                    typ = "Drache";
                    break;
                case "Fiffyen","Darkrai","Felilou","Kramurx","Hunduster","Zobiris":
                    typ = "Unlicht";
                    break;
                default:
            }
            aPokemonListe.add(new Pokemon(pokemonName,typ,level,alter,groesse));
        }
        for(Pokemon b : aPokemonListe){
            b.info();
            pokecenter.addPokemonPokecenter(b);
            System.out.println(pokecenter.getPokeballKapazitaet() + " stell - frei " + pokecenter.getFreiePlaetze());
        }

        System.out.println("Wenn man alle Pokemon übereinander stellt, haben sie eine Größe von " + pokecenter.getGesamtPokemonUebereinander() + "cm!");

        pokecenter.getPokemonMitTyp("Wasser");
        System.out.println();
        pokecenter.getPokemonMitLevel(30,20);
        pokecenter.loeschePokemonMitTyp("Wasser");
        pokecenter.getPokemonMitTyp("Wasser");
    }
}
