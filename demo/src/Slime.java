public class Slime extends Enemy
{
    int maxHealth;
    int currentHealth;
    int maxStrength;
    int maxDefense;
    int maxSpeed;
    int strength;
    int defense;
    int speed;
    int target;
    boolean isPlayer;
    int gold;
    
    public Slime(int level)
    {
      maxHealth = 8 + (level*3) + (int)((level*2*Math.random()));
      currentHealth = maxHealth;
      strength=3+level+((int)((level*Math.random())+1));
      defense=5+level+((int)((level*Math.random())+1));;
      speed=1+level+((int)((level*Math.random())+1));
      isPlayer=false;
      strength=maxStrength;
      defense=maxDefense;
      speed=maxSpeed;
      gold=level*4;
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
