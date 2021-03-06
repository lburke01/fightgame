public class SnakeRoot extends Enemy
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
    int count=0;
    int target;
    int gold;
    public SnakeRoot(int level)
    {
      maxHealth = 7 + (level*2)+((int)((level*Math.random())+1));
      currentHealth = maxHealth;
      maxStrength=9+(level*2)+((int)((level*Math.random())+1));
      maxDefense=3+(level)+((int)((level*Math.random())+1));
      maxSpeed=1+(level);
      isPlayer=false;
      strength=maxStrength;
      defense=maxDefense;
      speed=maxSpeed;
      gold=level*15;
    }
    public Actor act(Actor recipient)
    {
      recipient.changeHealth(-1*baseAttack(recipient.getDefense()));
      if(count==2)
      {
      	strength+=maxStrength*.2;
      	count=0;
      }
      count++;
      return recipient;
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