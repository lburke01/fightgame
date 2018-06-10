public class Player extends Actor
{
  boolean isKnocked = false;
  int target;
  public Player(String theName,int level)
  {
    name = theName;
    maxHealth = 7 + (level*2) + (int)((level*Math.random()));
      currentHealth = maxHealth;
      strength=3+level+((int)((level*Math.random())+1));
      defense=2+level;
      speed=1+((int)((level*Math.random())+1));
      maxMana=20;
      currentMana=maxMana;
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
  //public void knockOut()
  //{
  //  isKnocked = true;
  //  currentHP = 0;
    
  //}
  public int baseAttack(int d)
    {
    	
        return (int)(((double)strength)*(100.0/(100 + d)));
    }
  public Environment act(Environment e)
  {
    e.getEnemies().get(target).changeHealth(-1*baseAttack(baseAttack(e.getEnemies().get(target).getDefense())));
    return e;
  }
  public int getHealth()
    {
    	return currentHealth;
    }
    public int getDefense()
    {
    	return defense;
    }
  public int getMaxHealth()
    {
    	return maxHealth;
    }
}
