public class Enemy extends Actor
{
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
}