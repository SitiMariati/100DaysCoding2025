package pkg100_days;

import java.util.Scanner;

public class Day73 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jumlah = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Masukkan angka : ");
            int bilangan = in.nextInt();

            if (bilangan < 0) {

                break;
            }
            jumlah += bilangan;
        }
        System.out.println("Hasil Penjumlahan Bilangan Positif : " + jumlah);
    }

}

