import java.util.*;
public class Party
{
  static List<Actor> players = new ArrayList<Actor>();
  final int maxGold = 9999;
  static int gold = 50;
  //static List<Item> bag = new ArrayList<Item>();
  public Party(List<Actor> allPlayers)
  {
    for(int i = 0; i < allPlayers.size(); i ++)
      players.add(allPlayers.get(i));
  }
  /*public void addItem(Item item)
  {
    bag.add(item);
    gold -= item.value;
    if(gold < 0)
      gold = 0;
  }*/
  /*public void sellItem(int i)
  {
    gold += bag.get(i).value;
    bag.remove(i);
  }*/
  public List<Actor> getActors()
  {
  	return players;
  }
}