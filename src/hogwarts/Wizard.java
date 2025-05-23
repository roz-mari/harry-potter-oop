package hogwarts;

public class Wizard {
    String name;
    String house;
    public Wizard(String name, String house) {
        this.name = name;
        this.house = house;
    }
    public void castSpell(String spell) {
        System.out.println(name + " casts " + spell + "!");
    }
}
