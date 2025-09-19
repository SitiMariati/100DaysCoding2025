package day12;

import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Inputkan Nama Anda = ");
         String nama = input.nextLine();
         
         System.out.print("Inputkan Jurusan = ");
         String jurusan = input.nextLine();
         
         System.out.print("Inputkan Semester = ");
         int semester = input.nextInt();
         
         System.out.print("Inputkan Umur = ");
         int umur = input.nextInt();
         
         System.out.print("Inputkan Tinggi Badan = ");
         double TB = input.nextDouble();
         
         System.out.println("Perkenalkan nama saya = " + nama);
         System.out.println("Jurusan saya Adalah = " + jurusan);
         System.out.println("Saya Sekarang Semester = " + semester);
         System.out.println("Umur Saya = " + umur);
         System.out.println("Tinggi Badan saya = " + TB);
         
         
    }
    
}
