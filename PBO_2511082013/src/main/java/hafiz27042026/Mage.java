package hafiz27042026;

public class Mage extends Character {
    int magic_atk;
    int speed;
    int mana;

    Mage(String name, int hp, int atk, int speed, int mana) {
        super(name, hp);
        this.magic_atk = atk;
        this.speed = speed;
        this.mana = mana;
    }

    public void attack() {
        System.out.println(name + " telah menyerang dan menghasilkan damage sebesar " + magic_atk + " dan mengonsumsi mana sebesar " + (mana*0.60) + "!");
    }

    public void leave() {
        if(speed > 50) {
            System.out.println(name + " telah meninggalkan pertarungan!");
        } else {
            System.out.println(name + " mencoba untuk kabur tapi gagal!");
        }

    }

}