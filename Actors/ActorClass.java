//accessors for player stats
//created for each player
import java.util.*;
public class ActorClass
{
	private int actorHealth;
	private int actorMana;
	private int actorStrength;
	private int actorDefense;
	private int actorMagic;
	private int actorSpeed;
	private List<Ability> abilityList = new ArrayList<Ability>();
	private String[] commands = new String[3];
	private String playerClass;
	public ActorClass(int choice)
	{
		if(choice == 0)
			fighter();
		else if(choice == 1)
			wizard();
		else if(choice == 2)
			healer();
		else if(choice == 3)
			ninja();
		else if(choice == 4)
			tank();
	}
	public void fighter()
	{
		playerClass = "Fighter";
		//medium health, high strength, medium defense, medium speed, low magic, low mana
		commands = {"Attack", "Skills", "Item"};
		abilityList.add(new Ability("Heavy Hit", "Does double damage, but with high miss change", 14));
		abilityList.add(new Ability("Subtract Attack", "Does more damage the lower the user's HP" 8));
		abilityList.add(new Ability("Quadracut", "Attacks four times with weaker damage, 18));
		
	}
	public void healer()
	{
		playerClass = "Healer";
		//low health, high mana, low strength, medium defense, high magic, medium speed
		commands = {"Attack", "Magic", "Item"};
		abilityList.add(new Ability("Restore", "Heals a small amount of HP", 12));
		abilityList.add(new Ability("Rejuvenate", "Heals a lot of HP, 64));
		abilityList.add(new Ability("Healing Field", "Heals a moderate amount of HP to all allies", 48));
		abilityList.add(new Ability("Revive", "Picks up a fallen ally with a small amount of HP", 56));
	}
	public void wizard()
	{
		playerClass = "Wizard";
		//medium health, high mana, low strength, low defense, high magic, medium speed
		commands = {"Attack", "Magic", "Item"};
		abilityList.add(new Ability("Shock", "Deals small damage to an enemy", 24));
		abilityList.add(new Ability("Discharge", "Deals small damage to all enemies, 44));
		abilityList.add(new Ability("Meteor", "Deals moderate damage to an enemy", 64));
		abilityList.add(new Ability("Hurricane", "Deals moderate damage to all enemies" 76);
		abilityList.add(new Ability(""));
		abilityList.add(new Ability("Tsunami" "Deals a lot of damage to all enemies", 192);
	}
	public void ninja()
	{
		playerClass = "Ninja";
		//low health, low mana, high strength, low defense, low magic, high speed
		commands = {"Attack", "Skills", "Item"};
	}
	public void tank()
	{
		playerClass = "Tank";
		//high health, low mana, medium strength, high defense, low magic, low speed
		commands = {"Attack", "Defend", "Item"};
	}
	public String getClass()
	{
		return playerClass;
	}
	public int getHealth()
	{
		return actorHealth;
	}
	public int getMana()
	{
		return actorMana;
	}
	public int getStrength()
	{
		return actorStrength;
	}
	public int getDefense()
	{
		return actorDefense;
	}
	public int getMagic()
	{
		return actorMagic;
	}
	public int getSpeed()
	{
		return actorSpeed;
	}
	public String[] getCommandList()
	{
		return actorCommands;
	}
}
