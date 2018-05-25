public class Slime extends Enemy
{
    int maxHealth;
    int currentHealth;
    int strength;
    int defense;
    int speed;
    boolean isPlayer;
    public Slime(int level)
    {
      maxHealth = 7 + (level*2) + (int)((level*Math.Random()));
      currentHealth = maxHealth;
      strength=3+level+((int)((level*Math.Random())+1));
      defense=2+level;
      speed=1+((int)((level*Math.Random())+1));
      isPlayer=false;
    }
    public Actor act(Actor recipient)
    {
      recipient.changeHealth(-1*baseAttack(recipient.getDefense))
      currentHealth+=(maxHealth*.2);
      return recipient;
    }
    public int baseAttack(int defense)
    {
        return (int)((double(strength)*(100/(100 + defense))));
    }
 }
