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
  public List<Actor> getTurnSequence()
  {
    List<Actor> allActors = setAllActors();
    List<Actor> turnSeq = new ArrayList<Actor>();
    int minSpeed = Integer.MAX_VALUE;
    int minSpot = allActors.size();
    while(allActors.size() > 0)
    {
      for(int i = 0; i < allActors.size(); i ++)
      { 
        if(allActors.get(i) < minSpeed)
        {
          minSpeed = allActors.get(i);
          minSpot = i;
        }
      }
      turnSeq.add(allActors.remove(i));
    }
    return turnSeq;
  }
    
  public List<Actor> setAllActors()
  {
    List<Actor> allActors = new ArrayList<Actors>(players.size() + enemies.size());
    for(int i = 0; i < players.size(); i ++)
      allActors.add(players.get(i));
    for(int i = 0; i < enemies.size(); i ++)
      allActors.add(enemies.get(i));
    return allActors;
  }
