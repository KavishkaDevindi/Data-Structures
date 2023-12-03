import java.io.IOException;
import java.util.Scanner;
public class Bubblesort {
 
    public void Sort(int[] arr, String[] name, int[] id) throws IOException {

           
        try (Scanner obj = new Scanner(System.in)) {
         
      
            for (int j = 0; j < arr.length - 1; ++j) {
                for (int k = 0; k < arr.length - 1 - j; ++k) {
                    if (arr[k] > arr[k + 1]) {
                        int i= arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = i;

                        String temp = name[k];
                        name[k] = name[k+1];
                        name[k+1] = temp;

                        int ip = id[k];
                        id[k] = id[k+1];
                        id[k+1] = ip;
                    }
                }
            }
            System.out.println("\nSorted Array :\n\n");

            for (int i = 0; i < arr.length; ++i) {
                System.out.println( id[i] +"-" + name[i]+"-"+arr[i]);               
            }
          

            System.out.print("Enter M to Go Main menu: ");
            char c = obj.next().charAt(0);
            if(c == 'M'){
                Main.Selection(arr,name,id);
            }
      
   }
        }

    
}

