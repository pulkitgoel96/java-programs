//Program to demonstrate the use of STATIC keyword....

class Student
{
  int rollno;
  String name;
  static String college = "MSI";
  static void change()
	{
		college = "MSIT";
  }
  Student(int r, String n)
	{
		rollno = r;
		name = n;
  }

  void display ()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
};
class staticdemo
{
  public static void main(String args[])
	{
		Student s1 = new Student (111,"John");
		s1.display();
		Student s2 = new Student (222,"Siara");
		Student.change();
		Student s3 = new Student (333,"Pulkit");
		s2.display();
		s3.display();
  }
}
