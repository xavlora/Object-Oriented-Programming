package hafiz02032026;

public class Latihan3 {
    public static void main(String[] args) {
        int detikA = 1230;
        int detikT = 5000;
        int selisih = detikT - detikA;
        
        int j_durasi = selisih / 3600;
        int m_durasi = (selisih % 3600) / 60;
        int d_durasi = selisih % 60;
        
        System.out.println("Lama durasinya adalah: " + j_durasi + ":" + m_durasi + ":" + d_durasi);
    }
}