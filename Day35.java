package pkg100_days;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ketikkan Hari : ");
        String hari = in.nextLine();
        
        if(hari.equalsIgnoreCase("sabtu")  || hari.equalsIgnoreCase("Minggu")){
            System.out.println("Hari libur");
        }else{
            System.out.println("Hari kerja");
        }
    }
    
}
