public abstract class Actor {
    protected int maxHealth;
    protected int maxMana;
    protected int currentHealth;
    protected int currentMana;
    protected int maxStrength;
    protected int maxDefense;
    protected int maxMagic;
    protected int maxSpeed;
    protected int strength;
    protected int defense;
    protected int magic;
    protected int speed;
    protected boolean isPlayer;
    protected boolean isKnocked;
    abstract void changeHealth(int change);
    abstract void changeMana(int change);
    abstract int getHealth();
    abstract int getMana();
    abstract int getStr();
    abstract int getMag();
    abstract int getDef();
    abstract int getSpd();
    abstract int getMaxHealth();
    abstract int getMaxMana();
    abstract boolean isKnocked();
}
