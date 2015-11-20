////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab 11
//November 6, 2015
//non-static methods and variables with finding area of rectangle

//delcare class
public class Rectangle {
     
     //declare non-static width and height variables
     double width;
     double height;
     
     //non-static method to set value of width
     public void setWidth(double x) {
          width = x;
     }
     
     //non-static method to set value of height
     public void setHeight(double y) {
          height = y;
     }
     
     //non-static method to return area of rectangle
     public double getArea() {
          return height * width;
     }
     
     public static void main(String[] args) {
          
          //declare rectangle variable
          Rectangle r1 = new Rectangle();
          
          //initialize width and height variables
          r1.setHeight(4.5);
          r1.setWidth(7.5);
          
          //print the area of the rectangle 
          System.out.println(r1.getArea());
          
     }//close main method
     
}//close class
