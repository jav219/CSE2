////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//November 12, 2015
//CSE 002 Section: 310
//hw10
//minesweeper

//import scanner class
import java.util.Scanner;

//declare class
public class MineSweeper {
	
	//method to check value for board inputted by user
	public static void checkN(int a) {
		if(a != (int)a || a < 2 || a > 30) {
			System.out.println("Invalid, enter an integer from 2-30");
			System.exit(0);
		}
	}//close checkN method
	
	//method to check value for mines inputted by user
	public static void checkM(int b, int c) {
		if(b != (int)b || b < 1 || b > c*c) {
			System.out.println("Invalid, enter an integer from 1-" + c*c);
			System.exit(0);
		}
	}
	
	//declare main method
	public static void main(String [] args) {
		
		//construct scanner object
		Scanner scan = new Scanner(System.in);
		
		//ask user to enter size of the board
		System.out.print("Enter an integer (from 2-30) for size of the board: ");
		int n = scan.nextInt();
		
		//check n for validity
		checkN(n);
		
		//create array for board
		char[][] board = new char[n][n];
		
		//ask user to input number of mines
		System.out.print("Enter number of mines as integer (from 1-" + n*n + "): ");
		int M = scan.nextInt();
		
		//check M for validity
		checkM(M, n);
		
		//random x and y coordinates for mines
		for(int i = M; i > 0; i--) {
			
			int X = (int)(Math.random() * n);
			int Y = (int)(Math.random() * n);
			
			//place mine only if space is empty, if not add to counter, loop again
			if(board[X][Y] != 'M') {
				board[X][Y] = 'M';
			}
			else{i++;}
			
		}//close for loop to place mines
		
		//make all open spaces 0
		for(int c = 0; c < n; c++) {
			
			for(int d = 0; d < n; d++) {
				if(board[c][d] != 'M') {
					board[c][d] = '0';
				}
			}
		}//close for loop to make all open spaces 0
		
		//for loop to find spaces bordering mines and increment them
		for(int j = 0; j < n; j++) {	
			for(int k = 0; k < n; k++) {
					
					//increment if mine is in lower right corner
					if((board[j][k] == 'M') && (j == n-1 && k == n-1)) {
						if(board[j-1][k] != 'M')
							board[j-1][k]++;
						if(board[j-1][k-1] != 'M')
							board[j-1][k-1]++;
						if(board[j][k-1] != 'M')
							board[j][k-1]++;
					}
					
					//increment if mine is in upper right corner
					else if((board[j][k] == 'M') && (j == n-1 && k == 0)) {
						if(board[j-1][k] != 'M')
							board[j-1][k]++;
						if(board[j-1][k+1] != 'M')
							board[j-1][k+1]++;
						if(board[j][k+1] != 'M')
							board[j][k+1]++;
					}
					
					//increment if mine is in lower left corner
					else if((board[j][k] == 'M') && (j == 0 && k == n-1)) {
						if(board[j][k-1] != 'M')
							board[j][k-1]++;
						if(board[j+1][k] != 'M')
							board[j+1][k]++;
						if(board[j+1][k-1] != 'M')
							board[j+1][k-1]++;
					}
					
					//increment if mine is in upper left corner
					else if((board[j][k] == 'M') && (j == 0 && k == 0)) {
						if(board[j][k+1] != 'M')
							board[j][k+1]++;
						if(board[j+1][k] != 'M')
							board[j+1][k]++;
						if(board[j+1][k+1] != 'M')
							board[j+1][k+1]++;
					}
					
					//increment if mine is in far left column
					else if((board[j][k] == 'M') && j == 0) {
						if(board[j][k-1] != 'M')
							board[j][k-1]++;
						if(board[j][k+1] != 'M')
							board[j][k+1]++;
						if(board[j+1][k] != 'M')
							board[j+1][k]++;
						if(board[j+1][k-1] != 'M')
							board[j+1][k-1]++;
						if(board[j+1][k+1] != 'M')
							board[j+1][k+1]++;
					}
					
					//increment if mine is in far right column
					else if((board[j][k] == 'M') && j == n-1) {
						if(board[j-1][k] != 'M')
							board[j-1][k]++;
						if(board[j-1][k-1] != 'M')
							board[j-1][k-1]++;
						if(board[j-1][k+1] != 'M')
							board[j-1][k+1]++;
						if(board[j][k-1] != 'M')
							board[j][k-1]++;
						if(board[j][k+1] != 'M')
							board[j][k+1]++;
					}
					
					//increment if mine is in bottom row
					else if((board[j][k] == 'M') && k == n-1) {
						if(board[j-1][k] != 'M')
							board[j-1][k]++;
						if(board[j-1][k-1] != 'M')
							board[j-1][k-1]++;
						if(board[j][k-1] != 'M')
							board[j][k-1]++;
						if(board[j+1][k] != 'M')
							board[j+1][k]++;
						if(board[j+1][k-1] != 'M')
							board[j+1][k-1]++;
					}
					
					//increment if mine is in top row
					else if((board[j][k] == 'M') && k == 0) {
						if(board[j-1][k] != 'M')
							board[j-1][k]++;
						if(board[j-1][k+1] != 'M')
							board[j-1][k+1]++;
						if(board[j][k+1] != 'M')
							board[j][k+1]++;
						if(board[j+1][k] != 'M')
							board[j+1][k]++;
						if(board[j+1][k+1] != 'M')
							board[j+1][k+1]++;
					}
					
					//increment if mine is middle of board
					else if(board[j][k] == 'M') {
						if(board[j-1][k] != 'M')
							board[j-1][k]++;
						if(board[j-1][k-1] != 'M')
							board[j-1][k-1]++;
						if(board[j-1][k+1] != 'M')
							board[j-1][k+1]++;
						if(board[j][k-1] != 'M')
							board[j][k-1]++;
						if(board[j][k+1] != 'M')
							board[j][k+1]++;
						if(board[j+1][k] != 'M')
							board[j+1][k]++;
						if(board[j+1][k-1] != 'M')
							board[j+1][k-1]++;
						if(board[j+1][k+1] != 'M')
							board[j+1][k+1]++;
					}
				
			}
		}//close for loop to find mines and increment spaces around it */
		
		//for loop to replace all 0's with empty spaces
		for(int f = 0; f < n; f++) {
			for(int g = 0; g < n; g++) {
				if(board[f][g] == '0') {
					board[f][g] = ' ';
				}
			}
		}//close for loop to make spaces
		
		//print board
		for(int a = 0; a < n; a++) {
			
			for(int b = 0; b < n; b++) {
				//print each spot with a space to make board easier to read
				System.out.print(board[a][b] + " ");
			
			}
			
			System.out.println();
		
		}//close for loop to print board
		
	}//close main method
	
}//close class
