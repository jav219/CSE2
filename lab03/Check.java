////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab03
//Calculating a dinner check with tip and splitting the cost 

//import scanner class
import java.util.Scanner;

//declare class
public class Check {
    
    //declare main method
    public static void main(String [] args) {
        
        //declare scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //output prompting user for variables
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        
        //declare cost variable
        double checkCost = myScanner.nextDouble();
        
        //output prompting user for tip percentage
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        
        //declare tip percentage variable
        double tipPercent = myScanner.nextDouble();
        tipPercent/= 100; //convert integer by user into decimal value
        
        //output prompting user for number of people to split check between
        System.out.print("Enter the number of people who went out to dinner: ");
        
        //declare variable for number of people at dinner
        int numPeople = myScanner.nextInt();
        
        //declare output variables
        double totalCost = checkCost * (1 + tipPercent);
        double costPerPerson = totalCost / numPeople;
        int dollars, //integer dollar amount of cost
        dimes, pennies; //for storing digits to right of decimal for cost
        //whole dollar amount
        dollars = (int)costPerPerson;
        //amount of dimes and pennies
        dimes = (int)(costPerPerson * 10) % 10;
        pennies = (int)(costPerPerson *100) % 10;
        
        //output how much each person owes 
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
    }//close main method
    
}//close class
