package hafiz30032026;

import javax.swing.JOptionPane;

public class GetInputUsingJOptionPane_2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Masukkan nama anda: ");
        String msg = "Halo " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
