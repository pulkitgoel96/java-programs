/*Program to copy the contents of one file into another after
  adding a line space after every line...*/

import java.io.*;

class copyFile
{
  public static void main(String args[]) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String sourceFile, targetFile, s;
    char ch;
    int n;
    System.out.print("Enter the name of the Source File : ");
    sourceFile = br.readLine();
    FileWriter fw = new FileWriter(sourceFile);
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
    System.out.print("\n\nEnter the Target File : ");
    targetFile = br.readLine();
    FileWriter fw1 = new FileWriter(targetFile);
    try
    {
      FileReader fr = new FileReader(sourceFile);
      try
      {
        BufferedReader newBr = new BufferedReader(fr);
        try
        {
          while((n = newBr.read()) != -1)
          {
            ch = (char)n;
            if(ch == '.')
            {
              fw1.write("\n");
            }
            else
            {
              fw1.write(ch);
            }
          }
        }finally{
          newBr.close();
        }
      }finally{
        fr.close();
      }
    }finally{
      fw1.close();
    }
  }
}
