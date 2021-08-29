package rpg.items;

import rpg.system.Roll;

public class Potion {
    String name;
    Roll roll;

    Potion(String name, Roll roll) {
        this.setName(name);
        this.setRoll(roll);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(Roll roll) {
        this.roll = roll;
    }

    public Roll getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return name + " " + roll;
    }
}
