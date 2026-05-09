package hafiz27042026;

public class Character {
    String name;
    int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void greet() {
        System.out.println("Halo! Saya " + name + " (" + hp + ")");
    }

}
