
public abstract class Command 
{
	public final static int TARGET_ONE = 0;
	public final static int TARGET_ALL = 1;
	
	protected String name;
	protected Actor caster;
	protected Actor[] targets;
	protected Actor currentTarget;
	protected int currentIndex;
	protected int damage;
	protected boolean groupTarget = true; //true = enemies, false = allies
	public Command(Actor a, Actor[] ab)
	{
		caster = a;
		targets = ab;
		currentIndex = 0;
		currentTarget = targets[currentIndex];
	}
	public String getName()
	{
		return name;
	}
	public int getDamage()
	{
		return damage;
	}
	abstract public int calculateEffect();
}
