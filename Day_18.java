package day_18;

public class Day_18 {

    public static void main(String[] args) {
        byte angka_B = 89;  // 1 byte
        short angka_S = angka_B;   //konversi otomatis dari byte ke short, ukuran short 2 byte
        int  angka_I = 456; // 4 byte
        long angka_L = angka_I;  //konversi dari int ke long, ukuran long 8 byte
       
        
        System.out.println("Ini adalah angka byte " + angka_B);
        System.out.println("Ini adalah angka_short " + angka_S);
        System.out.println("Ini adalah angka_int " + angka_I);
        System.out.println("Ini adalah angka_long " + angka_L);
       
    }
    
}
