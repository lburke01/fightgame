import java.util.*;
public class Menu
{
	List<String> commands;
	List<String> magicList;
	String menuName;
	public Menu(Player p)
	{
		
	}
  public static int attack(int strength, int defense)
  {
    return (int)((double(strength)*(100.0/(100 + defense)))); //change the constant
  }
  public static int magic(List<Ability> magicList)
  {
    DmgAbility.cast(magicList.get(
  }
  public void getMagicList()
  {
  	if(num == )
  }
  public static int item(List<Item> itemList)
  {
  	return 0;
  }
  public static void getCommand()
  {
    
  }
}