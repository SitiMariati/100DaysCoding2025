package pkg100_days;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ketikkan Umur : ");
        int umur = in.nextInt();
        
        String status = (umur >=17)? "Dewasa" : "Belum Dewasa";
        
        System.out.println("Umur anda sekarang di masa : " + status);
    }
    
}
