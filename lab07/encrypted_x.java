////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab07
//October 9, 2015
//Printing out an 'X' buried in asterisks 

//import scanner class
import java.util.Scanner;

//declare class
public class encrypted_x {
    
    //declare main method
    public static void main(String [] args) {
        
        //construct scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //ask user to input integer between 0-100
        System.out.println("Input an integer between 0 and 100 to be the size of the x:");
        int input = myScanner.nextInt(); 
        
        //check input for validity
        if(input < 0 || input > 100) {
            System.exit(-1);
        }
        
        //outer for loop to print the number of lines based on input
        for(int i = 0; i < input; i++) {
            
            //inner for loop to print out asterisks in each line
            for(int j = 0; j <= input; j++) {
            
                //if statement to print either * or " "
                if(j == i) {
                    System.out.print(' ');
                }
                else if(j == input - i) {
                    System.out.print(' ');
                }
                else {System.out.print('*');}
            }//close inner for loop to print asterisks in each line
            
            //move to the next line
            System.out.println();
            
        }//close outer for loops to print number of lines
        
    }//close main method
    
}//close class
