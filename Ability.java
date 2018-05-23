public class Ability
{
  int rate;
  int manaCost;
  Actor caster;
  public Ability(int r, int mC, Actor a)
  {
    rate = r;
    manaCost = mC;
    caster = a;
  }
  public void cast()
  {
    caster.changeMana(manaCost);
  
