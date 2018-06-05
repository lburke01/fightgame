import java.util.*;
public class Party
{
  List<Actor> players = new ArrayList<Actor>();
  List<Actor> enemies = new ArrayList<Actor>();
  
  public Party(List<Actor> allPlayers, List<Actor> allEnemies)
  {
    for(int i = 0; i < allPlayers.size(); i ++)
      players.add(allPlayers.get(i));
    for(int i = 0; i < allEnemies.size(); i ++)
      players.add(allEnemies.get(i));
  }
  
  public static List<Actor> getTurnSequence()
  {
    List<Actor> allActors = setAllActors();
    List<Actor> turnSeq = new ArrayList<Actor>();
    int minSpeed = Integer.MAX_VALUE;
    int minSpot = allActors.size();
    while(allActors.size() > 0)
    {
    	int i = 0;
    	
      while(i < allActors.size())
      { 
        if(allActors.get(i).speed < minSpeed)
        {
          minSpeed = allActors.get(i).speed;
          minSpot = i;
        }
        i ++;
      }
      turnSeq.add(allActors.remove(i));
    }
    return turnSeq;
  }
    
  public List<Actor> setAllActors()
  {
    List<Actor> allActors = new ArrayList<Actor>(players.size() + enemies.size());
    for(int i = 0; i < players.size(); i ++)
      allActors.add(players.get(i));
    for(int i = 0; i < enemies.size(); i ++)
      allActors.add(enemies.get(i));
    return allActors;
  }
}
