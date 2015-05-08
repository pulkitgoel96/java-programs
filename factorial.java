//PROGRAM TO CLAC THE FACTORIAL OF A NUMBER.....

import java.util.Scanner;

class factorial
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int i = 0 , num , fact = 1;
    System.out.print("Enter a number : ");
    num = in.nextInt();
    for(i = 1 ; i <= num ; i++)
    {
      fact *= i;
    }
    System.out.println("Factorial of " + num + " = " + fact);
  }
}
