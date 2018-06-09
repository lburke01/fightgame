public class AttackCommand extends Command
{

	public AttackCommand(Actor a, Actor[] ab) 
	{
		super(a, ab); //ab.length should equal 1
		name = "Attack";
	}
	public int calculateEffect()
	{
		return -1 * (int) ((Math.random() + 1) * (caster.getStr()) - (currentTarget.getDef()/5));
	}
	public void execute()
	{
		if(currentTarget.isKnocked())
		{
			damage = 0;
			return;
		}
		currentTarget.changeHealth(calculateEffect());
	}
}
