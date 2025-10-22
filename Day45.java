package pkg100_days;

import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String matkul;

        System.out.print("Ketikkan Kode Mata Kuliah : ");
        int kode = in.nextInt();

        switch (kode) {
            case 1:
                matkul = "Pemrograman Mobile";
                break;

            case 2:
                matkul = "Kewirausahaan";
                break;
            case 3:
                matkul = "Pemrograman Jaringan";
                break;

            default:
                matkul = "Kode Matakuliah Yang Anda Pilih Tidak Valid";
                break;
        }
        
        System.out.println("Mata Kuliah Berdasarkan Kode Inputan : " + matkul);
    }

}
