package pkg100_days;

import java.util.Scanner;


public class Day32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ketikkan Nilai : ");
        int nilai = in.nextInt();
        
         System.out.print("Ketikkan Kehadiran : ");
        int kehadira = in.nextInt();
        
        if(nilai >= 80 || kehadira == 8){
            System.out.println("Anda lulus");
        }else{
            System.out.println("Anda belum lulus");
        }
    }
}
