import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Task {

  
   /*Remove student */
    public void Delete(int[] arr,String[] Name, int[] id) throws IOException  {
    
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        try (Scanner obj = new Scanner(System.in)) {
            int[] arr_new = new int[arr.length-1];
            String[] a = new String[Name.length-1];
            int[] ai = new int[id.length];
            System.out.print("Enter Student Id to delete: ");
            int j = obj.nextInt();

            for(int i=0, k=0;i<arr.length;i++){
                if(id[i]!=j){
                    arr_new[k]=arr[i];
                    a[k] = Name[i];
                    ai[k] = id[i];
                    k++;
                }
            }
            System.out.println("\nBefore Deletion: \n");  
            for(int i = 0;i<arr.length;i++){
           
            System.out.println(id[i] + "-" + Name[i] + "-" + arr[i]+ " ");
            }
            System.out.println("\nAfter Deletion: \n");
            for(int i=0;i<arr_new.length;i++){
            System.out.println(ai[i] + "-"+ a[i] + "-" + arr_new[i] + " ");
            }

            System.out.print("\nEnter M to go Main menu: ");
            char c = obj.next().charAt(0);
            if(c == 'M'){
                Main.Selection(arr,Name,id);
            }
        }
          
    }

    /*Add new student */
    public void Insert(int[] arr,String[] Name, int[] id)  throws IOException{
 
   
        try (Scanner ob = new Scanner(System.in)) {
        
int n = arr.length;  

int newArr[] = new int[n+1];  
String newname[] = new String[n+1];
int idarr[] = new int[n+1];
System.out.print("Enter student Name you want to add: ");
String x = ob.nextLine();
System.out.print("Enter student id you want to add: ");
int y = ob.nextInt();
System.out.print("Enter Marks you want to add: ");
int value = ob.nextInt();  



for(int i = 0; i<n; i++) {  
newArr[i] = arr[i]; 
newname[i] = Name[i]; 
idarr[i] = id[i];
}  
newArr[n] = value;  
newname[n] = x;
idarr[n] = y;



for(int i = 0; i<newArr.length; i++) {
System.out.println(idarr[i] + "-"+newname[i]+"-"+newArr[i]); 
} 
  
                System.out.print("Enter M to Go Main menu: ");
                char c = ob.next().charAt(0);
            if(c == 'M'){
                Main.Selection(arr,Name,id);
            }
        }
        } 
    



    /*Search */
    public void Binarysearch(int [] arr,String[] Name, int[] id) throws IOException {

            Arrays.sort(arr);
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
            int item;
            int first,last,middle;
            int num = id.length; 
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Enter student id to search: ");
                   item = input.nextInt();
            
       first = 0;
       last = num-1;
       middle = (first+last)/2;

       while(first<=last){
        if(id[middle] < item)
          first = middle + 1;
          else if(id[middle]== item)
          {
            System.out.println(item+ " " +"found");
            break;
          }
          else{
            last = middle-1;
          }
          middle = (first + last)/2;
       }
       if(first>last)
          System.out.println(item+ " " + "is not found.\n");
  
          System.out.print("Enter M to Go Main menu: ");
          char c = input.next().charAt(0);
          if(c == 'M')
              Main.Selection(arr,Name,id);   
          
    }
      }

      /*Traverse */
    public void Traverse(int[] arr,String[] Name, int [] id) throws IOException {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Students Id, names and marks: \n");
            for(int i=0;i<arr.length;i++){
                System.out.println( id[i]+ "-" +Name[i] + "-" + arr[i]);
                System.out.print("\n");
            }

            System.out.print("Enter M to go main menu: ");
            char c = input.next().charAt(0);
            if(c == 'M')
                Main.Selection(arr,Name,id);
        } 
    }


   
    
}
