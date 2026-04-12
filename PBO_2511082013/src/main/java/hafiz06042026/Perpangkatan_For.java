package hafiz06042026;

import java.util.Scanner;

public class Perpangkatan_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== MENGGUNAKAN FOR ==");

        System.out.print("Masukkan bilangan base: ");
        int base = sc.nextInt();
        System.out.print("Masukkan bilangan eksponen/pangkat: ");
        int index = sc.nextInt();

        int hasil = base;
        for(int i = index; i>1; i--) {
            hasil *= base;
        }

        System.out.println("Hasil " + base + "^" + index + " adalah: " + hasil);
    }
}
