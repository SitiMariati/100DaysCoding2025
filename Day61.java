package pkg100_days;

import java.util.Scanner;

public class Day61 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka N : ");
        int N = in.nextInt();

        System.out.print("Masukkan Angka keliptan M : ");
        int M = in.nextInt();

        System.out.println("Angka kelipatan " + M + " dari 1 sampai " + N);
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.println( i + " ");
            }
        }
    }

}
