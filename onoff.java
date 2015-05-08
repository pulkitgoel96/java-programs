//Program to check whether the bit is on or off using bitwise operator

import java.util.*;
public class onoff
{
	public static void main(String[]args)
	{
		int a,n,b,result;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		a=input.nextInt();
		System.out.println("Enter the place of bit which you need to check: ");
		n=input.nextInt();
		b=(int)Math.pow(2.0,n-1);
		result=a&b;
		if(result==b)
		{
			System.out.println("The bit is on...!");
		}
		else
		{
			System.out.println("The bit is off...!");
		}
	}
}
