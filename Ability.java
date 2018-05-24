public class Ability
{
  int rate;
  int manaCost;
  Actor caster;
  Actor recipient;
  public Ability(double r, int mC, Actor a, Actor rC)
  {
    rate = r;
    manaCost = mC;
    caster = a;
    recipient = rC;
  }
  public void cast()
  {
    caster.changeMana(manaCost);
  }
}
