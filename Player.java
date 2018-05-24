public class Player extends Actor
{
  boolean isKnocked = false;
  public Player(String theName ,ActorClass c)
  {
    name = theName;
    maxHealth = c.getHealthStat();
    maxMana = c.getManaStat();
    currentHealth = maxHealth;
    currentMana = maxMana;
    strength = c.getStrengthStat();
    defense = c.getDefenseStat();
    magic = c.getMagicStat();
    speed = c.getSpeedStat(); 
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
    currentHP = 0;
    
  }
  public void act()
  {
    Menu.getCommand();
  }
  
}
