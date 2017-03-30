import java.util.ArrayList;
import java.util.List;

public class Keypad
{
	private Button[] arrayOfButton = new Button[10];
	
	/**
	 * 
	 */
	public Keypad()
	{
		char[] button_zero = {' '};
		arrayOfButton[0] = new Button(0, button_zero);
		
		char[] button_one = {};
		arrayOfButton[1] = new Button(1, button_one);
		
		char[] button_two = {'a', 'b', 'c'};
		arrayOfButton[2] = new Button(2, button_two);
		
		char[] button_three = {'d', 'e', 'f'};
		arrayOfButton[3] = new Button(3, button_three);
		
		char[] button_four = {'g', 'h', 'i'};
		arrayOfButton[4] = new Button(4, button_four);
		
		char[] button_five = {'j', 'k', 'l'};
		arrayOfButton[5] = new Button(5, button_five);
		
		char[] button_six = {'m', 'n', 'o'};
		arrayOfButton[6] = new Button(6, button_six);
		
		char[] button_seven = {'p', 'q', 'r', 's'};
		arrayOfButton[7] = new Button(7, button_seven);
		
		char[] button_eight = {'t', 'u', 'v'};
		arrayOfButton[8] = new Button(8, button_eight);
		
		char[] button_nine = {'w', 'x', 'y', 'z'};
		arrayOfButton[9] = new Button(9, button_nine);
	}
	
	public List<String> getLetterComb(int number)
	{
		if (number <= 0)
		{
			return null;
		}
		
		List<String> letterCom = new ArrayList<String>();
		
		generateLetterComb(letterCom, "", number);
		
		return letterCom;
	}
	
	public void generateLetterComb(List<String> storedArray, String prefix, int number)
	{
		int noOfDigit = (int)(Math.log10(number) + 1);
		int currentDigit = number / (int)(Math.pow(10, noOfDigit - 1));
		int remainDigit = number % (int)(Math.pow(10, noOfDigit - 1));
		
		if (noOfDigit == 1)
		{
			for (int i = 0; i < this.arrayOfButton[currentDigit].getNumOfLetters(); i++)
			{
				storedArray.add(prefix + this.arrayOfButton[currentDigit].getArrayOfLetters()[i]);
			}
		}
		else
		{
			for (int i = 0; i < this.arrayOfButton[currentDigit].getNumOfLetters(); i++)
			{
				generateLetterComb(storedArray, prefix + this.arrayOfButton[currentDigit].getArrayOfLetters()[i], remainDigit);
			}
		}
	}
	
	public String getWordNum(String word)
	{
		String wordNum = "";
		
		for (int i = 0; i < word.length(); i++)
		{
			wordNum += getLetterNum(word.charAt(i));
		}
		
		return wordNum;
	}
	

	public int getTotalKeyPress(String word)
	{
		// Remember to covert to lower case
		int totalKeyPress = 0;
		
		for (int i = 0; i < word.length(); i++)
		{
			totalKeyPress += getNoOfKeyPress(word.charAt(i));
		}
		
		return totalKeyPress;
	}
	
	public String getLetterNum(char letter)
	{
		Button buttonPressed = null;
		
		switch (letter)
		{
		case ' ':
			buttonPressed = buttonAt(0);
			break;
		case 'a':
		case 'b':
		case 'c':
			buttonPressed = buttonAt(2);
			break;
		case 'd':
		case 'e':
		case 'f':
			buttonPressed = buttonAt(3);
			break;
		case 'g':
		case 'h':
		case 'i':
			buttonPressed = buttonAt(4);
			break;
		case 'j':
		case 'k':
		case 'l':
			buttonPressed = buttonAt(5);
			break;
		case 'm':
		case 'n':
		case 'o':
			buttonPressed = buttonAt(6);
			break;
		case 'p':
		case 'q':
		case 'r':
		case 's':
			buttonPressed = buttonAt(7);
			break;
		case 't':
		case 'u':
		case 'v':
			buttonPressed = buttonAt(8);
			break;
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			buttonPressed = buttonAt(9);
			break;
		default:
			return "";
		}
		
		return Integer.toString(buttonPressed.getNumber());
	}
	
	public int getNoOfKeyPress(char letter)
	{
		Button buttonPressed = null;
		
		switch (letter)
		{
		case ' ':
			buttonPressed = buttonAt(0);
			break;
		case 'a':
		case 'b':
		case 'c':
			buttonPressed = buttonAt(2);
			break;
		case 'd':
		case 'e':
		case 'f':
			buttonPressed = buttonAt(3);
			break;
		case 'g':
		case 'h':
		case 'i':
			buttonPressed = buttonAt(4);
			break;
		case 'j':
		case 'k':
		case 'l':
			buttonPressed = buttonAt(5);
			break;
		case 'm':
		case 'n':
		case 'o':
			buttonPressed = buttonAt(6);
			break;
		case 'p':
		case 'q':
		case 'r':
		case 's':
			buttonPressed = buttonAt(7);
			break;
		case 't':
		case 'u':
		case 'v':
			buttonPressed = buttonAt(8);
			break;
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			buttonPressed = buttonAt(9);
			break;
		default:
			return 0;
		}
		
		return buttonPressed.getLetterPress(letter);
	}
	
	public Button buttonAt(int index)
	{
		return this.arrayOfButton[index];
	}
	
	
	
	
}
