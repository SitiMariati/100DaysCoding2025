 
package pkg100_days;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String menu;
        System.out.print("Ketikkan Kode Pilihan 1-3 : ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                menu = "Nasi Goreng";
                break;

            case 2:
                menu = "Jus Alpukat";
                break;
            case 3:
                menu = "Sate Ayam";
                break;

            default:
                menu = "Pilihan Anda Tidak Valid";
                break;
        }
        
        System.out.println("Menu Yang Telah Anda Pilih : " + menu);
    }
    
}
