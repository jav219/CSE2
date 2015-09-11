////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//September 15, 2015
//CSE 002 Section: 310
//hw03
//Program 2- calculating volume & suface area of block with user-inputted dimensions

//import scanner class
import java.util.Scanner;

//declare class
public class Block {
    
    //declare main method
    public static void main(String [] args) {
        
        //declare and construct scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for length of block
        System.out.print("Enter the length of the block: ");
        
        //declare lenght variable
        double length = myScanner.nextDouble();
        
        //prompt user for width of block
        System.out.print("Enter the width of the block: ");
        
        //declare width variable
        double width = myScanner.nextDouble();
        
        //prompt user for height variable
        System.out.print("Enter the height of the block: ");
        
        //declare height variable
        double height = myScanner.nextDouble();
        
        //declare and assign values to output variables
        double volume = length * width * height;
        double surfaceArea = 2*length*width + 2*length*height + 2*width*height;
        
        //output block dimensions, volume, and surface area
        System.out.println("The volume of the block of dimensions "
        +length+" x "+width+" x "+height+" is "+volume);
        System.out.println("The surface area of the block is " + surfaceArea);
        
    }
    
}
