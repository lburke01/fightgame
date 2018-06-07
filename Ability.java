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
    //implement some kind of actor used ability print out
    caster.changeMana(manaCost);
  }
}
