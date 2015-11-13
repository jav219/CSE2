////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab 12
//November 13, 2015
//moving values within arrays based on user inputs

//import scanner class
import java.util.Scanner;

//declare class
public class move_array {
    
    //declare main method
    public static void main(String [] args) {
        
        //construct scanner object
        Scanner scan = new Scanner(System.in);
        
        //ask user to input size of the array
        System.out.print("Enter the size of the array as an integer: ");
        int n = 0;
        try{
            //catch exception if it is not an int
            n += scan.nextInt();
            
            //make sure it is above zero, otherwise throw exception
            n -= 1;
            int[] arr = new int[n];
            
            //set n back to original value
            n++;
        }
        
        catch(Exception e) {
            System.out.println("Invalid, enter an integer greater than zero");
            System.exit(0);
            
        }
        
        //create array
        int[] arr = new int[n];
        
        //for loop to initialize array values with random numbers from 0-100
        for(int i = 0; i < n; i++) {
            
            arr[i] = (int)(Math.random() * 100);
            
        }//close for loop to initialize array values
        
        //ask user to enter index for array value to be moved
        System.out.print("Enter index for array value to be moved to end of array: ");
        int index = 0;
        try {
            //catch exception if value entered is not int
            index += scan.nextInt();
            
            //catch exception if index is not between 0 and n-1
            int tmp = arr[index];
        }
        
        catch(Exception e) {
            System.out.println("Invalid, enter an integer between 0 and " + (n-1));
            System.exit(0);
        }
        
         //test print
        for(int j = 0; j < n; j++) {
            System.out.print(arr[j] + ", ");
        }
        System.out.println();
        System.out.println();
        
        int tmp = arr[index];
        
        try{
            
            for(int a = (index); a < n; a++) {
            
                arr[a] = arr[a + 1];
            
            }
        
        }     
        catch(Exception e) {}
        
        arr[n - 1] = tmp;
        
        //test print
        for(int j = 0; j < n; j++) {
            System.out.print(arr[j] + ", ");
        }
        System.out.println();
        System.out.println();
        
    }//close main method
    
}//close class
