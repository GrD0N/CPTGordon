import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGameBoard{
	public static void main(String [] args){
		Console con = new Console();
		int intRow = 1;
		int intColumn;
		int intColumn2 = 0;
		int intPiece[][];
		int intPiece2[][];
		char charAns;
		int intCount = 0;
		int intPlayer;
		int intColumnP2;
		String strPiece;	
			
		con.println("Enter Piece Column (1-7)");
		charAns = con.getChar();
		intColumn = charAns - 48;
		intPiece = new int[6][7];
		con.println(intRow +" : " +intColumn);
		
		
		
	}
}
