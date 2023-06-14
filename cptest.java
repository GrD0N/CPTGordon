import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class cptest{
	public static void main(String [] args){
		Console con = new Console();
		int intRow = 7;
		
		int intColumn = 1;
		int intColumn2 = 0;
		int intPiece[][];
		char charAns;
		int intCount = 0;
		

		intPiece = new int[6][7];
		
		//Row 1
		intPiece[0][0] = 0;
		intPiece[0][1] = 0;
		intPiece[0][2] = 0;
		intPiece[0][3] = 0;
		intPiece[0][4] = 0;
		intPiece[0][5] = 0;
		intPiece[0][6] = 0;
		
		// Row 2
		intPiece[1][0] = 0;
		intPiece[1][1] = 0;
		intPiece[1][2] = 0;
		intPiece[1][3] = 0;
		intPiece[1][4] = 0;
		intPiece[1][5] = 0;
		intPiece[1][6] = 0;
		
		// Row 3
		intPiece[2][0] = 0;
		intPiece[2][1] = 0;
		intPiece[2][2] = 0;
		intPiece[2][3] = 0;
		intPiece[2][4] = 0;
		intPiece[2][5] = 0;
		intPiece[2][6] = 0;
		
		// Row 4
		intPiece[3][0] = 0;
		intPiece[3][1] = 0;
		intPiece[3][2] = 0;
		intPiece[3][3] = 0;
		intPiece[3][4] = 0;
		intPiece[3][5] = 0;
		intPiece[3][6] = 0;		
		
		// Row 5
		intPiece[4][0] = 0;
		intPiece[4][1] = 0;
		intPiece[4][2] = 0;
		intPiece[4][3] = 0;
		intPiece[4][4] = 0;
		intPiece[4][5] = 0;
		intPiece[4][6] = 0;	
		
		//Row 6
		intPiece[5][0] = 0;
		intPiece[5][1] = 0;
		intPiece[5][2] = 0;
		intPiece[5][3] = 0;
		intPiece[5][4] = 0;
		intPiece[5][5] = 0;
		intPiece[5][6] = 0;	
		
		con.println("Enter Piece Column");
		charAns = con.getChar();
		intColumn = charAns - 48;
		con.println(intColumn);
		for(intCount = intRow; intCount >= 0; intCount--){
			con.sleep(250);
			con.println(intRow);
			intRow = intRow - 1;
		}
		intPiece[intRow][intColumn] = 1;
		con.println(intPiece[intRow][intColumn]);
		
	}
}
