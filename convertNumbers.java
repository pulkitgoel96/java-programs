//Program to convert a Decimal number into Binary, Octal, Hexa-decimal number.

import java.util.Scanner;

class converter
{
  public String toHex(int num)
  {
    return Integer.toString(num, 8);
  }

  public String toOct(int num)
  {
    return Integer.toString(num, 16);
  }

  public String toBinary(int num)
  {
    return Integer.toString(num, 2);
  }
}

class convertNumber
{
  public static void main(String args[])
  {
    converter c1 = new converter();
    int n = Integer.parseInt(args[0]);
    System.out.println("Number : " + n);
    System.out.println("Number in Binary : " + c1.toBinary(n));
    System.out.println("Number in Octal : " + c1.toOct(n));
    System.out.println("Number in Hexa Decimal : " + c1.toHex(n));
  }
}
