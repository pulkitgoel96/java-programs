//Program to depict a banker...

import java.util.*;
import java.io.*;
class human
{
  String name, sex, adderess;
  int age;
  Date date = new Date();

  public human(String n, String s, int a, String add)
  {
    name = n;
    sex = s;
    age = a;
    adderess = add;
  }
}

class bankAccount extends human
{
  long accNo;
  volatile double balance = 0;
  bankAccount(String n, String s, int a, String add, long acc)
  {
    super(n, s, a, add);
    accNo = acc;
  }
  void deposit(double amount)
  {
    try
    {
      balance += amount;
      System.out.println("\nAmount deposited Successfully.....\n");
      showBalance();
    }
    catch(Exception e)
    {
      System.out.println("Error Occured : Transaction Failed......." + e);
      showBalance();
    }
  }

  void withdrawl(double amount)
  {
    try
    {
      balance -= amount;
      System.out.println("\nKindly Collect the Cash......");
      System.out.println("Count the money before leaving....\n");
      showBalance();
    }
    catch(Exception e)
    {
      System.out.println("Error Occured : Transaction failed......" + e);
      System.out.println("please try after some time....\n");
      showBalance();
    }
  }

  void showBalance()
  {
    System.out.println("\nBalance in your account as on " + date);
    System.out.println("\n\t" + balance);
  }
}

class banker
{
  public static void main(String args[]) throws IOException
  {
    Scanner in = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<bankAccount> bankers = new ArrayList<bankAccount>();
    String name, sex, adderess;
    int age;
    long accno;
    double balance;
    int ch, bankersIndex = -1;
    do
    {
      System.out.println("\n\n\tWelcome to the Bank Menu\n\n");
      System.out.println("1.New Coustomer.");
      System.out.println("2.Existing.");
      System.out.println("3.Exit.");
      System.out.print("\nPlease Enter your choice : ");
      ch = in.nextInt();
      switch(ch)
      {
        case 1: System.out.println("\nEnter the details of the coustomer :");
                System.out.print("Name : ");
                name = br.readLine();
                System.out.print("Gender : ");
                sex = br.readLine();
                System.out.print("Age : ");
                age = in.nextInt();
                System.out.print("Adderess : ");
                adderess = br.readLine();
                System.out.print("Account Number : ");
                accno = in.nextLong();
                bankers.add(new bankAccount(name, sex, age, adderess, accno));
                break;
        case 2: System.out.print("\nEnter the acount Number of the coustomer : ");
                accno = in.nextLong();
                for(int i = 0; i < bankers.size(); i++)
                {
                  if(bankers.get(i).accNo == accno)
                  {
                    bankersIndex = i;
                  }
                  else
                  {
                    continue;
                  }
                }
                if(bankersIndex != -1)
                {
                  do
                  {
                    System.out.println("\n\nWelcome " + bankers.get(bankersIndex).name + "\n");
                    System.out.println("\tAccount Menu.....\n");
                    System.out.println("1.Deposit.");
                    System.out.println("2.Withdrawl.");
                    System.out.println("3.Check Balance.");
                    System.out.println("4.Goto Previous Menu.");
                    System.out.println("5.Exit.");
                    System.out.print("Enter your choice : ");
                    ch = in.nextInt();
                    double amount;
                    switch(ch)
                    {
                      case 1: System.out.print("Enter the Amount to be deposited : ");
                              amount = in.nextDouble();
                              bankers.get(bankersIndex).deposit(amount);
                              break;
                      case 2: System.out.print("Enter the Amount to be Withdrawn : ");
                              amount = in.nextDouble();
                              bankers.get(bankersIndex).withdrawl(amount);
                              break;
                      case 3: bankers.get(bankersIndex).showBalance();
                              break;
                      case 4: break;
                      case 5: System.out.print("\nPress any key to terminate.....");
                              System.out.println(in.nextLine());
                              System.exit(0);
                              break;
                      default: System.out.println("\nWrong choice....");
                    }
                  }while(ch != 4);
                }
                else
                {
                  System.out.println("Account Number Not found!!!");
                }
                break;
        case 3: System.out.print("\nPress any key to terminate.....");
                System.out.println(in.nextLine());
                System.exit(0);
                break;
        default: System.out.println("\nWrong choice....");
      }
    }while(ch != 3);
  }
}
