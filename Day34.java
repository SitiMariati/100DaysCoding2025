package pkg100_days;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ketikkan umur : ");
        int umur = in.nextInt();
        
          System.out.print("Ketikkan true atau false : ");
        boolean punya_kendaraan = in.nextBoolean();
        
        if(umur >= 18 && punya_kendaraan ){
            System.out.println("Anda sudah bisa mengendarai motor");
        }else if(umur <= 17 && !punya_kendaraan){
            System.out.println("Anda belum bisa untuk berkendara");
    }else{
           
        }
    }
    
}
