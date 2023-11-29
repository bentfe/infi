package at.sma.basics;
import javax.swing.plaf.synth.SynthTreeUI;
import java.util.Scanner;


public class Caesar_Verschluesselung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inInt;
        String inString;
        String inStop;
        String result;
        boolean run = true;

        while (run) {

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Caesar-Verschlüsselung");
            System.out.println("Wählen sie eines der folgenden Programme aus indem sie den entsprechenden Buchstaben eintippen!");
            System.out.println();
            System.out.println("(e) entschlüsseln");
            System.out.println("(v) verschlüsseln");
            System.out.println("(b) beenden");
            System.out.println();
            inString = in.nextLine();
            switch (inString) {
                case "e":
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Caesar-Verschlüsselung");
                    System.out.println();
                    System.out.println("Geben sie den zu entschlüsselnden Text ein!");
                    System.out.println();
                    inString = in.nextLine();
                    System.out.println();
                    System.out.println("Geben sie die Verschiebungszahl ein!");
                    inInt = in.nextInt();
                    System.out.println();
                    result = decrypt(inInt, inString);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Caesar-Verschlüsselung");
                    System.out.println();
                    System.out.println("Der entschlüsselte Text: " + result);
                    System.out.println();
                    System.out.println("Geben sie eine beliebige Zahl ein, um fortzufahren");
                    System.out.println();
                    inInt = in.nextInt();
                    break;
                case "v":
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Caesar-Verschlüsselung");
                    System.out.println();
                    System.out.println("Geben sie den zu verschlüsselnden Text ein");
                    System.out.println();
                    inString = in.nextLine();
                    System.out.println();
                    System.out.println("Geben sie die Verschiebungszahl ein!");
                    inInt = in.nextInt();
                    System.out.println();
                    result = encrypt(inInt, inString);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Caesar-Verschlüsselung");
                    System.out.println();
                    System.out.println("Der verschlüsselte Text: " + result);
                    System.out.println();
                    System.out.println("Geben sie eine beliebige Zahl ein, um fortzufahren");
                    System.out.println();
                    inInt = in.nextInt();
                    break;
                case "b":
                    System.out.println("Das Programm wird beendet.");
                    run = false;
                    break;
                default:
            }
        }
    }

    public static String encrypt(int shift, String stringToEncrypt) {
        String encryptedString = "";
        char[] inputdata = stringToEncrypt.toCharArray();

        for (int i = 0; i< inputdata.length; i++) {
            int letter = inputdata[i] + shift;
            encryptedString += Character.toString(letter);
        }

        return encryptedString;
    }

    public static String decrypt(int shift, String stringToDecrypt) {
        String decryptedString = "";
        char[] inputdata = stringToDecrypt.toCharArray();

        for (int i = 0; i< inputdata.length; i++) {
            int letter = inputdata[i] - shift;
            decryptedString += Character.toString(letter);
        }

        return decryptedString;
    }
}
