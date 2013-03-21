/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_shupesmithsherry;

import java.util.*;
import java.io.*;

/**
 *
 * @author S515888
 */
public class Acrostics {

    public static void main(String[] args) throws FileNotFoundException {
        acrosticsGame();
    }

    public static void acrosticsGame() throws FileNotFoundException {
        Scanner acrosticsWord = new Scanner(System.in);
        System.out.print("Please enter a word to generate acrostics: ");
        String s = acrosticsWord.next();
        char[] letterArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(letterArray[i] + " ----- " + letterArray[(s.length() - 1) - i]);
        }
        System.out.println("You have 5 minutes to enter the longest possible words that start/end with the indicated letters. "
                + "Enter all words on one line, separated by spaces.");
        Scanner player1Input = new Scanner(System.in);
        System.out.print("Player 1: ");
        String playersInput = player1Input.nextLine();
        String[] playersWords = playersInput.split(" ");
        for (int i = 0; i < s.length(); i++) {
            char[] player1Array = playersWords[i].toCharArray();
            if (letterArray[i] != player1Array[0] || letterArray[(s.length() - 1) - i] != player1Array[playersWords[i].length() - 1]) {
                System.out.println("This word does not work, because your first and/or last letter do not match up! Try again!");
                break;
            } else if (letterArray[i] == player1Array[0] || letterArray[(s.length() - 1) - i] == player1Array[playersWords[i].length() - 1]) {
                ArrayList<String> dictionary = computer.getDictionary();
                for (int f = 0; f < dictionary.size(); f++) {
                    if (playersWords[i].equals(dictionary.get(f))) {
                        System.out.println("Word " + i + " works!");
                        break;
                    } else if (!playersWords[i].equals(dictionary.get(f))) {
                        continue;
                    }
                }
            }
        }
    }
}
