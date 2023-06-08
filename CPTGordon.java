import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGordon{
	public static void main(String [] args){ // Main Screen
		Console con = new Console("CPTGordon", 1280, 720);
		char charStart = ' ';
		con.setBackgroundColor(Color.BLUE);
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
	public static void HighScore(Console con){
		String strPlayer = " ";
		int intCount;
		int intY = 250;
		int intNum = 1;
		
		con.clear();
		con.repaint();
		con.setBackgroundColor(Color.BLUE);
		con.drawRect(200,200, 200, 200);

		TextInputFile txtLeaderBoard = new TextInputFile("HighScore.txt"); 
		
		for(intCount = 0; intCount <= 10; intCount++){
			strPlayer = txtLeaderBoard.readLine();
			con.setDrawColor(Color.WHITE);
			con.drawString(intNum +". " +strPlayer, 525,intY);
			intCount = intCount + 1;
			intNum = intNum + 1;
			intY = intY + 20;
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
		int intBoard[][];
		int intRow = 1;
		char charColumn;
		char charColumnP2;
		con.clear();
		int intColumn;
		int intColumnP2;
		int intCount;
		TextInputFile txtName = new TextInputFile("PlayerName.txt");
		
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
		
		for(intCount = 0; intCount <= 21; intCount++){
			charColumn = con.getChar();
			intColumn = charColumn - 48;
		
			if(intColumn == 1){
				con.repaint();
				con.setDrawColor(Color.RED);
				con.fillOval(300,600,85,85);
				con.repaint();
			}else if(intColumn == 2){
				con.repaint();
				con.setDrawColor(Color.RED);
				con.fillOval(400,600,85,85);
			}else if(intColumn == 3){
				con.repaint();
				con.setDrawColor(Color.RED);
				con.fillOval(500,600,85,85);
			}else if(intColumn == 4){
				con.repaint();
				con.setDrawColor(Color.RED);
				con.fillOval(600,600,85,85);
			}else if(intColumn == 5){
				con.repaint();
				con.setDrawColor(Color.RED);
				con.fillOval(700,600,85,85);
			}else if(intColumn == 6){
				con.repaint();
				con.setDrawColor(Color.RED);
				con.fillOval(800,600,85,85);
			}else if(intColumn == 7){
				con.repaint();
				con.setDrawColor(Color.RED);
				con.fillOval(900,600,85,85);
			}
			charColumnP2 = con.getChar();
			intColumnP2 = charColumnP2 - 48;
			
			if(intColumnP2 == 1){
				con.repaint();
				con.setDrawColor(Color.YELLOW);
				con.fillOval(300,600,85,85);
				con.repaint();
			}else if(intColumnP2 == 2){
				con.repaint();
				con.setDrawColor(Color.YELLOW);
				con.fillOval(400,600,85,85);
			}else if(intColumnP2 == 3){
				con.repaint();
				con.setDrawColor(Color.YELLOW);
				con.fillOval(500,600,85,85);
			}else if(intColumnP2 == 4){
				con.repaint();
				con.setDrawColor(Color.YELLOW);
				con.fillOval(600,600,85,85);
			}else if(intColumnP2 == 5){
				con.repaint();
				con.setDrawColor(Color.YELLOW);
				con.fillOval(700,600,85,85);
			}else if(intColumnP2 == 6){
				con.repaint();
				con.setDrawColor(Color.YELLOW);
				con.fillOval(800,600,85,85);
			}else if(intColumnP2 == 7){
				con.repaint();
				con.setDrawColor(Color.YELLOW);
				con.fillOval(900,600,85,85);
			}
			
		}
		con.setDrawColor(Color.WHITE);
		con.drawRect(779,0,500,55);
		con.drawString("Player 2: " +strPlayer2,782,0);
		
		
	}
}
