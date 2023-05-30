import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGordon{
	public static void main(String [] args){
		Console con = new Console("CPTGordon", 1280, 720);
		int intKey = 0;
		
		con.setDrawColor(new Color(0,0,0));		
		
		BufferedImage imgStartScreen = con.loadImage("Connect4.jpg");
		con.drawImage(imgStartScreen, 0, 0);
		
		
		con.drawString("(p) --> Play Game", 950, 350);
		con.drawString("(h) --> View High Scores", 950, 400);
		con.drawString("(r) --> View Replay", 950, 450);

		con.repaint();
		
		while(intKey != 112 && intKey != 104 && intKey != 114){
			intKey = con.getChar();
		}
		Player1(con);
		
	}
	
	public static void Player1(Console con){ // Input Player Names
		String strPlayer1 = "";
		String strPlayer2 = "";
		BufferedImage imgPlayer1 = con.loadImage("Screen1.jpg");
		con.drawImage(imgPlayer1, 0, 0);
		con.repaint();
		
		con.drawRect(251,0,240,28);
		
		con.print("Enter Player 1 Name: ");
		strPlayer1 = con.readLine();
		
		con.drawRect(251,25,240,28);
		
		con.print("Enter Player 2 Name: ");
		strPlayer2 = con.readLine();
		
		con.println("Player 1: "+strPlayer1);
		con.println("Player 2: "+strPlayer2);
	}
	public static void highScore(Console con){
		String strPlayerName;
		String strScore;
		
		//TextInputFile txtLeaderboard = new TextInputFile 
	}
	public static void GameBoard(Console con){
		int intBoard[][];
		int intRow = 1;
		int intColumn;
		con.println("Player 1's Turn - Enter Column Number");
		intColumn = con.readInt();
		
		intBoard = new int[intRow][intColumn];
		
	}
}
