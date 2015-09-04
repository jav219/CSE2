////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section:310
//Lab 02
//Cyclometer that calculates data for time, distance, and RPM of bike trips

//declare class
public class Cyclometer {
    
    //main method required for every Java Program
    public static void main(String[] args) {
        
        //declaring input data variable and assigning values to them
        int secsTrip1=480;  //time for Trip 1 in seconds
        int secsTrip2=3220; //time for Trip 2 in seconds
        int countsTrip1=1561;   //Rotations of wheel for Trip 1
        int countsTrip2=9037;   //Rotations of Wheel for Trip 2
        
        //declaring intermediate variables and assignging values to them
        double wheelDiameter=27.0,  //wheel diameter in inches
        PI=3.14159, //variale for pi calculated to 5 decimal places
        feetPerMile=5280,   //5,280 feet in 1 mile
        inchesPerFoot=12,   //12 inches in 1 foot
        secondsPerMinute=60;    //60 seconds in 1 minute
        double distanceTrip1, distanceTrip2, totalDistance; //Solution variables
        
        //Print answers to questions in lab
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + 
        " minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + 
        " minutes and had " + countsTrip2 + " counts.");
        
        //Do calculations and store the values with corresponding variables
        //Distance= (Diameter * PI) * Counts, this is cirumference multiplied
        //by the rotations of the wheel in inches. This must then be converted
        //to miles using the inchesPerFoot and feetPerMile variables
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1 + distanceTrip2; 
        
        //Print distance data on the screen
        System.out.println("Trip 1 was " +distanceTrip1+ " miles.");
        System.out.println("Trip 2 was " +distanceTrip2+ " miles.");
        System.out.println("The total distance was " +totalDistance+ " miles.");
        
        
    }   //end of main method
    
}   //end of class
