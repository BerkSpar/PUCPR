import java.util.Random;

public class Character {
    String name;
    int defense;
    int skill;
    int life;

    public Character(String name, int defense, int skill, int life) {
        this.name = name;
        this.life = life;
        this.defense = defense;
        this.skill = skill;
    }

    private int rollDice() {
        return new Random().nextInt(6) + 1;
    }

    public void takeDamage(int damage) {
        this.life -= damage;
        if(this.life < 0) this.life = 0;

        System.out.printf("%s taken %d damage points | Life: %d%n", this.name, damage, this.life);
    }

    public void attack(Character enemy) {
        int target = this.skill - enemy.defense;
        int roll = rollDice() + rollDice() + rollDice();

        if(roll <= target) {
            this.takeDamage(rollDice());
        } else {
            System.out.printf("%s failed!%n", this.name);
        }
    }
}
