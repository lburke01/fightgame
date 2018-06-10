public class Cell extends Enemy implements Cloneable
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
    int count;
    public Cell(int level)
    {
      count=0;
      maxHealth = 4 + (level*2);
      currentHealth = maxHealth;
      maxStrength=5+(level*2)+((int)((level*Math.random())+1));
      maxDefense=2+level;
      maxSpeed=3+(level*1)+((int)((level*2*Math.random())+1));
      isPlayer=false;
      strength=maxStrength;
      defense=maxDefense;
      speed=maxSpeed;
      gold=level*4;
    }
    public Environment act(Environment e) throws CloneNotSupportedException
	{
    	if(count==1)
    	{
    		count=0;
    		e.addEnemy((Enemy)clone());
    	}
    	else
    	{
    		target=findTarget(e);
    		e.getPlayers().get(target).changeHealth(-1*baseAttack(baseAttack(e.getPlayers().get(target).getDefense())));
    		count++;
    	}
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
    public Object clone()throws CloneNotSupportedException
    {  
    	return super.clone();  
    }  
}