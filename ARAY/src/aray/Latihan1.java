/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aray;

/**
 *
 * @author USER
 */

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        System.out.print("Jumlah Mahasiswa : ");
        jumlah = input.nextInt();

        String nim[] = new String[jumlah];
        String nama[] = new String[jumlah];
        double uts[] = new double[jumlah];
        double uas[] = new double[jumlah];
        double akhir[] = new double[jumlah];
        char index[] = new char[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM  : ");
            nim[i] = input.next();

            System.out.print("Nama : ");
            nama[i] = input.next();

            System.out.print("UTS  : ");
            uts[i] = input.nextDouble();

            System.out.print("UAS  : ");
            uas[i] = input.nextDouble();

            akhir[i] = (uts[i] + uas[i]) / 2;

            if (akhir[i] >= 80) {
                index[i] = 'A';
            } else if (akhir[i] >= 70) {
                index[i] = 'B';
            } else if (akhir[i] >= 60) {
                index[i] = 'C';
            } else if (akhir[i] >= 50) {
                index[i] = 'D';
            } else {
                index[i] = 'E';
            }
        }

        System.out.println("\n==================================================");
        System.out.println("No\tNIM\tNama\tUTS\tUAS\tNilai Akhir\tIndex");
        System.out.println("==================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t" + nim[i] + "\t" +
                nama[i] + "\t" + uts[i] + "\t" + uas[i] +
                "\t" + akhir[i] + "\t\t" + index[i]);
        }

        input.close();
    }
}

