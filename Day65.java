
package pkg100_days;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka N : ");
        int N = in.nextInt();
        int faktorial = 1;

        System.out.println("Angka dari 1 sampai " + N);
        for (int i = 1; i <= N; i++) {
            faktorial *= i;
            System.out.print(i + " " + "\n");
        }
        System.out.println("Hasil Faktorial dari 1 sampai N : " + faktorial);
    }
    
}
