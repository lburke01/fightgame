
public class Fighter extends Player
{
	private int enemiesLeft = 0;
	private int level;
	private int MAXLEVEL = 4;
	public Fighter(String n, ActorClass c)
	{
		super(n, c);
		level = 1;
		enemiesLeft = 5;
		
	}
	
	public void levelUP()
	{
		if(!moreEnemiesRequired() && level < MAXLEVEL)
		{	
			level ++;
			if(level == 2)
			{
				enemiesLeft = 10;
				abilities.add(GameObjects.getAllFighterSkills()[0]);
				abilities.add(GameObjects.getAllFighterSkills()[1]);
			}
			else if(level == 3)
			{
				enemiesLeft = 35;
				abilities.add(GameObjects.getAllFighterSkills()[2]);
			}
			else if(level == MAXLEVEL)
			{
				enemiesLeft = 0;
				abilities.add(GameObjects.getAllFighterSkills()[3]);
			}
		}
	}
	private boolean moreEnemiesRequired()
	{
		return enemiesLeft > 0;
	}
}
