////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//October 27, 2015
//CSE 002 Section: 310
//hw08
//area methods

//import scanner class
import java.util.Scanner;

//declare class
public class areas {
    
    //area of circle method, integer is radius
    public static double areaCircle(int r) {
        
        //calculate area
        double areaCircle = 3.14 * (r * r);
        
        //return area as double
        return areaCircle;
    }//close area of circle method
    
    //area of a rectangle method, integers are length and width
    public static double areaRectangle(int l, int w) {
        
        //caclulate area
        double areaRectangle = l * w;
        
        //return area as double
        return areaRectangle;
    }//close area of rectangle method
    
    //area of trapezoid method, integers are height, base 1, and base 2
    public static double areaTrapezoid(int h, int b1, int b2) {
        
        //calculate area
        double areaTrapezoid = (b1 + b2)/2 * h;
        
        //return area as double
        return areaTrapezoid;
    }//close area of trapezoid method
    
    //declare main method
    public static void main(String [] args) {
        
        //construct scanner object
        Scanner scan = new Scanner(System.in);
        
        //ask user to enter a shape
        System.out.println("1- Circle, 2- Rectangle, 3- Trapezoid, 4- Exit");
        System.out.println("Enter a number to calculate the area of that shape: ");
        int input = scan.nextInt();
        
        //exit program if user wants
        if(input == 4) {
            System.exit(0);
        }
        
       while(input != 4) {
       
            //switch for each of 3 possible inputs
            switch(input) {
            
                case 1:
                    System.out.println("Enter the radius (as an integer): ");
                    int radius = scan.nextInt();
                
                    double aCircle = areaCircle(radius);
                
                    System.out.println("The area is: " + aCircle);
                    break;
                    
                case 2:
                    System.out.println("Enter the length and width (as integers): ");
                    int l = scan.nextInt();
                    int w = scan.nextInt();
                
                    double aRect = areaRectangle(l, w);
                
                    System.out.println("The area is: " + aRect);
                    break;
                
                case 3:
                    System.out.println("Enter the height and bases (as integers): ");
                    int h = scan.nextInt();
                    int base1 = scan.nextInt();
                    int base2 = scan.nextInt();
                
                    double aTrap = areaTrapezoid(h, base1, base2);
                
                    System.out.println("The area is: " + aTrap);
                    break;
                
                    default:
                    System.out.println("Invalid");
                    break;
                    
            }//close switch statement
            
            //ask user to enter a shape
            System.out.println("1- Circle, 2- Rectangle, 3- Trapezoid, 4- Exit");
            System.out.println("Enter a number to calculate the area of that shape: ");
            input = scan.nextInt();
        
            //exit program if user wants
            if(input == 4) {
                System.exit(0);
            }
            
       }//close while loop
        
    }//close main mehtod
    
}//close class