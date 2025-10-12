package pkg100_days;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ketikkan angka : ");
        int angka = in.nextInt();
        
        if(angka > 0){
            System.out.println("Bilangan positif");
        }else{
            System.out.println("Bilangan negatif");
        }
    }
    
}
