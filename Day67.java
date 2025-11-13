
package pkg100_days;

import java.util.Scanner;

public class Day67 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan : ");
        int pola = in.nextInt();

        for (int i = 1; i < pola; i++) {
            System.out.print("*");
        }

    }
}
