package day_19;

public class Day_19 {

    public static void main(String[] args) {
        
        float nilai_F = 123.5f;
        short nilai_S = (short) nilai_F; 
        
        double nilai_D = 145.2;
        int nilai_I = (int) nilai_D;
        
        System.out.println("Sebelum konversi ke short = " + nilai_F);
        System.out.println("Setelah konversi ke short = " + nilai_S);
        System.out.println("Sebelum konversi ke double = " + nilai_D);
        System.out.println("Setelah konversi ke double = " + nilai_I);
    }
    
}
