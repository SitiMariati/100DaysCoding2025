package pkg100_days;

import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka N : ");
        int N = in.nextInt();
        System.out.print("Masukkan Angka M : ");
        int M = in.nextInt();
        int total = 1;

        for (int i = 1; i <= N; i++) {
            total *= M;
            
        }
        System.out.println("Hasil dari " + M + " pangkat " + N + " = " + total);
    }
}
