/*Program to store the personel information of students with their
respective attendence and raise an exception if the attendence is
below 75%...*/

import java.util.Scanner;

class studentData
{
  int rollNo;
  String adderess, name, course;
  float attendence;

  studentData(int r, String n, String c, String add, float att)
  {
    rollNo = r;
    name = n;
    course = c;
    adderess = add;
    attendence = att;
  }

  void display()
  {
    System.out.println("Roll no. : " + rollNo);
    System.out.println("Name : " + name);
    System.out.println("Course : " + course);
    System.out.println("Adderess : " + adderess);
    System.out.println("Attendence : " + attendence);
  }
}

class myException extends Exception
{
  private float percentage;
  myException(float a)
  {
    percentage = a;
  }
  public String toString()
  {
    return "Your attendence is " + percentage + "%\nIt's Short Dude!! ";
  }
}
class student
{
  static void compute(float a) throws myException
  {
    if(a < 75)
    {
      throw new myException(a);
    }
    else
    {
      System.out.println("Good Attandence!, Keep it up ");
    }
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the details of student 1 : ");
    int rollNo;
    String adderess, name, course;
    float attendence;
    System.out.print("\nRollNo : ");
    rollNo = in.nextInt();
    System.out.print("Name : ");
    name = in.nextLine();
    System.out.print("Course : ");
    course = in.nextLine();
    System.out.print("Adderess : ");
    adderess = in.nextLine();
    System.out.print("Attendence : ");
    attendence = in.nextFloat();
    System.out.println("\n\n");
    try
    {
      compute(attendence);
    }
    catch(myException e)
    {
      System.out.println(e);
    }

    System.out.println("\n\nDetails of student 1 :\n");
    studentData s1 = new studentData(rollNo, name, course, adderess, attendence);
    s1.display();
  }
}
