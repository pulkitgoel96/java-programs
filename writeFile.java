//Program to write multiline input into a file....

import java.io.*;

class writeFile
{
  public static void main(String args[]) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String file;
    char ch;
    int n;
    System.out.print("Enter the name of the File : ");
    file = br.readLine();
    FileWriter fw = new FileWriter(file);
    System.out.println("Enter the contents of the Source File : ");
    try
    {
      do
      {
        ch = (char)br.read();
        fw.write(ch);
      }while(ch != '\n');
    }finally{
      fw.close();
    }
  }
}
