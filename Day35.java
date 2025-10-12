package pkg100_days;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ketikkan Umur : ");
        int umur = in.nextInt();
        
        System.out.print("Ketikkan true atau false : ");
        boolean punya_ktp = in.nextBoolean();
        
        if(umur >= 18 && punya_ktp){
            System.out.println("Anda Sudah dewasa");
        }else{
            System.out.println("Anda belum dewasa");
        }
    }
    
}
