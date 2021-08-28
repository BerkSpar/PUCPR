package rpg;

import rpg.character.Character;
import rpg.items.Weapon;
import rpg.system.Roll;

public class Main {
    public static void main(String[] args) {

        Character hero = new Character(
            "Sir Gallahad",
            15,
            5,
            50,
            new Weapon("Broadsword", new Roll(1, 8))
        );

        var monster = Character.createGoblin();

        //A BATALHA ATE A MORTE!!!!
        while (hero.isAlive() && monster.isAlive()) {
            hero.attack(monster);

            if (monster.isAlive()) {
                monster.attack(hero);
            }
            System.out.println();
        }
    }
}
