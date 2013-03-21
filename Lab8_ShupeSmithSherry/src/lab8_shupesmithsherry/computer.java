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
public class computer
{
	Scanner fileInput;
	public void computer() throws FileNotFoundException
	{
		
		
	}
	
	public static ArrayList<String> getDictionary() throws FileNotFoundException{
            
            ArrayList<String> dictionary = new ArrayList<String>();
            File myFile = new File("dictionary.txt");
            Scanner fileInput = new Scanner(myFile);
            
            String temp = "";
            
            while(fileInput.hasNext()){
                temp = fileInput.nextLine();
                if(!temp.equals("")){
                    dictionary.add(temp);
                }
            }
            
            return dictionary;
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getWord(String letters) throws FileNotFoundException{
		char[] arrLetters = letters.toCharArray();
		String currentWord = "";
		char[] currentArr;
		boolean isPresent = true;
                computer jarman = new computer();
                ArrayList<String> dictionary = jarman.getDictionary();
                int counter = 0;
		while(counter < dictionary.size()){
			currentWord = dictionary.get(counter);
			currentArr = currentWord.toCharArray();
			for(int i = 0; i < currentArr.length; i++){
				for(int j = 0; j < arrLetters.length; j++){
					if(currentArr[i] == arrLetters[j] && isPresent)
						isPresent = true;
					else isPresent = false;
					
				}
				if(!isPresent){
					break;
				}
			}
		}
		
		
		return currentWord;
	}
}
