//Program to find no. of digits, sum of digits, and reverse of a number..

import java.util.Scanner;

class resultfinder
{
  int nod = 0, sod = 0, rev = 0;
  void compute(int n)
  {
    int temp,remainder;
    temp = n;
    while(temp > 0)
    {
      remainder = temp % 10;
      rev = (rev * 10) + remainder;
      nod++;
      sod += remainder;
      temp = temp/10;
    }
  }
  void show()
  {

  }
}

class digitoperations
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    resultfinder r1 = new resultfinder();
    int x;
    System.out.println("Enter a number : ");
    x = in.nextInt();
    r1.compute(x);
    System.out.println("\nSum of Digits of the number : " + r1.sod);
    System.out.println("\nNo. of Digits : " + r1.nod);
    System.out.println("\nRverse of the number : " + r1.rev);
  }
}
