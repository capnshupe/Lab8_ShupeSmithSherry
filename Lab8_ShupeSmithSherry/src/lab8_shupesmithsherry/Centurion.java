/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_shupesmithsherry;

import java.util.*;
import java.io.*;

/**
 *
 * @author s505835
 */
public class Centurion {

    int userTotal = 0;
    int comTotal = 0;

    public void playGame() throws FileNotFoundException {
        ArrayList<String> threeletterword = new ArrayList<>();
        Random rng = new Random();
        int randomnum = rng.nextInt(threeletterword.size());
        Scanner input = new Scanner(System.in);
        while (userTotal <= 100 && comTotal <= 100) {
            if (userTotal == 100) {
                System.out.println("Player 2 wins!");
            }
            if (comTotal == 100) {
                System.out.println("Player 1 wins!");
            }
            System.out.print("Player 1: ");
            String s = input.next();
            System.out.print("Player 1 score: " + calculateScore(s));
            userTotal += calculateScore(s);
            ArrayList<String> dictionary = computer.getDictionary();
            for (int i = 0; i < dictionary.size(); i++) {
                if (dictionary.get(i).length() == 3) {
                    threeletterword.add(dictionary.get(i));
                }
            }
            System.out.print("Player 2: ");


            System.out.print("Player 2 score: " + calculateScore(s));
            comTotal += calculateScore(s);
        }


    }

    public int calculateScore(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            total += s.charAt(i) - 96;
        }
        return total;
    }
}
