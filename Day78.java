package pkg100_days;

import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat : ");
        String teks = in.nextLine();

        int panjang = teks.length();

        String hurufBesar = teks.toUpperCase();

        boolean cekata = teks.contains("Java");

        String diganti = teks.replace("belajar", "mempelajari");

        String rapih = teks.trim();

        boolean isiteks = teks.isEmpty();

        System.out.println("Panjang teks : " + panjang);
        System.out.println("TO UPPERCASE : " + hurufBesar);
        System.out.println("mengecek apakah ada kata 'Java'? : " + cekata);
        System.out.println("Hasil setelah di kata diganti : " + diganti);
        System.out.println("Hasil trim : " + rapih);
        System.out.println("mengecek apakah teks kosong : " + isiteks);
    }
}
