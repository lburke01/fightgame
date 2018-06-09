public class Player extends Actor
{	
	Menu playerMenu;
	boolean isKnocked = false;
	String name;
	String playerClass;
	public Player(String n, ActorClass c)
	  {
	 	name = n;
	 	playerClass = c.getClass();
	    maxHealth = c.getHealthStat();
	    maxMana = c.getManaStat();
	    currentHealth = maxHealth;
	    currentMana = maxMana;
	    maxStrength = c.getStrengthStat();
	    maxDefense = c.getDefenseStat();
	    maxMagic = c.getMagicStat();
	    maxSpeed = c.getSpeedStat();
	    strength = maxStrength;
	    defense = maxDefense;
	    magic = maxMagic;
	    speed = maxSpeed;
	    commands = c.getCommandList();
	    playerMenu = new Menu(Player.class);
	    isPlayer = true;
	  }
	  public void changeHealth(int change)
	  {
	    if(currentHealth + change > maxHealth) //Prevents over-healing by setting currentHealth to maxHealth if the sum is greater than maxHealth
	      currentHealth = maxHealth;
	    else
	      currentHealth += change; //if change is damage, it is a negative value; if change is healing, it is a positive value
	    
	  }
	  public void changeMana(int change)
	  {
	    if(currentMana + change > maxMana) //uses same control loop system as in changeHealth
	      currentMana = maxMana;
	    else
	      currentMana += change; //if magic is used, change is negative; if mana potion is used, change is positive
	  }
	  public void knockOut()
	  {
	    isKnocked = true;
	    //come back to this 
	  }
	  public void act()
	  {
	  	
	  }
}
