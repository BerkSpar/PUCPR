package rpg.character;

import rpg.items.Weapon;
import rpg.system.Roll;

import java.util.Random;

public class Character {
    //Constante
    private static final Random RANDOM = new Random();

    //Atributos
    private String name;
    private int skill;
    private int defense;
    private int life;
    private Weapon weapon;


    //Construtores
    public Character(String name, int skill, int defense, int life, Weapon weapon) {
        this.setName(name);
        this.skill = skill;
        this.defense = defense;
        this.life = life < 0 ? 0 : life;
        this.setWeapon(weapon);
    }

    //Na associação simples, a arma é opcional
    public Character(String name, int skill, int defense, int life) {
        this(name, skill, defense, life, null);
    }

    //Métodos fábrica (exemplo de static)
    public static Character createGoblin() {
        String names[] = {"Tobias", "Jeremias", "Timotio", "Jesivaldo"};
        String surnames[] = {"Carrasco", "o grande", "abençoado", "raivoso"};

        String name = names[RANDOM.nextInt(names.length)];
        String surname = surnames[RANDOM.nextInt(surnames.length)];

        int skill = new Roll(1, 4, 1).roll();
        int defense = new Roll(1, 4, 1).roll();
        int life = (RANDOM.nextInt(10) + RANDOM.nextInt(10) + 1) * 3;
        Roll daggerDamage = new Roll(1, 4, -1);
        Weapon dagger = new Weapon("adaga enferrujada", daggerDamage);

        return new Character(name + " " + surname, skill, defense, life, dagger);
    }

    public static Character[] createGoblins(int number) {
        Character[] goblins = new Character[number];
        for (int i = 0; i < number; i++) {
            goblins[i] = createGoblin();
        }
        return goblins;
    }

    //Métodos de acesso
    //Propriedades
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? "" : name;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLife() {
        return life;
    }

    //Propriedade calculada
    public boolean isAlive() {
        return life > 0;
    }

    //Métodos (ações)
    public void takeDamage(int damage) {
        life = life - damage;
        if (life < 0) {
            life = 0;
        }
        System.out.printf("%s levou %d de dano. Life: %d%n", name, damage, life);
    }

    /**
     * Ataca o inimigo. O ataque terá sucesso se skill - enemy.defense <= 3D6
     * @param enemy inimigo a ser atacado
     */
    public void attack(Character enemy) {
        System.out.printf("%s atacou %s com %s!%n", name, enemy.name, weapon);
        int target = skill - enemy.defense;
        int roll = new Roll(1, 20).roll();
        if (roll <= target) {
            enemy.takeDamage(weapon.roll());
        } else {
            System.out.println("ERROU!!");
        }
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon == null ? Weapon.SOQUINHO : weapon;
    }
}
