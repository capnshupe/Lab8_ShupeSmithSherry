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
		File myFile = new File("dictionary.txt");
		this.fileInput = new Scanner(myFile);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getWord(String letters){
		char[] arrLetters = letters.toCharArray();
		String currentWord = "";
		char[] currentArr;
		boolean isPresent = true;
		while(fileInput.hasNextLine()){
			currentWord = fileInput.nextLine();
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
