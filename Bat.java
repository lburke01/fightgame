public class Bat extends Enemy
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
    public Bat(int level)
    {
      maxHealth = 4 + (level);
      currentHealth = maxHealth;
      maxStrength=5+(level*2)+((int)((level*Math.random())+1));
      maxDefense=2+level;
      maxSpeed=5+(level*2)+((int)((level*2*Math.random())+1));
      isPlayer=false;
      strength=maxStrength;
      defense=maxDefense;
      speed=maxSpeed;
    }
    public Actor act(Actor recipient)
    {
      recipient.changeHealth(-1*baseAttack(recipient.getDefense()));
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