////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab05
//September 25, 2015
//performing addition, subtraction, multiplication or division with two integers
//repeatedly until user decides to stop 

//import scanner class
import java.util.Scanner;

//declare class
public class CalculatorSpecial {
    
    //declare main method
    public static void main(String [] args) {
        
        //construct scanner object
        Scanner scan = new Scanner(System.in);
        
            //prompt user to stop and declare variable for question
            System.out.println("Type n or N to stop");
            String Y = scan.next();
            
        while(!Y.equals("n") && !Y.equals("N")) {
            
            //prompt user for the two integers
            System.out.println("Enter first integer");
            double num1 = scan.nextInt();
            System.out.println("Enter Second integer");
            double num2 = scan.nextInt();
        
            //prompt user for an operation
            System.out.println("Enter an operator: +, -, *, or /");
            char Operator = scan.next().charAt(0);
        
            //declare output variable
            double Solution;
        
            //create switch statements for four possible operators
            switch(Operator) {
                case '+':
                    Solution = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + Solution);
                        break;
                case '-':
                    Solution = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + Solution);
                        break;
                case '*':
                    Solution = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + Solution);
                        break;
                case '/':
                    Solution = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + Solution);
                        break;
                default:
                System.out.println("Illegal operator");
                break;
            }//close switch statement
        
        System.out.println("Type n or N to stop");
        Y = scan.next();
        }//close while loop
        
    }//close main method
    
}//close class 
