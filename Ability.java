public class Ability
{
  String name;
  String desc;
  int rate;
  int manaCost;
  Actor caster;
  Actor recipient;
  public Ability(double r, int mC, Actor a, Actor rC, String n, String d)
  {
    rate = r;
    manaCost = mC;
    caster = a;
    recipient = rC;
    name = n;
    desc = d;
  }
  public void cast()
  {
    caster.changeMana(manaCost);
  }
}
