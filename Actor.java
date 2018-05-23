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
    abstract void act();
    abstract void changeHealth(int change);
    abstract void changeMana(int change);
}
