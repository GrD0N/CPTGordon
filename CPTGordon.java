import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGordon{
	public static void main(String [] args){ // Main Screen
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
			HighScore(con);
		}
		
	}
	
	public static void Player1(Console con){ // Player Name Setup Screen
		String strPlayer1 = "";
		String strPlayer2 = "";
		BufferedImage imgNameScreen = con.loadImage("BlueScreen.jpg");
		con.drawImage(imgNameScreen, 0, 0);
		con.repaint();
		con.setDrawColor(Color.WHITE);	
		TextOutputFile txtName = new TextOutputFile("PlayerName.txt",false);
		con.drawRect(585,0,128,28);
		
		con.print("Enter Player 1 Name (NO LONGER THAN 10 LETTERS): ");
		strPlayer1 = con.readLine();
		txtName.println(strPlayer1);
		con.drawRect(585,25,128,28);
		
		con.print("Enter Player 2 Name (NO LONGER THAN 10 LETTERS): ");
		strPlayer2 = con.readLine();
		txtName.println(strPlayer2);
		txtName.close();
		con.clear();
		con.repaint();
		
		RecordChoice(con);
		
	}
	public static void HighScore(Console con){
		String strPlayer;
		int intCount = 0;
		int intY = 300;
		int intNum = 1;
		
		BufferedImage imgBackScreen = con.loadImage("BlueScreen.jpg");
		con.drawImage(imgBackScreen, 0, 0);
		con.clear();
		con.repaint();
		
		TextInputFile txtLeaderBoard = new TextInputFile("HighScore.txt"); 
		con.repaint();
		while(intCount != 2){
			strPlayer = txtLeaderBoard.readLine();
			con.setDrawColor(Color.WHITE);
			con.drawString(intNum +". " +strPlayer, 300,intY);
			intCount = intCount + 1;
			intNum = intNum = 1;
			intY = intY + 20;
			con.sleep(200);
		}
		
		
		
		
	}
	public static void RecordChoice(Console con){
		char charRecord;
		con.clear();
		
		BufferedImage imgGameScreen = con.loadImage("BlueScreen.jpg");
		con.drawImage(imgGameScreen, 0, 0);
		con.repaint();
		con.setDrawColor(Color.WHITE);	
		con.drawString("Would you like to record this Game?", 445,250);
		con.drawString("(y) --> Yes, Record the current Game", 431, 275);
		con.drawString("(n) --> No, don't record the current game", 420,300);
		charRecord = con.getChar();
		if(charRecord == 'y'){
			GameBoardYes(con);
		}else if(charRecord == 'n'){
			GameBoardNo(con);
		}
	}
	
	public static void GameBoardYes(Console con){
		String strPlayer1;
		String strPlayer2;
		int intBoard[][];
		int intRow = 1;
		char charColumn;
		con.clear();
		TextInputFile txtName = new TextInputFile("PlayerName.txt");
		
		BufferedImage imgBoardScreen = con.loadImage("BlueScreen.jpg");
		con.drawImage(imgBoardScreen, 0, 0);
		con.repaint();
		
		con.setDrawColor(Color.WHITE);	
		con.drawRect(0,0,500,55);
		strPlayer1 = txtName.readLine();
		strPlayer2 = txtName.readLine();
		con.repaint();
		con.drawString("Player 1: " +strPlayer1,0,0);
		con.drawString(strPlayer1 +"'s Turn - Enter Column Number", 0,23);
		con.drawRect(779,0,500,55);
		con.drawString("Player 2: " +strPlayer2,782,0);
		con.drawString(strPlayer2 +"'s Turn - Enter Column Number",782,23);
		
	}
	public static void GameBoardNo(Console con){
		String strPlayer1;
		String strPlayer2;
		int intBoard[][];
		int intRow = 1;
		char charColumn;
		con.clear();
		TextInputFile txtName = new TextInputFile("PlayerName.txt");
		
		BufferedImage imgBoardScreen = con.loadImage("BlueScreen.jpg");
		con.drawImage(imgBoardScreen, 0, 0);
		con.repaint();
		/*BufferedImage imgBoard = con.loadImage("Board.jpg");
		con.drawImage(imgBoard, 0, 75);
		con.repaint(); */
		
		con.setDrawColor(Color.WHITE);	
		con.drawRect(0,0,500,55);
		strPlayer1 = txtName.readLine();
		strPlayer2 = txtName.readLine();
		con.repaint();
		con.drawString("Player 1: " +strPlayer1,0,0);
		con.drawString(strPlayer1 +"'s Turn - Enter Column Number", 0,23);
		con.drawRect(779,0,500,55);
		con.drawString("Player 2: " +strPlayer2,782,0);
		con.drawString(strPlayer2 +"'s Turn - Enter Column Number",782,23);
		
	}
}
