package pkg100_days;

import java.util.Scanner;

public class Day58 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka N : ");
        int N = in.nextInt();

        System.out.println("Angka dari 1 sampai " + N);
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Angka dari " + N + " Sampai 1");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");

        }
    }

}
