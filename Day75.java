package pkg100_days;

public class Day75 {
    public static void main(String[] args) {
        
        String kata = "Saya Sedang Belajar";
        
        int jumlahKrkter = kata.length();
        
        String Kapital = kata.toUpperCase();
        
        String Kecil = kata.toLowerCase();
        
        System.out.println("Kalimat : " + kata);
        System.out.println("Jumlah karakter yang ada dalam kalimat : " +jumlahKrkter);
        System.out.println("Mengubah ke huruf Kapital : " + Kapital);
        System.out.println("Mengubah ke huruf Kecil : " + Kecil);
    }
    
}
