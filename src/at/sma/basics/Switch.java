package at.sma.basics;

import java.sql.SQLOutput;
import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        int randomNumber = 0;
        Random random = new Random();
        randomNumber = random.nextInt(6);
        randomNumber = randomNumber + 5;
        System.out.println(randomNumber);
        switch (randomNumber) {
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
        }
    }
}
