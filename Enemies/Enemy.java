public abstract class Enemy extends Actor
{
	int target;
	int gold;
//    public Enemy();

	public Environment act(Environment e)
	{
		target=findTarget(e);
		e.getPlayers().get(target).changeHealth(-1*baseAttack(baseAttack(e.get(target).getDefense())));
		return e;
	}
	public int getMaxHealth()
	{
		return maxHealth;
	}
	public int baseAttack(int d)
    {
        return (int)(((double)strength)*(100.0/(100 + d)));
    }
    public int getGold()
    {
    	return gold;
    }
    public int findTarget(Environment e)
    {
    	target=Math.random()*e.getPlayers().size();
    	for(int i=0;i<e.getPlayers().size();i++)
    	{
    		if(e.getPlayers().get(i).getHealth()<((int)e.getPlayers().get(i).getMaxHealth()*.3))
    		{
    			if(e.getPlayers().get(i).getHealth()<e.getPlayers().get(target).getHealth())
    			{
    				target=i;
    			}
    		}
    		
    	}
    }
    public void changeHealth(int change)
  {
    if(currentHealth + change > maxHealth) //Prevents over-healing by setting currentHealth to maxHealth if the sum is greater than maxHealth
      currentHealth = maxHealth;
    else
      currentHealth += change; //if change is damage, it is a negative value; if change is healing, it is a positive value
  }
}
