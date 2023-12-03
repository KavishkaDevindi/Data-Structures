import java.io.IOException;
import java.util.Scanner;
public class Selectionsort {

  
    public void Sort(int [] arr, String[] name, int[] id) throws IOException {

      
        try (Scanner ob = new Scanner(System.in)) {
            int n = arr.length;

            for (int i = 0; i < n-1; i++)
            {
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                {
                    if (arr[j] < arr[min_idx])
                        min_idx = j;
                }
    
               
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;

                String tempname = name[min_idx];
                name[min_idx]=name[i];
                name[i]=tempname;
                
                int tempId = id[min_idx];
                id[min_idx] = id[i];
                id[i] = tempId;
            }
            
            /*Print sorted Array */
            System.out.println("\nSorted Array : ");
            System.out.println("\n");
            for (int i = 0; i < arr.length; ++i) {
                System.out.println(id[i] +"-" + name[i] + "-" + arr[i]);
            }

            System.out.print("\nEnter M to Go Main menu: ");
            char c = ob.next().charAt(0);
            if(c == 'M'){
                Main.Selection(arr,name,id);
            }
        }
    }
   }
    


