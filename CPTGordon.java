import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class CPTGordon{
	public static void main(String [] args){
		Console con = new Console("CPTGordon", 1280, 720);
		
		int intKey = 0;
		
		BufferedImage imgStartScreen = con.loadImage("Connect4.jpg");
		con.drawImage(imgStartScreen, 0, 0);
		
		con.drawString("(P) --> Play Game", 950, 350);
		con.drawString("(H) --> View High Scores", 950, 400);
		con.drawString("(R) --> View Replay", 950, 450);
		con.repaint();
		
		intKey = con.getChar();
		
		
	}
}
