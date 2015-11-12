package Der_Butter;

import java.io.*;
import java.util.Scanner;



/**
 * Hello world!
 *
 */

public class App 
{
	public static void main(String[] args)
	{
		String input;
		Scanner scanIn = new Scanner(System.in);
		input = scanIn.nextLine();
		scanIn.close();
		System.out.println(input.toUpperCase());
	}
}