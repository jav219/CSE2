////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//September 15, 2015
//CSE 002 Section: 310
//hw03
//Program 1- Timer giving user period between now and when they go to dinner

//import scanner class
import java.util.Scanner;

//declare class
public class Timer {
    
    //declare main method
    public static void main(String [] args) {
        
        //declare and construct scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user to input current time in HHMM format
        System.out.print("Enter the current time in the form HHMM: ");
        
        //declare current time variable
        double currentTime = myScanner.nextInt();
        
        //promt user for time of dinner in HHMM format
        System.out.print("Enter the time that you will be eating dinner in the form HHMM: ");
        
        //declare dinner time variable
        double dinnerTime = myScanner.nextInt();
        
        //declare and assign values to output variables
        double untilDinner = dinnerTime - currentTime;
        int hoursDinner = (int)(untilDinner * 0.01) % 100;
        int minutesDinner = (int)(untilDinner * 1) % 100;
        
        //output time until dinner
        System.out.println("You have " + hoursDinner + " hours and " + minutesDinner + " minutes until dinner.");
        
    }
    
}
