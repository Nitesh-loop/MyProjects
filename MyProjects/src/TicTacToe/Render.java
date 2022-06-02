package TicTacToe;

import java.util.Scanner;

public class Render {
	
	static String[] gameBoard;
	static String turn = null;
	
	
	//check winner
	static String checkWinner() {
		
		String line = null;
		
		for(int a = 0; a<8; a++) {
			switch(a){
			
			case 0:
                line = gameBoard[0] + gameBoard[1] + gameBoard[2];
                break;
            case 1:
                line = gameBoard[3] + gameBoard[4] + gameBoard[5];
                break;
            case 2:
                line = gameBoard[6] + gameBoard[7] + gameBoard[8];
                break;
            case 3:
                line = gameBoard[0] + gameBoard[3] + gameBoard[6];
                break;
            case 4:
                line = gameBoard[1] + gameBoard[4] + gameBoard[7];
                break;
            case 5:
                line = gameBoard[2] + gameBoard[5] + gameBoard[8];
                break;
            case 6:
                line = gameBoard[0] + gameBoard[4] + gameBoard[8];
                break;
            case 7:
                line = gameBoard[2] + gameBoard[4] + gameBoard[6];
                break;
						
			}
			
			if(line.equals("XXX")) {
				return "X";
			}
			
			if(line.equals("OOO")) {
				return "O";
			}
			
		}
		
		return null;
		
	}
	
	//print game board
	static void board() {
		System.out.println("|---|---|---|");
		System.out.println("| " + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8] + " |");
		System.out.println("|---|---|---|");
	}
	
	
	
	
	
	// -----------------------------------------------//
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		gameBoard = new String[9];
		turn = "X";
		String winner = null;
		
		for (int a = 0; a < 9; a++) {
            gameBoard[a] = String.valueOf(a + 1);
        }
		
		System.out.println(" ");
		System.out.println("Welcome to Tic Tac Toe");
		System.out.println(" ");
		board();
		System.out.println(" ");
		
			
		System.out.println("X will play first. Please enter cell number for Player X : ");
		
		while(winner == null) {
			int numInput;
			
			numInput = in.nextInt();
			
			if(gameBoard[numInput - 1].equals(String.valueOf(numInput))) {
				gameBoard[numInput - 1] = turn;
				
				if (turn.equals("X")) {
                    			turn = "O";
                		}
                		else {
                   		 	turn = "X";
                		}
  
               			board();
                		winner = checkWinner();
			}
			else {
                		System.out.println("Slot already taken; re-enter slot number:");
            		}
		}
		

		
	}

}
