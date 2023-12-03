import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {


  /*Write data on the file */
  public  void writefile(String[] name, int[] arr, int[] id) throws IOException {

    try (Scanner input = new Scanner(System.in)) {
      try {
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Studentdata.txt", true)));

        for(int i=0;i<arr.length;i++){
        out.write(id[i] + "-" + name[i] +"-" + arr[i]+"\n");
               }
        out.close();
        
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

      System.out.print("\nEnter M to Go Main menu: ");
      char c = input.next().charAt(0);
      if(c == 'M')
          Main.Selection(arr,name,id);
    }  

  }
  

/*Read file */
  public void Readfile(int[] arr, String[] name, int[] id) throws IOException
  {


    try (Scanner input = new Scanner(System.in)) {
      try {
        File myObj = new File("Studentdata.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      System.out.print("\nEnter M to Go Main menu: ");
      char c = input.next().charAt(0);
      if(c == 'M')
          Main.Selection(arr,name,id);
    }
  }
  
  
  /*Delete file */
  public  void Deletefile(int[] arr, String[] name, int[] id) throws IOException
  {
    try (Scanner input = new Scanner(System.in)) {
      File file
          = new File("Studentdata.txt");

      if (file.delete()) {
          System.out.println("File deleted successfully");
      }
      else {
          System.out.println("Failed to delete the file");
      }  
      System.out.print("\nEnter M to Go Main menu: ");
      char c = input.next().charAt(0);
      if(c == 'M')
          Main.Selection(arr,name,id);
    }

}

  }
  