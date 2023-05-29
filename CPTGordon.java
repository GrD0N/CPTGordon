import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class CPTGordon{
	public static void main(String [] args){
		Console con = new Console("CPTGordon", 1280, 720);
		BufferedImage imgStartScreen = con.loadImage("Connect4.jpg");
		
		con.drawImage(imgStartScreen,0,0);
		con.drawString("(P) --> Play Game", 950, 200);
		con.drawString("(H) --> View High Scores", 950, 250);
		con.drawString("(R) --> View Replay", 950, 300);
	}
}
