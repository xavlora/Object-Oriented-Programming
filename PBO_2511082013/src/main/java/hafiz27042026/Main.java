package hafiz27042026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama karakter anda: "); String name = sc.nextLine();
        System.out.println("Pilih kelas anda:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Civilian\n");

        System.out.print("Pilihan: "); int pilihan = sc.nextInt();

        switch(pilihan) {
            case 1:
                Warrior m1 = new Warrior(name, 100, 2845, 0.5, 2, 50);
                m1.attack();
                m1.leave();
                break;
            case 2:
                Mage w1 = new Mage(name, 60, 1750, 70, 500);
                w1.attack();
                w1.leave();
                break;
            default:
                break;
        }

    }
}
