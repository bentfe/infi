package at.sma.basics;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean stop = false;
        int Kontostand = 0;
        int Differenz = 0;
        while (stop==false) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Sie haben " + Kontostand + "€ auf dem Konto!");
            System.out.println();
            System.out.println("Gebe eine der folgenden Zahlen ein um den jeweiligen Befehl auszuführen!");
            System.out.println("1: Einzahlen");
            System.out.println("2: Abheben");
            System.out.println("3: Bankomat beenden");
            System.out.println();
            int a = in.nextInt();
            System.out.println();
            switch (a) {
                case 1:
                    System.out.println("Geben sie die Zahl ein die sie einzahlen wollen!");
                    System.out.println();
                    Differenz = in.nextInt();
                    System.out.println();
                    System.out.println("Sie haben " + Differenz + "€ eingezahlt");
                    System.out.println();
                    Kontostand = Kontostand + Differenz;
                    System.out.println("Geben sie eine beliebige Zahl ein um fortzufahren!");
                    System.out.println();
                    Differenz = in.nextInt();
                    break;
                case 2:
                    System.out.println("Geben sie die Zahl ein die sie abheben wollen!");
                    System.out.println();
                    Differenz = in.nextInt();
                    System.out.println();
                    System.out.println("Sie haben " + Differenz + "€ abgehoben");
                    System.out.println();
                    Kontostand = Kontostand - Differenz;
                    System.out.println("Geben sie eine beliebige Zahl ein um fortzufahren!");
                    System.out.println();
                    Differenz = in.nextInt();
                    break;
                case 3:
                    System.out.println("Das Programm wird beendet!");
                    stop = true;
                    break;
                default:
                    System.out.println("Es wurde keine gültige Zahl eingegeben!");
                    break;

            }
        }
    }
}
