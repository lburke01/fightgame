public class Slime extends Enemy
{
    int maxHealth;
    int currentHealth;
    int strength;
    int defense;
    int speed;
    public Slime(int level)
    {
      maxHealth = 7 + (level*2) + (int)((level*Math.Random())+1);
      currentHealth = maxHealth;
      strength=5+level+((int)((level*Math.Random())+1));
      defense=2+level;
      speed=1+((int)((level*Math.Random())+1));
    }
 }
