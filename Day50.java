
package pkg100_days;

import java.util.Scanner;


public class Day50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ketikkan Angka : ");
        int angka = in.nextInt();
        
        String hasil =(angka % 2 == 0)? "Genap":"Ganjil";
        
        System.out.println("Hasil Angka Yang Anda Masukkan Adalah Angka " + hasil);
    }
   
}
