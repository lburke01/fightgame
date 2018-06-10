public class AttackCommand extends Command
{

	public AttackCommand(Actor a, Actor[] ab) 
	{
		super(a, ab); //ab.length should equal 1
		name = "Attack";
	}
	@Override
	public int calculateEffect()
	{
		return -1 * (int) ((Math.random() + 1) * (caster.getStr() * Math.random() * Math.PI) - (currentTarget.getDef() * Math.random() * .33)); //
	}
	public void execute()
	{
		if(currentTarget.isKnocked())
		{
			change = 0;
			return;
		}
		else
		{
			change = calculateEffect();
		}
		currentTarget.changeHealth(change);
	}
}
