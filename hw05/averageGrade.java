////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//October 1, 2015
//CSE 002 Section: 310
//hw05
//Averaging grades entered by the user when the user enter 999

//import scanner class
import java.util.Scanner;

//declare class
public class averageGrade {
    
    //declare main method
    public static void main(String [] args) {
        
        //construct scanner object
        Scanner scan = new Scanner(System.in);
        
        //prompt user for first grade and declare variable for input
        System.out.println("Input a grade between 0 and 100");
        double inputGrade = scan.nextDouble();
        
        //start grade count at 0
        int gradeCount = 0;  
        
        //declare variable for total grade
        double totalGrade = 0 ;
        
        //create while loop
        while(inputGrade != 999) {
            if( inputGrade > 0 && inputGrade < 100 ) {
                totalGrade += inputGrade;
            } else {
                System.out.println("Invalid, input a grade between 0 and 100");
            }//close if else statement
            //prompt user for input again
            System.out.println("Enter another grade or enter '999' to average grades");
            inputGrade = scan.nextDouble();
            //add one to grade number of grades entered
            gradeCount++;
        }//close while loop
    
    //average the grades if the user entered 999
    double averageGrade = totalGrade / gradeCount; 
    System.out.println("The average of the grades entered is: " + averageGrade);
    }//close main method
    
}//close class
