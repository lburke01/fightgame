public class HealAbility extends Ability
{
  public HealAbility(double r, int mC, Actor a, Actor rC, String n, String d)
  {
    super(r, mC, a, rC, n, d);
  }
  public void cast()
  {
    super();
    int heal = caster.magic * rate;
    recipient.changeHealth(heal);
  }
}
