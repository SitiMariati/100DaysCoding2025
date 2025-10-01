package day_24;

import java.util.Scanner;

public class Day_24 {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
         System.out.print("Ketikkan Jari Jari : ");
         int Jari_jari = in.nextInt();
         
         System.out.print("Ketikkan Phi : ");
         double phi = in.nextDouble();
         
         double  luas_lingkaran = phi * Jari_jari * Jari_jari;
         System.out.print("Luas Lingkaran : " + luas_lingkaran);
         
         
    }
    
}
