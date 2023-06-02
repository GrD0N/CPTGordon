import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGameBoard{
	public static void main(String [] args){
		Console con = new Console();
		
		String strP1;
		String strP2;

		
		TextOutputFile txtNameTest = new TextOutputFile("NameTest.txt", false);
		con.print("Player 1 name: ");
		strP1 = con.readLine();
		txtNameTest.println(strP1);
		con.print("Player 2 name: ");
		strP2 = con.readLine();
		txtNameTest.println(strP2);
		txtNameTest.close();
		con.sleep(100);
		con.clear();
		Board(con);
	}	
	
	public static void Board(Console con){
		String strP1;
		String strP2; 
		char charP1Choice;
		char charP2Choice;
		int intPieceboard[][];
		int intRow = 1;
		int intColumn;
		int intCount = 0;
		
		TextInputFile txtNames = new TextInputFile("NameTest.txt");
		strP1 = txtNames.readLine();
		strP2 = txtNames.readLine();
		
		
		while(intCount != 21);
			con.println(strP1 +"'s turn");
			charP1Choice = con.getChar();
			intColumn = charP1Choice - 48;
			intPieceboard = new int[intRow][intColumn];
			con.println("Row " +intRow +" : " +"Column " +intColumn);
			intPieceboard[intRow][intColumn] = 1;
			intColumn = charP1Choice + 0;
			con.println(intColumn);
			if(intPieceboard[intRow][charP1Choice] == 1){
				intRow = intRow + 1;
			}
			intCount = intCount + 1;
			/*
			con.println(strP2 +"'s turn");
			charP2Choice = con.getChar();
			intPieceboard = new int[intRow][charP2Choice];
			con.println("Row " +intRow +" : " +"Column " +charP2Choice);
			intPieceboard[intRow][charP2Choice] = 1;
			if(intPieceboard[intRow][charP2Choice] == 1){
				intRow = intRow + 1;
			}*/
		}

}
