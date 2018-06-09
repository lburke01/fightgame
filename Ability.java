public class Ability
{
  String name;
  String desc;
  double rate;
  int manaCost;
  Actor caster;
  Actor recipient;
  public Ability(String n, String d, int mC)
  {
  	manaCost = mC;
    name = n;
    desc = d;
  }
  public void cast()
  {
    recipient.changeHealth(/*we need to discuss damage*/);
    caster.changeMana(manaCost);
  }
}
