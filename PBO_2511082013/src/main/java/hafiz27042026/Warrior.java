package hafiz27042026;

public class Warrior extends Character {
    private int atk;
    private double critical_chance;
    private double critical_damage;
    private int speed;

    Warrior(String name, int hp, int atk, double critical_chance, double critical_damage, int speed) {
        super(name, hp);
        this.atk = atk;
        this.critical_chance = critical_chance;
        this.critical_damage = critical_damage;
        this.speed = speed;
    }

    public void attack() {
        System.out.println(name + " telah menyerang dan menghasilkan damage sebesar " + atk + "!");
    }

    public void leave() {
        if(speed > 50) {
            System.out.println(name + " telah meninggalkan pertarungan!");
        } else {
            System.out.println(name + " mencoba untuk kabur tapi gagal!");
        }

    }

}
