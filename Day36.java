package pkg100_days;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ketikkan angka : ");
        int angka = in.nextInt();

        if (angka % 3 == 0) {
            if (angka % 5 == 0) {
                System.out.println("Angka habis dibagi 3 dan 5");
            } else {
                System.out.println("Angka hanya habis dibagi 3");
            }
        } else if (angka % 5 == 0) {
            System.out.println("Angka hanya habis dibagi 5");
        } else {
            System.out.println("Tidak valid");
        }
    }
}
