import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
 class SetOutExample 
{
   public static void main(String args[]) throws IOException
    {
      //Instantiating the File class
      File file = new File("D:\\sample.txt");
      //Instantiating the PrintStream class
      PrintStream stream = new PrintStream(file);
      System.out.println("From now on "+file.getAbsolutePath()+" will be your console");
      System.setOut(stream);
      //Printing values to file
      System.out.println("Hello, how are you");
      System.out.println("Welcome to Tutorialspoint");
   }
}