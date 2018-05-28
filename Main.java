package other;

import java.util.Scanner;

public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String input = "";
		String number = "";
		
		int result = 0; 
		
		while(!input.equals("END")) 
		{
			input = scan.nextLine();
			
			if(!input.equals("END"))
				number += input.trim() + " ";
		}
		
		number = number.trim();
		
		String[] values = number.split(" ");
		
		if(values.length == 6) 
		{
			result += ConvertToInt(values[0]) * ConvertToInt(values[1]);	//	1000
			result += ConvertToInt(values[2]) * ConvertToInt(values[3]);	//	100
			result += ConvertToInt(values[5]);								//	10
		}
		else if(values.length == 4) 
		{
			result += ConvertToInt(values[0]) * ConvertToInt(values[1]);	//	100
			result += ConvertToInt(values[3]);								//	10
		}
		else if(values.length == 2) 
		{
			if(values[1].equals("hundred") || values[1].equals("thousand"))
				result = ConvertToInt(values[0]) * ConvertToInt(values[1]);	//	Any two numbers
			else
				result = ConvertToInt(values[0]) + ConvertToInt(values[1]);
		}
		else if(values.length == 1) 
		{
			result = ConvertToInt(values[0]);								//	10
		}
		
		System.out.printf("[%s] = %d", number, result);
		
		scan.close();
	}
	
	public static int ConvertToInt(String number) 
	{
		switch(number) 
		{
		case "one":
			return 1;
		case "two":
			return 2;
		case "three":
			return 3;
		case "four":
			return 4;
		case "five":
			return 5;
		case "six":
			return 6;
		case "seven":
			return 7;
		case "eight":
			return 8;
		case "nine":
			return 9;
		case "ten":
			return 10;
		case "twenty":
			return 20;
		case "thirty":
			return 30;
		case "forty":
			return 40;
		case "fifty":
			return 50;
		case "sixty":
			return 60;
		case "seventy":
			return 70;
		case "eighty":
			return 80;
		case "ninety":
			return 90;
		case "hundred":
			return 100;
		case "thousand":
			return 1000;
		}
		
		return 0;
	}
}
