import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;

public class Main
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Keypad keypad = new Keypad();
		
		// Question 1
		System.out.println("Question 1");
		System.out.print("Input: ");
		
		Scanner scanner = new Scanner(System.in);
		String word_Q1 = scanner.nextLine();
		
		int totalKeyPressed = keypad.getTotalKeyPress(word_Q1);
		
		System.out.print("Output: ");
		System.out.println(totalKeyPressed);
		System.out.println("");
		
		
		// Question 2
		System.out.println("Question 2");
		System.out.print("Input: ");
		
		scanner = new Scanner(System.in);
		String word_Q2 = scanner.nextLine();
		
		String wordNum = keypad.getWordNum(word_Q2);
		
		System.out.print("Output: ");
		System.out.println(wordNum);
		System.out.println("");
		
		
		// Question 3
		System.out.println("Question 3");
		System.out.print("Input: ");
		
		scanner = new Scanner(System.in);
		int num_Q3 = scanner.nextInt();
		
		List<String> letterCom = keypad.getLetterComb(num_Q3);
		
		System.out.print("Output: ");
		System.out.println(letterCom);
		System.out.println("");
		
		// Question 4
		System.out.println("Question 4");
		System.out.print("Input: ");
		
		scanner = new Scanner(System.in);
		int num_Q4 = scanner.nextInt();
		
		List<String> letterCom1 = keypad.getLetterComb(num_Q4);
		
		String[] arrayText = null;
		
		try
		{	
			FileReader reader = new FileReader("src/WordsRTF.RTF");
			RTFEditorKit rtfParser = new RTFEditorKit();
			Document document = rtfParser.createDefaultDocument();
			rtfParser.read(reader, document, 0);
			
			String text = document.getText(0, document.getLength());
			arrayText = text.split("\n");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (BadLocationException e)
		{
			e.printStackTrace();
		}
		
		List<String> valid = Arrays.asList(arrayText);
		
		List<String> validCom = new ArrayList<String>();
		
		for (int i = 0; i < letterCom1.size(); i++)
		{
			if (valid.contains(letterCom1.get(i)))
			{
				validCom.add((letterCom1.get(i)));
			}
		}
		
		System.out.print("Output: ");
		System.out.println(validCom);
		
	}

}
