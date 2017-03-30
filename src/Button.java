
public class Button {
	
	private int number;
	private char[] arrayOfLetters;
	
	/**
	 * @param number
	 * @param arrayOfLetters
	 */
	public Button(int number, char[] arrayOfLetters)
	{
		this.number = number;
		this.arrayOfLetters = arrayOfLetters;
	}
	
	public int getLetterPress(char letter)
	{	
		for (int i = 0; i < this.arrayOfLetters.length; i++)
		{
			if (this.arrayOfLetters[i] == letter)
			{
				return i + 1;
			}
		}
		
		return -1;
	}
	
	public int getNumOfLetters()
	{
		return this.arrayOfLetters.length;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the arrayOfLetters
	 */
	public char[] getArrayOfLetters() {
		return arrayOfLetters;
	}

	/**
	 * @param arrayOfLetters the arrayOfLetters to set
	 */
	public void setArrayOfLetters(char[] arrayOfLetters) {
		this.arrayOfLetters = arrayOfLetters;
	}
}
