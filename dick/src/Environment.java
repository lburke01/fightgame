import java.util.*;
public class Environment
{
	Party party;
	DungFloor dungeon;
	List<Player> players=new ArrayList<Player>();
	List<Enemy> enemies=new ArrayList<Enemy>();
	public Environment(Party p, DungFloor d)
	{
		for(int i=0;i<dungeon.getEnemies();i++)
		{
			enemies.add(dungeon.getEnemies().get(i));
		}
		for(int i=0;i<party.getPlayers();i++)
		{
			enemies.add(party.getPlayers().get(i));
		}
		party=p;
		dungeon=d;
	}
	public List<Player> getPlayers()
  	{
  		return players;
  	}
  	public List<Enemy> getEnemies()
  	{
  		return enemies;
  	}	
}