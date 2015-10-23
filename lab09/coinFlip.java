////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab 09
//October 23, 2015
//coin flipping

//import scanner class
import java.util.Scanner;

//declare class
public class coinFlip {
 
   //mehtod to output 0-head or 1-tails
   public static int flip() {
        
        //declare variable for random numder
        int numRandom = (int)(Math.random() * 2);
        
        //if statement to output heads or tails
        if(numRandom == 0) {
            System.out.println("Heads " + numRandom);
        }
        else if(numRandom == 1) {
            System.out.println("Tails " + numRandom);
        }
        
        return numRandom;
       
   }//close heads or tails method
   
   //method to count heads or tails based on number of flips
   public static void flip(int n) {
       
       //declare heads and tails counter variables
       int countHeads = 0;
       int countTails = 0;
       
       //for loop to simulate n flips
       for(int i = n; i > 0; i--) {
           
           //run flips 
           int result = flip();
           
           //count heads or tails
           if(result == 0) {
               countHeads++;
           }
           else if(result == 1) {
               countTails++;
           }
           
       }//close for loop
       
       //print out results
       System.out.println(countHeads + " Heads and " + countTails + " Tails");
       
   }//close counting flips method
   
    //declare main method
    public static void main(String [] ags) {
        
        //construct scanner object
        Scanner scan = new Scanner(System.in);
        
        //ask user for integer between 0 and 100
        System.out.println("Enter an integer between 0 and 100");
        int input = scan.nextInt();
        
        //run flip once if user enters 0
        if(input == 0) {
            flip();
        }
        
        //exit program if user enters number over 100
        else if(input > 100) {
            System.exit(0); 
        }
        
        //run n number of flips entered by user
        else {
            flip(input);
        }
        
    }//close main method
    
}//close class
