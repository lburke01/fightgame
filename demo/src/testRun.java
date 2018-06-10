import java.util.*;
import javax.swing.*;
public class testRun implements java.lang.Cloneable
{
	public static void main(String[]args) throws CloneNotSupportedException
	{
		DungFloor d= new DungFloor(1,new ArrayList<Enemy>(Arrays.asList(new Cell(5),new Cell(5))));
		Party p=new Party(new ArrayList<Actor>(Arrays.asList(new Player("n",5), new Player("d",5), new Player("d",5))));
		
		Environment e=new Environment(p,d);
		for(int i=0;i<e.getEnemies().size();i++)
		{
			System.out.println(i+"  HP: "+e.getEnemies().get(i).getHealth());
			
		}
		System.out.println("Players");
		for(int i=0;i<e.getPlayers().size();i++)
		{
			System.out.println(i+"  HP: "+e.getPlayers().get(i).getHealth());
			
		}
		while(true)
		{
			System.out.println("Enemies");
			for(int i=0;i<e.getEnemies().size();i++)
			{
				System.out.println(i+"  HP: "+e.getEnemies().get(i).getHealth());
				e.getEnemies().get(i).act(e);
			}
			System.out.println("Players");
			for(int i=0;i<e.getPlayers().size();i++)
			{
				System.out.println(i+"  HP: "+e.getPlayers().get(i).getHealth());
				e.getPlayers().get(i).act(e);
			}
			
			
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
		
	}
}