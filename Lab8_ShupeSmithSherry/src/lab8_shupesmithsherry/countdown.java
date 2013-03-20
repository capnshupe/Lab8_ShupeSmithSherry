package lab8_shupesmithsherry;

import java.util.Random;
import java.util.Scanner;

/**
 * @author s509086
 */
public class countdown {

    Scanner keyScan = new Scanner(System.in);

    public countdown() {
    }

    /**
     * Uses a random number generator that will create a 9 letter string of
     * distinct letters.
     *
     * @return
     */
    public String genLetters() {
        String generatedLetters = "";
        int charCode;
        char currChar = 'a';
        char[] charArr = new char[9];
        boolean isPresent = false;
        Random rng = new Random();
        for (int i = 0; i < 9; i++) {
            charCode = 97 + rng.nextInt(26);
            currChar = (char) charCode;
            for (int j = 0; j <= i; j++) {
                if (!isPresent) {
                    if (currChar == charArr[j]) {
                        isPresent = true;
                    } else if (j == i) {
                        charArr[j] = currChar;
                    }
                } else {
                    i--;
                    break;
                }
            }
            isPresent = false;
        }
        generatedLetters =
                generatedLetters.concat(String.valueOf(charArr));
        System.out.println(generatedLetters);
        return generatedLetters;
    }

    public void PlayGame() {
        String gLetters = this.genLetters();
        String playInput;
        String compInput;
        System.out.println("Letters: " + gLetters);
        System.out.println("You have 30 seconds to create a word out of the letters.");
        long startTime = System.currentTimeMillis();
        System.out.print("Player 1: ");
        playInput = keyScan.next();
        long endTime = System.currentTimeMillis();
        if (endTime - startTime > 30000) {
            System.out.println("Time exceeded, player 2 wins!");
        } else {
            compInput = this.compWord(gLetters);
            System.out.println("Player 2: " + compInput);
            if (playInput.length() > compInput.length()) {
                System.out.println("Player 1 wins!");
            } else {
                System.out.println("Player 2 wins!");
            }
        }

    }

    public String compWord(String letters) {
        computer Jarvis = new computer();
        return Jarvis.getWord(letters);
    }
}
