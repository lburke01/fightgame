public class DmgAbility extends Ability
{
  public DmgAbility(double r, int mC, Actor a, Actor rC, String n, String d)
  {
    super(r, mC, a, rC, n, d);
  } 
  public void cast()
  {
    super();
    int dmg = -1 * ((caster.magic / recipient.defense) * r);
    recipient.changeHealth(dmg);
  }
}
