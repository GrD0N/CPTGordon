import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGameBoard{
	public static void main(String [] args){
		Console con = new Console();
		int intRow = 7;
		int intColumn;
		int intColumn2 = 0;
		int intPiece[][];
		int intPiece2[][];
		char charAns;
		int intCount = 0;
		int intPlayer;
		int intColumnP2;
		String strPiece;	
		char charP;
		
		con.println("Enter Column");
		charP = con.getChar();
		intColumn = charP - 48;
		for(intCount = intRow; intCount >= 1; intCount--){
			intRow = intRow - 1;
		}
		intPiece = new int[intRow][intColumn];
		con.println(intRow +" : " +intColumn);
		intPiece[intRow][intColumn] = 1;
		System.out.println(intPiece);
		
		
		
	}
}
