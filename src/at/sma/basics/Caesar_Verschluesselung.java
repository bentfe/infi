package at.sma.basics;

import java.util.Random;

public class Caesar_Verschluesselung {
    public static void main(String[] args) {
        String result = encrypt(1, "hallo");
        System.out.println(result);
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
}
