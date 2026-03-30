package hafiz30032026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputUsingBufferedReader_2 {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String nama = "";
        String no_telp = "";
        int umur = 0;
        String gender = "";
        
        System.out.print("Masukkan nama anda: ");
        try{
            nama = input.readLine();
        } catch(IOException e) {
            System.out.println("Error!");
        }
        
        System.out.print("Masukkan nomor telepon anda: ");
        try{
            no_telp = input.readLine();
        } catch(IOException e) {
            System.out.println("Error!");
        }
        
        System.out.print("Masukkan umur anda: ");
        try{
            umur = Integer.parseInt(input.readLine());
        } catch(IOException e) {
            System.out.println("Error!");
        }
        
        System.out.print("Masukkan jenis kelamin: ");
        try{
            gender = input.readLine();
        } catch(IOException e) {
            System.out.println("Error!");
        }
        
        System.out.println("DATA ANDA: ");
        System.out.println("Nama = " + nama);
        System.out.println("No Telp = " + no_telp);
        System.out.println("Umur = " + umur);
        System.out.println("Jenis Kelamin = " + gender);
        
    }
}
