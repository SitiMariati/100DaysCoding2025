package pkg100_days;

import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String hari;
        System.out.print("Ketikkan Hari Keberapa 1-7 : ");
        int hari_ke = in.nextInt();

        switch (hari_ke) {
            case 1:
                hari = "Senin";
                break;

            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;

            case 4:
                hari = "Kamis";
                break;
                
            case 5:
                hari = "Jumat";
                break;
                
            case 6:
                hari = "Sabtu";
                break;
                
            case 7:
                hari = "Minggu";
                break;

            default:
                hari = "Pilihan Anda Tidak Valid";
                break;
        }

        System.out.println("Hari Ini Adalaha Hari : " + hari);
    }

}
