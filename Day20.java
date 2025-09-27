package day_20;

public class Day_20 {

    public static void main(String[] args) {
        short nilai_S = 24;
        String S_s = String.valueOf(nilai_S);
        
        byte nilai_B = 12;
        String SB = String.valueOf(nilai_B);
        
        int nilai_I = 234;
        String nilai_Strng = Integer.toString(nilai_I);
        
        boolean K = true;
        String SK = Boolean.toString(K);
        
        System.out.println("Nilai Short sebelum konversi ke String = " + nilai_S);
        System.out.println("Nilai Short sesudah konversi ke String = " + S_s);
        System.out.println("Nilai byte sebelum konversi ke String = " + nilai_B);
        System.out.println("Nilai byte sebelum konversi ke String = " + SB);   
        System.out.println("Nilai integer sebelum konversi ke String = " + nilai_I);
        System.out.println("Nilai integer sebelum konversi ke String = " + nilai_Strng);
        System.out.println("Nilai boolean sebelum konversi ke String = " + K);
        System.out.println("Nilai boolean sebelum konversi ke String = " + SK);
        
    }
    
}
