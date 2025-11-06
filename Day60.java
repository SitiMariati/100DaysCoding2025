
package pkg100_days;

import java.util.Scanner;


public class Day60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka N : ");
        int N = in.nextInt();

        System.out.println("Angka Genap dari " + N + " Sampai 1");
        for (int i = N; i >= 1; i--) {
             if(i % 2 ==0){
            System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Angka Ganjil dari " + N + " Sampai 1");
        for (int i = N; i >= 1; i--) {
             if(i % 2 !=0){
            System.out.print(i + " ");
            }

        }
    }
    
}
