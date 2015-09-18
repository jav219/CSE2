////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab04
//performing addition, subtraction, multiplication, or division with two integers

//import scanner class
import java.util.Scanner;

//declare class
public class Calculator {
    
    //declare main method
    public static void main(String [] args) {
       
       //construct scanner object 
        Scanner scan = new Scanner(System.in);
        
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
                System.out.println("= " + Solution);
                    break;
            case '-':
                Solution = num1 - num2;
                System.out.println("= " + Solution);
                    break;
            case '*':
                Solution = num1 * num2;
                System.out.println("= " + Solution);
                    break;
            case '/':
                Solution = num1 / num2;
                System.out.println("= " + Solution);
                    break;
            default:
            System.out.println("Illegal operator");
            break;
        }
        
    }
    
}
