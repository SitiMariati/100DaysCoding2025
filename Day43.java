package pkg100_days;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ketikkan Angka : ");
        short bilangan = in.nextShort();
        
        if(bilangan % 3 == 0  && bilangan % 5 == 0){
            System.out.println("Bilangan ini merupakan kelipatan 3 dan 5");
        } else if(bilangan % 5 == 0){
            System.out.println("Bilangan ini merupakan kelipatan 5");
        }else if(bilangan % 3 == 0){
            System.out.println("Bilangan ini merupakan kelipatan 3");
        }else{
            System.out.println("Bukan kelipatan dari 3 ataupun 5");
        }
    }
    
}
