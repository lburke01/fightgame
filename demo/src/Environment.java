import java.util.*;
public class Environment
{
	Party party;
	DungFloor dungeon;
	List<Actor> players=new ArrayList<Actor>();
	List<Enemy> enemies=new ArrayList<Enemy>();
	public Environment(Party p, DungFloor d)
	{
		for(int i=0;i<d.getEnemies().size();i++)
		{
			enemies.add(d.getEnemies().get(i));
		}
		for(int i=0;i<p.getActors().size();i++)
		{
			players.add(p.getActors().get(i));
		}
		party=p;
		dungeon=d;
	}
	public List<Actor> getPlayers()
  	{
  		return players;
  	}
  	public List<Enemy> getEnemies()
  	{
  		return enemies;
  	}
  	public void addEnemy(Enemy e)
  	{
  		enemies.add(e);
  	}
}