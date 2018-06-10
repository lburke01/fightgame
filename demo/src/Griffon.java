public class Griffon extends Enemy
{
	int maxHealth;
    int currentHealth;
    int maxStrength;
    int maxDefense;
    int maxSpeed;
    int strength;
    int defense;
    int speed;
    int count=0;
    boolean isPlayer;
    int target;
    int gold;
    public Griffon(int level)
    {
      maxHealth = 9 + (level*3)+((int)((level*Math.random())+1));
      currentHealth = maxHealth;
      maxStrength=10+(level*3)+((int)((level*Math.random())+1));
      maxDefense=7+(2*level);
      maxSpeed=8+(level*2)+((int)((level*Math.random())+1));
      isPlayer=false;
      strength=maxStrength;
      defense=maxDefense;
      speed=maxSpeed;
      gold=level*60;
    }
    public Environment act(Environment e)
    {
    	target=findTarget(e);
    	if(count==2)
      	{
      		e.getPlayers().get(target).changeHealth(-1*((int)(((double)e.getPlayers().get(target).getMaxHealth())*.75)));
    		count=0;
      	}
      else
        e.getPlayers().get(target).changeHealth(-1*baseAttack(e.getPlayers().get(target).getDefense()));
      return e;
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