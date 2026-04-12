package hafiz06042026;

import java.util.Scanner;

public class Perpangkatan_doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== MENGGUNAKAN DO WHILE ==");

        System.out.print("Masukkan bilangan base: ");
        int base = sc.nextInt();
        System.out.print("Masukkan bilangan eksponen/pangkat: ");
        int index = sc.nextInt();

        int hasil = base;
        int i = index;
        do {
            hasil *= base;
            i--;
        } while (i > 1);

        System.out.println("Hasil " + base + "^" + index + " adalah: " + hasil);
    }
}
