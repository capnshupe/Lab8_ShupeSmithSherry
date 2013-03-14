package lab8_shupesmithsherry;

import java.util.Random;

/**
 * @author s509086
 */
public class countdown
{

	public countdown()
	{
	}

	public String genLetters()
	{
		String generatedLetters = "";
		int charCode;
		char currChar = 'a';
		char[] charArr = new char[9];
		boolean isPresent = false;
		Random rng = new Random();
		for (int i = 0; i < 9; i++)
		{
			charCode = 97 + rng.nextInt(26);
			currChar = (char) charCode;
			for (int j = 0; j <= i; j++)
			{
				if (!isPresent)
				{
					if (currChar == charArr[j])
					{
						isPresent = true;
					}
					else if (j == i)
					{
						charArr[j] = currChar;
					}
				} else
				{
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

	public void PlayGame()
	{
		long startTime = System.currentTimeMillis();
		
	}

	public String compWord(String letters)
	{

		return "";
	}
}
