package pkg100_days;

import java.util.Scanner;

public class Day63 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka N : ");
        int N = in.nextInt();
        int hasil = 1;

        System.out.println("Angka dari 1 sampai " + N);
        for (int i = 1; i <= N; i++) {
            hasil *= i;
            System.out.println(i + " ");
        }
        System.out.println("Hasil Perkalian dari 1 sampai N : " + hasil);
    }

}
