package uppg1_3;

public class Main {
    static void main() {

        Character c1 = new Character(500);

        while (c1.isAlive()) {

            int damage = Integer.parseInt(IO.readln
                    ("Enter a number to damage your hero: "));

            c1.setHealth(c1.getHealth() - damage);

            IO.println("Current health: " + c1.getHealth());
        }

        IO.println("You are dead.");

        c1.setHealth(c1.getMaxHealth());

        while (true) {
            int heal = Integer.parseInt(IO.readln
                    ("Enter a number to heal your hero: "));

            c1.setHealth(c1.getHealth() + heal);

            IO.println("Current health: " + c1.getHealth());

        }


    }
}
