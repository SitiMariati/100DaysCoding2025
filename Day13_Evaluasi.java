package evaluasi_1;

public class NO_6 {
    public static void main(String[] args) {
        int jumlah = 22;
       int warisan = 120_000;
       int biayaAdmin =  jumlah*warisan / 100;
       int orng = 3;
       
       int Hasil = biayaAdmin / orng;
       
        System.out.println("Biaya Admin = " + biayaAdmin );
        System.out.println("Untuk Bagian Rifai = " + Hasil );
        System.out.println("Untuk Bagian Cipung = " + Hasil );
        System.out.println("Untuk Bagian Mariati = " + Hasil );
        System.out.println("Hasil Akhir = " + 8800 * 3);
    }
    
}
