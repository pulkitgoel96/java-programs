//Program to find all prime numbers in a given range....

import java.util.Scanner;

class prime
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int p, q, i, count = 0;
    boolean flag = false;
    System.out.println("\nEnter the range : ");
    p = in.nextInt();
    q = in.nextInt();
    for(i = p ; i<= q ; i++)
    {
      for(int j = i-1 ; j >= 2 ; j--)
      {
        if(i % j ==0)
        {
          flag = false;
          break;
        }
        else
        {
          flag = true;
          continue;
        }
      }
      if(flag != false)
      {
        System.out.println("\n\t" + i);
        count++;
      }
    }
    System.out.println("\n\nTotal Prime numbers : " + count);
  }
}
