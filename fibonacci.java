//Program to print a fibonacci series....

import java.util.Scanner;

class fibonacci
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int a = 0 , b = 1 , c , num , i;
    System.out.print("Enter where you want the series to end(Position) : ");
    num = in.nextInt();
    System.out.println("\n");
    System.out.print(a + "\t" + b);
    for(i = 0 ; i < num ; i++)
    {
      c = a + b;
      System.out.print("\t" + c);
      a = b;
      b = c;
    }
  }
}
