public class Main {
    public static void main(String[] args) {
        Character hero = new Character("Knight", 10, 15, 80);
        Character enemy = new Character("Big Snake", 5, 16, 60);

        while (hero.life > 0 && enemy.life > 0) {
            enemy.attack(hero);
            if (hero.life > 0) hero.attack(enemy);

            System.out.println();
        }
    }
}
