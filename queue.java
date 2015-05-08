//Program to implement a Queue...

import java.util.Scanner;

class queueOperations
{
  int[] q;
  int eoq = -1;
  queueOperations()
  {
    q = new int[10];
    eoq = 0;
  }
  void insert(int x)
  {
    if(eoq < 10)
    {
      q[eoq] = x;
      eoq++;
    }
    else
    {
      System.out.println("\nQueue is FULL...");
    }
  }
  void delete()
  {
    if(eoq > -1)
    {
      System.out.println("\nYou got : " + q[eoq]);
      eoq--;
    }
    else
    {
      System.out.println("Queue Underflow.....");
    }
  }
  void display()
  {
    System.out.print("\n\nQueue at present :");
    for(int i = 0; i < eoq; i++)
    {
      System.out.print("\t" + q[i]);
    }
    System.out.println("\n");
  }
}

class queue
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    queueOperations q1 = new queueOperations();
    int ch;
    do
    {
      System.out.println("\n\n\t\tQueue Menu\n\n");
      System.out.println("1.Insert.");
      System.out.println("2.Delete.");
      System.out.println("3.Display.");
      System.out.println("4.Exit.");
      ch = in.nextInt();
      switch(ch)
      {
        case 1: System.out.print("Enter the element to be Inserted : ");
                q1.insert(in.nextInt());
                break;
        case 2: q1.delete();
                break;
        case 3: q1.display();
                break;
        case 4: System.exit(0);
                break;
        default:  System.out.println("Wrong Input!!!");
        System.out.println("let's try again!!!");
        break;
      }
    }while(ch != 4);
  }
}
