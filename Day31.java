package pkg100_days;

import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ketikkan umur : ");
        int umur = in.nextInt();
        
        System.out.print("Punya KTP : ");
        boolean punya_ktp = in.nextBoolean();
        
        if(umur >= 18 && punya_ktp){
            System.out.println("Anda sudah dewasa");
        }else{
            System.out.println("Anda belum dewasa");
        }
    }
    
}
