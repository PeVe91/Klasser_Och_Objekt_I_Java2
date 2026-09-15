package uppg1_3;

public class Main {
    static void main() {

        Character c1 = new Character(500);


        while (c1.isAlive()) {

            int damage = Integer.parseInt(IO.readln
                    ("Enter a number to damage your hero: "));
            c1.takeDamage(damage);
            IO.println("Current health: " + c1.getHealth());
        }

        IO.println("You are dead.");

        c1.setHealth(c1.getMaxHealth() -250);

        while (true) {
            int heal = Integer.parseInt(IO.readln
                    ("Enter a number to heal your hero. Enter 0 to quit the game."));
            if (heal == 0) {
                break;
            }
            c1.heal(heal);

            IO.println("Current health: " + c1.getHealth());
        }
        /* Utan klassens metoder
        while (c1.isAlive()) {
            int damageOrHeal =
                    Integer.parseInt(IO.readln
                    ("Enter a negative number " +
                            "to damage your character.\n" +
                    "Enter a positive number " +
                            "to heal your character.\n" +
                            "Entering 0 exits the program. "));

            if (damageOrHeal == 0)
                break;

            c1.setHealth(c1.getHealth() + damageOrHeal);

            IO.println("\nCurrent health: \n" + c1.getHealth() + "\n");
        }

        if (c1.getHealth() == 0)
            IO.println("You are dead.");

         */

    }
}
