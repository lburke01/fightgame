public class Player extends Actor
{
  boolean isKnocked = false;
  public Player(PlayerClass c)
  {
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
    if(currentHealth + change > maxHealth)
      currentHealth = maxHealth;
    else
      currentHealth += change; //if change is damage, it is a negative value; if change is healing, it is a positive value
    
  }
  public void changeMana(int change)
  {
    currentMana += change; //if magic is used, change is negative; if mana potion is used, change is positive
  }
  public void knockOut()
  {
    isKnocked = true;
    //come back to this 
  }
}
