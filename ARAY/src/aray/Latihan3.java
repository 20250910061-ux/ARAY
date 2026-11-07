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

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kodeBarang[] = {"A01", "B02", "C02"};
        String namaBarang[] = {"Hardisk", "Monitor", "Mouse"};
        int harga[] = {700000, 800000, 50000};

        String namaPembeli[] = new String[100];
        String kode[] = new String[100];
        String barang[] = new String[100];
        int jumlah[] = new int[100];
        int hargaSatuan[] = new int[100];
        int bayar[] = new int[100];

        int banyak;
        System.out.print("Jumlah Pembeli : ");
        banyak = input.nextInt();

        for (int i = 0; i < banyak; i++) {
            System.out.println("\nPembeli ke-" + (i + 1));

            System.out.print("Nama Pembeli : ");
            namaPembeli[i] = input.next();

            System.out.print("Kode Barang : ");
            kode[i] = input.next();

            System.out.print("Jumlah : ");
            jumlah[i] = input.nextInt();

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kode[i].equalsIgnoreCase(kodeBarang[j])) {
                    barang[i] = namaBarang[j];
                    hargaSatuan[i] = harga[j];
                    break;
                }
            }

            if (barang[i] == null) {
                System.out.println("Kode barang tidak ditemukan!");
                i--;
                continue;
            }

            bayar[i] = hargaSatuan[i] * jumlah[i];
        }

        System.out.println("\n==============================================================");
        System.out.println("No\tNama\tKode\tBarang\tJumlah\tHarga\tBayar");
        System.out.println("==============================================================");

        for (int i = 0; i < banyak; i++) {
            System.out.println((i + 1) + "\t" + namaPembeli[i] +
                "\t" + kode[i] + "\t" + barang[i] +
                "\t" + jumlah[i] + "\t" + hargaSatuan[i] +
                "\t" + bayar[i]);
        }

        input.close();
    }
}