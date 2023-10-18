package at.sma.basics;

import java.util.Random;
public class While {


    public static void main(String[] args) {
        boolean stop = false;
        while (stop==false) {
            Random random= new Random();
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
            if (randomNumber == 15 || randomNumber==25) {
                stop = true;
            }
        }
    }
}
