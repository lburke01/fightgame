
public class Healer extends Player
{
	private int healingLeft = 0;
	private int level;
	private int MAXLEVEL = 4;
	public Healer(String n, ActorClass c)
	{
		super(n, c);
		level = 1;
		healingLeft = 800;
		abilities.add(GameObjects.getAllHealerMagic()[0]);
	}
	
	public void levelUP()
	{
		if(!moreHealingRequired() && level < MAXLEVEL)
		{
			level ++;
			if(level == 2)
			{
				healingLeft = 2500;
				abilities.add(GameObjects.getAllHealerMagic()[1]);
				abilities.add(GameObjects.getAllHealerMagic()[2]);
				abilities.add(GameObjects.getAllHealerMagic()[3]);
			}
			else if(level == 3)
			{
				healingLeft = 9999;
				abilities.add(GameObjects.getAllHealerMagic()[4]);
			}
			else if(level == MAXLEVEL)
			{
				healingLeft = 0;
				abilities.add(GameObjects.getAllHealerMagic()[5]);
				abilities.add(GameObjects.getAllHealerMagic()[6]);
			}
		}
	}
	private boolean moreHealingRequired()
	{
		return healingLeft > 0;
	}
}
