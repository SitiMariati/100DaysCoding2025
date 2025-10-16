package pkg100_days;

import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ketikkan Pilihan Menu Anda : ");
        int pilihan = in.nextInt();
        System.out.println("Menu Minuman & Makanan");
        System.out.println("1. Mie Ayam");
        System.out.println("2. Jus Alpukat");
        System.out.println("3. Nasi Goreng");
        System.out.println("4. Jus Buah Naga");
        System.out.print("Menu Yang Telah Anda Pilih Adalah No : " + pilihan + " ");
        
        if (pilihan == 1) {
            System.out.println("Mie Ayam");
        } else if (pilihan == 2) {
            System.out.println("Jus Alpukat");
        } else if (pilihan == 3) {
            System.out.println("Nasi Goreng");
        } else if (pilihan == 4) {
            System.out.println("Jus Buah Naga");
        } else {
            System.out.println("Pilihan Tidak Valid");
        }
    }

}
