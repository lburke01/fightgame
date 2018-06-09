import java.util.*;
public class Player extends Actor
{	
	Menu playerMenu;
	private boolean isKnocked = false;
	String name;
	String playerClass;
	String[] commands;
	List<Ability> abilities = new ArrayList<Ability>();
	final int MAXHEALTH = 999;
	final int MAXMAGIC = 999;
	
	
	public Player(String n, ActorClass c)
	  {
	 	name = n;
	 	playerClass = c.getPlayerClass();
	    maxHealth = c.getHealth();
	    maxMana = c.getMana();
	    currentHealth = maxHealth;
	    currentMana = maxMana;
	    maxStrength = c.getStrength();
	    maxDefense = c.getDefense();
	    maxMagic = c.getMagic();
	    maxSpeed = c.getSpeed();
	    strength = maxStrength;
	    defense = maxDefense;
	    magic = maxMagic;
	    speed = maxSpeed;
	    commands = c.getCommandList();
	    playerMenu = new Menu(this); //not sure if this works
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
	    currentHealth = 0;
	    //come back to this 
	  }
	  public boolean isKnocked()
	  {
		  return isKnocked;
	  }
	  public void act()
	  {
	  	
	  }
	
}
