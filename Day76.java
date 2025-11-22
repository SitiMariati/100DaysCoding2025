package pkg100_days;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();
        
        System.out.print("Masukkan nm : ");
        String nm = in.nextLine();
        
        System.out.print("Masukkan String : ");
        String ST = in.nextLine();
        
        System.out.println(nama.equals("Siti"));
        System.out.println(nm.equalsIgnoreCase("Siti mariati"));
        System.out.println(ST.contains("Day 76"));
        System.out.println(ST.isEmpty());
        
    }
    
}
