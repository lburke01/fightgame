public class DmgAbility extends Ability
{
  public DmgAbility(double r, int mC, Actor a, Actor rC, String n, String d)
  {
    super(r, mC, a, rC, n, d);
  } 
  public static void cast()
  {
    super();
    int dmg = -1 * (int)(magic/(100/(100 + defense)) * rate);
    recipient.changeHealth(dmg);
  }
}
