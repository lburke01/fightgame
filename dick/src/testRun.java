import java.util.*;
import javax.swing.*;
public class testRun
{
	public static void main(String[]args)
	{
		String name=JOptionPane.showInputDialog("Enter your name");
		
		ArrayList<Actor> players=new ArrayList<Actor>();
		ArrayList<Actor> enemies=new ArrayList<Actor>();
		players.add(new Dragon(20));
		enemies.add(new Golem(20));
		
	}
}