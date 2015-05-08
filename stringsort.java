//Program to arrange 5 names in dictionary order....

import java.util.Scanner;

class stringsort
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 5 names : ");
    String[] s = new String[5];
    for(int i = 0; i < 5; i++)
    {
      s[i] = in.nextLine();
    }

    for(int i = 0; i < 5; i++)
    {
      for(int j = i+1; j < 5; j++)
      {
        if(s[j].compareTo(s[i]) < 0)
        {
          String t = s[i];
          s[i] = s[j];
          s[j] = t;
        }
      }
    }

    System.out.println("\n\nSorted names are : \n");

    for(int i = 0; i < 5; i++)
    {
      System.out.println("\n" + s[i]);
    }
  }
}
