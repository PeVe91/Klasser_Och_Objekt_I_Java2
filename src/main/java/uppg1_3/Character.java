package uppg1_3;

public class Character {

    private int health;
    private int maxHealth;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        if (health > maxHealth)
            this.health = maxHealth;
        else if (health < 0)
            this.health = 0;
        else
        this.health = health;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        setHealth(this.health);
    }

    public void heal(int amount) {
        this.health += amount;
        setHealth(this.health);
    }

    public boolean isAlive() {
        return health > 0;
    }

}
