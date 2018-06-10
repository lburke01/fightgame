public abstract class Actor {
    String name;
    int maxHealth;
    int maxMana;
    int currentHealth;
    int currentMana;
    int strength;
    int defense;
    int magic;
    int speed;
    boolean isPlayer;
    abstract int getDefense();
	abstract void changeHealth(int h);
	public abstract Environment act(Environment e) throws CloneNotSupportedException;
	abstract int getHealth();
	public int getMaxHealth()
	{
		return maxHealth;
	}
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
	}  
}
