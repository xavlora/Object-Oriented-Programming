package hafiz13042026;

import java.util.Scanner;

public class MaxMinAvgNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nilai = new double[10];

        for(int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextDouble();
        }

        double max = nilai[0];
        for(int i = 1; i < 10; i++) {
            if(nilai[i] > max) {
                max = nilai[i];
            }
        }

        double min = nilai[0];
        for(int i = 1; i < 10; i++) {
            if(nilai[i] < min) {
                min = nilai[i];
            }
        }

        double sum = 0, avg;
        for(int i = 0; i < 10; i++) {
            sum += nilai[i];
        }
        avg = sum/nilai.length;

        System.out.println("\n");

        int lulus=0, tidak_lulus=0;
        for(int i = 0; i<nilai.length; i++) {
            if(nilai[i] >= 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus!");
                lulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus!");
                tidak_lulus++;
            }
        }
        System.out.println("\n");

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Rata-rata: " + avg);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidak_lulus);
    }
}
