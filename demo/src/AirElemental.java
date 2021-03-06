
public class AirElemental extends Enemy
{
	int maxHealth;
    int currentHealth;
    int maxStrength;
    int maxDefense;
    int maxSpeed;
    int strength;
    int defense;
    int speed;
    boolean isPlayer;
    int target;
    int gold;
    public AirElemental(int level)
    {
      maxHealth = 10 + (level*2)+((int)((level*Math.random())+1));
      currentHealth = maxHealth;
      maxStrength=5+(level*2)+((int)((level*Math.random())+1));
      maxDefense=5+(level*2)+((int)((level*Math.random())+1));
      maxSpeed=10+(level*5);
      isPlayer=false;
      strength=maxStrength;
      defense=maxDefense;
      speed=maxSpeed;
      gold=level*10;
    }
    
    public int baseAttack(int d)
    {
        return (int)(((double)strength)*(100.0/(100 + d)));
    }
    public int getHealth()
    {
    	return currentHealth;
    }
    public int getDefense()
    {
    	return defense;
    }
    public void changeHealth(int change)
    {
    if(currentHealth + change > maxHealth) //Prevents over-healing by setting currentHealth to maxHealth if the sum is greater than maxHealth
      currentHealth = maxHealth;
    else
      currentHealth += change; //if change is damage, it is a negative value; if change is healing, it is a positive value
    }
}
