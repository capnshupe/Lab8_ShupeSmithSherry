/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_shupesmithsherry;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s505835
 */
public class computer {

    public computer() throws FileNotFoundException {
        File myFile = new File("dictionary.txt");
        Scanner fileInput = new Scanner(myFile);
        String readLine = "";
        while (fileInput.hasNextLine()) 
        {
            readLine = fileInput.nextLine();
            ArrayList dictionary = readLine.split(" ");
        }
        
    }
    public String getThreeLetters()
    {
        
    }
}
