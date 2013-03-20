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
public class Centurion 
{
    public String playGame()
    {
        
    Scanner input = new Scanner(System.in);
    System.out.print("Player 1: ");
    String s = input.next();
    System.out.print("Player 1 score: " + calculateScore(s));
    System.out.print("Player 2: ");
    
    
    return "";
    }
    public int calculateScore(String s)
    {
        int total = 0;
        for(int i =0; i<s.length(); i++)
        {
            total += s.charAt(i) -96;
        }
          return total;
    }
    
}
