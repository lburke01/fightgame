public abstract class Actor {
    int maxHealth;
    int maxMana;
    int currentHealth;
    int currentMana;
    int maxStrength;
    int maxDefense;
    int maxMagic;
    int maxSpeed;
    int strength;
    int defense;
    int magic;
    int speed;
    boolean isPlayer;
    abstract void act();
    abstract void changeHealth(int change);
    abstract void changeMana(int change);
}
