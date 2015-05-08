//Program to convert the temprature from fahrenheit to celsius

import java.util.Scanner;
public class ftoc
{
	public static void main(String[]args)
	{
		double f;
		int c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		f=input.nextDouble();
		c = ( (int) f - 32 ) * 5 / 9;
		System.out.println("Temperature in Celsius will be: " + c);
	}
}
