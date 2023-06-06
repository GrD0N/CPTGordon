import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGameBoard{
	public static void main(String [] args){
		Console con = new Console();
		int intRow = 0;
		int intColumn;
		int intColumn2 = 0;
		int intPiece[][];
		int intPiece2[][];
		char charAns;
		int intCount = 0;
		int intPlayer;
		int intColumnP2;
			
			con.println("Enter Piece Column (1-7)");
			charAns = con.getChar();
			intColumn = charAns - 48;
			intRow = intRow + 1;	
			intPiece = new int[intRow][intColumn];
			con.println("Row " +intRow +": Column: "+intColumn);
			con.println("Enter Piece 2 Column (1-7)");
			charAns = con.getChar();
			intColumn2 = charAns - 48;
			if(intColumn != intColumn2){
				intRow = intRow - 1;
			}else if(intColumn2 == intColumn){	
			}
			intPiece = new int[intRow = intRow + 1][intColumn];
			con.println("Row " +intRow +": Column: "+intColumn);
			
		while(intCount != 10){
			con.println("Enter Piece Column (1-7)");
			charAns = con.getChar();
			intColumn = charAns - 48;
			intRow = intRow + 1;	
			intPiece = new int[intRow][intColumn];
			con.println("Row " +intRow +": Column: "+intColumn);
			con.println("Enter Piece 2 Column (1-7)");
			charAns = con.getChar();
			intColumn2 = charAns - 48;
			if(intColumn != intColumn2){
				intRow = intRow - 1;
			}else if(intColumn2 == intColumn){	
			}
			intPiece = new int[intRow = intRow + 1][intColumn];
			con.println("Row " +intRow +": Column: "+intColumn);
		}
		
	}
}
