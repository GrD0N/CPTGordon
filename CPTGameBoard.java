import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGameBoard{
	public static void main(String [] args){
		Console con = new Console();
		int intRow = 1;
		int intColumn;
		int intPiece[][][];
		char charAns;
		int intCount = 0;
		int intPlayer;
		int intColumnP2;
			
		while(intCount != 10){
			con.println("Enter Piece Column");
			charAns = con.getChar();
			intColumn = charAns - 48;
			//intColumn = charAns - 48;
			intPiece = new int[1][intRow][intColumn];
			con.println("Row " +intRow +": Column: "+intColumn);
			con.println("Enter piece column");
			charAns = con.getChar();
			intColumn = charAns - 48;
			con.println("Row " +intRow +": Column: "+intColumn);
			intCount = intCount  + 1;
		}
	}
}
