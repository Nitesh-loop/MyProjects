package TicTacToe;

import java.util.Scanner;

public class Render {
	
	static String[][] gameBoard;
	
	
	static String checkWinner() {
		
		String Line = null;
		
		for(int a = 1; a>=9; a++) {
			switch(a){
			
			case 1 : Line = gameBoard[0][0]+gameBoard[0][1]+gameBoard[0][2];
				break;
			case 2 : Line = gameBoard[1][0]+gameBoard[1][1]+gameBoard[1][2];
				break;
			case 3 : Line = gameBoard[2][0]+gameBoard[2][1]+gameBoard[2][2];
				break;
			case 4 : Line = gameBoard[0][0]+gameBoard[1][0]+gameBoard[2][0];
				break;
			case 5 : Line = gameBoard[0][1]+gameBoard[1][1]+gameBoard[2][1];
				break;
			case 6 : Line = gameBoard[0][2]+gameBoard[1][2]+gameBoard[2][2];
				break;
			case 7 : Line = gameBoard[0][0]+gameBoard[1][1]+gameBoard[2][2];
				break;
			case 8 : Line = gameBoard[0][2]+gameBoard[1][1]+gameBoard[2][0];
				break;
						
			}
			
			if(Line == "XXX") {
				System.out.println("Winner is X");
			}
			
			if(Line == "OOO") {
				System.out.println("Winner is O");
			}
			
		}
		
		return null;
		
	}

	static void board(String[][] gameboard) {
		System.out.println("|---|---|---|");
		System.out.println("| " + gameboard[0][0] + " | " + gameboard[0][1] + " | " + gameboard[0][2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + gameboard[1][0] + " | " + gameboard[1][1] + " | " + gameboard[1][2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + gameboard[2][0] + " | " + gameboard[2][1] + " | " + gameboard[2][2] + " |");
		System.out.println("|---|---|---|");
	}
	
	
	
	
	
	// -----------------------------------------------//
	
	public static void main(String[] args) {
		
		gameBoard = new String[3][3];
		int count = 1;
		for(int i=0; i< 3; i++) {
			
			for(int j=0; j< 3; j++) {
				gameBoard[i][j] = String.valueOf(count);
				count++;
			}
			//System.out.println(" ");
		}
		
		board(gameBoard);
		
		Scanner in = new Scanner(System.in);
		int playerX = 0;
		
		System.out.println("Welcome to Tic Tac Toe");
		System.out.println("Please enter cell number for Player X : ");
		
		playerX = in.nextInt();
		

		
	}

}
