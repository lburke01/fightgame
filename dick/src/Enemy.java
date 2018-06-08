public abstract class Enemy extends Actor
{
	int target;
	int gold;
//    public Enemy();

	public Environment act(Environment e)
	{
		target=1;
		e.getPlayers().get(target).changeHealth(-1*baseAttack(baseAttack(e.getPlayers().get(target).getDefense())));
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
    	target=((int)(Math.random()*((double)e.getPlayers().size())));
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
}
