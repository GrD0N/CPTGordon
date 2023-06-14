import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGordon{
	public static void main(String [] args){ // Main Screen
		Console con = new Console("CPTGordon - Connect 4 Game", 1280, 720);
		
		char charPlay = ' ';
		
		BufferedImage imgStart = con.loadImage("Connect4.jpg");
		con.drawImage(imgStart, 0, 0);
		con.setDrawColor(Color.BLACK);
		con.drawString("Press (s) to Start", 950, 350);
		con.repaint();
		charPlay = con.getChar();
		System.out.println(charPlay);
		while(charPlay != 's'){
			charPlay = con.getChar();
			System.out.println(charPlay);
		}
		if(charPlay == 's'){
			con.sleep(200);
			Start(con);
		}
		
	}
	public static void Start(Console con){	
		
		char charStart = ' ';
		
		BufferedImage imgStartScreen = con.loadImage("Connect4.jpg");
		con.drawImage(imgStartScreen, 0, 0);
		
		
		con.drawString("(p) --> Play Game", 950, 350);
		con.drawString("(l) --> View Leaderboard", 950, 400);
		con.drawString("(r) --> View Replay", 950, 450);
		con.drawString("(h) --> Help Screen", 950, 500);

		con.repaint();
		charStart = con.getChar();
		System.out.println(charStart);
		
		while(charStart != 'p' && charStart != 'l' && charStart != 'h'){
			charStart = con.getChar();
			System.out.println(charStart);
		}
		if(charStart == 'p'){
			con.sleep(200);
			Player1(con);
		}else if(charStart == 'l'){
			con.sleep(200);
			LeaderBoard(con);
		}else if(charStart == 'h'){
			con.sleep(200);
			HelpScreen(con);
		}
		
	}
	
	public static void Player1(Console con){ // Player Name Setup Screen
		String strPlayer1 = "";
		String strPlayer2 = "";
		con.setBackgroundColor(Color.BLUE);
		con.repaint();
		con.setDrawColor(Color.WHITE);	
		TextOutputFile txtName = new TextOutputFile("PlayerName.txt",false);
		con.drawRect(585,0,128,28);
		
		con.print("Enter Player 1 Name (NO LONGER THAN 10 LETTERS): ");
		strPlayer1 = con.readLine();
		txtName.println(strPlayer1);
		con.drawRect(585,20,128,29);
		
		con.print("Enter Player 2 Name (NO LONGER THAN 10 LETTERS): ");
		strPlayer2 = con.readLine();
		txtName.println(strPlayer2);
		txtName.close();
		con.clear();
		con.repaint();
		
		RecordChoice(con);
		
	}
	public static void LeaderBoard(Console con){
		String strPlayer = " ";
		int intCount;
		int intY = 250;
		int intNum = 1;
		int intCounter;
		int intCounter2;
		int intCurrent;
		int intBelow;
		String strTemp;
		con.clear();
		con.repaint();
		con.setBackgroundColor(Color.BLUE);
		con.setDrawColor(Color.WHITE);
		con.drawRect(490,250, 250, 250);

		TextInputFile txtLeaderBoard = new TextInputFile("HighScore.txt"); 
		
		
		for(intCount = 0; intCount <= 10; intCount++){
			strPlayer = txtLeaderBoard.readLine();
			con.setDrawColor(Color.WHITE);
			con.drawString(intNum +". " +strPlayer, 500,intY);
			intCount = intCount + 1;
			intNum = intNum + 1;
			intY = intY + 20;
		}		
		
		for(intCounter2 = 0; intCounter2 < intCount -1; intCounter2++){
			for(intCounter = 0; intCounter < intCount -1; intCounter++){
				intCurrent = Integer.parseInt(strPlayer);
				intBelow = Integer.parseInt(strPlayer);
				if(intCurrent < intBelow){
					strTemp = strPlayer;
					strPlayer = strPlayer;
					strPlayer = strTemp;
					strTemp = strPlayer;
					strPlayer = strPlayer;
					strPlayer = strTemp;
					strTemp = strPlayer;
					strPlayer = strPlayer;
					strPlayer = strTemp;
				}
			}
		}
		
		

	}
	
	public static void HelpScreen(Console con){
		char charHelpChoice;
		
		con.clear();
		con.setBackgroundColor(Color.BLUE);
		con.repaint();
		con.setDrawColor(Color.WHITE);
		
		con.drawString("What do you need help with?", 445, 250);
		con.drawString("(n) --> Navigation", 495, 275);
		con.drawString("(p) --> Playing the Game", 460,300);
		con.drawString("(g) --> Go Back", 510,325);
		charHelpChoice = con.getChar();
		
		if(charHelpChoice == 'n'){
			con.clear();
			NavigationHelp(con);
		}else if(charHelpChoice == 'p'){
			con.clear();
			GameHelp(con);
		}else if(charHelpChoice == 'g'){
			con.clear();
			Start(con);
		}
		
	}
	
	public static void NavigationHelp(Console con){
		char charNavigationChoice;
		
		con.clear();
		con.setBackgroundColor(Color.BLUE);
		con.repaint();
		con.setDrawColor(Color.WHITE);
		
		con.drawString("To navigate throught the screens simply press the",380,275);
		con.drawString("corresponding key to navigate to the desired screen", 380,300);
		con.drawString("Press (g) to go back", 500, 550);
		charNavigationChoice = con.getChar();
		if(charNavigationChoice == 'g'){
			HelpScreen(con);
		}
		
	}
	
	public static void GameHelp(Console con){
		char charGameChoice;
		
		con.clear();
		con.setBackgroundColor(Color.BLUE);
		con.repaint();
		con.setDrawColor(Color.WHITE);
		
		con.drawString("To play the game, simply press the column", 380, 275);
		con.drawString("from 1-7 that you want to put the piece int", 380, 300);
		con.drawString("Press (g) to go back", 500, 550);
		charGameChoice = con.getChar();
		if(charGameChoice == 'g'){
			HelpScreen(con);
		}
	}
	public static void RecordChoice(Console con){
		char charRecord;
		
		con.clear();
		con.setBackgroundColor(Color.BLUE);
		con.repaint();
		con.setDrawColor(Color.WHITE);	
		
		con.drawString("Would you like to record this Game?", 445,250);
		con.drawString("(y) --> Yes, Record the current Game", 431, 275);
		con.drawString("(n) --> No, don't record the current game", 420,300);
		charRecord = con.getChar();
		
		while(charRecord != 'y' && charRecord != 'n'){
			charRecord = con.getChar();
		}
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
		
		con.setBackgroundColor(Color.BLUE);
		con.repaint();
		
				con.setBackgroundColor(Color.BLUE);
		con.repaint();
		con.setDrawColor(Color.WHITE);
		// Column 1
		con.fillOval(300,100,85,85);
		con.fillOval(300,200,85,85);
		con.fillOval(300,300,85,85);
		con.fillOval(300,400,85,85);
		con.fillOval(300,500,85,85);
		con.fillOval(300,600,85,85);
		
		// Column 2
		con.fillOval(400,100,85,85);
		con.fillOval(400,200,85,85);
		con.fillOval(400,300,85,85);
		con.fillOval(400,400,85,85);
		con.fillOval(400,500,85,85);
		con.fillOval(400,600,85,85);
		
		// Column 3
		con.fillOval(500,100,85,85);
		con.fillOval(500,200,85,85);
		con.fillOval(500,300,85,85);
		con.fillOval(500,400,85,85);
		con.fillOval(500,500,85,85);
		con.fillOval(500,600,85,85);
		
		// Column 4
		con.fillOval(600,100,85,85);
		con.fillOval(600,200,85,85);
		con.fillOval(600,300,85,85);
		con.fillOval(600,400,85,85);
		con.fillOval(600,500,85,85);
		con.fillOval(600,600,85,85);		
		
		//Column 5
		con.fillOval(700,100,85,85);
		con.fillOval(700,200,85,85);
		con.fillOval(700,300,85,85);
		con.fillOval(700,400,85,85);
		con.fillOval(700,500,85,85);
		con.fillOval(700,600,85,85);		
		
		// Column 6
		con.fillOval(800,100,85,85);
		con.fillOval(800,200,85,85);
		con.fillOval(800,300,85,85);
		con.fillOval(800,400,85,85);
		con.fillOval(800,500,85,85);
		con.fillOval(800,600,85,85);
		
		// Column 7
		con.fillOval(900,100,85,85);
		con.fillOval(900,200,85,85);
		con.fillOval(900,300,85,85);
		con.fillOval(900,400,85,85);
		con.fillOval(900,500,85,85);
		con.fillOval(900,600,85,85);	

		
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
		con.clear();

		TextInputFile txtName = new TextInputFile("PlayerName.txt"); // Drawing the game board
		con.setBackgroundColor(Color.BLUE);
		con.repaint();
		con.setDrawColor(Color.WHITE);
		// Column 1
		con.fillOval(300,100,85,85); // Row 1
		con.fillOval(300,200,85,85); // Row 2
		con.fillOval(300,300,85,85); // Row 3
		con.fillOval(300,400,85,85); // Row 4
		con.fillOval(300,500,85,85); // Row 5
		con.fillOval(300,600,85,85); // Row 6
		
		// Column 2
		con.fillOval(400,100,85,85); // Row 1
		con.fillOval(400,200,85,85); // Row 2
		con.fillOval(400,300,85,85); // Row 3
		con.fillOval(400,400,85,85); // Row 4
		con.fillOval(400,500,85,85); // Row 5
		con.fillOval(400,600,85,85); // Row 6
		
		// Column 3
		con.fillOval(500,100,85,85); // Row 1
		con.fillOval(500,200,85,85); // Row 2
		con.fillOval(500,300,85,85); // Row 3
		con.fillOval(500,400,85,85); // Row 4
		con.fillOval(500,500,85,85); // Row 5
		con.fillOval(500,600,85,85); // Row 6
		
		// Column 4
		con.fillOval(600,100,85,85); // Row 1
		con.fillOval(600,200,85,85); // Row 2
		con.fillOval(600,300,85,85); // Row 3
		con.fillOval(600,400,85,85); // Row 4
		con.fillOval(600,500,85,85); // Row 5
		con.fillOval(600,600,85,85); // Row 6
		
		//Column 5
		con.fillOval(700,100,85,85); // Row 1
		con.fillOval(700,200,85,85); // Row 2
		con.fillOval(700,300,85,85); // Row 3
		con.fillOval(700,400,85,85); // Row 4
		con.fillOval(700,500,85,85); // Row 5
		con.fillOval(700,600,85,85); // Row 6
		
		// Column 6
		con.fillOval(800,100,85,85); // Row 1
		con.fillOval(800,200,85,85); // Row 2
		con.fillOval(800,300,85,85); // Row 3
		con.fillOval(800,400,85,85); // Row 4
		con.fillOval(800,500,85,85); // Row 5
		con.fillOval(800,600,85,85); // Row 6
		
		// Column 7
		con.fillOval(900,100,85,85); // Row 1
		con.fillOval(900,200,85,85); // Row 2
		con.fillOval(900,300,85,85); // Row 3
		con.fillOval(900,400,85,85); // Row 4
		con.fillOval(900,500,85,85); // Row 5
		con.fillOval(900,600,85,85); // Row 6

		
		con.drawRect(0,0,500,55);
		strPlayer1 = txtName.readLine();
		strPlayer2 = txtName.readLine();
		con.repaint();
		con.drawString("Player 1: " +strPlayer1,0,0);
		con.drawRect(779,0,500,55);
		con.drawString("Player 2: " +strPlayer2,782,0);
		con.drawString(strPlayer1 +"'s Turn - Enter Column Number", 0,23);
		con.drawString(strPlayer2 +"'s Turn - Enter Column Number",782,23);		
		
		char charColumn;
		int intColumn;
		int intRow = 7;
		int intBoard[][];
		int intCount;
		
		charColumn = con.getChar();
		intColumn = charColumn;
		intBoard = new int[6][7];
		
		for(intCount = intRow; intCount >= 1; intCount++){ // Drops Piece to the bottom of the Board
			intRow = intRow - 1;
		}
		
		
	}

}

