package TicTacToe;

public class Render {

	static void board(int[][] gameboard) {
		System.out.println("|---|---|---|");
		System.out.println("| " + gameboard[0][0] + " | " + gameboard[0][1] + " | " + gameboard[0][2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + gameboard[1][0] + " | " + gameboard[1][1] + " | " + gameboard[1][2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + gameboard[2][0] + " | " + gameboard[2][1] + " | " + gameboard[2][2] + " |");
		System.out.println("|---|---|---|");
	}
	
	
	
	
	public static void main(String[] args) {
		int[][] gameBoard = {
								{1,2,3},
								{4,5,6},
								{7,8,9}
							};
		/*
		for(int i=0; i< 3; i++) {
			for(int j=0; j< 3; j++) {
				System.out.print(gameBoard[i][j]);
			}
			System.out.println(" ");
		}*/
		
		board(gameBoard);
		
		
		
		
	}

}
