//Filename Program5.java
//Written by Mike Zavatta-MacDonald
//Written on 8/27/2014

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Program5
	{
	public static void main(String[] args)
		{
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		// Get the starting number.
		int number; 
		Verify testnum;
		System.out.print("Enter a number between 10 and 100.");
		number = keyboard.nextInt();
		testnum = new Verify(10,100);
		try
			{testnum.Validate(number);
			}
		catch (Exception e)
			{
			}
		}
	}
