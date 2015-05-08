//Program to explain all the methods of string and string buffer class....

class string
{
  public static void main(String args[])
  {
    //Concatenation and tostring() Method
    int i = 9;
    String s = "He is " + i + "years old.";
    System.out.println(s);

    //charAt() Method
    char ch = s.charAt(1);
    System.out.println(ch);

    //getChars() Method
    String x = "This is a demo of the getchars method.";
    char[] buf = new char[4];
    x.getChars(10, 14, buf, 0);
    System.out.println(buf);

    //toCharArray() Method
    char[] a = x.toCharArray();
    System.out.println(a);

    //equals() and equalsIgnoreCase() Methods
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = "Good-bye";
    String s4 = "HELLO";
    System.out.println(s1 + " equals " + s2 + " : " + s1.equals(s2));
    System.out.println(s1 + " equals " + s3 + " : " + s1.equals(s3));
    System.out.println(s1 + " equals " + s4 + " : " + s1.equals(s4));
    System.out.println(s1 + " equalsIgnoreCase " + s4 + " : " + s1.equalsIgnoreCase(s4));

    //regionMatches() Method
    System.out.println(s.regionMatches(2, x, 5, 2));

    //startsWith() and endsWith() Methods
    System.out.println("foobar".endsWith("bar"));
    System.out.println("foobar".startsWith("foo"));

    //compareTo() Method
    String[] arr = {"Now", "is", "the", "time", "for", "all", "good",
            "men", "to", "come", "to", "the", "aid", "of", "their", "country"};
    for(int j = 0; j < arr.length; j++)
    {
      for(i = j + 1; i < arr.length; i++)
      {
        if(arr[i].compareTo(arr[j]) < 0)
        {
          String temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
      System.out.println(arr[j]);
    }

    //indexOf() and lastindexOf() Methods
    String w = "Now is the time for all good man to come to the aid of their country.";
    System.out.println("indexOf(\"the\")" + w.indexOf("the"));
    System.out.println("lastIndexOf(\"the\")" + w.lastIndexOf("the"));

    //replace() Method
    String a1 = "   Hello World  ".replace('l', 'w');

    //trim() Method
    System.out.println(a1.trim());

    //toUpperCase() and toLowerCase() Methods
    System.out.println(a1.toUpperCase());
    System.out.println(a1.toLowerCase());

    /*StringBuffer Class*/

    StringBuffer sb = new StringBuffer(a1);

    //length() and capacity() Methods
    System.out.println("Length : " + sb.length());
    System.out.println("Capacity : " + sb.capacity());

    //charAt() and setCharAt() Methods
    System.out.println("charAt(5) : " + sb.charAt(5));
    sb.setCharAt(5, 'Y');
    System.out.println("setCharAt(5) : " + sb);

    //append(), insert(), reverse(), replace(), and delete() Methods
    StringBuffer sb1 = new StringBuffer(40);
    String x1;
    int a0 = 42;

    s = sb.append("a = ").append(a0).append(" ! ").toString();
    System.out.println(s);

    sb.insert(2, "Hello");
    System.out.println(sb);

    System.out.println(sb.reverse());

    System.out.println(sb.delete(4, 8));

    System.out.println(sb.replace(5, 7, "abcd"));
  }
}
