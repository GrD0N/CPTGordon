import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGameBoard{
	public static void main(String [] args){
		Console con = new Console();
		int intRow = 7;
		int intRow2 = 7;
		// https://stackoverflow.com/questions/67991573/how-can-one-check-if-an-integer-is-equal-to-another-in-a-2d-array
		int intColumn = 0;
		int intColumn2 = 0;
		int intNum = 1;
		int intPiece[][];
		int intPiece2[][];
		char charAns;
		char charAns2;
		int intCount = 0;
		int intPlayer;
		int intColumnP2;
		String strPiece;	
		char charP;
		

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
		con.println("Column: " +intColumn);
		intColumn = intColumn - 1;
		for(intCount = intRow; intCount >= intNum; intCount--){
			con.sleep(250);
			con.println(intRow);
			intRow = intRow - 1;
		}
		intPiece2 = new int[intRow][intColumn];
		
		if(intRow == 0 && intColumn == 0){
			intPiece[0][0] = 1;
			con.println(intPiece[0][0]);
		}else{
			con.println("no");
		}
		
		con.println("Enter a second column");
		charAns2 = con.getChar();
		intColumn2 = charAns2 - 48;
		con.println("Column: " +intColumn2);
		intColumn2 = intColumn2 - 1;
		if(intColumn2 == intColumn){
			intNum = intNum + 1;
		}
		for(intCount = intRow2; intCount >= intNum; intCount--){
			con.println(intRow);
		}
		
	}
}
