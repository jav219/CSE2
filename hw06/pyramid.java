////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//October 6, 2015
//hw06
//making pyramids out of asterisks of a number of rows defined by the user

//import scanner class
import java.util.Scanner;

//declare class
public class pyramid {
    
    //declare main method
    public static void main(String [] args) {
        
        //construct scanner object
        Scanner scan = new Scanner(System.in);
        
        //prompt user to input nuber of rows in pyramid
        System.out.println("Enter the number of rows in the pyramid as an integer");
        int rowsPyramid = scan.nextInt();
        
        //declare string variables to be used in loops
        String spaces = "";
        String asterisk = "";
        
        //declare counter variables
        //int j = 0;
        //int k = rowsPyramid;
        
        //make outermost for loop to run for each row and zero-out string values at the end
        for(int i = rowsPyramid; i > 0; i--) {
            
            //make for loop to create spaces in rows
            for(int j = 0; j < i; j++) {
                spaces += " ";
            }//close spaces for loop
            
            //make for loop to create asterisks in each row
            for(int k = rowsPyramid; k > 0; k--) {
                asterisk += "*";
                k -= rowsPyramid;
            }//close asterisks for loop
            
            //print out line created
            System.out.println(spaces + asterisk);
            
            //alter string values
            spaces = "";
            asterisk += "*";
            
        }//close outer for loop
        
    }//close main method
    
}//close class 