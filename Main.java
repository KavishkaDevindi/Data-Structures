import java.io.IOException;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class Main {
    public static void main(String[] args) throws Exception {
      

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        
        System.out.print("Access time: ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));

        System.out.println("\n\t\t\t\t\t=============================================================================================\n");
        System.out.println("\t\t\t\t\t\t\t>>>>>>>>>>> MARKS SORTING SYSTEM<<<<<<<<<<<<<<\n");
        System.out.println("\t\t\t\t\t=============================================================================================\n\n");
        
          

        try (Scanner obj = new Scanner(System.in)) {
            try (Scanner ob = new Scanner(System.in)) {
                System.out.print("Enter array Size: ");
                int Size = obj.nextInt();

                int[] arr = new int[Size];
                String[] name = new String[Size];
                int[] Id = new int[Size];

                System.out.print("\033[H\033[2J");  
                System.out.flush();

                for (int i = 0; i < Size; i++) {

                    System.out.print("Enter Students Name: ");
                    name[i] =ob.nextLine();
                    System.out.print("Enter student Id: ");
                    Id[i] = obj.nextInt();
                  System.out.print("Enter Students marks: ");
                  arr[i] = obj.nextInt(); 
                        
                  System.out.println("\n");
                 }
                Selection(arr,name,Id);
             
              
            }
        }
    }
           
    public static void Selection(int[] arr,String[] name,int[] Id) throws IOException{
        
        Bubblesort marks = new Bubblesort();                /*OBJECTS */
        Selectionsort marks2 = new Selectionsort();
        Task task = new Task();
        CreateFile obj1 = new CreateFile();

            try (Scanner obj = new Scanner(System.in)) {
                System.out.print("\033[H\033[2J"); 
                System.out.flush(); 
                System.out.println("Main menu: ");
                System.out.print("Choose Sorting Technique :\n");
                System.out.println("1 :Bubble Sort");
                System.out.println("2 :Selection Sort");
                System.out.println("3:File managing");
                System.out.println("4 :Exit");

      
                
                System.out.print("\n");
                System.out.print("\nEnter Your choice: ");
                
                int choice = obj.nextInt();
                System.out.print("\n");
                switch(choice){
                    case 1:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush(); 
                        System.out.println("1 :Sort");
                        System.out.println("2 :Insert");
                        System.out.println("3 :Delete");
                        System.out.println("4:Search");
                        System.out.println("5:Traverse");
                        System.out.println("6: Exit");
                      
                       
                        System.out.println("\n");
                        System.out.print("Enter your choice: ");
                       int Task = obj.nextInt();
                        switch(Task){
                            case 1:
                                marks.Sort(arr,name,Id);
                            break;
                            case 2:
                               task.Insert(arr,name,Id);
                            break;
                            case 3:
                                task.Delete(arr,name,Id);
                            break;
                            case 4:
                                task.Binarysearch(arr,name,Id);
                            break;
                            case 5:
                            task.Traverse(arr,name,Id);
                            break;
                            case 6:
                            System.out.println("Exit");
                            break;
                           
                            default:
                                System.out.println("\nInvalid choice");
                        }
                        break;
                    case 2:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush(); 
                        System.out.println("1 : Sort");
                        System.out.println("2 : Insert");
                        System.out.println("3 : Delete");
                        System.out.println("4 : Search");
                        System.out.println("5:Traverse");
                        System.out.println("6: Exit");
                        System.out.print("\nEnter your choice: ");
                        int Task2 = obj.nextInt();
                        switch(Task2){
                            case 1:
                                marks2.Sort(arr,name,Id);
                                break;
                            case 2:
                            task.Insert(arr,name,Id);
                               
                                break;
                            case 3:
                            task.Delete(arr,name,Id);
                                break;
                            case 4:
                                task.Binarysearch(arr,name,Id);
                            break;
                            case 5:
                            task.Traverse(arr,name,Id);
                            break;
                            case 6:
                            System.out.println("Exit");
                            break;
                            default:
                                System.out.println("\nInvalid choice");
                        }
   
                        break;


                          case 3:
                          System.out.print("\033[H\033[2J"); 
                          System.out.flush(); 
                           System.out.println("1.Savetdata");
                           System.out.println("2.Viewdata");
                           System.out.println("3.Deletefile");
                           System.out.println("4.Exit");
                           System.out.print("\nEnter your choice: ");
                           int input = obj.nextInt();
                           switch(input){
                            case 1:
                            obj1.writefile(name, arr,Id);   
                                break;
                            case 2:
                            obj1.Readfile(arr, name,Id);
                                break;
                            case 3:
                            obj1.Deletefile(arr, name,Id);
                                break;
                            case 4:
                            System.out.println("Exit");
                            break;
                            default:
                                System.out.println("\nInvalid choice");
                        }
                     break;
                        case 4: 
                          System.out.println("Exit");
                          break;
                    }
                }
            }
     
    }


         

        
    
        

   
    
    
    

        
   


      
      
    

   
   

