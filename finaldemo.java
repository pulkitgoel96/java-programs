//Program to demonstrate the use of final keyword.....

class base
{
  int baseVariable;
  base(int a)
  {
    baseVariable = a;
  }
  void baseShow()
  {
    System.out.println("Base class variable = " + baseVariable);
  }
}

final class derived extends base
{
  int derivedVariable;
  derived(int x, int y)
  {
    super(x);
    derivedVariable = y;
  }
  void derivedShow()
  {
    super.baseShow();
    System.out.println("Derived class variable = " + derivedVariable);
  }
}

class finaldemo
{
  public static void main(String args[])
  {
    derived d1 = new derived(5,7);
    d1.derivedShow();
  }
}
