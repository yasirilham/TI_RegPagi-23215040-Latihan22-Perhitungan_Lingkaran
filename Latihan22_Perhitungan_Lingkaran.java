/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM :Membuat Program Perhitungan Lingkaran
 */
import java.util.Scanner;
public class Latihan22_Perhitungan_Lingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        double diameter = 0;

        while (!validInput) {
            System.out.println("=======Perhitungan Lingkaran=======");
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String input = scanner.nextLine();

            try {
                diameter = Double.parseDouble(input);
                if (diameter <= 0) {
                    System.out.println("Nilai Diameter Tidak Sesuai\n");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
            }
        }

        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("\n=======Hasil Perhitungan Lingkaran=======");
        System.out.printf("Jari-jari Lingkaran = %.0f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
    }
}
