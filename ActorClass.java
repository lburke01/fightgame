//accessors for player stats
//created for each player
public class ActorClass
{
	private int actorHealth;
	private int actorMana;
	private int actorStrength;
	private int actorDefense;
	private int actorMagic;
	private int actorSpeed;
	
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
	}
	public void healer()
	{
		playerClass = "Healer";
		//low health, high mana, low strength, medium defense, high magic, medium speed
		commands = {"Attack", "Magic", "Item"};
	}
	public void wizard()
	{
		playerClass = "Wizard";
		//medium health, high mana, low strength, low defense, high magic, medium speed
		commands = {"Attack", "Magic", "Item"};
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
