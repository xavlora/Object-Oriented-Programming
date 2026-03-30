package hafiz30032026;

import javax.swing.JOptionPane;

public class Latihan1_UsingJOptionPane {
    public static void main(String[] args) {
        String nama_brg = JOptionPane.showInputDialog("Masukkan nama barang!");
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pembelian!"));
        int harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan harga barang!"));
        int total = jumlah * harga;
        int jml_bayar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pembayaran!"));
        int kembalian = jml_bayar - total;

        String msg = "Barang = " + nama_brg + "\nJumlah = " + jumlah + "\nHarga = " + harga + "\nTotal = " + total + "\n\nJumlah Pembayaran = " + jml_bayar + "\nKembalian = " + kembalian;

        JOptionPane.showMessageDialog(null, msg);

    }
}
