////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//CSE 002 Section: 310
//Lab 11
//November 6, 2015
//sorting and merging numbers in arrays

//import arrays class
import java.util.Arrays;

//declare class
public class sortArrays {
	
	public static void sort(int[] arr) {
		
		Arrays.sort(arr);
		
	}//close sort method
	
	//declare main method
	public static void main(String [] ags) {
		
		//declare array1
		int[] array1 = new int[20];
		
		//initialize 20 random numbers between 0 and 100
		for(int n = 0; n < 20; n++) {
			
			array1[n] = (int)(Math.random() * 100);
			
		}//close for loop to initialize array1 values
		
		//declare array2
		int[] array2 = new int[10];
		
		//initialize random numbers between 0 and 100 for array2
		for(int i = 0; i < 10; i++) {
			
			array2[i] = (int)(Math.random() * 100);
			
		}//close for loop to initialize array2 values
		
		//sort arrays 1 and 2
		sort(array1);
		sort(array2);
		
		System.out.println("Array1:");
		//print values of array1
		for(int j = 0; j < 20; j++) {
			
			System.out.print(array1[j] + ", ");
			
		}//close for loop to print array1 values
		
		System.out.println();
		System.out.println();
		
		System.out.println("Array2:");
		//print values of array2
		for(int x = 0; x < 10; x++) {
			
			System.out.print(array2[x] + ", ");
			
		}//close for loop to print array2 values
		
		System.out.println();
		System.out.println();
		
		//declare array3
		int[] array3 = new int[30];
		
		//initialize first 20 values of array3
		for(int y = 0; y < 20; y++) {
			
			array3[y] = array1[y];
			
		}//close for loop to initialize last 10 values of array3
		
		//initialize last 10 values of array3
		for(int a = 20; a < 30; a++) {
			
			array3[a] = array2[(a - 20)];
			
		}//close for loop to initialize last 10 values of array3
		
		//sort array3
		sort(array3);
		
		System.out.println("Array3:");
		//print values of array3
		for(int b = 0; b < 30; b++) {
			
			System.out.print(array3[b] + ", ");
			
		}
		
		System.out.println();
		System.out.println();
	
	}//close main method

}//close class
