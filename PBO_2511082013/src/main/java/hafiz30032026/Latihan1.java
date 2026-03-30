package hafiz30032026;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama_brg;
        int jml, harga, total, jml_bayar, kembalian;

        System.out.print("Nama barang: "); nama_brg = sc.nextLine();
        System.out.print("Jumlah pembelian: "); jml = sc.nextInt();
        System.out.print("Harga barang: "); harga = sc.nextInt();
        total = jml * harga;
        System.out.println("Total harga: " + total);
        System.out.print("Bayar: "); jml_bayar = sc.nextInt();
        kembalian = jml_bayar - total;
        System.out.println("Kembalian: " + kembalian);

        System.out.println("=================================================================");
        System.out.println("Selamat Datang di TOKO ABDI JAYA MAGELANG!\nBarang = " + nama_brg + "\nHarga = " + harga + "\nTotal = " + total + "\nBayar = " + jml_bayar + "\nKembalian = " + kembalian);
        System.out.println("=================================================================");
    }
}
