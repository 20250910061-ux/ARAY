/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aray;

/**
 *
 * @author USER
 */

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama[] = new String[100];
        String jurusan[] = new String[100];
        String kelas[] = new String[100];
        int jumlah[] = new int[100];
        int harga[] = new int[100];
        int bayar[] = new int[100];

        int hargaTiket[][] = {
            {40000, 60000},
            {20000, 40000}
        };

        int banyak;
        System.out.print("Jumlah Pembeli : ");
        banyak = input.nextInt();

        for (int i = 0; i < banyak; i++) {
            System.out.println("\nPembeli ke-" + (i + 1));

            System.out.print("Nama Pembeli : ");
            nama[i] = input.next();

            System.out.print("Jurusan (Bandung/Jakarta) : ");
            jurusan[i] = input.next();

            System.out.print("Kelas (Bisnis/Ekonomi) : ");
            kelas[i] = input.next();

            System.out.print("Jumlah Tiket : ");
            jumlah[i] = input.nextInt();

            int j = jurusan[i].equalsIgnoreCase("Bandung") ? 0 : 1;
            int k = kelas[i].equalsIgnoreCase("Bisnis") ? 0 : 1;

            harga[i] = hargaTiket[k][j];
            bayar[i] = harga[i] * jumlah[i];
        }

        System.out.println("\n==============================================================");
        System.out.println("No\tNama\tJurusan\tKelas\tJumlah\tHarga\tBayar");
        System.out.println("==============================================================");

        for (int i = 0; i < banyak; i++) {
            System.out.println((i + 1) + "\t" + nama[i] + "\t" +
                jurusan[i] + "\t" + kelas[i] + "\t" +
                jumlah[i] + "\t" + harga[i] + "\t" + bayar[i]);
        }

        input.close();
    }
}
