package hogwarts;

public class Hogwarts {
    public static void main(String[] args) {
        Wizard harry = new Harry();
        Wizard draco = new Draco();

        harry.castSpell("Expelliarmus");
        draco.castSpell("Serpensortia");

        Flyable[] flyers = {
                new Hedwig(),
        };

        for (Flyable f : flyers) {
            f.fly();
        }
    }
}