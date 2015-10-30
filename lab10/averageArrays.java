////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab 10
//October 30, 2015
//averaging numbers in array

//import scanner class
import java.util.Scanner;

//declare class
public class averageArrays {
   
    //declare main method
    public static void main(String [] ags) {
        
        //construct scanner object
        Scanner scan = new Scanner(System.in);
        
        //ask user for input
		System.out.println("Input the number of values (as integer) to be averaged: ");
		int n = scan.nextInt();
		
		//print line so it's easier to read in terminal
		System.out.println();
		
        //create array of the size inputted by user
        int[] arr = new int[n];
        
        //for loop to assign random numbers from 0-100 to array 
        for(int j = 0; j < n; j++) {
            
            arr[j] = (int)(Math.random() * 100);
            
            System.out.print(arr[j] + ", ");
            
        }//close for loop to assign values to arr
        
        //print lines so it's easier to read in terminal
        System.out.println();
        System.out.println();
        
        //declare variable for sum of integers in arr
        int sum = 0;
        
        //for loop to sum values in arr
        for(int x = 0; x < n; x++) {
            
            sum += arr[x];
            
        }//close for loop to sum values
        
        //print sum
        System.out.println("Sum of the values in array: " + sum);
        
        //declare and print average of values in array
        double avg = (double)sum / (double)n;
        System.out.println("Average of values in array: " + avg);
        
        //print lines so it's easier to read in terminal
        System.out.println();
        
        //for loop to print values in arr >= the average
        for(int i = 0; i < n; i++) {
            
            int test = arr[i];
            
            if(test >= avg) {
                System.out.print(arr[i] + ", ");
            }
            else {continue;}
            
        }//close for loop to print values above average
        
        //print lines to it's easier to read in terminal
        System.out.println();
        System.out.println();
        
    }//close main method
    
}//close class
