
package pkg100_days;

import java.util.Scanner;


public class Day62 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka N : ");
        int N = in.nextInt();
        int jumlah = 0;

        System.out.println("Angka dari 1 sampai " + N);
        for (int i = 1; i <= N; i++) {
            jumlah+=i;
            System.out.println(i + " ");
        }
        System.out.println("Hasil Penjumlahan 1 sampai N : " + jumlah);
    }
   
}
