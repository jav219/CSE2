////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab06
//October 2, 2015
//calculating total payroll for a number of employees with data entered by the user

//import scanner class
import java.util.Scanner;

//declare class
public class timeSheets {
    
    //declare main method
    public static void main(String [] args) {
        
        //construct scanner object
        Scanner scan = new Scanner(System.in);
        
        //ask user for number of employees
        System.out.println("Enter the number of employee time sheets to be read-in: ");
        int numEmployees = scan.nextInt();
        
        //declare variable for toatal payroll
        int totalPay = 0;
        
        //create while loop
        while(numEmployees >= 1) {
            //prompt user for hourly wage in cents
            System.out.println("Enter employee's hourly wage in cents as an integer: ");
            int hourWage = scan.nextInt();
            //prompt user to input hours worked each day
            System.out.println("Enter the number of hours worked on each day as an integer");
            System.out.print("Monday: ");
            int hoursMon = scan.nextInt();
            System.out.print("Tuesday: ");
            int hoursTues = scan.nextInt();
            System.out.print("Wednesday: ");
            int hoursWed = scan.nextInt();
            System.out.print("Thursday: ");
            int hoursThurs = scan.nextInt();
            System.out.print("Friday: ");
            int hoursFri = scan.nextInt();
            //declare variable for hours this week and pay for the week
            int weekHours = hoursMon + hoursTues + hoursWed + hoursThurs + hoursFri;
            int weekPay = hourWage * weekHours;
            //add this employee's pay to total payroll
            totalPay += weekPay;
            //substract one from the number of employees left to get data for
            numEmployees--;
        }//close while loop
        
        //output the total payroll for the week
        System.out.println("The total payroll in cents is: " + totalPay);
        
    }//close main method
    
}//close calss 