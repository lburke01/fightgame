public abstract class Actor {
    int maxHealth;
    int maxMana;
    int currentHealth;
    int currentMana;
    int strength;
    int defense;
    int magic;
    int speed;
    boolean isPlayer;
    abstract void act();
    abstract void changeHealth();
    abstract void changeMana();
}
