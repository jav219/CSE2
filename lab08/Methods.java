////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab 08
//October 16, 2015
//mean and median with 10 numbers inputted by the user

//import scanner class
import java.util.Scanner;

//declare class
public class Methods {
    
    //create method to find mean of values
    public static double Mean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
        //declare and calculate value for mean variable
        return (a + b + c + d + e + f + g +h + i + j)/10;
    
    }
    
    //create method to find median of values
    public static double Median(double n, double z) {
        //declare and calculate value for median variable
        return (n + z)/2;

    }
    
    //create method to print out results
    public static void printResults(double x, double y) {
        //print out the mean
        System.out.println("The mean of the 10 values is: " + x);
        //print out the median
        System.out.println("The median of the 10 values is: " + y);
    }
    
    //declare main method
    public static void main(String [] args) {
        
       //construct scanner object
       Scanner scan = new Scanner(System.in);
       
        //ask user to input 10 numbers
        System.out.println("Please input 10 numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double num5 = scan.nextDouble();
        double num6 = scan.nextDouble();
        double num7 = scan.nextDouble();
        double num8 = scan.nextDouble();
        double num9 = scan.nextDouble();
        double num10 = scan.nextDouble();
        
        //calculate value for mean
        double mean = Mean(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);
        
        //calculate value for median
        double median = Median(num5, num6);
        
        //print results with method
        printResults(mean, median);
        
    }//close main method
    
}//close class