import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGordon{
	public static void main(String [] args){
		Console con = new Console("CPTGordon", 1280, 720);
		char charStart = ' ';
		
		con.setDrawColor(new Color(0,0,0));		
		
		BufferedImage imgStartScreen = con.loadImage("Connect4.jpg");
		con.drawImage(imgStartScreen, 0, 0);
		
		
		con.drawString("(p) --> Play Game", 950, 350);
		con.drawString("(h) --> View High Scores", 950, 400);
		con.drawString("(r) --> View Replay", 950, 450);

		con.repaint();
		charStart = con.getChar();
		if(charStart == 'p'){
			con.sleep(200);
			Player1(con);
		}else if(charStart == 'h'){
			con.sleep(200);
			Player1(con);
		}
		
	}
	
	public static void Player1(Console con){ // Input Player Names
		String strPlayer1 = "";
		String strPlayer2 = "";
		BufferedImage imgNameScreen = con.loadImage("BlueScreen.jpg");
		con.drawImage(imgNameScreen, 0, 0);
		con.repaint();
		con.setDrawColor(Color.WHITE);	
		
		con.drawRect(251,0,240,28);
		
		con.print("Enter Player 1 Name: ");
		strPlayer1 = con.readLine();
		
		con.drawRect(251,25,240,28);
		
		con.print("Enter Player 2 Name: ");
		strPlayer2 = con.readLine();
		con.clear();
		con.repaint();
		RecordChoice(con);
		
	}
	public static void highScore(Console con){
		String strPlayerName;
		String strScore;
		
		//TextInputFile txtLeaderboard = new TextInputFile 
	}
	public static void RecordChoice(Console con){
		char charChoice;
		con.clear();
		
		BufferedImage imgGameScreen = con.loadImage("BlueScreen.jpg");
		con.drawImage(imgGameScreen, 0, 0);
		con.repaint();
		con.setDrawColor(Color.WHITE);	
		con.drawString("Would you like to record this Game?", 445,250);
		con.drawString("(y) --> Yes, Record the current Game", 431, 275);
		con.drawString("(n) --> No, don't record the current game", 420,300);
		charChoice = con.getChar();
		if(charChoice == 'y'){
			GameBoardYes(con);
		}else if(charChoice == 'n'){
			GameBoardNo(con);
		}
	}
	
	public static void GameBoardYes(Console con){
		int intBoard[][];
		int intRow = 1;
		int intColumn;
		
		con.repaint();
		BufferedImage imgGameScreen = con.loadImage("BlueScreen.jpg");
		con.drawImage(imgGameScreen, 0, 0);

		con.print("Player 1's Turn - Enter Column Number");
		intColumn = con.readInt();
		intBoard = new int[intRow][intColumn];
		con.print("Player 2's Turn - Enter Column Number");
		
	}
	public static void GameBoardNo(Console con){
		int intBoard[][];
		int intRow = 1;
		int intColumn;
		
		con.repaint();
		con.println("Player 1's Turn - Enter Column Number");
		intColumn = con.readInt();
		
		intBoard = new int[intRow][intColumn];
	}
}
