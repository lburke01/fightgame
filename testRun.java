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
		while(enemies.get(0).getHealth()>0 && players.get(0).getHealth()>0)
		{
			System.out.println("Dragon  HP: "+players.get(0).getHealth());
			System.out.println("Golem  HP: "+enemies.get(0).getHealth());
			enemies.set(0,players.get(0).act(enemies.get(0)));
			players.set(0,enemies.get(0).act(players.get(0)));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			

			JOptionPane.showInputDialog("yea");
		}
		System.out.println("Dragon  HP: "+players.get(0).getHealth());
		System.out.println("Golem  HP: "+enemies.get(0).getHealth());
		System.out.println("someone died");
	}
}