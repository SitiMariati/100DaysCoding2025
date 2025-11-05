
package pkg100_days;

import java.util.Scanner;


public class Day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka N : ");
        int N = in.nextInt();

        System.out.println("Angka Genap dari 1 sampai " + N);
        for (int i = 1; i <= N; i++) {
            if(i % 2 ==0){
            System.out.print(i + " ");
            }
        }

        System.out.println();

       System.out.println("Angka Ganjil dari 1 sampai " + N);
        for (int i = 1; i <= N; i++) {
            if(i % 2 !=0){
            System.out.print(i + " ");
            }
        }
    }
   
}
