package pkg100_days;

import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pilihan; 

        do {
            System.out.println("**Menu Pilihan Matakuliah**");
            System.out.println("1. Bahasa Pemrograman");
            System.out.println("2. Kewirausahaan");
            System.out.println("3. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Bahasa Pemrograman: Belajar Java,logika pemrograman.");
                    break;

                case 2:
                    System.out.println("Kewirausahaan: Belajar membuat bisnis.");
                    break;

                case 3:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan anda tidak ada dalam menu pilihan");
            }

        } while (pilihan != 3);
    }
}
