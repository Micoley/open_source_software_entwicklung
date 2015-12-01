package Der_Butter;

import java.util.Scanner;



/**
 * Hello world!
 * This class is the class in which we do all the things
 * 
 */

public class App 
{
	/**
	 * Hello world!
	 * this is the main method, which does stuff
	 * 
	 * @param args args contain the mainmethod paarameters
	 * 
	 */
	public static void main(String[] args)
	{
		String input;
		Scanner scanIn = new Scanner(System.in);
		input = scanIn.nextLine();
		scanIn.close();
		System.out.println(input.toUpperCase());
	}
}